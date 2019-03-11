package at.indata.tirestorage.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tire
{
	private String		title;
	private String		description;
	private String		calatogNumber;
	private String		partNumber;
	private BigDecimal	price;
}
