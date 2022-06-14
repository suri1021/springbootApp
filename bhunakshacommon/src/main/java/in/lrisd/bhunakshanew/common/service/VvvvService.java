package in.lrisd.bhunakshanew.common.service;

import java.util.List;

import in.lrisd.bhunakshanew.common.entity.Vvvv;

public interface VvvvService {
	public List<Vvvv> findAll();
	public Vvvv findByBhucode(String bhucode);
	public List<Vvvv> findByPattern(String pattern);
	public List<Vvvv> findByVsrno(String vsrno);	
}
