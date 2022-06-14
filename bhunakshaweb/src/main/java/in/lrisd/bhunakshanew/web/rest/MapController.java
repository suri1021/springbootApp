package in.lrisd.bhunakshanew.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.lrisd.bhunakshanew.common.entity.Khasramap;
import in.lrisd.bhunakshanew.common.entity.Vvvv;
import in.lrisd.bhunakshanew.common.service.KhasramapService;
import in.lrisd.bhunakshanew.common.service.LevelReaderService;
import in.lrisd.bhunakshanew.common.service.VvvvService;


@RestController
@RequestMapping("/map")
public class MapController {

	@Autowired(required = true)
	private KhasramapService khasramapService;
	
	@Autowired(required = true)
	private LevelReaderService levelReaderService;

	@Autowired(required = true)
	private VvvvService vvvvService;

	@GetMapping("/findkhasrasall/{state}/{bhucode}")
	public List<Khasramap> getVillageKhasras(@PathVariable String state,@PathVariable String bhucode)
	{
		return khasramapService.findAllByBhucode(state, bhucode);
	}

	@GetMapping("/findkhasra/{state}/{bhucode}/{kide}")
	public Khasramap getKhasra(@PathVariable String state,@PathVariable String bhucode, @PathVariable String kide)
	{
		return khasramapService.findByBhucodeKide(state,bhucode,kide);
	}
	
	@GetMapping("/findkhasrabyid/{id}")
	public Khasramap getKhasra(@PathVariable String id)
	{
		return khasramapService.findById(id);
	}
	
	@GetMapping("/findvvvvall")
	public List<Vvvv> findvvvvall()
	{
		return vvvvService.findAll();
	}
	
	@GetMapping("/findvvvvbygiscode/{gis_code}")
	public Vvvv findvvvvByGiscode(@PathVariable String gis_code) {
		return vvvvService.findByBhucode(gis_code);
	}
	
	@GetMapping("/findvvvvbypattern/{pattern}")
	public List<Vvvv> findvvvvByPattern(@PathVariable String pattern) {
		return vvvvService.findByPattern(pattern);
	}
}
