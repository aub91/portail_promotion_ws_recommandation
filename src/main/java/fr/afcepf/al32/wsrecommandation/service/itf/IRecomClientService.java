package fr.afcepf.al32.wsrecommandation.service.itf;

import fr.afcepf.al32.groupe2.ws.dto.ClientRequestDto;
import fr.afcepf.al32.groupe2.ws.dto.SearchByClientResponseDto;

public interface IRecomClientService {

	SearchByClientResponseDto rechercherRecommandationByClientReservation(ClientRequestDto clientRequestDto);

}
