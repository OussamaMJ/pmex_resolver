package com.degetel.pmex.en.entities;

import lombok.Builder;
import lombok.Data;

@javax.persistence.Entity
@javax.persistence.Table(name = "user_addresses")
@Data
@Builder
public class EntityUserAddresses {

	  @javax.persistence.Column(name = "address1")
	  @javax.validation.constraints.NotNull 
	  private String address1 ;
	  
	  @javax.persistence.Column(name = "address2")
	  private String address2 ;
	  
	  @javax.persistence.Column(name = "city")
	  @javax.validation.constraints.NotNull 
	  private String city ;
	  
	  @javax.persistence.Column(name = "country")
	  @javax.validation.constraints.NotNull 
	  private String country ;
	 
	  @javax.persistence.Column(name = "id")
	  @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	  @javax.persistence.Id
	  private Long id ;
	  
	  @javax.persistence.Column(name = "state")
	  private String state ;
	  
	  @javax.persistence.Column(name = "zipcode")
	  @javax.validation.constraints.NotNull 
	  private String zipcode ;
	  

	  public boolean equals(Object obj) {
	    if (null == this.id) return super.equals(obj) ;
	    if (null == obj) return false ;
	    if (!(obj instanceof EntityUserAddresses)) return false ;

	    EntityUserAddresses _id = (EntityUserAddresses) obj ;
	    if (!java.util.Objects.equals(this.id, _id.getId())) return false ;
	    return true;
	  }

	  public int hashCode() {
	    if (null == this.id) return super.hashCode() ;
	    return java.util.Objects.hash(id) ;
	  }
}
