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
@Table(name="ad_ad_status")
@Proxy(lazy=false) 
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)

public class Ad_Ad_Status extends Abstract_Entity {

  //fields
  private Integer ad_ad_status;
  private String code;
  private String name;
  private Boolean is_deleted;

  //transient fields



  public Ad_Ad_Status() {

  }

  //fields getter and setter methods
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="ad_ad_status", unique=true, nullable=false)
  public Integer getAd_ad_status() {
    return this.ad_ad_status;
  }
  public void setAd_ad_status(Integer ad_ad_status) {
    this.ad_ad_status = ad_ad_status;
  }

  @Type(type="text")
  @Column(name="code", nullable=false)
  public String getCode() {
    return this.code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  @Type(type="text")
  @Column(name="name", nullable=false)
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }

  @Column(name="is_deleted", nullable=false)
  public Boolean getIs_deleted() {
    return this.is_deleted;
  }
  public void setIs_deleted(Boolean is_deleted) {
    this.is_deleted = is_deleted;
  }






  
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 89 * hash + Objects.hashCode(this.getAd_ad_status());
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
    final Ad_Ad_Status other = (Ad_Ad_Status) obj;
    if (!Objects.equals(this.getAd_ad_status(), other.getAd_ad_status())) {
      return false;
    }
    return true;
  }

  @Transient
  @Override
  public Serializable getEntity_id() {
    return getAd_ad_status();
  }

} 
