package fr.afcepf.al32.wsrecommandation.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.afcepf.al32.groupe2.ws.wsPromoTemplate.dto.PromotionTemplateResultDto;
import fr.afcepf.al32.groupe2.ws.wsPromoTemplate.dto.TopPromotionTemplateResultDto;
import fr.afcepf.al32.wsrecommandation.service.IRecomClientService;

@RestController
@RequestMapping(value = "/rest/Recommandation", headers = "Accept=application/json")
public class RecommandationClientRestCtrl {

	@Autowired
	private IRecomClientService clientService;

//	@Autowired
//	private MongoOperations mongoOps;

	@PostMapping("/ByClient")
	public TopPromotionTemplateResultDto searchByClientsFavoriteCategory(@RequestParam String sourceLong,
			@RequestParam String sourceLat, @RequestParam String category) {

		List<PromotionTemplateResultDto> result = clientService.rechercherRecommandationsPromotionsByCategory(
				Double.parseDouble(sourceLong), Double.parseDouble(sourceLat), category);

		List<String> categories = new ArrayList<>();
		categories.add(category);
		return new TopPromotionTemplateResultDto(Double.parseDouble(sourceLong), Double.parseDouble(sourceLat),
				categories, result);
	}

}
