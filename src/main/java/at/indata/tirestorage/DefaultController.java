package at.indata.tirestorage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController
{
	@GetMapping("")
	public String get()
	{
		return "/"; //$NON-NLS-1$
	}

	@GetMapping("/")
	public ModelAndView getHomeReturnPage()
	{
		ModelAndView mav = new ModelAndView("home");

		mav.addObject("brands", DataUtils.createBrands());
		mav.addObject("tires", DataUtils.createTireList());

		return mav;
	}
}