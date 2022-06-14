package in.lrisd.bhunakshanew.web.rest;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
	@GetMapping("/getMessage")
	public String getMessage(Model model) {

		model.addAttribute("message", "helloWorld");

		return "show";
	}

	@GetMapping("/getMessageAndTime")
	public String getMessageAndTime(ModelMap map) {

		var ldt = LocalDateTime.now();

		var fmt = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

		fmt.withLocale(new Locale("sk", "SK"));
		fmt.withZone(ZoneId.of("CET"));

		var time = fmt.format(ldt);

		map.addAttribute("message", "hello Model").addAttribute("time", time);

		return "show";
	}
	
	@GetMapping("/getMessage2")
	public ModelAndView getMessage() {

	    var mav = new ModelAndView();
	    mav.addObject("message", "hello");
	    mav.setViewName("show");

	    return mav;
	}
}
