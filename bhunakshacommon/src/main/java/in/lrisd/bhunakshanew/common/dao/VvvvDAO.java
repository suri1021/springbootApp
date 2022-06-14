package in.lrisd.bhunakshanew.common.dao;

import java.util.List;

import in.lrisd.bhunakshanew.common.entity.Vvvv;

public interface VvvvDAO {
	public List<Vvvv> findAll();
	public Vvvv findByBhucode(String bhucode);
	public List<Vvvv> findByPattern(String pattern);
	public List<Vvvv> findByVsrno(String vsrno);
}
