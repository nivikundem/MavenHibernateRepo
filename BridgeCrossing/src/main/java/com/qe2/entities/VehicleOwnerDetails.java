package com.qe2.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VEHICLEOWNERDETAILS")
public class VehicleOwnerDetails {
	public VehicleOwnerDetails() {
	}
	
	@Id
	@Column(name = "UID", nullable = false)
	private int uid;
	
	@Column(name = "VRN", nullable = false)
	private String vrn;
	
	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "POSTCODE", nullable = false)
	private String postcode;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getVrn() {
		return vrn;
	}

	public void setVrn(String vrn) {
		this.vrn = vrn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

}
