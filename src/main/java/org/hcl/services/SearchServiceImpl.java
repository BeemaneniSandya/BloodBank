package org.hcl.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.hcl.dao.SearchDao;
import org.hcl.models.DonateBlood;

@Service("searchService")
public class SearchServiceImpl implements SearchService {

	@Autowired
	private SearchDao searchDao;

	@Transactional
	public List<DonateBlood> getSearchResults(String searchQuery) {

		return searchDao.getSearchResults(searchQuery);
	}

}