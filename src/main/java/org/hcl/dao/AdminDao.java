package org.hcl.dao;

import java.util.List;

import org.hcl.appexception.ApplicationException;
import org.hcl.models.Admin;
import org.hcl.models.DonateBlood;
import org.hcl.models.RequestBlood;

public interface AdminDao {
	public boolean validateAdmin(Admin admin) throws ApplicationException;

	public List<RequestBlood> getRequestList();

	public boolean acceptRequest(long patientId);

	public boolean rejectRequest(long patientId);

	public List<DonateBlood> getDonarList();

	public boolean acceptDonar(long patientId);

	public boolean rejectDonar(long patientId);

}