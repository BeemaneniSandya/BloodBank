package org.hcl.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bb_request")
public class RequestBlood implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "patient_id")
	private long patientId;

	@Column(name = "patient_name", nullable = false, length = 50)
	private String patientName;

	@Column(name = "blood_group", nullable = false, length = 5)
	private String bloodGroup;

	@Column(name = "city", nullable = false, length = 20)
	private String city;

	@Column(name = "doctor_name", nullable = false, length = 50)
	private String doctorName;

	@Column(name = "hospital_address", nullable = false, length = 100)
	private String hospitalAddress;

	@Column(name = "when_date", nullable = false, length = 10)
	private String when;

	@Column(name = "contact_name", nullable = false, length = 50)
	private String contactName;

	@Column(name = "contact_number", nullable = false, length = 10)
	private String contactNumber;

	@Column(name = "contact_email", nullable = false, length = 50)
	private String contactEmail;

	@Column(name = "request_status", nullable = false, length = 20)
	private String requestStatus;

	@Column(name = "account_id", nullable = false, length = 5)
	private long accountId;

	public RequestBlood() {
		super();
	}

	public RequestBlood(long patientId, String patientName, String bloodGroup, String city, String doctorName,
			String hospitalAddress, String when, String contactName, String contactNumber, String contactEmail,
			String requestStatus, int accountId) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.bloodGroup = bloodGroup;
		this.city = city;
		this.doctorName = doctorName;
		this.hospitalAddress = hospitalAddress;
		this.when = when;
		this.contactName = contactName;
		this.contactNumber = contactNumber;
		this.contactEmail = contactEmail;
		this.requestStatus = requestStatus;
		this.accountId = accountId;
	}

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
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

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getHospitalAddress() {
		return hospitalAddress;
	}

	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

	public String getWhen() {
		return when;
	}

	public void setWhen(String when) {
		this.when = when;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
}