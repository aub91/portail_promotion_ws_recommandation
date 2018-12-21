package fr.afcepf.al32.wsrecommandation.dao.itf;

import java.util.List;

import fr.afcepf.al32.wsrecommandation.entity.Promotion;
import fr.afcepf.al32.wsrecommandation.entity.Reservation;

public interface IRecommandationClientDao {

	List<Promotion> findByClientEtCategorie(Long clientId, String categorieLibelle);

	
}
