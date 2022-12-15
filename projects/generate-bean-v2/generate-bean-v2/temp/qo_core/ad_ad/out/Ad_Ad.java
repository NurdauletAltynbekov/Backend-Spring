package model.ad.dbtables;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;
import org.hibernate.annotations.Proxy;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import gs.common.model.db.Abstract_Entity;
import managers.ad.dbtables.*;
import org.hibernate.Session;

@Entity
@Table(name="ad_ad")
@Proxy(lazy=false) 
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)

public class Ad_Ad extends Abstract_Entity {

  //fields
  private Long ad_ad;
  private Long ad_usr;
  private Integer c_country;
  private Integer ad_cat;
  private Integer c_loc;
  private Integer ad_ad_status;
  private Date ins_dt;
  private Boolean is_deleted;
  private String name;
  private String description;
  private Boolean is_private;
  private Boolean is_auto_renewal;
  private String contact_person;
  private String phone_num;
  private Double price;
  private Boolean is_negociable;
  private Integer ad_ad_price_type;

  //transient fields
  private  ad_usr_t = null;
  private  c_country_t = null;
  private  ad_cat_t = null;
  private  c_loc_t = null;
  private  ad_ad_status_t = null;
  private  ad_ad_price_type_t = null;



  public Ad_Ad() {

  }

  //fields getter and setter methods
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="ad_ad", unique=true, nullable=false)
  public Long getAd_ad() {
    return this.ad_ad;
  }
  public void setAd_ad(Long ad_ad) {
    this.ad_ad = ad_ad;
  }

  @Column(name="ad_usr", nullable=false)
  public Long getAd_usr() {
    return this.ad_usr;
  }
  public void setAd_usr(Long ad_usr) {
    this.ad_usr = ad_usr;
  }

  @Column(name="c_country", nullable=false)
  public Integer getC_country() {
    return this.c_country;
  }
  public void setC_country(Integer c_country) {
    this.c_country = c_country;
  }

  @Column(name="ad_cat", nullable=false)
  public Integer getAd_cat() {
    return this.ad_cat;
  }
  public void setAd_cat(Integer ad_cat) {
    this.ad_cat = ad_cat;
  }

  @Column(name="c_loc", nullable=false)
  public Integer getC_loc() {
    return this.c_loc;
  }
  public void setC_loc(Integer c_loc) {
    this.c_loc = c_loc;
  }

  @Column(name="ad_ad_status", nullable=false)
  public Integer getAd_ad_status() {
    return this.ad_ad_status;
  }
  public void setAd_ad_status(Integer ad_ad_status) {
    this.ad_ad_status = ad_ad_status;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="ins_dt", nullable=false, length = 19, columnDefinition="TIMESTAMP WITHOUT TIME ZONE")
  public Date getIns_dt() {
    return this.ins_dt;
  }
  public void setIns_dt(Date ins_dt) {
    this.ins_dt = ins_dt;
  }

  @Column(name="is_deleted", nullable=false)
  public Boolean getIs_deleted() {
    return this.is_deleted;
  }
  public void setIs_deleted(Boolean is_deleted) {
    this.is_deleted = is_deleted;
  }

  @Type(type="text")
  @Column(name="name", nullable=false)
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }

  @Type(type="text")
  @Column(name="description", nullable=false)
  public String getDescription() {
    return this.description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  @Column(name="is_private", nullable=false)
  public Boolean getIs_private() {
    return this.is_private;
  }
  public void setIs_private(Boolean is_private) {
    this.is_private = is_private;
  }

  @Column(name="is_auto_renewal", nullable=false)
  public Boolean getIs_auto_renewal() {
    return this.is_auto_renewal;
  }
  public void setIs_auto_renewal(Boolean is_auto_renewal) {
    this.is_auto_renewal = is_auto_renewal;
  }

  @Type(type="text")
  @Column(name="contact_person", nullable=false)
  public String getContact_person() {
    return this.contact_person;
  }
  public void setContact_person(String contact_person) {
    this.contact_person = contact_person;
  }

  @Type(type="text")
  @Column(name="phone_num", nullable=false)
  public String getPhone_num() {
    return this.phone_num;
  }
  public void setPhone_num(String phone_num) {
    this.phone_num = phone_num;
  }

  @Column(name="price")
  public Double getPrice() {
    return this.price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }

  @Column(name="is_negociable")
  public Boolean getIs_negociable() {
    return this.is_negociable;
  }
  public void setIs_negociable(Boolean is_negociable) {
    this.is_negociable = is_negociable;
  }

  @Column(name="ad_ad_price_type")
  public Integer getAd_ad_price_type() {
    return this.ad_ad_price_type;
  }
  public void setAd_ad_price_type(Integer ad_ad_price_type) {
    this.ad_ad_price_type = ad_ad_price_type;
  }


  @Transient
  public  getAd_usr_t() {
    if (this.ad_usr_t == null && this.getAd_usr() != null) {
      this.ad_usr_t = _Manager.getCI().get_rec(this.getAd_usr()); 
    }
    return this.ad_usr_t;
  }
  @Transient
  public  getAd_usr_t_2(Session session_) {
    if (this.ad_usr_t == null && this.getAd_usr() != null) {
      this.ad_usr_t = _Manager.getCI().get_rec(session_, this.getAd_usr()); 
    }
    return this.ad_usr_t;
  }
  public void setAd_usr_t( ad_usr_t) {
    this.ad_usr_t = ad_usr_t;
    this.ad_usr = (this.ad_usr_t != null?this.ad_usr_t.get():null);
  }

  @Transient
  public  getC_country_t() {
    if (this.c_country_t == null && this.getC_country() != null) {
      this.c_country_t = _Manager.getCI().get_rec(this.getC_country()); 
    }
    return this.c_country_t;
  }
  @Transient
  public  getC_country_t_2(Session session_) {
    if (this.c_country_t == null && this.getC_country() != null) {
      this.c_country_t = _Manager.getCI().get_rec(session_, this.getC_country()); 
    }
    return this.c_country_t;
  }
  public void setC_country_t( c_country_t) {
    this.c_country_t = c_country_t;
    this.c_country = (this.c_country_t != null?this.c_country_t.get():null);
  }

  @Transient
  public  getAd_cat_t() {
    if (this.ad_cat_t == null && this.getAd_cat() != null) {
      this.ad_cat_t = _Manager.getCI().get_rec(this.getAd_cat()); 
    }
    return this.ad_cat_t;
  }
  @Transient
  public  getAd_cat_t_2(Session session_) {
    if (this.ad_cat_t == null && this.getAd_cat() != null) {
      this.ad_cat_t = _Manager.getCI().get_rec(session_, this.getAd_cat()); 
    }
    return this.ad_cat_t;
  }
  public void setAd_cat_t( ad_cat_t) {
    this.ad_cat_t = ad_cat_t;
    this.ad_cat = (this.ad_cat_t != null?this.ad_cat_t.get():null);
  }

  @Transient
  public  getC_loc_t() {
    if (this.c_loc_t == null && this.getC_loc() != null) {
      this.c_loc_t = _Manager.getCI().get_rec(this.getC_loc()); 
    }
    return this.c_loc_t;
  }
  @Transient
  public  getC_loc_t_2(Session session_) {
    if (this.c_loc_t == null && this.getC_loc() != null) {
      this.c_loc_t = _Manager.getCI().get_rec(session_, this.getC_loc()); 
    }
    return this.c_loc_t;
  }
  public void setC_loc_t( c_loc_t) {
    this.c_loc_t = c_loc_t;
    this.c_loc = (this.c_loc_t != null?this.c_loc_t.get():null);
  }

  @Transient
  public  getAd_ad_status_t() {
    if (this.ad_ad_status_t == null && this.getAd_ad_status() != null) {
      this.ad_ad_status_t = _Manager.getCI().get_rec(this.getAd_ad_status()); 
    }
    return this.ad_ad_status_t;
  }
  @Transient
  public  getAd_ad_status_t_2(Session session_) {
    if (this.ad_ad_status_t == null && this.getAd_ad_status() != null) {
      this.ad_ad_status_t = _Manager.getCI().get_rec(session_, this.getAd_ad_status()); 
    }
    return this.ad_ad_status_t;
  }
  public void setAd_ad_status_t( ad_ad_status_t) {
    this.ad_ad_status_t = ad_ad_status_t;
    this.ad_ad_status = (this.ad_ad_status_t != null?this.ad_ad_status_t.get():null);
  }











  @Transient
  public  getAd_ad_price_type_t() {
    if (this.ad_ad_price_type_t == null && this.getAd_ad_price_type() != null) {
      this.ad_ad_price_type_t = _Manager.getCI().get_rec(this.getAd_ad_price_type()); 
    }
    return this.ad_ad_price_type_t;
  }
  @Transient
  public  getAd_ad_price_type_t_2(Session session_) {
    if (this.ad_ad_price_type_t == null && this.getAd_ad_price_type() != null) {
      this.ad_ad_price_type_t = _Manager.getCI().get_rec(session_, this.getAd_ad_price_type()); 
    }
    return this.ad_ad_price_type_t;
  }
  public void setAd_ad_price_type_t( ad_ad_price_type_t) {
    this.ad_ad_price_type_t = ad_ad_price_type_t;
    this.ad_ad_price_type = (this.ad_ad_price_type_t != null?this.ad_ad_price_type_t.get():null);
  }


  
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 89 * hash + Objects.hashCode(this.getAd_ad());
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Ad_Ad other = (Ad_Ad) obj;
    if (!Objects.equals(this.getAd_ad(), other.getAd_ad())) {
      return false;
    }
    return true;
  }

  @Transient
  @Override
  public Serializable getEntity_id() {
    return getAd_ad();
  }

} 
