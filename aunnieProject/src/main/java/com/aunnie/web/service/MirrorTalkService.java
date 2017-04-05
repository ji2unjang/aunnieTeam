package com.aunnie.web.service;

import java.util.List;

import com.aunnie.web.dto.MirrorTalkDTO;

public interface MirrorTalkService {
	public List<MirrorTalkDTO> getAll();
	public MirrorTalkDTO getOne(int no);
	public void writeOne(MirrorTalkDTO dto);
	public void modifyOne(MirrorTalkDTO dto);
	public void deleteOne(int no);
}
