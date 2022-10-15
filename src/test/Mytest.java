package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import chapter20.Memo.MemoDAO;
import chapter20.Memo.MemoVO;

class Mytest {
		
	
	MemoDAO dao = new MemoDAO();
//	@Test
	void memoSelectList() throws Exception {
		
		List<MemoVO> list = dao.selectList();
		assertEquals(1,list.size());
	}
	
//	@Test	
	void memoSelectListOne() throws Exception {
		MemoVO vo = dao.selectOne(0);
		assertNull(vo);
		
	}
	
//	@Test	
	void insert() throws Exception {
		
		MemoVO vo = new MemoVO();
		vo.setTitle("두번째 메모");
		vo.setContents("곧 점심 시간이다");
		
		
		
		int insertMemo = dao.insertMemo(vo);
		assertEquals(1, insertMemo);
//		assertEquals(2, dao.selectList().size());
		
	}
	
//	@Test	
	void update() throws Exception {
		
		MemoVO vo = new MemoVO();
		vo.setId(4);
		vo.setTitle("오늘은 화요일");
		vo.setContents("9시 34분이 지났다.");
		
		MemoVO memo = dao.selectOne(4);
		assertNull(memo.getModifyDate());
		
		int updateMemo = dao.updateMemo(vo);
		
	
		
		MemoVO selectOne = dao.selectOne(4);
		
		memo	= dao.selectOne(4);
		
		assertEquals(vo.getTitle(), selectOne.getTitle());
		assertNotNull(memo.getModifyDate());
	
	}
	
	@Test
	void delete() throws Exception{
		
		dao.deleteMemo(2);
		assertEquals(4, dao.selectList().size());
		
	}
	
	
	
	

}
