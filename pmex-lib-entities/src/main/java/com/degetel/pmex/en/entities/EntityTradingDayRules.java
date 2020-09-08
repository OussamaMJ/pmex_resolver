package com.degetel.pmex.en.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "trading_day_rules")
@Data
@Builder
public class EntityTradingDayRules {

	  @Column(name = "allowed_number_of_share_max")
	  private Integer allowedNumberOfShareMax ;
	  
	  @Column(name = "allowed_number_of_share_min")
	  private Integer allowedNumberOfShareMin ;
	  
	  @Column(name = "date_acquisition_prior_to")
	  @Temporal(TemporalType.DATE)
	  private java.util.Date dateAcquisitionPriorTo ;
	  
	  @Column(name = "holding_period_longer_than")
	  private Integer holdingPeriodLongerThan ;
	  
	  @Column(name = "id")
	  @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	  @Id
	  private Long id ;
	  

	  public boolean equals(Object obj) {
	    if (null == this.id) return super.equals(obj) ;
	    if (null == obj) return false ;
	    if (!(obj instanceof EntityTradingDayRules)) return false ;

	    EntityTradingDayRules _id = (EntityTradingDayRules) obj ;
	    if (!java.util.Objects.equals(this.id, _id.getId())) return false ;
	    return true;
	  }

	  public int hashCode() {
	    if (null == this.id) return super.hashCode() ;
	    return java.util.Objects.hash(id) ;
	  }
}
