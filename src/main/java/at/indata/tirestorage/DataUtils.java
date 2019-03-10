package at.indata.tirestorage;

import java.math.BigDecimal;
import java.util.ArrayList;

public class DataUtils
{
	public static ArrayList<Brand> createBrands()
	{
		ArrayList<Brand> brands = new ArrayList<>();

		brands.add(new Brand("mercedes", "Mercedes"));
		brands.add(new Brand("bmw", "BMW"));
		brands.add(new Brand("opel", "Opel"));
		brands.add(new Brand("vw", "VW"));

		return brands;
	}

	public static ArrayList<Model> createModelsForBrand(String brand)
	{
		ArrayList<Model> models = new ArrayList<>();

		switch (brand)
		{
			case "mercedes":
				models.add(new Model("model_a", "Model A"));
				models.add(new Model("model_b", "Model B"));
				models.add(new Model("model_c", "Model C"));
				models.add(new Model("model_d", "Model D"));
				break;
			case "bmw":
				models.add(new Model("model_a", "Model A"));
				models.add(new Model("model_b", "Model B"));
				models.add(new Model("model_c", "Model C"));
				models.add(new Model("model_d", "Model D"));
				break;
			case "opel":
				models.add(new Model("insignia", "Insignia"));
				models.add(new Model("astra", "Astra"));
				models.add(new Model("vectra", "Vectra"));
				models.add(new Model("mokka", "Mokka"));
				break;
			case "vw":
				models.add(new Model("model_a", "Model A"));
				models.add(new Model("model_b", "Model B"));
				models.add(new Model("model_c", "Model C"));
				models.add(new Model("model_d", "Model D"));
				break;

			default:
				break;
		}

		return models;
	}

	public static ArrayList<Tire> createTireList()
	{
		ArrayList<Tire> tires = new ArrayList<>();

		Tire t1 = new Tire();
		t1.setCalatogNumber("10 02 554");
		t1.setDescription(
				"10-Speichen-Design in silberner Ausführung. Größe: 7J x 17 ET 39, 5-Loch. Passend für Reifengröße 225/45 R 17 91V. Für alle Räder müssen die jeweiligen Ventile und Radnabenabdeckungen separat bestellt werden.");
		t1.setPartNumber("13298701");
		t1.setPrice(new BigDecimal("249.00"));
		t1.setTitle("Leichtmetallrad 17 Zoll");
		tires.add(t1);

		Tire t2 = new Tire();
		t2.setCalatogNumber("10 02 592");
		t2.setDescription(
				"7-V-Speichen-Design in silberner Ausführung. Größe: 7J x 17 ET 35, 5-Loch. Passend für Reifengröße 225/45 R 17 91V. Für alle Räder müssen die jeweiligen Ventile und Radnabenabdeckungen separat bestellt werden.");
		t2.setPartNumber("13276584");
		t2.setPrice(new BigDecimal("210.60"));
		t2.setTitle("Leichtmetallrad 17 Zoll");
		tires.add(t2);

		Tire t3 = new Tire();
		t3.setCalatogNumber("10 02 578");
		t3.setDescription(
				"5-V-Speichen-Design in silberner Ausführung. Größe: 7J x 17 ET 39, 5-Loch. Passend für Reifengröße 225/45 R 17 91V. Für alle Räder müssen die jeweiligen Ventile und Radnabenabdeckungen separat bestellt werden.");
		t3.setPartNumber("13288965");
		t3.setPrice(new BigDecimal("245.40"));
		t3.setTitle("Leichtmetallrad 17 Zoll");
		tires.add(t3);
		return tires;
	}
}