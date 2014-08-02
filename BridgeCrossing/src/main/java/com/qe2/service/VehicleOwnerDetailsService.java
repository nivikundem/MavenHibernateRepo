package com.qe2.service;

import java.util.List;

import com.qe2.entities.VehicleOwnerDetails;

public interface VehicleOwnerDetailsService {
	void persistVehicleOwner(VehicleOwnerDetails vehicleOwnerDetails);	  
	 VehicleOwnerDetails findVehicleOwnerById(int id);	  
	 List<VehicleOwnerDetails> listVehicleOwnerDetails();
	 void updateVehicleOwnerDetails(VehicleOwnerDetails vehicleOwnerDetails);	  
	 void deleteVehicleOwnerDetails(VehicleOwnerDetails vehicleOwnerDetails);
}

