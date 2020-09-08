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
import com.degetel.pmex.en.enums.RefAlgorithmResolution;
import com.degetel.pmex.en.enums.RefStrategyFixingNegotiation;
import com.degetel.pmex.en.enums.RefStrategyMatching;
import com.degetel.pmex.en.enums.RefStrategyOtcNegotiation;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "company_rules")
@TypeDef(name = "pgsql_enum", typeClass = HibernatePgSqlEnum.class)
@Data
@Builder
public class EntityCompanyRules {

	  @Column(name = "algorithm_resolution")
	  @Enumerated(javax.persistence.EnumType.STRING)
	  @Type(type = "pgsql_enum")
	  private RefAlgorithmResolution algorithmResolution ;
	 
	  @Column(name = "auctioning_duration")
	  private Integer auctioningDuration ;
	  
	  @Column(name = "auctioning_interval")
	  private Integer auctioningInterval ;
	  
	  @Column(name = "id_company")
	  @Id
	  @NotNull
	  private long idCompany ;
	  
	  @Column(name = "strategy_fixing_negotiation")
	  @Enumerated(javax.persistence.EnumType.STRING)
	  @Type(type = "pgsql_enum")
	  private RefStrategyFixingNegotiation strategyFixingNegotiation ;
	  
	  @Column(name = "strategy_matching")
	  @Enumerated(javax.persistence.EnumType.STRING)
	  @Type(type = "pgsql_enum")
	  private RefStrategyMatching strategyMatching ;
	  
	  @Column(name = "strategy_otc_negotiation")
	  @Enumerated(javax.persistence.EnumType.STRING)
	  @Type(type = "pgsql_enum")
	  private RefStrategyOtcNegotiation strategyOtcNegotiation ;
	  

	  public boolean equals(Object obj) {
	    if (null == obj) return false ;
	    if (!(obj instanceof EntityCompanyRules)) return false ;

	    EntityCompanyRules _id = (EntityCompanyRules) obj ;
	    if (!java.util.Objects.equals(this.idCompany, _id.getIdCompany())) return false ;
	    return true;
	  }

	  public int hashCode() {
	    return java.util.Objects.hash(idCompany) ;
	  }
}
