package in.lrisd.bhunakshanew.common.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.lrisd.bhunakshanew.common.dao.KhasramapDAO;
import in.lrisd.bhunakshanew.common.entity.Khasramap;

@Service
public class KhasramapServiceImpl implements KhasramapService {

	@Autowired
	private KhasramapDAO khasramapDAO;
		
	@Override
	@Transactional
	public List<Khasramap> findAllByBhucode(String state, String bhucode) {
		return khasramapDAO.findAllByBhucode(state, bhucode);
	}

	@Override
	@Transactional
	public Khasramap findByBhucodeKide(String state, String bhucode, String kide) {
		return khasramapDAO.findByBhucodeKide(state, bhucode, kide);
	}

	@Override
	@Transactional
	public Khasramap findById(String id) {
		return khasramapDAO.findById(id);
	}
}