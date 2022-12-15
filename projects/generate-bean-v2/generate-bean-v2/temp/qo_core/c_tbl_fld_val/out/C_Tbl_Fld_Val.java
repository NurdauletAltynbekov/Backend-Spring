package model.core.dbtables;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;
import org.hibernate.annotations.Proxy;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import gs.common.model.db.Abstract_Entity;
import managers.core.dbtables.*;
import org.hibernate.Session;

@Entity
@Table(name="c_tbl_fld_val")
@Proxy(lazy=false) 
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)

public class C_Tbl_Fld_Val extends Abstract_Entity {

  //fields
  private Integer c_tbl_fld_val;
  private Integer c_tbl;
  private Long rec_id;
  private Integer c_tbl_fld;
  private String val;
  private Boolean is_deleted;

  //transient fields
  private  c_tbl_t = null;
  private  c_tbl_fld_t = null;



  public C_Tbl_Fld_Val() {

  }

  //fields getter and setter methods
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="c_tbl_fld_val", unique=true, nullable=false)
  public Integer getC_tbl_fld_val() {
    return this.c_tbl_fld_val;
  }
  public void setC_tbl_fld_val(Integer c_tbl_fld_val) {
    this.c_tbl_fld_val = c_tbl_fld_val;
  }

  @Column(name="c_tbl", nullable=false)
  public Integer getC_tbl() {
    return this.c_tbl;
  }
  public void setC_tbl(Integer c_tbl) {
    this.c_tbl = c_tbl;
  }

  @Column(name="rec_id", nullable=false)
  public Long getRec_id() {
    return this.rec_id;
  }
  public void setRec_id(Long rec_id) {
    this.rec_id = rec_id;
  }

  @Column(name="c_tbl_fld", nullable=false)
  public Integer getC_tbl_fld() {
    return this.c_tbl_fld;
  }
  public void setC_tbl_fld(Integer c_tbl_fld) {
    this.c_tbl_fld = c_tbl_fld;
  }

  @Type(type="text")
  @Column(name="val")
  public String getVal() {
    return this.val;
  }
  public void setVal(String val) {
    this.val = val;
  }

  @Column(name="is_deleted", nullable=false)
  public Boolean getIs_deleted() {
    return this.is_deleted;
  }
  public void setIs_deleted(Boolean is_deleted) {
    this.is_deleted = is_deleted;
  }


  @Transient
  public  getC_tbl_t() {
    if (this.c_tbl_t == null && this.getC_tbl() != null) {
      this.c_tbl_t = _Manager.getCI().get_rec(this.getC_tbl()); 
    }
    return this.c_tbl_t;
  }
  @Transient
  public  getC_tbl_t_2(Session session_) {
    if (this.c_tbl_t == null && this.getC_tbl() != null) {
      this.c_tbl_t = _Manager.getCI().get_rec(session_, this.getC_tbl()); 
    }
    return this.c_tbl_t;
  }
  public void setC_tbl_t( c_tbl_t) {
    this.c_tbl_t = c_tbl_t;
    this.c_tbl = (this.c_tbl_t != null?this.c_tbl_t.get():null);
  }


  @Transient
  public  getC_tbl_fld_t() {
    if (this.c_tbl_fld_t == null && this.getC_tbl_fld() != null) {
      this.c_tbl_fld_t = _Manager.getCI().get_rec(this.getC_tbl_fld()); 
    }
    return this.c_tbl_fld_t;
  }
  @Transient
  public  getC_tbl_fld_t_2(Session session_) {
    if (this.c_tbl_fld_t == null && this.getC_tbl_fld() != null) {
      this.c_tbl_fld_t = _Manager.getCI().get_rec(session_, this.getC_tbl_fld()); 
    }
    return this.c_tbl_fld_t;
  }
  public void setC_tbl_fld_t( c_tbl_fld_t) {
    this.c_tbl_fld_t = c_tbl_fld_t;
    this.c_tbl_fld = (this.c_tbl_fld_t != null?this.c_tbl_fld_t.get():null);
  }




  
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 89 * hash + Objects.hashCode(this.getC_tbl_fld_val());
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
    final C_Tbl_Fld_Val other = (C_Tbl_Fld_Val) obj;
    if (!Objects.equals(this.getC_tbl_fld_val(), other.getC_tbl_fld_val())) {
      return false;
    }
    return true;
  }

  @Transient
  @Override
  public Serializable getEntity_id() {
    return getC_tbl_fld_val();
  }

} 
