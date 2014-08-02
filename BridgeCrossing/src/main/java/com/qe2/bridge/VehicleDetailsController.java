package com.qe2.bridge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.qe2.entities.VehicleOwnerDetails;
import com.qe2.service.VehicleOwnerDetailsService;

//http://localhost:8080/BridgeCrossing/VehicleDetailsEntryView
@Controller
public class VehicleDetailsController {

	@Autowired
	private VehicleOwnerDetailsService vehicleOwnerDetailsService;

	@RequestMapping(value = "/VehicleDetailsEntryView", method = RequestMethod.GET)
	public String homePage(Model model) {
		model.addAttribute("vehicleOwnersDetailsObjList",
				vehicleOwnerDetailsService.listVehicleOwnerDetails());
		return "VehicleDetailsEntryView";
	}

	@RequestMapping(value = "/EntryView", method = RequestMethod.POST)
	public String entryPage(@RequestParam(required = false) String vrn,
			@RequestParam(required = false) String name,
			@RequestParam(required = false) String postcode, Model model) {
		if (vrn != null && name != null && postcode != null) {
			VehicleOwnerDetails vehicleOwnerDetails = new VehicleOwnerDetails();
			vehicleOwnerDetails.setVrn(vrn);
			vehicleOwnerDetails.setName(name);
			vehicleOwnerDetails.setPostcode(postcode);
			vehicleOwnerDetailsService.persistVehicleOwner(vehicleOwnerDetails);
		}
		model.addAttribute("vehicleOwnersDetailsObjList",
				vehicleOwnerDetailsService.listVehicleOwnerDetails());
		return "VehicleDetailsEntryView";
	}

	@RequestMapping("/DeleteView")
	public String deleteContact(@RequestParam(required = false) Integer uid,
			Model model) {
		System.out.println(uid);
		VehicleOwnerDetails vehicleOwnerDetails = vehicleOwnerDetailsService
				.findVehicleOwnerById(uid);
		vehicleOwnerDetailsService
				.deleteVehicleOwnerDetails(vehicleOwnerDetails);
		model.addAttribute("vehicleOwnersDetailsObjList",
				vehicleOwnerDetailsService.listVehicleOwnerDetails());
		return "VehicleDetailsEntryView";
	}

	@RequestMapping(value = "/ContactView", method = RequestMethod.GET)
	public String getContactView(Model model) {
		return "ContactView";
	}

	@RequestMapping(value = "/AboutView", method = RequestMethod.GET)
	public String getAboutView(Model model) {
		return "AboutView";
	}
}