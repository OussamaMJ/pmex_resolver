package com.degetel.pmex.en.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "owned_share_history")
@Data
@Builder
public class EntityOwnedShareHistory {

	  @Column(name = "id")
	  @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	  @Id
	  private Long id ;
	  
	  @Column(name = "id_company")
	  private Long idCompany ;
	  
	  @Column(name = "id_user")
	  private Long idUser ;
	  
	  @Column(name = "timestamp_log")
	  @Temporal(javax.persistence.TemporalType.TIMESTAMP)
	  private java.util.Date timestampLog ;
	  
	  @Column(name = "total_share_number")
	  private Integer totalShareNumber ;
	  
	  @Column(name = "total_share_value")
	  private Float totalShareValue ;
	  

	  public boolean equals(Object obj) {
	    if (null == this.id) return super.equals(obj) ;
	    if (null == obj) return false ;
	    if (!(obj instanceof EntityOwnedShareHistory)) return false ;

	    EntityOwnedShareHistory _id = (EntityOwnedShareHistory) obj ;
	    if (!java.util.Objects.equals(this.id, _id.getId())) return false ;
	    return true;
	  }

	  public int hashCode() {
	    if (null == this.id) return super.hashCode() ;
	    return java.util.Objects.hash(id) ;
	  }
}
