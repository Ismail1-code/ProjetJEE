package ma.techmind.service.impl;



import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.techmind.bean.Consommation;
import ma.techmind.dao.ConsommationDao;
import ma.techmind.service.ConsommationService;


@Service 
public class ConsommationServiceImpl implements ConsommationService {
	@Autowired
	private ConsommationDao consommationDao ;

	@Override
	public int save(Consommation consommation) {
        Consommation foundedConsommation  = findByRef(consommation.getRef());
        if(foundedConsommation!=null)
        	return -1;
        else {
        	
        	consommationDao.save(consommation);
        	return 1;
        }
        	
	}

	@Override
	public List<Consommation> findAll() {
		
		return consommationDao.findAll(Sort.by(Sort.Direction.DESC, "date"));

	}

	@Override
	public Consommation findByRef(String ref) {
		return this.consommationDao.findByRef(ref);
	}

	@Override
	public List<Consommation> findByDate(Date d) {
		return consommationDao.findByDateOrderByDateDesc(d);
	}

	@Override
	public List<Consommation> findByImportEmp(String importEmp) {
		return consommationDao.findByImportEmpOrderByDateDesc(importEmp);
	}

	@Override
	@Transactional
	public int deleteByRef(String ref) {
		  Consommation foundedConsommation  = findByRef(ref);
	        if(foundedConsommation==null)
	        	return -1;
	        else {
	        	consommationDao.deleteById(foundedConsommation.getId());
	        	return 1;
	        }
	}

	@Override
	public int updateConsommation(Consommation c) {
		 Consommation foundedConsommation  = findByRef(c.getRef());
        if(foundedConsommation==null)
        	return -1;
        else {
        	foundedConsommation.setQteRestMedicamment(c.getQteRestmMedicamment());
        	foundedConsommation.setQteRestNourriture(c.getQteRestNourriture());
        	consommationDao.save(foundedConsommation);
        	return 1;
        }
	}

	

	
	
}


	