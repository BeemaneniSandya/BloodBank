package org.hcl.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bb_donar")
public class DonateBlood implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "patient_id")
	public long patientId;

	@Column(name = "donar_name", nullable = false, length = 50)
	public String donarName;

	@Column(name = "blood_group", nullable = false, length = 5)
	public String bloodGroup;

	@Column(name = "city", nullable = false, length = 20)
	public String city;

	@Column(name = "glucose_level", nullable = false, length = 10)
	public String glucoseLevel;

	@Column(name = "sample_time", nullable = false, length = 10)
	public String time;

	@Column(name = "donation_status", nullable = false, length = 20)
	public String donationStatus;

	@Column(name = "account_id", nullable = false, length = 5)
	public long accountId;

	public DonateBlood() {
		super();
	}

	public DonateBlood(long patientId, String donarName, String bloodGroup, String city, String glucoseLevel,
			String time, String donationStatus, long accountId) {
		super();
		this.patientId = patientId;
		this.donarName = donarName;
		this.bloodGroup = bloodGroup;
		this.city = city;
		this.glucoseLevel = glucoseLevel;
		this.time = time;
		this.donationStatus = donationStatus;
		this.accountId = accountId;
	}

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	public String getDonarName() {
		return donarName;
	}

	public void setDonarName(String donarName) {
		this.donarName = donarName;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGlucoseLevel() {
		return glucoseLevel;
	}

	public void setGlucoseLevel(String glucoseLevel) {
		this.glucoseLevel = glucoseLevel;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDonationStatus() {
		return donationStatus;
	}

	public void setDonationStatus(String donationStatus) {
		this.donationStatus = donationStatus;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

}