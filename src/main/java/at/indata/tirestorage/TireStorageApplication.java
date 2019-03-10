package at.indata.tirestorage;

import javax.xml.bind.JAXBException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TireStorageApplication
{
	public static void main(String[] args) throws JAXBException
	{
		SpringApplication.run(TireStorageApplication.class, args);
	}
}
