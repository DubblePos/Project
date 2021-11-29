package kr.co.thejoenmovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.thejoenmovie.dao.MemberDao;

@Service
public class MemberService {
	@Autowired
	private MemberDao dao;
}
