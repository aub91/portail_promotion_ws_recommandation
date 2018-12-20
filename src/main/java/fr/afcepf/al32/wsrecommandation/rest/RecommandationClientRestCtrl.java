package fr.afcepf.al32.wsrecommandation.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.afcepf.al32.groupe2.ws.dto.ClientRequestDto;
import fr.afcepf.al32.groupe2.ws.dto.SearchByClientResponseDto;
import fr.afcepf.al32.wsrecommandation.service.itf.IRecomClientService;


@RestController
@RequestMapping(value = "/rest/recomClient", headers = "Accept=application/json")
public class RecommandationClientRestCtrl {

	@Autowired
	private IRecomClientService clientService;
	
	@PostMapping("/ByClient")
	public SearchByClientResponseDto getSearchByShopper(@RequestBody ClientRequestDto clientRequestDto) {
		return clientService.rechercherRecommandationByClientReservation(clientRequestDto);
	}
}
