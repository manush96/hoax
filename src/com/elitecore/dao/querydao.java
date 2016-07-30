package com.elitecore.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
		
		public void insertquery(Query query1)
		{
			em.persist(query1);
		}
		JdbcTemplate template;

		public void setTemplate(JdbcTemplate template) {
			this.template = template;
		}

		public List<Query> getqueryByPage(int pageid,int total){
			String sql="select * from query limit "+(pageid-1)+","+total;
			return template.query(sql,new RowMapper<Query>(){
				public Query mapRow(ResultSet rs, int row) throws SQLException {
					Query e=new Query();
					e.setId(rs.getInt("id"));
					e.setName(rs.getString("name"));
					e.setDescription(rs.getString("description"));
					e.setQuery(rs.getString("query"));
					e.setStatus(rs.getInt("status"));
					return e;
				}
			});
		}
}
