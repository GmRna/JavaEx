package kr.co.project.board;

import java.io.File;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class BoardController {
	
	@Autowired
	BoardService service;
	
	@GetMapping("/board/index.do")
	public String index(Model model, BoardVO vo) {
		model.addAttribute("data", service.index(vo));
		
		return "board/index";
	}
	
	@GetMapping("/board/write.do")
	public String write() {
		return "board/write";
	}
	
	@PostMapping("/board/insert.do")
	public String insert(Model model, BoardVO vo, @RequestParam MultipartFile fileName, HttpServletRequest req) {
		// 첨부파일 처리
		if(!fileName.isEmpty()) {
			// 파일명 구하기
			String org = fileName.getOriginalFilename(); // 오리지널 파일이름
			String ext = org.substring(org.lastIndexOf(".")); // 확장자 (.다음부터)
			String real = new Date().getTime()+ext; // 현재일시 + 확장자 붙여서 서버파일이름 저장

			// 파일저장
			String path = req.getRealPath("/upload/");
			System.out.println(path);
			System.out.println(path+real);
			try {
				fileName.transferTo(new File(path+real));
			} catch(Exception e) {
				e.printStackTrace();
			}
			vo.setFilename_org(org);
			vo.setFilename_real(real);
			
			
		}
		if(service.insert(vo)) {
			model.addAttribute("msg", "정상적으로 저장되었습니다.");
			model.addAttribute("url", "index.do");			
			return "common/alert";
		} else {	
			model.addAttribute("msg", "저장에 실패하였습니다.");
			return "common/alert";
		}
	}
	
	@GetMapping("/board/view.do")
	public String view(BoardVO vo, Model model) {
		BoardVO data = service.view(vo);
		model.addAttribute("data", data);
		return "board/view";
	}
	
	@GetMapping("/board/edit.do")
	public String edit(BoardVO vo, Model model) {
		BoardVO data = service.edit(vo);
		model.addAttribute("data", data);
		return "board/edit";
	}
	
	@PostMapping("/board/update.do")
	public String update(BoardVO vo, Model model) {
		if (service.update(vo)) {
			model.addAttribute("msg", "정상적으로 수정되었습니다.");
			model.addAttribute("url", "view.do?no="+vo.getNo());
			return "common/alert";
		} else {
			model.addAttribute("msg", "수정 실패하였습니다.");
			return "common/alert";
		}
	}
	
	@GetMapping("/board/delete.do")
	public String delete(BoardVO vo, Model model) {
		if (service.delete(vo)) {
			
			model.addAttribute("msg", "정상적으로 삭제되었습니다.");
			model.addAttribute("url", "index.do");
			return "common/alert";
		} else {
			model.addAttribute("msg", "삭제 실패하였습니다.");
			return "common/alert";
		}
	}
}
