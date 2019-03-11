package at.indata.tirestorage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import at.indata.tirestorage.utils.DataUtils;

@Controller
public class MainControllerMVC
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