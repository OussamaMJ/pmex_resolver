package com.degetel.pmex.en.entities;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class IdOfTradingDayParticipants implements Serializable {

	  /**
	 * 
	 */
	private static final long serialVersionUID = 2315487977263664696L;

	@NotNull 
	  private long idParticipant ;
	  
	  @NotNull 
	  private long idTradingDay ;
	  

	  

	  public boolean equals(Object obj) {
	    if (null == obj) return false ;
	    if (!(obj instanceof IdOfTradingDayParticipants)) return false ;

	    IdOfTradingDayParticipants _id = (IdOfTradingDayParticipants) obj ;
	    if (!java.util.Objects.equals(idTradingDay, _id.getIdTradingDay())) return false ;
	    if (!java.util.Objects.equals(idParticipant, _id.getIdParticipant())) return false ;
	    return true;
	  }

	  public int hashCode() { return java.util.Objects.hash(idTradingDay, idParticipant) ; }
}
