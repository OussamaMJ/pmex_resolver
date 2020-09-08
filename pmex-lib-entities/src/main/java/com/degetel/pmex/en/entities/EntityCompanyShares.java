package com.degetel.pmex.en.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "company_shares")
@Data
@Builder
public class EntityCompanyShares {
	
	  @Column(name = "availability_date")
	  @Temporal(javax.persistence.TemporalType.DATE)
	  private java.util.Date availabilityDate ;
	  
	  @Column(name = "id")
	  @Id
	  @NotNull 
	  private long id ;
	  
	  @Column(name = "id_company")
	  private Long idCompany ;
	  
	  @Column(name = "id_owner")
	  private Long idOwner ;
	 
	  @Column(name = "share_number")
	  private Long shareNumber ;
	  

	  public boolean equals(Object obj) {
	    if (null == obj) return false ;
	    if (!(obj instanceof EntityCompanyShares)) return false ;

	    EntityCompanyShares _id = (EntityCompanyShares) obj ;
	    if (!java.util.Objects.equals(this.id, _id.getId())) return false ;
	    return true;
	  }

	  public int hashCode() {
	    return java.util.Objects.hash(id) ;
	  }
}
