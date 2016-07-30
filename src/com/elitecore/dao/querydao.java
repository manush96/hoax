package com.elitecore.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.elitecore.model.Query;
@Repository("querydao")
public class querydao {
		private EntityManager em;
			
		@PersistenceContext
		public void setEntityManager(EntityManager em)
		{
		    this.em = em;
		}
		
		public void insertquery(Query query)
		{
			em.persist(query);
		}
}
