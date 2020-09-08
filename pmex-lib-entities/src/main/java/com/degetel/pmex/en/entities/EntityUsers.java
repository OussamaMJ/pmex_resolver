package com.degetel.pmex.en.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@javax.persistence.Entity
@javax.persistence.Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EntityUsers {

	  @javax.persistence.Column(name = "balance")
	  private Float balance ;
	  
	  @javax.persistence.Column(name = "created_at")
	  @javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)

	  private java.util.Date createdAt ;
	  
	  /**
	   *@personnal. 
	   */
	  @javax.persistence.Column(name = "date_birth")
	  @javax.validation.constraints.NotNull 
	  private String dateBirth ;
	  
	  /**
	   *@personnal login. 
	   */
	  @javax.persistence.Column(name = "email")
	  @javax.validation.constraints.NotNull 
	  private String email ;
	  
	  /**
	   *@personnal. 
	   */
	  @javax.persistence.Column(name = "email_auxiliary")
	  private String emailAuxiliary ;
	  
	  /**
	   *true when the customer has checked the data collection checkbox.. 
	   */
	  @javax.persistence.Column(name = "has_authorized_data_collection")

	  private boolean hasAuthorizedDataCollection ;
	  
	  /**
	   *true when the customer has checked the cgu checkbox.. 
	   */
	  @javax.persistence.Column(name = "has_read_cgu")

	  private boolean hasReadCgu ;
	  
	  /**
	   *true when the customer has filled the 'I agree' field.. 
	   */
	  @javax.persistence.Column(name = "has_signed_terms")

	  private boolean hasSignedTerms ;
	  
	  @javax.persistence.Column(name = "id")
	  @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	  @javax.persistence.Id
	  private Long id ;
	  
	  /**
	   *@personnal may be the same address than the contact address.. 
	   */
	  @javax.persistence.Column(name = "id_address_billing")
	  private Long idAddressBilling ;
	  
	  /**
	   *@personnal. 
	   */
	  @javax.persistence.Column(name = "id_address_contact")
	  private Long idAddressContact ;
	  
	  @javax.persistence.Column(name = "id_employer")
	  private Long idEmployer ;
	  
	  /**
	   *true when user is administrator.. 
	   */
	  @javax.persistence.Column(name = "is_admin")

	  private boolean isAdmin ;
	  
	  /**
	   *true when the customer has checked the possible loss disclaimer checkbox.. 
	   */
	  @javax.persistence.Column(name = "is_aware_of_possible_loss")
	  private boolean isAwareOfPossibleLoss ;
	  
	  @javax.persistence.Column(name = "is_ceo")
	  @javax.validation.constraints.NotNull 
	  private boolean isCeo ;
	  
	  /**
	   *true when the customer has visited the verification link send by email.. 
	   */
	  @javax.persistence.Column(name = "is_verified")
	  @javax.validation.constraints.NotNull 
	  private boolean isVerified ;
	  
	  @javax.persistence.Column(name = "last_logged_at")
	  @javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	  private java.util.Date lastLoggedAt ;
	  
	  /**
	   *@personnal. 
	   */
	  @javax.persistence.Column(name = "name_family")
	  @javax.validation.constraints.NotNull 
	  private String nameFamily ;
	  
	  /**
	   *@personnal. 
	   */
	  @javax.persistence.Column(name = "name_first")
	  @javax.validation.constraints.NotNull 
	  private String nameFirst ;
	  
	  /**
	   *salted password hash. 
	   */
	  @javax.persistence.Column(name = "password_hash")
	  private String passwordHash ;
	  
	  /**
	   *@personnal. 
	   */
	  @javax.persistence.Column(name = "phone_number_main")
	  @javax.validation.constraints.NotNull 
	  private String phoneNumberMain ;
	  
	  /**
	   *public id. 
	   */
	  @javax.persistence.Column(name = "uuid")
	  private String uuid ;
	  
	  @javax.persistence.Column(name = "verified_at")
	  @javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	  private java.util.Date verifiedAt ;
	  

	  public boolean equals(Object obj) {
	    if (null == this.id) return super.equals(obj) ;
	    if (null == obj) return false ;
	    if (!(obj instanceof EntityUsers)) return false ;

	    EntityUsers _id = (EntityUsers) obj ;
	    if (!java.util.Objects.equals(this.id, _id.getId())) return false ;
	    return true;
	  }

	  public int hashCode() {
	    if (null == this.id) return super.hashCode() ;
	    return java.util.Objects.hash(id) ;
	  }
}
