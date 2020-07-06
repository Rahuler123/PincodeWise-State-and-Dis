package com.PincodeWise;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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

public class DistrictOrderResponse {
	
	@Id
	@Column(name="district")
	private String district;
    private String districtName;
    private String stateCode;

    
    public DistrictOrderResponse() {
    	
    }

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public DistrictOrderResponse(String district, String districtName, String stateCode) {
		super();
		this.district = district;
		this.districtName = districtName;
		this.stateCode = stateCode;
	}

	
    
    
}
