package in.lrisd.bhunakshanew.common.service;

import java.util.List;

import in.lrisd.bhunakshanew.common.entity.CodeValueObj;

public interface LevelReaderService {
	public List<CodeValueObj> fetchListForLevel(int level, String... code);
}
