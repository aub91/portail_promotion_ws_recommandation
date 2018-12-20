package fr.afcepf.al32.wsrecommandation.service.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import fr.afcepf.al32.groupe2.ws.dto.ClientRequestDto;
import fr.afcepf.al32.groupe2.ws.dto.SearchByClientResponseDto;
import fr.afcepf.al32.wsrecommandation.service.itf.IRecomClientService;

@Transactional
@Component
public class RecomClientService implements IRecomClientService{

	@Override
	public SearchByClientResponseDto rechercherRecommandationByClientReservation(ClientRequestDto clientRequestDto) {
		return null;
	}

}
