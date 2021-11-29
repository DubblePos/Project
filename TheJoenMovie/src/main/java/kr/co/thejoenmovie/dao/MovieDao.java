package kr.co.thejoenmovie.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.thejoenmovie.vo.CinemaVo;
import kr.co.thejoenmovie.vo.MovieVo;
import kr.co.thejoenmovie.vo.TicketVo;
import kr.co.thejoenmovie.vo.TimeVo;

@Repository
public interface MovieDao {
	public List<CinemaVo> selectCate1();
	public List<MovieVo> selectCate2(String cinema_name);
	public List<TimeVo> selectCate3(String title);
	public void insertTicket(TicketVo tv);
}
