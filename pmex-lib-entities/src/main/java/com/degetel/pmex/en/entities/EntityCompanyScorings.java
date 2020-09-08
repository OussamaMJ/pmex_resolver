package com.degetel.pmex.en.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.degetel.pmex.en.HibernatePgSqlEnum;
import com.degetel.pmex.en.enums.RefVisualIndicator;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "company_scorings")
@TypeDef(name = "pgsql_enum", typeClass = HibernatePgSqlEnum.class)
@Data
@EqualsAndHashCode
@Builder
public class EntityCompanyScorings {

	  @Column(name = "id_company")
	  @Id
	  @NotNull 
	  private long idCompany ;
	  
	  @Column(name = "level_fin")
	  @Enumerated(javax.persistence.EnumType.STRING)
	  @Type(type = "pgsql_enum")
	  private RefVisualIndicator levelFin ;
	  
	  @Column(name = "level_global")
	  @Enumerated(javax.persistence.EnumType.STRING)
	  @Type(type = "pgsql_enum")
	  private RefVisualIndicator levelGlobal ;
	  
	  @Column(name = "level_hr")
	  @Enumerated(javax.persistence.EnumType.STRING)
	  @Type(type = "pgsql_enum")
	  private RefVisualIndicator levelHr ;
	  
	  @Column(name = "level_pmex")
	  @Enumerated(javax.persistence.EnumType.STRING)
	  @Type(type = "pgsql_enum")
	  private RefVisualIndicator levelPmex ;
	  
	  @Column(name = "level_prod")
	  @Enumerated(javax.persistence.EnumType.STRING)
	  @Type(type = "pgsql_enum")
	  private RefVisualIndicator levelProd ;
	  
	  @Column(name = "level_risk")
	  @Enumerated(javax.persistence.EnumType.STRING)
	  @Type(type = "pgsql_enum")
	  private RefVisualIndicator levelRisk ;
	  
	  @Column(name = "score_fin")
	  private Integer scoreFin ;
	  
	  @Column(name = "score_global")
	  private Integer scoreGlobal ;
	  
	  @Column(name = "score_hr")
	  private Integer scoreHr ;
	  
	  @Column(name = "score_pmex")
	  private Integer scorePmex ;
	  
	  @Column(name = "score_prod")
	  private Integer scoreProd ;
	  
	  @Column(name = "score_risk")
	  private Integer scoreRisk ;
	  

	 /* public boolean equals(Object obj) {
	    if (null == obj) return false ;
	    if (!(obj instanceof EntityCompanyScorings)) return false ;

	    EntityCompanyScorings _id = (EntityCompanyScorings) obj ;
	    if (!java.util.Objects.equals(this.idCompany, _id.getIdCompany())) return false ;
	    return true;
	  }

	  public int hashCode() {
	    return java.util.Objects.hash(idCompany) ;
	  }*/
}
