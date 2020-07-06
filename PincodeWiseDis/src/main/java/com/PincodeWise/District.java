package com.PincodeWise;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "district_master_temporary")
public class District {
	
	@Id
	@Column(name="district")
	private String district;
	private String districtName;
    //private String stateNameCaps;
    
    

	public District() {
		
	}



	public District(String district, String districtName) {
		super();
		this.district = district;
		this.districtName = districtName;
	}



	public String getDistrict() {
		return district;
	}



	public void setDistrict(String district) {
		this.district = district;
	}



	public String getDistrictName() {
		return districtName;
	}



	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
   


	
	
}
