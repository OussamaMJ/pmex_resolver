package com.degetel.pmex.en.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.degetel.pmex.en.HibernatePgSqlEnum;
import com.degetel.pmex.en.enums.RefMatchingStrategy;
import com.degetel.pmex.en.enums.RefNegociationAlgorithm;
import com.degetel.pmex.en.enums.RefRatingRythm;
import com.degetel.pmex.en.enums.RefTradingAlgorithm;
import com.degetel.pmex.en.enums.RefVisualIndicator;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "companies")
@TypeDef(name = "pgsql_enum", typeClass = HibernatePgSqlEnum.class)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EntityCompanies {

	  @Column(name = "activity_description")
	  private String activityDescription ;
	  
	  @Column(name = "count_avail_shares")
	  private Long countAvailShares ;
	  
	  @Column(name = "count_total_shares")
	  private Long countTotalShares ;
	  
	  @Column(name = "country")
	  private String country ;

	  @Column(name = "currency")
	  private String currency ;

	  @Column(name = "date_registration")
	  @Temporal(javax.persistence.TemporalType.DATE)
	  private java.util.Date dateRegistration ;
	  
	  @Column(name = "displayed_name_ceo")
	  private String displayedNameCeo ;
	  
	  @Column(name = "employees_count")
	  private Integer employeesCount ;
	  
	  @Column(name = "facebook_link")
	  private String facebookLink ;
	  
	  /**
	   *fixed fee of future trading days transactions. 
	   */
	  @Column(name = "fee_fixed")
	  @NotNull
	  private float feeFixed ;
	  
	  /**
	   *percentage fee of future trading days transactions. 
	   */
	  @Column(name = "fee_percent")
	  @NotNull 
	  private float feePercent ;
	  
	  @javax.persistence.Column(name = "head_quarter")
	  private String headQuarter ;
	  
	  /**
	   *private id. 
	   */
	  @Column(name = "id")
	  @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	  @Id
	  private Long id ;
	  
	  @Column(name = "last_price_share_indicative")
	  private Float lastPriceShareIndicative ;
	 
	  @Column(name = "linkedin_link")
	  private String linkedinLink ;
	  
	  @Column(name = "liquidity")
	  @Enumerated(javax.persistence.EnumType.STRING)
	  @Type(type = "pgsql_enum")
	  private RefVisualIndicator liquidity ;
	  
	  @Column(name = "logo")
	  private String logo ;
	  
	  @Column(name = "management_authority")
	  private String managementAuthority ;
	 
	  @Column(name = "name")
	  private String name ;
	  
	  /**
	   *Private market Securities Identification Number. 
	   */
	  @Column(name = "psin")
	  private String psin ;
	  

	  @Column(name = "rating_rythm")
	  @Enumerated(javax.persistence.EnumType.STRING)
	  @Type(type = "pgsql_enum")
	  private RefRatingRythm ratingRythm ;
	  
	  @Column(name = "registration_number")
	  private String registrationNumber ;
	  
	  @Column(name = "trading_duration_hours")
	  private Integer tradingDurationHours ;
	 
	  @Column(name = "trading_matching_strategy")
	  @Enumerated(javax.persistence.EnumType.STRING)
	  @Type(type = "pgsql_enum")
	  private RefMatchingStrategy tradingMatchingStrategy ;
	 
	  @Column(name = "trading_negociation_algorithm")
	  @Enumerated(javax.persistence.EnumType.STRING)
	  @Type(type = "pgsql_enum")
	  private RefNegociationAlgorithm tradingNegociationAlgorithm ;
	  
	  @Column(name = "trading_selected_algorithm")
	  @Enumerated(javax.persistence.EnumType.STRING)
	  @Type(type = "pgsql_enum")
	  private RefTradingAlgorithm tradingSelectedAlgorithm ;
	  
	  @Column(name = "turnover")
	  private Float turnover ;
	  

	  @Column(name = "twitter_link")
	  private String twitterLink ;
	  
	  @Column(name = "website_link")
	  private String websiteLink ;
	  
	  @Column(name = "youtube_link")
	  private String youtubeLink ;
	  
	  private Integer businessSector;

}
