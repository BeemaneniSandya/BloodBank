package org.hcl.services;

import java.util.List;

import org.hcl.models.DonateBlood;
import org.hcl.models.User;

public interface DonationStatus {

	public List<DonateBlood> getDonationList(User user);
}