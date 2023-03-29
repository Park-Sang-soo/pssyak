package com.blackyak.b2c.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

//import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductJsonVo {

	@JsonProperty(value="comp_cd")
	public String comp_cd;
	
	@JsonProperty(value="prod_cd")
	public String prod_cd;
	
	@JsonProperty(value="prod_nm")
	public String prod_nm;
	
	@JsonProperty(value="colr_cd")
	public String colr_cd;
	
	@JsonProperty(value="size_cd")
	public String size_cd;
}
