package com.iu.lhj2.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//클라이언트 요청을 처리해서 Service로 전달하거나 클라이언트로 전달
@Controller 
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
}
