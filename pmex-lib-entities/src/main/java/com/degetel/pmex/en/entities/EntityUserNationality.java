package com.degetel.pmex.en.entities;

import lombok.Builder;
import lombok.Data;

@javax.persistence.Entity
@javax.persistence.Table(name = "user_nationality")
@Data
@Builder
public class EntityUserNationality {

	  @javax.persistence.Column(name = "country")
	  @javax.validation.constraints.NotNull 
	  private String country ;
	  
	  @javax.persistence.Column(name = "id")
	  @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	  @javax.persistence.Id
	  private Long id ;
	  
	  @javax.persistence.Column(name = "id_customer")
	  @javax.validation.constraints.NotNull 
	  private long idCustomer ;
	  

	  public boolean equals(Object obj) {
	    if (null == this.id) return super.equals(obj) ;
	    if (null == obj) return false ;
	    if (!(obj instanceof EntityUserNationality)) return false ;

	    EntityUserNationality _id = (EntityUserNationality) obj ;
	    if (!java.util.Objects.equals(this.id, _id.getId())) return false ;
	    return true;
	  }

	  public int hashCode() {
	    if (null == this.id) return super.hashCode() ;
	    return java.util.Objects.hash(id) ;
	  }
}
