package fr.afcepf.al32.wsrecommandation.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.afcepf.al32.groupe2.ws.dto.ClientRequestDto;
import fr.afcepf.al32.groupe2.ws.dto.SearchByClientResponseDto;
import fr.afcepf.al32.wsrecommandation.dao.itf.IRecommandationClientDao;
import fr.afcepf.al32.wsrecommandation.entity.Reservation;
import fr.afcepf.al32.wsrecommandation.service.itf.IRecomClientService;

@Transactional
@Component
public class RecomClientService implements IRecomClientService {

	@Autowired
	public IRecommandationClientDao clientIDao;

	@Override
	public SearchByClientResponseDto rechercherRecommandationByClientReservation(ClientRequestDto clientRequestDto) {

		return null;
	}

	public Reservation findDerniereReservation(Long clientId) {
		return null;

	}

}
