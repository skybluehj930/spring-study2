package com.iu.lhj2.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Repository로 데이터 사전 작업 후 전달
@Service
public class BoardService {
	
	@Autowired
	private BoardRepository boardRepository;
}
