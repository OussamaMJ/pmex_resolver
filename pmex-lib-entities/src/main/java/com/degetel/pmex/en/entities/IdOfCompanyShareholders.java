package com.degetel.pmex.en.entities;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class IdOfCompanyShareholders implements Serializable{
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = 4072778088305491397L;

	@NotNull 
	  private long idCompany ;

	  @NotNull 
	  private long idUser ;

	  
	  public boolean equals(Object obj) {
	    if (null == obj) return false ;
	    if (!(obj instanceof IdOfCompanyShareholders)) return false ;

	    IdOfCompanyShareholders _id = (IdOfCompanyShareholders) obj ;
	    if (!java.util.Objects.equals(idUser, _id.getIdUser())) return false ;
	    if (!java.util.Objects.equals(idCompany, _id.getIdCompany())) return false ;
	    return true;
	  }

	  public int hashCode() { return java.util.Objects.hash(idUser, idCompany) ; }

}
