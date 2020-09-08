package com.degetel.pmex.en.entities;

import com.degetel.pmex.en.HibernatePgSqlEnum;
import com.degetel.pmex.en.enums.RefSetupAlertType;

import lombok.Builder;
import lombok.Data;

@javax.persistence.Entity
@javax.persistence.Table(name = "user_setup_alerts")
@org.hibernate.annotations.TypeDef(name = "pgsql_enum", typeClass = HibernatePgSqlEnum.class)
@Data
@Builder
public class EntityUserSetupAlerts {

	  @javax.persistence.Column(name = "id")
	  @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	  @javax.persistence.Id
	  private Long id ;
	  
	  /**
	   *Trading Day Id. 
	   */
	  @javax.persistence.Column(name = "id_trading_day")
	  private Long idTradingDay ;
	  
	  /**
	   *User Id. 
	   */
	  @javax.persistence.Column(name = "id_user")
	  private Long idUser ;
	  

	  @javax.persistence.Column(name = "type")
	  @javax.persistence.Enumerated(javax.persistence.EnumType.STRING)
	  @org.hibernate.annotations.Type(type = "pgsql_enum")
	  private RefSetupAlertType type ;
	  
	  @javax.persistence.Column(name = "value")
	  private Float value ;
	  

	  public boolean equals(Object obj) {
	    if (null == this.id) return super.equals(obj) ;
	    if (null == obj) return false ;
	    if (!(obj instanceof EntityUserSetupAlerts)) return false ;

	    EntityUserSetupAlerts _id = (EntityUserSetupAlerts) obj ;
	    if (!java.util.Objects.equals(this.id, _id.getId())) return false ;
	    return true;
	  }

	  public int hashCode() {
	    if (null == this.id) return super.hashCode() ;
	    return java.util.Objects.hash(id) ;
	  }
}
