package ma.techmind.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.techmind.bean.Consommation;
import ma.techmind.bean.ImportShed;
import ma.techmind.bean.Medicament;
import ma.techmind.bean.Nourriture;
import ma.techmind.bean.StockMedicament;
import ma.techmind.bean.StockNourriture;
import ma.techmind.dao.ConsommationDao;
import ma.techmind.service.ConsommationService;

@Service
public class ConsommationServiceImpl implements ConsommationService {
	@Autowired
	private ConsommationDao consommationDao ;

	@Override
	public Consommation findByMedicament(Medicament medicamment) {
		// TODO Auto-generated method stub
		return consommationDao.findByMedicament(medicamment);
	}
	
	@Override
	public List<Consommation> findByImportEmp(ImportShed importEmp) {
		// TODO Auto-generated method stub
		return consommationDao.findByImportEmp(importEmp);
	}
	@Override
	public Consommation findByNourriture(Nourriture nourriture) {
		// TODO Auto-generated method stub
		return consommationDao.findByNourriture(nourriture);
	}

	@Override
	public Consommation findByStockMedicamment(StockMedicament stockMedicamment) {
		// TODO Auto-generated method stub
		return consommationDao.findByStockMedicamment(stockMedicamment);
	}

	@Override
	public Consommation findByStockNourriture(StockNourriture stockNourriture) {
		// TODO Auto-generated method stub
		return consommationDao.findByStockNourriture(stockNourriture);
	}

	@Override
	public int save(Consommation consommation) {
		// TODO Auto-generated method stub
		Consommation foundedconsommation = consommationDao.findByRef(consommation.getRef());
		if (foundedconsommation==null) return -1;
		else {
		 consommationDao.save(consommation);
		 return 1;}
	}

	@Override
	public List<Consommation> findAll() {
		// TODO Auto-generated method stub
		return  consommationDao.findAll();
	}

	@Override
	public Consommation findByRef(String ref) {
		// TODO Auto-generated method stub
		return consommationDao.findByRef(ref);		
	}
	
	
	@Override
	public double totConsommeParJour(String ref) {
		double tot ;
		Consommation consommation = findByRef(ref);
		tot = consommation.getMedicament().getPrixUni()*consommation.getQteMedicamment()+consommation.getNourriture().getPrixUni()*consommation.getQteNourriture();
	return 	tot;
	}
	
	@Override
	public double totConsommeParImportEmp(ImportShed importEmp) {
		double sommeConsommation =0;
		List<Consommation> listconsommation =findByImportEmp(importEmp);
		for (Consommation c : listconsommation) {
			sommeConsommation += totConsommeParJour(c.getRef());	
		}
		return sommeConsommation;
	}
	
	@Override
	public double qteNourritureConsommeParJour (String ref) {
		Consommation consommation = findByRef(ref);
		double totNourritureConsomme;
		totNourritureConsomme=consommation.getQteNourriture()-consommation.getQteRestNourriture();
		return totNourritureConsomme;
	}
	
	@Override
	public double qteMedicammentConsommeParJour (String ref) {
		Consommation consommation = findByRef(ref);
		double totMedicammentConsomme;
		totMedicammentConsomme=consommation.getQteMedicamment()-consommation.getQteRestmMedicamment();
		return totMedicammentConsomme;
	}
	
	
	
}


	