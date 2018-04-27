package org.zerock.persistence;

import org.zerock.domain.MemberVo;

public interface MemberDAO {
	public String getTime();
	
	public void insertMemebr(MemberVo vo);
	
	public MemberVo readMember(String userid) throws Exception;
	
	public MemberVo readWithPw(String userid, String userpw) throws Exception;
}
