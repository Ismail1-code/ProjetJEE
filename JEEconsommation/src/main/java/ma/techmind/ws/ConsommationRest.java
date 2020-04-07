package ma.techmind.ws;

import java.util.Date;
//import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.techmind.bean.Consommation;

import ma.techmind.service.ConsommationService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("stock-api/consommation")
public class ConsommationRest {
	@Autowired
	private ConsommationService consommationService ;
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
  
   @GetMapping("/importEmp/{importEmp}")
	public List<Consommation> findByImportEmp(@PathVariable String importEmp) {
		return consommationService.findByImportEmp(importEmp);
	}
   @DeleteMapping("/ref/{ref}")
	public int deleteByRef(@PathVariable String ref) {
		return consommationService.deleteByRef(ref);
	}
   @PutMapping("/update/")
    public int updateConsommation(@RequestBody Consommation c){
	   return consommationService.updateConsommation(c);
   }
	

	
	
	
	
	
}
