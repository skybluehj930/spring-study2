package com.iu.lhj2.board;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.lhj2.MyAbstractTest;

public class BoardRepositoryTest extends MyAbstractTest {

	@Autowired
	private BoardRepository boardRepository;
	
	@Autowired
	private BoardService boardService;
	
	@Test
	public void getRepository() {
		assertNotNull(boardRepository);
	}
	
	
	@Test
	public void getService() {
		assertNotNull(boardService);
	}

}
