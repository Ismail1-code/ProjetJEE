package ma.techmind.dao;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.techmind.bean.Consommation;


@Repository
public interface ConsommationDao extends JpaRepository<Consommation, Long>{
	    Consommation findByRef(String ref);
	    List<Consommation> findByImportEmpOrderByDateDesc(String importEmp);
		List<Consommation>findByDateOrderByDateDesc(Date d);
	
	}
