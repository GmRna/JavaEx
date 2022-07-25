package kr.co.project.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardMapper mapper;
	
	@Override
	public Map index(BoardVO vo) {
		// 총 게시물 수
		int totalCount = mapper.count(vo);
		
		// 총 페이지수
		int totalPage = totalCount / vo.getPageRow();
		
		if(totalCount % vo.getPageRow()> 0) {
			totalPage++;
		}
		
		// 시작 인덱스 - xml 시작 시 필요한 idx
		int startIdx = (vo.getPage() -1) * vo.getPageRow();
		vo.setStartIdx(startIdx);
		List<BoardVO> list = mapper.list(vo);
		
		// 페이징처리
		int endPage = (int)(Math.ceil(vo.getPage()/10.0)*10); // 현재페이지 * 10.0 *보여주고 싶은 페이지
		int startPage = endPage-9;
		if(endPage > totalPage) endPage = totalPage;
		boolean prev = startPage > 1 ? true : false;
		boolean next = endPage < totalPage ? true : false;
		
		Map map = new HashMap(); // model도 사용가능
		map.put("totalCount", totalCount);
		map.put("totalPage", totalPage );
		map.put("startPage", startPage );
		map.put("endPage", endPage );
		map.put("list", list);
		map.put("prev", prev);
		map.put("next", next);
		
		return map;
	}

	@Override
	public BoardVO view(BoardVO vo) {
		mapper.updateViewcount(vo);
		return mapper.view(vo);
	}

	@Override
	public BoardVO edit(BoardVO vo) {
		
		return mapper.view(vo);
	}

	@Override
	public boolean update(BoardVO vo) {
		// 
		return mapper.update(vo) > 0 ? true : false;
	}

	@Override
	public boolean delete(BoardVO vo) {
		return mapper.delete(vo) > 0 ? true : false;
	}

	@Override
	public boolean insert(BoardVO vo) {
		
		return mapper.insert(vo) > 0 ? true : false;
	}

}
