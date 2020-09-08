package com.degetel.pmex.en.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.degetel.pmex.en.HibernatePgSqlEnum;
import com.degetel.pmex.en.enums.RefRatingRythm;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "trading_days")
@TypeDef(name = "pgsql_enum", typeClass = HibernatePgSqlEnum.class)
@Data
@Builder
public class EntityTradingDays {

	  @Column(name = "fee_fixed")
	  private Float feeFixed ;
	  
	  @Column(name = "fee_percent")
	  private Float feePercent ;
	  
	  @Column(name = "historic_exchanged_orders")
	  private Integer historicExchangedOrders ;
	  
	  @Column(name = "historic_exchanged_shares")
	  private Integer historicExchangedShares ;
	  
	  @Column(name = "historic_exchanged_transactions")
	  private Integer historicExchangedTransactions ;
	  
	  @Column(name = "historic_exchanged_value")
	  private Float historicExchangedValue ;
	  
	  @Column(name = "historic_price_average")
	  private Float historicPriceAverage ;
	  
	  @Column(name = "historic_price_high")
	  private Float historicPriceHigh ;
	  
	  @Column(name = "historic_price_low")
	  private Float historicPriceLow ;
	  
	  @Column(name = "historic_price_mean")
	  private Float historicPriceMean ;
	  
	  @Column(name = "historic_total_fee")
	  private Float historicTotalFee ;
	  
	  @Column(name = "historic_total_fee_fixed")
	  private Float historicTotalFeeFixed ;
	  
	  @Column(name = "historic_total_fee_percent")
	  private Float historicTotalFeePercent ;
	  
	  @Column(name = "id")
	  @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	  @Id
	  private Long id ;
	  
	  @Column(name = "id_company")
	  private Long idCompany ;
	  
	  @Column(name = "is_allowed_all_or_nothing_strategy")
	  private Boolean isAllowedAllOrNothingStrategy ;
	  
	  @Column(name = "is_validated")
	  private Boolean isValidated ;
	  
	  @Column(name = "limit_share_count")
	  private Integer limitShareCount ;
	  
	  @Column(name = "max_price_decrease")
	  private Integer maxPriceDecrease ;
	  
	  @Column(name = "max_price_increase")
	  private Integer maxPriceIncrease ;
	  
	  @Column(name = "price_indicative")
	  private Float priceIndicative ;
	  
	  @Column(name = "rating_rythm")
	  @Enumerated(javax.persistence.EnumType.STRING)
	  @Type(type = "pgsql_enum")
	  private RefRatingRythm ratingRythm ;
	  
	  @Column(name = "rules_buyer")
	  private Long rulesBuyer ;
	  
	  @Column(name = "rules_seller")
	  private Long rulesSeller ;
	  
	  @Column(name = "timestamp_end")
	  @Temporal(javax.persistence.TemporalType.TIMESTAMP)
	  private java.util.Date timestampEnd ;
	  
	  @Column(name = "timestamp_start")
	  @Temporal(javax.persistence.TemporalType.TIMESTAMP)
	  private java.util.Date timestampStart ;
	  
	  @Column(name = "timestamp_trade")
	  @Temporal(javax.persistence.TemporalType.TIMESTAMP)
	  private java.util.Date timestampTrade ;
	  
	  /**
	   *public id. 
	   */
	  @Column(name = "uuid")
	  private String uuid ;
	  


	  public boolean equals(Object obj) {
	    if (null == this.id) return super.equals(obj) ;
	    if (null == obj) return false ;
	    if (!(obj instanceof EntityTradingDays)) return false ;

	    EntityTradingDays _id = (EntityTradingDays) obj ;
	    if (!java.util.Objects.equals(this.id, _id.getId())) return false ;
	    return true;
	  }

	  public int hashCode() {
	    if (null == this.id) return super.hashCode() ;
	    return java.util.Objects.hash(id) ;
	  }

}
