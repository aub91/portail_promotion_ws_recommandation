package fr.afcepf.al32.wsrecommandation.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import fr.afcepf.al32.wsrecommandation.dao.itf.IRecommandationClientDao;
import fr.afcepf.al32.wsrecommandation.entity.Promotion;

@Repository
public class RecommandationClientDao implements IRecommandationClientDao {

	@Autowired
	private MongoOperations mongoOps;

	@Override
	public List<Promotion> findByClientEtCategorie(Long clientId, String categorieLibelle) {

		Query query = new Query(Criteria.where(key))
	}

}
