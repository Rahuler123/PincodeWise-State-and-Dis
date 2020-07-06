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
public class Dist {
	
	@Id

	private String dist;
	private String districtName;
    //private String stateNameCaps;
    
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "districtCode_FKKK", referencedColumnName = "dist")
    private List<pincodeOrderRes> pincodeOrderRes;


	

	public Dist() {
		
	}




	public String getDist() {
		return dist;
	}




	public void setDist(String dist) {
		this.dist = dist;
	}




	public String getDistrictName() {
		return districtName;
	}




	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}




	public List<pincodeOrderRes> getPincodeOrderRes() {
		return pincodeOrderRes;
	}




	public void setPincodeOrderRes(List<pincodeOrderRes> pincodeOrderRes) {
		this.pincodeOrderRes = pincodeOrderRes;
	}




	public Dist(String dist, String districtName, List<com.PincodeWise.pincodeOrderRes> pincodeOrderRes) {
		super();
		this.dist = dist;
		this.districtName = districtName;
		this.pincodeOrderRes = pincodeOrderRes;
	}



	
	
}
