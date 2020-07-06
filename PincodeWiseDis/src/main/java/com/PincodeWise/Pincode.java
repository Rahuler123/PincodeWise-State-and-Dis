package com.PincodeWise;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class Pincode {
    @Id
    @GeneratedValue
    @Column(name = "pincode")
    private int pincode;
    private String  district;
    private String  stateCode;

    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dist_fk", referencedColumnName = "district")
    private District districtss;

	



	public Pincode(int pincode, String district, String stateCode, District districtss) {
		super();
		this.pincode = pincode;
		this.district = district;
		this.stateCode = stateCode;
		this.districtss = districtss;
	}



	public int getPincode() {
		return pincode;
	}



	public void setPincode(int pincode) {
		this.pincode = pincode;
	}






	public String getDistrict() {
		return district;
	}



	public void setDistrict(String district) {
		this.district = district;
	}



	public String getStateCode() {
		return stateCode;
	}



	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}



	public District getDistrictss() {
		return districtss;
	}



	public void setDistrictss(District districtss) {
		this.districtss = districtss;
	}



	public Pincode() {
		
	}

   
}
