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
@Table(name="ad_usr")
@Proxy(lazy=false) 
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)

public class Ad_Usr extends Abstract_Entity {

  //fields
  private Long ad_usr;
  private Boolean is_deleted;
  private String contact_name;
  private String main_phone_num;
  private Boolean is_notif_when_publish;
  private Boolean is_notif_when_refuse;
  private Boolean is_notif_when_remove;
  private Boolean is_notif_when_new_msg;
  private Boolean is_notif_when_comment;
  private Boolean is_notif_when_acc_low_amount;
  private Double acc_low_amount;
  private Long c_usr;

  //transient fields
  private  c_usr_t = null;



  public Ad_Usr() {

  }

  //fields getter and setter methods
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="ad_usr", unique=true, nullable=false)
  public Long getAd_usr() {
    return this.ad_usr;
  }
  public void setAd_usr(Long ad_usr) {
    this.ad_usr = ad_usr;
  }

  @Column(name="is_deleted", nullable=false)
  public Boolean getIs_deleted() {
    return this.is_deleted;
  }
  public void setIs_deleted(Boolean is_deleted) {
    this.is_deleted = is_deleted;
  }

  @Type(type="text")
  @Column(name="contact_name")
  public String getContact_name() {
    return this.contact_name;
  }
  public void setContact_name(String contact_name) {
    this.contact_name = contact_name;
  }

  @Type(type="text")
  @Column(name="main_phone_num")
  public String getMain_phone_num() {
    return this.main_phone_num;
  }
  public void setMain_phone_num(String main_phone_num) {
    this.main_phone_num = main_phone_num;
  }

  @Column(name="is_notif_when_publish", nullable=false)
  public Boolean getIs_notif_when_publish() {
    return this.is_notif_when_publish;
  }
  public void setIs_notif_when_publish(Boolean is_notif_when_publish) {
    this.is_notif_when_publish = is_notif_when_publish;
  }

  @Column(name="is_notif_when_refuse", nullable=false)
  public Boolean getIs_notif_when_refuse() {
    return this.is_notif_when_refuse;
  }
  public void setIs_notif_when_refuse(Boolean is_notif_when_refuse) {
    this.is_notif_when_refuse = is_notif_when_refuse;
  }

  @Column(name="is_notif_when_remove", nullable=false)
  public Boolean getIs_notif_when_remove() {
    return this.is_notif_when_remove;
  }
  public void setIs_notif_when_remove(Boolean is_notif_when_remove) {
    this.is_notif_when_remove = is_notif_when_remove;
  }

  @Column(name="is_notif_when_new_msg", nullable=false)
  public Boolean getIs_notif_when_new_msg() {
    return this.is_notif_when_new_msg;
  }
  public void setIs_notif_when_new_msg(Boolean is_notif_when_new_msg) {
    this.is_notif_when_new_msg = is_notif_when_new_msg;
  }

  @Column(name="is_notif_when_comment", nullable=false)
  public Boolean getIs_notif_when_comment() {
    return this.is_notif_when_comment;
  }
  public void setIs_notif_when_comment(Boolean is_notif_when_comment) {
    this.is_notif_when_comment = is_notif_when_comment;
  }

  @Column(name="is_notif_when_acc_low_amount", nullable=false)
  public Boolean getIs_notif_when_acc_low_amount() {
    return this.is_notif_when_acc_low_amount;
  }
  public void setIs_notif_when_acc_low_amount(Boolean is_notif_when_acc_low_amount) {
    this.is_notif_when_acc_low_amount = is_notif_when_acc_low_amount;
  }

  @Column(name="acc_low_amount")
  public Double getAcc_low_amount() {
    return this.acc_low_amount;
  }
  public void setAcc_low_amount(Double acc_low_amount) {
    this.acc_low_amount = acc_low_amount;
  }

  @Column(name="c_usr", nullable=false)
  public Long getC_usr() {
    return this.c_usr;
  }
  public void setC_usr(Long c_usr) {
    this.c_usr = c_usr;
  }












  @Transient
  public  getC_usr_t() {
    if (this.c_usr_t == null && this.getC_usr() != null) {
      this.c_usr_t = _Manager.getCI().get_rec(this.getC_usr()); 
    }
    return this.c_usr_t;
  }
  @Transient
  public  getC_usr_t_2(Session session_) {
    if (this.c_usr_t == null && this.getC_usr() != null) {
      this.c_usr_t = _Manager.getCI().get_rec(session_, this.getC_usr()); 
    }
    return this.c_usr_t;
  }
  public void setC_usr_t( c_usr_t) {
    this.c_usr_t = c_usr_t;
    this.c_usr = (this.c_usr_t != null?this.c_usr_t.get():null);
  }


  
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 89 * hash + Objects.hashCode(this.getAd_usr());
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
    final Ad_Usr other = (Ad_Usr) obj;
    if (!Objects.equals(this.getAd_usr(), other.getAd_usr())) {
      return false;
    }
    return true;
  }

  @Transient
  @Override
  public Serializable getEntity_id() {
    return getAd_usr();
  }

} 
