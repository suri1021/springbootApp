package in.lrisd.bhunakshanew.common.dao;

import java.util.List;

import in.lrisd.bhunakshanew.common.entity.Khasramap;

public interface KhasramapDAO {
	public List<Khasramap> findAllByBhucode(String state, String bhucode);
	
	public Khasramap findByBhucodeKide(String state, String bhucode, String kide);

	public Khasramap findById(String id);
}
