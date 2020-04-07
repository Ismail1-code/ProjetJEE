package ma.techmind.service;

import java.util.Date;
import java.util.List;

import ma.techmind.bean.Consommation;

public interface ConsommationService {
	int save(Consommation consommation);
	 List<Consommation> findAll();
	Consommation findByRef(String ref);
	List<Consommation>findByDate(Date d);
	List<Consommation> findByImportEmp(String importEmp);
    int deleteByRef(String ref);
	int updateConsommation(Consommation c);	
	
}
