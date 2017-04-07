package com.aunnie.web.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aunnie.web.dao.MirrorTalkDAO;
import com.aunnie.web.dto.MirrorTalkDTO;

@Service("MirrorTalkService")
public class MirrorTalkServiceImple implements MirrorTalkService{

	@Resource(name="mirrortalkDAO")
	private MirrorTalkDAO dao;
	
	@Override
	public List<MirrorTalkDTO> getAll() {
		return dao.selectAll();
	}

	@Override
	public MirrorTalkDTO getOne(int no) {
		return dao.selectOne(no);
	}

	@Override
	public void writeOne(MirrorTalkDTO dto) {
		dao.insertOne(dto);
		
	}

	@Override
	public void modifyOne(MirrorTalkDTO dto) {
		dao.updateOne(dto);
	}

	@Override
	public void deleteOne(int no) {
		dao.deleteOne(no);
	}

}
