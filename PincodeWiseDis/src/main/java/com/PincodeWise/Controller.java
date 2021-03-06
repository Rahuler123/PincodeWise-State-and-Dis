package com.PincodeWise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
@RequestMapping("/")
public class Controller {
    @Autowired
    private PincodeRepo pincodeRepository;
    @Autowired
    private DistrictRepo districtRepository;
//    @Autowired
//    private  pincodeRepoService pincodeRepoService;
    @Autowired
    private DistR distR;
	
    
    @Autowired
    private StateRepo stateRepository;

//    @PostMapping("/create")
//    public Pincode create(@RequestBody OrderRequest request){
//       return pincodeRepository.save(request.getPincode());
//    }

//    @GetMapping("/findAll")
//    public List<Pincode> findAll(){
//        return pincodeRepository.findAll();
//    }

//    @GetMapping("/getAll")
//    public List<PincodeResponse> getJoinInformation(){
//        return pincodeRepository.getJoinInformation();
//    }
    
//    @GetMapping("/find")
//    public List<PincodeResponse> findByPincode(@RequestParam int pincode){
//        return pincodeRepository.findByPincode(pincode);
//    }
    
    @GetMapping("/pincode/{pincode}")
    public List<Pincode> findByPincode(@PathVariable int pincode){
        return pincodeRepository.findByPincode(pincode);
    }
    
//    @GetMapping("/getPinCode")
//    public List<PincodeMaster> findByPincode(@RequestBody PincodeMaster pincodeMaster){
//    	int pincodeString = pincodeMaster.getPincode();
//        return pincodeRepository.findByPincode(pincodeString);
//    }

    @GetMapping("/state/{state}")
    public List<State> findByState(@PathVariable String state){
        return stateRepository.findByState(state);
    }
    
    
    
    
    
    @GetMapping("/getDistrict/{dist}")
    public List<Dist> findByDist(@PathVariable String dist){
        return distR.findByDist(dist);
    }
    
//    @GetMapping("/state/{state}")
//    public List<State> getStatess(@PathVariable String state){
//        return stateRepository.getStateDis(state);
//    }
    
    
    
//    @GetMapping("/getInfo/{id}")
//    public List<OrderResponse> finByString(){
//        return ((Controller) pincodeRepository).finByString();
//    }
    
    
    
 
}
