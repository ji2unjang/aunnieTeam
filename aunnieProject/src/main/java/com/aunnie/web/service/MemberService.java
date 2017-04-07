package com.aunnie.web.service;

import java.util.List;

import com.aunnie.web.Criteria;
import com.aunnie.web.dto.MemberDTO;

public interface MemberService {
	public List<MemberDTO> getAll();
	public List<MemberDTO> getPage(Criteria cri);
	public MemberDTO readOne(int no);
	public void writeOne(MemberDTO dto);
	public void modifyOne(MemberDTO dto);
	public void removeOne(int no);
	public boolean checkId(String id);
	public boolean checkNick(String nickname);
	public int totalCount();
	public MemberDTO findUser(MemberDTO memberDto);
}
