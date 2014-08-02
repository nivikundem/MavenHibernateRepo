package com.qe2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qe2.dao.VehicleOwnerDetailsDAO;
import com.qe2.entities.VehicleOwnerDetails;

@Service("vehicleOwnerDetailsService")
public class VehicleOwnerDetailsServiceImpl implements
		VehicleOwnerDetailsService {

	@Autowired
	VehicleOwnerDetailsDAO vehicleOwnerDetailsDAO;
	
	@Transactional
	public void persistVehicleOwner(VehicleOwnerDetails vehicleOwnerDetails) {
		vehicleOwnerDetailsDAO.persistVehicleOwner(vehicleOwnerDetails);
	}

	@Transactional
	public VehicleOwnerDetails findVehicleOwnerById(int id) {		
		return vehicleOwnerDetailsDAO.findVehicleOwnerById(id);
	}

	@Transactional
	public void deleteVehicleOwnerDetails(
			VehicleOwnerDetails vehicleOwnerDetails) {
		vehicleOwnerDetailsDAO.deleteVehicleOwnerDetails(vehicleOwnerDetails);		
	}

	@Transactional
	public void updateVehicleOwnerDetails(
			VehicleOwnerDetails vehicleOwnerDetails) {
		vehicleOwnerDetailsDAO.updateVehicleOwnerDetails(vehicleOwnerDetails);		
	}

	@Transactional
	public List<VehicleOwnerDetails> listVehicleOwnerDetails() {		
		 return vehicleOwnerDetailsDAO.listVehicleOwnerDetails();
	}

}
