package at.indata.tirestorage;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class RESTController
{
	@GetMapping("/models")
	private List<Model> getModels(@RequestParam("brand") String brand)
	{
		return DataUtils.createModelsForBrand(brand);
	}
}
