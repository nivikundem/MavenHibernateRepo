/**
 * 
 */
package com.qe2.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.qe2.entities.VehicleOwnerDetails;

/**
 * @author Nivi Kundem
 *
 */
@Repository("vehicleOwnerDetailsDAO")
public class VehicleOwnerDetailsDAOImpl implements VehicleOwnerDetailsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void persistVehicleOwner(VehicleOwnerDetails vehicleOwnerDetails) {
		sessionFactory.getCurrentSession().persist(vehicleOwnerDetails);
	}
	
	public VehicleOwnerDetails findVehicleOwnerById(int id) {
		return (VehicleOwnerDetails) sessionFactory.getCurrentSession().get(VehicleOwnerDetails.class, id);
	}
	
	public void updateVehicleOwnerDetails(
			VehicleOwnerDetails vehicleOwnerDetails) {
		sessionFactory.getCurrentSession().update(vehicleOwnerDetails);

	}

	public void deleteVehicleOwnerDetails(
			VehicleOwnerDetails vehicleOwnerDetails) {
		sessionFactory.getCurrentSession().delete(vehicleOwnerDetails);


	}

	@SuppressWarnings("unchecked")
	public List<VehicleOwnerDetails> listVehicleOwnerDetails() {
		return sessionFactory.getCurrentSession().createCriteria(VehicleOwnerDetails.class).list();
	}

}
