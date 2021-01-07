package org.hcl.dao;

import java.util.List;

import org.hcl.models.DonateBlood;

public interface SearchDao {

	public List<DonateBlood> getSearchResults(String searchQuery);

}