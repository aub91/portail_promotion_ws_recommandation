package fr.afcepf.groupe2.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import fr.afcepf.al32.groupe2.ws.dto.ClientRequestDto;
import fr.afcepf.al32.groupe2.ws.dto.SearchByClientResponseDto;

@Transactional
@Component
public class RecomClientServiceImpl implements IRecomClientService{

	@Override
	public SearchByClientResponseDto rechercherRecommandationByClientReservation(ClientRequestDto clientRequestDto) {
		return null;
	}

}
