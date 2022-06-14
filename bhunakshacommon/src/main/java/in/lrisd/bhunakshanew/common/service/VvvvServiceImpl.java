package in.lrisd.bhunakshanew.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.lrisd.bhunakshanew.common.dao.VvvvDAO;
import in.lrisd.bhunakshanew.common.entity.Vvvv;

@Service
public class VvvvServiceImpl implements VvvvService {

	@Autowired
	private VvvvDAO vvvvDAO;
	
	@Override
	public List<Vvvv> findAll() {
		return vvvvDAO.findAll();
	}

	@Override
	public Vvvv findByBhucode(String bhucode) {
		return vvvvDAO.findByBhucode(bhucode);
	}

	@Override
	public List<Vvvv> findByPattern(String pattern) {
		return vvvvDAO.findByPattern(pattern);
	}

	@Override
	public List<Vvvv> findByVsrno(String vsrno) {
		return vvvvDAO.findByVsrno(vsrno);
	}
}