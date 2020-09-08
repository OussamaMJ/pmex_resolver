package com.degetel.pmex.en.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.degetel.pmex.en.HibernatePgSqlEnum;
import com.degetel.pmex.en.enums.RefTypePublication;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "company_publications")
@TypeDef(name = "pgsql_enum", typeClass = HibernatePgSqlEnum.class)
@Data
@Builder
public class EntityCompanyPublications {

	@Column(name = "attachement")
	  private String attachement ;
	 
	  @Column(name = "category")
	  @Enumerated(javax.persistence.EnumType.STRING)
	  @Type(type = "pgsql_enum")
	  private RefTypePublication category ;
	  
	  @Column(name = "date_archive")
	  @Temporal(javax.persistence.TemporalType.DATE)
	  @NotNull 
	  private java.util.Date dateArchive ;
	  
	  @Column(name = "date_event")
	  @Temporal(javax.persistence.TemporalType.DATE)
	  private java.util.Date dateEvent ;
	  
	  @Column(name = "description")
	  private String description ;
	  
	  @Column(name = "id")
	  @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	  @Id
	  private Long id ;
	  
	  @Column(name = "id_author")
	  private Long idAuthor ;
	  
	  @Column(name = "id_company")
	  private Long idCompany ;
	  
	  @Column(name = "is_private_access")
	  @NotNull 
	  private boolean isPrivateAccess ;
	  
	  @Column(name = "is_published")
	  @NotNull 
	  private boolean isPublished ;
	  
	  @Column(name = "language")
	  private String language ;
	  
	  @Column(name = "timestamp_creation")
	  @Temporal(javax.persistence.TemporalType.TIMESTAMP)
	  @NotNull 
	  private java.util.Date timestampCreation ;
	  
	  @Column(name = "title")
	  private String title ;
	  
	  @Column(name = "uuid")
	  private String uuid ;
	  
	public boolean equals(Object obj) {
	    if (null == this.id) return super.equals(obj) ;
	    if (null == obj) return false ;
	    if (!(obj instanceof EntityCompanyPublications)) return false ;

	    EntityCompanyPublications _id = (EntityCompanyPublications) obj ;
	    if (!java.util.Objects.equals(this.id, _id.getId())) return false ;
	    return true;
	  }

	  public int hashCode() {
	    if (null == this.id) return super.hashCode() ;
	    return java.util.Objects.hash(id) ;
	  }
	}


