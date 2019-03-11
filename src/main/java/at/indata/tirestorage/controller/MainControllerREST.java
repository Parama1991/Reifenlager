package at.indata.tirestorage.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import at.indata.tirestorage.model.Model;
import at.indata.tirestorage.utils.DataUtils;

@RestController()
@RequestMapping("/api")
public class MainControllerREST
{
	@GetMapping("/models")
	private List<Model> getModels(@RequestParam("brand") String brand)
	{
		return DataUtils.createModelsForBrand(brand);
	}
}
