package fr.afcepf.al32.wsrecommandation.service.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import fr.afcepf.al32.groupe2.ws.dto.ClientRequestDto;
import fr.afcepf.al32.groupe2.ws.dto.SearchByClientResponseDto;
import fr.afcepf.al32.wsrecommandation.service.itf.IRecomClientService;

@Transactional
@Component
public class RecomClientService implements IRecomClientService{

	private static final String URL = "http://localhost:9200/xxxx/";
	@Override
	public SearchByClientResponseDto rechercherRecommandationByClientReservation(ClientRequestDto clientRequestDto) {
		
		return null;
	}

	
	private String responseCategorie(String idClient) {
		return null;
	}
	
//	POST <index name>/<type name>/_search?search_type=count
//			{
//			  "aggs": {
//			    "app_cat": {
//			      "terms": {
//			        "script" : "doc['app'].value + '#' + doc['cat'].value",
//			        "size": 10
//			      }
//			    }
//			  }
//			}
}


