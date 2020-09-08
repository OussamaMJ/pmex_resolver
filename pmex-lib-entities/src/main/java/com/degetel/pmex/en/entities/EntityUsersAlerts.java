package com.degetel.pmex.en.entities;

import com.degetel.pmex.en.HibernatePgSqlEnum;
import com.degetel.pmex.en.enums.RefAlertCategory;

import lombok.Builder;
import lombok.Data;

@javax.persistence.Entity
@javax.persistence.Table(name = "users_alerts")
@org.hibernate.annotations.TypeDef(name = "pgsql_enum", typeClass = HibernatePgSqlEnum.class)
@Data
@Builder
public class EntityUsersAlerts {

	  /**
	   *Sending Time. 
	   */
	  @javax.persistence.Column(name = "created_at")
	  @javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	  private java.util.Date createdAt ;
	  
	  @javax.persistence.Column(name = "id")
	  @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	  @javax.persistence.Id
	  private Long id ;
	  
	  /**
	   *Sender Trading Id. 
	   */
	  @javax.persistence.Column(name = "id_trading_source")
	  private Long idTradingSource ;
	  
	  /**
	   *Recipient User Id. 
	   */
	  @javax.persistence.Column(name = "id_user_receipient")
	  private Long idUserReceipient ;
	  
	  /**
	   *Sender User Id. 
	   */
	  @javax.persistence.Column(name = "id_user_source")
	  private Long idUserSource ;
	  
	  @javax.persistence.Column(name = "is_new")
	  @javax.validation.constraints.NotNull 
	  private boolean isNew ;
	  
	  /**
	   *The core message. 
	   */
	  @javax.persistence.Column(name = "message")
	  private String message ;
	  
	  @javax.persistence.Column(name = "type")
	  @javax.persistence.Enumerated(javax.persistence.EnumType.STRING)
	  @org.hibernate.annotations.Type(type = "pgsql_enum")
	  private RefAlertCategory type ;
	  
	  /**
	   *Public Alert Id. 
	   */
	  @javax.persistence.Column(name = "uuid")
	  private String uuid ;
	  

	  public boolean equals(Object obj) {
	    if (null == this.id) return super.equals(obj) ;
	    if (null == obj) return false ;
	    if (!(obj instanceof EntityUsersAlerts)) return false ;

	    EntityUsersAlerts _id = (EntityUsersAlerts) obj ;
	    if (!java.util.Objects.equals(this.id, _id.getId())) return false ;
	    return true;
	  }

	  public int hashCode() {
	    if (null == this.id) return super.hashCode() ;
	    return java.util.Objects.hash(id) ;
	  }  
}
