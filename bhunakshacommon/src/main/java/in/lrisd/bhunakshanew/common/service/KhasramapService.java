package in.lrisd.bhunakshanew.common.service;

import java.util.List;

import in.lrisd.bhunakshanew.common.entity.Khasramap;

public interface KhasramapService {
	public List<Khasramap> findAllByBhucode(String state, String bhucode);
	public Khasramap findByBhucodeKide(String state, String bhucode, String kide);
	public Khasramap findById(String id);
}
