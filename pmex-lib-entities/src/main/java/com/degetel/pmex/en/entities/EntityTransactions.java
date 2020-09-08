package com.degetel.pmex.en.entities;

import lombok.Builder;
import lombok.Data;

@javax.persistence.Entity
@javax.persistence.Table(name = "transactions")
@Data
@Builder
public class EntityTransactions {
	
	  @javax.persistence.Column(name = "buyer_had_shares_before")
	  @javax.validation.constraints.NotNull 
	  private boolean buyerHadSharesBefore ;
	  
	  @javax.persistence.Column(name = "created_at")
	  @javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	  @javax.validation.constraints.NotNull 
	  private java.util.Date createdAt ;
	  
	  @javax.persistence.Column(name = "id")
	  @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	  @javax.persistence.Id
	  private Long id ;
	  
	  @javax.persistence.Column(name = "id_buyer")
	  @javax.validation.constraints.NotNull 
	  private long idBuyer ;
	  
	  @javax.persistence.Column(name = "id_buyer_order")
	  @javax.validation.constraints.NotNull 
	  private long idBuyerOrder ;
	  
	  @javax.persistence.Column(name = "id_seller")
	  @javax.validation.constraints.NotNull 
	  private long idSeller ;
	  
	  @javax.persistence.Column(name = "id_seller_order")
	  @javax.validation.constraints.NotNull 
	  private long idSellerOrder ;
	  
	  @javax.persistence.Column(name = "id_trading_day")
	  @javax.validation.constraints.NotNull 
	  private long idTradingDay ;
	  
	  /**
	   *true when the transaction has been succesfully processed.. 
	   */
	  @javax.persistence.Column(name = "is_finished")
	  @javax.validation.constraints.NotNull 
	  private boolean isFinished ;
	  
	  @javax.persistence.Column(name = "seller_has_shares_left")
	  @javax.validation.constraints.NotNull 
	  private boolean sellerHasSharesLeft ;
	  
	  @javax.persistence.Column(name = "share_fee")
	  private Float shareFee ;
	  
	  @javax.persistence.Column(name = "share_price")
	  private Float sharePrice ;
	  
	  @javax.persistence.Column(name = "share_volume")
	  private Integer shareVolume ;
	  
	  /**
	   *public id. 
	   */
	  @javax.persistence.Column(name = "uuid")
	  private String uuid ;
	  

	  public boolean equals(Object obj) {
	    if (null == this.id) return super.equals(obj) ;
	    if (null == obj) return false ;
	    if (!(obj instanceof EntityTransactions)) return false ;

	    EntityTransactions _id = (EntityTransactions) obj ;
	    if (!java.util.Objects.equals(this.id, _id.getId())) return false ;
	    return true;
	  }

	  public int hashCode() {
	    if (null == this.id) return super.hashCode() ;
	    return java.util.Objects.hash(id) ;
	  }
}
