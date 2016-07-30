package com.elitecore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.elitecore.dao.querydao;
import com.elitecore.model.Query;
@Service("queryservices")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class queryservices {
//	private querydao querydao;

	@Autowired
	querydao dao;
	public queryservices() {
	}
	public void insert(Query query)
	{
		dao.insertquery(query);
	}
	
	public List<Query> getbypage(int pageid,int total)
	{
		return dao.getqueryByPage(pageid, total);
	}
	
	
}

