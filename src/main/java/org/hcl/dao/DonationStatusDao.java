package org.hcl.dao;

import java.util.List;

import org.hcl.models.DonateBlood;
import org.hcl.models.User;

public interface DonationStatusDao {
	public List<DonateBlood> getDonationList(User user);
}