package ma.techmind.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
//import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Consommation implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String ref ;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date date ; 
	
	private String importEmp ;
	
	private String refMedicament ;
	private double prixMedicamentUnit ;
	private double qteMedicament ;
	private double qteRestMedicamment ; 
	
	private String refNourriture ;
	private double prixNourritureUnit ;
	private double qteNourriture ;
	private double qteRestNourriture ; 
	
	
	
	
	

	public Consommation() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Consommation(Long id, String ref, Date date, String importEmp, String refMedicament,
			double prixMedicamentUnit, double qteMedicament, double qteRestMedicamment, String refNourriture,
			double prixNourritureUnit, double qteNourriture, double qteRestNourriture) {
		super();
		this.id = id;
		this.ref = ref;
		this.date = date;
		this.importEmp = importEmp;
		this.refMedicament = refMedicament;
		this.prixMedicamentUnit = prixMedicamentUnit;
		this.qteMedicament = qteMedicament;
		this.qteRestMedicamment = qteRestMedicamment;
		this.refNourriture = refNourriture;
		this.prixNourritureUnit = prixNourritureUnit;
		this.qteNourriture = qteNourriture;
		this.qteRestNourriture = qteRestNourriture;
	}





	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public String getRef() {
		return ref;
	}





	public void setRef(String ref) {
		this.ref = ref;
	}





	public Date getDate() {
		return date;
	}





	public void setDate(Date date) {
		this.date = date;
	}





	public String getImportEmp() {
		return importEmp;
	}





	public void setImportEmp(String importEmp) {
		this.importEmp = importEmp;
	}





	public String getRefMedicament() {
		return refMedicament;
	}





	public void setRefMedicament(String refMedicament) {
		this.refMedicament = refMedicament;
	}





	public double getPrixMedicamentUnit() {
		return prixMedicamentUnit;
	}





	public void setPrixMedicamentUnit(double prixMedicamentUnit) {
		this.prixMedicamentUnit = prixMedicamentUnit;
	}





	public double getQteMedicament() {
		return qteMedicament;
	}





	public void setQteMedicament(double qteMedicament) {
		this.qteMedicament = qteMedicament;
	}





	public double getQteRestmMedicamment() {
		return qteRestMedicamment;
	}





	public void setQteRestMedicamment(double qteRestMedicamment) {
		this.qteRestMedicamment = qteRestMedicamment;
	}





	public String getRefNourriture() {
		return refNourriture;
	}





	public void setRefNourriture(String refNourriture) {
		this.refNourriture = refNourriture;
	}





	public double getPrixNourritureUnit() {
		return prixNourritureUnit;
	}





	public void setPrixNourritureUnit(double prixNourritureUnit) {
		this.prixNourritureUnit = prixNourritureUnit;
	}





	public double getQteNourriture() {
		return qteNourriture;
	}





	public void setQteNourriture(double qteNourriture) {
		this.qteNourriture = qteNourriture;
	}





	public double getQteRestNourriture() {
		return qteRestNourriture;
	}





	public void setQteRestNourriture(double qteRestNourriture) {
		this.qteRestNourriture = qteRestNourriture;
	}
	
	


	
}