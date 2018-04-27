package org.zerock.persistence;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.zerock.domain.MemberVo;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private static final String namespace = "org.zerock.mapper.MemberMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace + ".getTime");
	}

	@Override
	public void insertMemebr(MemberVo vo) {
		sqlSession.insert(namespace + ".insertMember", vo); 
	}

	@Override
	public MemberVo readMember(String userid) throws Exception {
		return (MemberVo)
				sqlSession.selectOne(namespace + ".selectMember", userid);
	}

	@Override
	public MemberVo readWithPw(String userid, String userpw) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("userid", userid);
		paramMap.put("userpw", userpw);
		return sqlSession.selectOne(namespace + ".readWithPw", paramMap);
	}
}