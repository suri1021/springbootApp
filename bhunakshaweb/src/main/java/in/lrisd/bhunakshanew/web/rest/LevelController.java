package in.lrisd.bhunakshanew.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.lrisd.bhunakshanew.common.entity.CodeValueObj;
import in.lrisd.bhunakshanew.common.service.LevelReaderService;

@RestController
@RequestMapping("/level")
public class LevelController {

	@Autowired
	private LevelReaderService levelReaderService;
	
	@GetMapping("/getlist/{level}/{levellist}")
	public List<CodeValueObj> getLevelValues(@PathVariable int level, @PathVariable String[] levellist)
	{
		return levelReaderService.fetchListForLevel(level, levellist);
	}
}
	