package com.qe2.dao;

import java.util.List;
import com.qe2.entities.VehicleOwnerDetails;

public interface VehicleOwnerDetailsDAO {
	 void persistVehicleOwner(VehicleOwnerDetails vehicleOwnerDetails);	  
	 VehicleOwnerDetails findVehicleOwnerById(int id);
	 List<VehicleOwnerDetails> listVehicleOwnerDetails();	  
	 void updateVehicleOwnerDetails(VehicleOwnerDetails vehicleOwnerDetails);	  
	 void deleteVehicleOwnerDetails(VehicleOwnerDetails vehicleOwnerDetails);
}
