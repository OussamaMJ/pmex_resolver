package com.degetel.pmex.en.entities;

import lombok.Builder;
import lombok.Data;

@javax.persistence.Entity
@javax.persistence.Table(name = "transaction_per_shares")
@Data
@Builder
public class EntityTransactionPerShares {
	
	  @javax.persistence.Column(name = "id")
	  @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	  @javax.persistence.Id
	  private Long id ;
	  
	  @javax.persistence.Column(name = "id_share")
	  private Long idShare ;
	  
	  @javax.persistence.Column(name = "id_transaction")
	  private Long idTransaction ;
	  
	  /**
	   *public id. 
	   */
	  @javax.persistence.Column(name = "uuid")
	  private String uuid ;
	  
	  public boolean equals(Object obj) {
	    if (null == this.id) return super.equals(obj) ;
	    if (null == obj) return false ;
	    if (!(obj instanceof EntityTransactionPerShares)) return false ;

	    EntityTransactionPerShares _id = (EntityTransactionPerShares) obj ;
	    if (!java.util.Objects.equals(this.id, _id.getId())) return false ;
	    return true;
	  }

	  public int hashCode() {
	    if (null == this.id) return super.hashCode() ;
	    return java.util.Objects.hash(id) ;
	  }

}
