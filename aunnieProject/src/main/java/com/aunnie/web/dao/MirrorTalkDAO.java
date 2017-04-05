package com.aunnie.web.dao;

import java.util.List;

import com.aunnie.web.dto.MemberDTO;
import com.aunnie.web.dto.MirrorTalkDTO;

public interface MirrorTalkDAO {
	public List<MirrorTalkDTO> selectAll();
	public MirrorTalkDTO selectOne(int no);
	public void insertOne(MirrorTalkDTO dto);
	public void updateOne(MirrorTalkDTO dto);
	public void deleteOne(int no);
}
