package com.degetel.pmex.en.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.degetel.pmex.en.HibernatePgSqlEnum;
import com.degetel.pmex.en.enums.RefTitleShareholder;
import com.degetel.pmex.en.enums.RefTypeShareholder;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "company_shareholders")
@IdClass(IdOfCompanyShareholders.class)
@TypeDef(name = "pgsql_enum", typeClass = HibernatePgSqlEnum.class)
@Data
@Builder
public class EntityCompanyShareholders{
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = -41466536695216387L;

	@Column(name = "count_avail_shares")
	  private Integer countAvailShares ;
	  
	  @Column(name = "count_total_shares")
	  private Integer countTotalShares ;
	  
	  @Column(name = "display_name")
	  private String displayName ;
	  
	  @Column(name = "display_title")
	  @Enumerated(javax.persistence.EnumType.STRING)
	  @Type(type = "pgsql_enum")
	  private RefTitleShareholder displayTitle ;
	  
	  @Column(name = "id_company")
	  @Id
	  @NotNull 
	  private long idCompany ;
	  
	  @Column(name = "id_user")
	  @Id
	  @NotNull 
	  private long idUser ;
	  
	  @Column(name = "is_major")
	  private Boolean isMajor ;
	  
	  @Column(name = "type_shareholder")
	  @Enumerated(javax.persistence.EnumType.STRING)
	  @Type(type = "pgsql_enum")
	  private RefTypeShareholder typeShareholder ;
	  
	  public IdOfCompanyShareholders toIdClass() { return new IdOfCompanyShareholders(idUser, idCompany) ;}


	  public boolean equals(Object obj) {
	    if (null == obj) return false ;
	    if (!(obj instanceof EntityCompanyShareholders)) return false ;

	    EntityCompanyShareholders _id = (EntityCompanyShareholders) obj ;
	    if (!java.util.Objects.equals(this.idUser, _id.getIdUser())) return false ;
	    if (!java.util.Objects.equals(this.idCompany, _id.getIdCompany())) return false ;
	    return true;
	  }

	  public int hashCode() {
	    return java.util.Objects.hash(idUser, idCompany) ;
	  }

}
