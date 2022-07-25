package kr.co.project.board;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardVO {
	private int no;
	private String title;
	private String content;
	private Timestamp regdate;
	private int viewcount;
	private int member_no;
	private String filename_org;
	private String filename_real;
	
	private int page;
	private String stype;
	private String sword;
	
	private int startIdx;
	private int pageRow;
	private String tableName;
	
	public BoardVO() {
//		this.page = 1;
//		this.pageRow = 10;
		this(1,10, "board");
	}
	
	public BoardVO(int page, int pageRow, String tableName) {
		this.page = page;
		this.pageRow = pageRow;
		this.tableName = tableName;
	}
}
