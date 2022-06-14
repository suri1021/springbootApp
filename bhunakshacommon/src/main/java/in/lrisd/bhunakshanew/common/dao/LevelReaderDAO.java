package in.lrisd.bhunakshanew.common.dao;

import java.util.List;

import in.lrisd.bhunakshanew.common.entity.CodeValueObj;

public interface LevelReaderDAO {
    public List<CodeValueObj> fetchListForLevel(int level, String... code);
    
    public CodeValueObj fetchLevelValue(int level, String... code);

    public String fetchVsrInfo(String vsrNo);
    
    public String fetchGisInfo(String giscode);
}