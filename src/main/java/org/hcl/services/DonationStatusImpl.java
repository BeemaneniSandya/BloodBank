package org.hcl.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.hcl.dao.DonationStatusDao;
import org.hcl.models.DonateBlood;
import org.hcl.models.User;

@Service("donationStatus")
public class DonationStatusImpl implements DonationStatus {

	@Autowired
	private DonationStatusDao donationStatusDao;

	@Transactional
	public List<DonateBlood> getDonationList(User user) {

		return donationStatusDao.getDonationList(user);
	}

}