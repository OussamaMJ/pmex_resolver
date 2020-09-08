package com.degetel.pmex.en.entities;

import com.degetel.pmex.en.HibernatePgSqlEnum;
import com.degetel.pmex.en.enums.RefTypeOrder;

import lombok.Builder;
import lombok.Data;

@javax.persistence.Entity
@javax.persistence.Table(name = "trading_orders")
@org.hibernate.annotations.TypeDef(name = "pgsql_enum", typeClass = HibernatePgSqlEnum.class)
@Data
@Builder
public class EntityTradingOrders {

	  @javax.persistence.Column(name = "created_at")
	  @javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	  private java.util.Date createdAt ;
	  
	  @javax.persistence.Column(name = "id")
	  @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	  @javax.persistence.Id
	  private Long id ;
	  
	  @javax.persistence.Column(name = "id_trading")
	  private Long idTrading ;
	 
	  @javax.persistence.Column(name = "id_user")
	  private Long idUser ;
	  
	  @javax.persistence.Column(name = "is_at_market_price")
	  private Boolean isAtMarketPrice ;
	  

	  @javax.persistence.Column(name = "max_fee")
	  private Float maxFee ;
	  
	  @javax.persistence.Column(name = "price_limit")
	  private Float priceLimit ;
	  
	  @javax.persistence.Column(name = "type_order")
	  @javax.persistence.Enumerated(javax.persistence.EnumType.STRING)
	  @org.hibernate.annotations.Type(type = "pgsql_enum")
	  private RefTypeOrder typeOrder ;
	  
	  /**
	   *public id. 
	   */
	  @javax.persistence.Column(name = "uuid")
	  private String uuid ;
	  

	  @javax.persistence.Column(name = "volume")
	  private Integer volume ;
	  

	  public boolean equals(Object obj) {
	    if (null == this.id) return super.equals(obj) ;
	    if (null == obj) return false ;
	    if (!(obj instanceof EntityTradingOrders)) return false ;

	    EntityTradingOrders _id = (EntityTradingOrders) obj ;
	    if (!java.util.Objects.equals(this.id, _id.getId())) return false ;
	    return true;
	  }

	  public int hashCode() {
	    if (null == this.id) return super.hashCode() ;
	    return java.util.Objects.hash(id) ;
	  }
}
