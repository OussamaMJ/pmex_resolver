package com.degetel.pmex.en.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.TypeDef;

import com.degetel.pmex.en.HibernatePgSqlEnum;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "company_shareholders_breakdown")
@TypeDef(name = "pgsql_enum", typeClass = HibernatePgSqlEnum.class)
@Data
@Builder
public class EntityCompanyShareholdersBreakdown {
	
	  @Column(name = "id_company")
	  @Id
	  @NotNull 
	  private long idCompany ;
	  
	  @Column(name = "share_employee")
	  private Integer shareEmployee ;
	 
	  @Column(name = "share_family")
	  private Integer shareFamily ;
	  
	  @Column(name = "share_founder")
	  private Integer shareFounder ;
	  
	  @Column(name = "share_institutional")
	  private Integer shareInstitutional ;
	 
	  @Column(name = "share_organization")
	  private Integer shareOrganization ;
	  
	  @Column(name = "share_private")
	  private Integer sharePrivate ;
	  

	  public boolean equals(Object obj) {
	    if (null == obj) return false ;
	    if (!(obj instanceof EntityCompanyShareholdersBreakdown)) return false ;

	    EntityCompanyShareholdersBreakdown _id = (EntityCompanyShareholdersBreakdown) obj ;
	    if (!java.util.Objects.equals(this.idCompany, _id.getIdCompany())) return false ;
	    return true;
	  }

	  public int hashCode() {
	    return java.util.Objects.hash(idCompany) ;
	  }

}
