package ma.techmind.service;

import java.util.List;

import ma.techmind.bean.Consommation;
import ma.techmind.bean.ImportShed;
import ma.techmind.bean.Medicament;
import ma.techmind.bean.Nourriture;
import ma.techmind.bean.StockMedicament;
import ma.techmind.bean.StockNourriture;

public interface ConsommationService {
	int save(Consommation consommation);
	public List<Consommation> findAll();
	Consommation findByRef(String ref);
	double totConsommeParJour(String ref);
	double qteNourritureConsommeParJour(String ref);
	
	double qteMedicammentConsommeParJour(String ref);
	
}
