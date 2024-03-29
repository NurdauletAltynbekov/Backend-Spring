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
@Table(name="ad_cat")
@Proxy(lazy=false) 
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)

public class Ad_Cat extends Abstract_Entity {

  //fields
  private Integer ad_cat;
  private Integer parent_id;
  private String name;
  private Boolean is_deleted;
  private Integer order_num;

  //transient fields
  private  parent_id_t = null;



  public Ad_Cat() {

  }

  //fields getter and setter methods
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="ad_cat", unique=true, nullable=false)
  public Integer getAd_cat() {
    return this.ad_cat;
  }
  public void setAd_cat(Integer ad_cat) {
    this.ad_cat = ad_cat;
  }

  @Column(name="parent_id")
  public Integer getParent_id() {
    return this.parent_id;
  }
  public void setParent_id(Integer parent_id) {
    this.parent_id = parent_id;
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

  @Column(name="order_num", nullable=false)
  public Integer getOrder_num() {
    return this.order_num;
  }
  public void setOrder_num(Integer order_num) {
    this.order_num = order_num;
  }


  @Transient
  public  getParent_id_t() {
    if (this.parent_id_t == null && this.getParent_id() != null) {
      this.parent_id_t = _Manager.getCI().get_rec(this.getParent_id()); 
    }
    return this.parent_id_t;
  }
  @Transient
  public  getParent_id_t_2(Session session_) {
    if (this.parent_id_t == null && this.getParent_id() != null) {
      this.parent_id_t = _Manager.getCI().get_rec(session_, this.getParent_id()); 
    }
    return this.parent_id_t;
  }
  public void setParent_id_t( parent_id_t) {
    this.parent_id_t = parent_id_t;
    this.parent_id = (this.parent_id_t != null?this.parent_id_t.get():null);
  }





  
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 89 * hash + Objects.hashCode(this.getAd_cat());
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
    final Ad_Cat other = (Ad_Cat) obj;
    if (!Objects.equals(this.getAd_cat(), other.getAd_cat())) {
      return false;
    }
    return true;
  }

  @Transient
  @Override
  public Serializable getEntity_id() {
    return getAd_cat();
  }

} 
