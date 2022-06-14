package in.lrisd.bhunakshanew.common.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.lrisd.bhunakshanew.common.dao.LevelReaderDAO;
import in.lrisd.bhunakshanew.common.entity.CodeValueObj;

@Service
public class LevelReaderServiceImpl implements LevelReaderService {

	@Autowired
	private LevelReaderDAO levelReaderDAO;
	@Override
	public List<CodeValueObj> fetchListForLevel(int level, String... code) {
		return levelReaderDAO.fetchListForLevel(level, code);
	}
}