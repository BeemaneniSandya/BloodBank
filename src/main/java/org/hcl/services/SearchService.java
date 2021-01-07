package org.hcl.services;

import java.util.List;

import org.hcl.models.DonateBlood;

public interface SearchService {

	public List<DonateBlood> getSearchResults(String searchQuery);
}