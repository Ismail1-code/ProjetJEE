package ma.techmind.ws;

//import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.techmind.bean.Consommation;
import ma.techmind.bean.ImportShed;
import ma.techmind.bean.Medicament;
import ma.techmind.bean.Nourriture;
import ma.techmind.service.ConsommationService;

@RestController
@RequestMapping("stock-api/consommation")
public class ConsommationRest {
	@Autowired
	private ConsommationService consommationService ;

	

	public Consommation findByMedicament(Medicament medicamment) {
		return consommationService.findByMedicament(medicamment);
	}
	public Consommation findByNourriture(Nourriture nourriture) {
		return consommationService.findByNourriture(nourriture);
	}
	public List<Consommation> findByImportEmp(ImportShed importEmp) {
		return consommationService.findByImportEmp(importEmp);
	}
	public double totConsommeParJour(String ref) {
		return consommationService.totConsommeParJour(ref);
	}
	public double qteNourritureConsommeParJour(String ref) {
		return consommationService.qteNourritureConsommeParJour(ref);
	}
	public double totConsommeParImportEmp(ImportShed importEmp) {
		return consommationService.totConsommeParImportEmp(importEmp);
	}
	//public Consommation findByImportEmplacementReferenceAndDate(String reference, Date date) {
		//return consommationService.findByImportEmplacementReferenceAndDate(reference, date);
	//}
	
	/*@GetMapping("/stockMedicamment/{stockMedicamment}")
	public Consommation findByStockMedicamment(@RequestBody StockMedicament stockMedicamment) {
		return consommationService.findByStockMedicamment(stockMedicamment);
	}*/
	/*@GetMapping("/stockNourriture/{stockNourriture}")
	public Consommation findByStockNourriture(@RequestBody StockNourriture stockNourriture) {
		return consommationService.findByStockNourriture(stockNourriture);
	}*/
	@PostMapping("/")
	public int save(@RequestBody Consommation consommation) {
		return consommationService.save(consommation);
	}
	@GetMapping("/")
	public List<Consommation> findAll() {
		return consommationService.findAll();
	}
	@GetMapping("/ref/{ref}")
	public Consommation findByRef(@PathVariable String ref) {
		return consommationService.findByRef(ref);
	}
	
	
	
	
	
}
