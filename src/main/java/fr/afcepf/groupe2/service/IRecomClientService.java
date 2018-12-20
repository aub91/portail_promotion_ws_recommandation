package fr.afcepf.groupe2.service;

import fr.afcepf.al32.groupe2.ws.dto.ClientRequestDto;
import fr.afcepf.al32.groupe2.ws.dto.SearchByClientResponseDto;

public interface IRecomClientService {

	SearchByClientResponseDto rechercherRecommandationByClientReservation(ClientRequestDto clientRequestDto);

}
