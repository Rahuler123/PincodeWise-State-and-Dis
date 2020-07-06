package com.PincodeWise;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface DistR extends JpaRepository<Dist, String>{
	
//	@Query("SELECT new com.PincodeWise.District(d.districtCode,d.districtName,d.stateCode) FROM District d JOIN State s where d.stateCode = s.stateCode ")
//	 public List<District> getJoinInformationnn();
//	
//	
	public List<Dist> findByDist(String dist);
}
