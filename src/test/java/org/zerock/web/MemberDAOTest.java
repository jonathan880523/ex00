package org.zerock.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.MemberVo;
import org.zerock.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOTest {
	
	@Inject
	private MemberDAO dao;
	
	@Test
	public void testTime() throws Exception{
		System.out.println(dao.getTime());
	}
	
	@Test
	public void testInsertMember()throws Exception{
		MemberVo vo = new MemberVo();
		vo.setUserid("user00");
		vo.setUserpw("user00");
		vo.setUsername("user00");
		vo.setEmail("user00@aaa.com");
		
		dao.insertMemebr(vo);
	}
}