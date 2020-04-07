package ma.techmind.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.techmind.bean.Consommation;


@Repository
public interface ConsommationDao extends JpaRepository<Consommation, Long>{
	Consommation findByRef(String ref);
	Consommation findByRefMedicament(String refMedicament);
	Consommation findByRefNourriture(String refNourriture);
	Consommation findByImportEmp(String importEmp);
	Consommation deleteByRef(String ref);
	
	}
