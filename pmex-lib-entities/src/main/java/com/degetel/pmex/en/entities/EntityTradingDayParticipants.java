package com.degetel.pmex.en.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.degetel.pmex.en.HibernatePgSqlEnum;
import com.degetel.pmex.en.enums.RefParticipationStatus;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "trading_day_participants")
@IdClass(IdOfTradingDayParticipants.class)
@TypeDef(name = "pgsql_enum", typeClass = HibernatePgSqlEnum.class)
@Data
@Builder
public class EntityTradingDayParticipants {

	  @Column(name = "created_at")
	  @Temporal(javax.persistence.TemporalType.TIMESTAMP)
	  @NotNull 
	  private java.util.Date createdAt ;
	  
	  @Column(name = "id_participant")
	  @Id
	  @NotNull 
	  private long idParticipant ;
	  
	  @Column(name = "id_trading_day")
	  @Id
	  @NotNull 
	  private long idTradingDay ;
	  
	  @Column(name = "last_modified_at")
	  @Temporal(javax.persistence.TemporalType.TIMESTAMP)
	  private java.util.Date lastModifiedAt ;
	  
	  @Column(name = "status")
	  @Enumerated(javax.persistence.EnumType.STRING)
	  @Type(type = "pgsql_enum")
	  @NotNull 
	  private RefParticipationStatus status ;
	  

	  public boolean equals(Object obj) {
	    if (null == obj) return false ;
	    if (!(obj instanceof EntityTradingDayParticipants)) return false ;

	    EntityTradingDayParticipants _id = (EntityTradingDayParticipants) obj ;
	    if (!java.util.Objects.equals(this.idTradingDay, _id.getIdTradingDay())) return false ;
	    if (!java.util.Objects.equals(this.idParticipant, _id.getIdParticipant())) return false ;
	    return true;
	  }

	  public int hashCode() {
	    return java.util.Objects.hash(idTradingDay, idParticipant) ;
	  }

	  public IdOfTradingDayParticipants toIdClass() { return new IdOfTradingDayParticipants(idTradingDay, idParticipant) ;}
}
