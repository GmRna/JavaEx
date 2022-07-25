package kr.co.project.board;

import java.util.Map;

import org.springframework.stereotype.Service;


public interface BoardService {

	// 목록
	Map index(BoardVO vo);
	
	// 상세
	BoardVO view(BoardVO vo);
	
	// 수정폼
	BoardVO edit(BoardVO vo);
	
	// 수정처리
	boolean update(BoardVO vo);

	// 삭제처리
	boolean delete(BoardVO vo);
	
	// 등록처리
	boolean insert(BoardVO vo);
}
