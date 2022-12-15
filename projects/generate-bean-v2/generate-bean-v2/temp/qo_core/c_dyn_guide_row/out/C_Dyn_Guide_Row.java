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
@Table(name="c_dyn_guide_row")
@Proxy(lazy=false) 
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)

public class C_Dyn_Guide_Row extends Abstract_Entity {

  //fields
  private Integer c_dyn_guide_row;
  private Integer c_dyn_guide;
  private String val;
  private Boolean is_deleted;
  private Integer order_num;

  //transient fields
  private  c_dyn_guide_t = null;



  public C_Dyn_Guide_Row() {

  }

  //fields getter and setter methods
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="c_dyn_guide_row", unique=true, nullable=false)
  public Integer getC_dyn_guide_row() {
    return this.c_dyn_guide_row;
  }
  public void setC_dyn_guide_row(Integer c_dyn_guide_row) {
    this.c_dyn_guide_row = c_dyn_guide_row;
  }

  @Column(name="c_dyn_guide", nullable=false)
  public Integer getC_dyn_guide() {
    return this.c_dyn_guide;
  }
  public void setC_dyn_guide(Integer c_dyn_guide) {
    this.c_dyn_guide = c_dyn_guide;
  }

  @Type(type="text")
  @Column(name="val", nullable=false)
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

  @Column(name="order_num", nullable=false)
  public Integer getOrder_num() {
    return this.order_num;
  }
  public void setOrder_num(Integer order_num) {
    this.order_num = order_num;
  }


  @Transient
  public  getC_dyn_guide_t() {
    if (this.c_dyn_guide_t == null && this.getC_dyn_guide() != null) {
      this.c_dyn_guide_t = _Manager.getCI().get_rec(this.getC_dyn_guide()); 
    }
    return this.c_dyn_guide_t;
  }
  @Transient
  public  getC_dyn_guide_t_2(Session session_) {
    if (this.c_dyn_guide_t == null && this.getC_dyn_guide() != null) {
      this.c_dyn_guide_t = _Manager.getCI().get_rec(session_, this.getC_dyn_guide()); 
    }
    return this.c_dyn_guide_t;
  }
  public void setC_dyn_guide_t( c_dyn_guide_t) {
    this.c_dyn_guide_t = c_dyn_guide_t;
    this.c_dyn_guide = (this.c_dyn_guide_t != null?this.c_dyn_guide_t.get():null);
  }





  
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 89 * hash + Objects.hashCode(this.getC_dyn_guide_row());
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
    final C_Dyn_Guide_Row other = (C_Dyn_Guide_Row) obj;
    if (!Objects.equals(this.getC_dyn_guide_row(), other.getC_dyn_guide_row())) {
      return false;
    }
    return true;
  }

  @Transient
  @Override
  public Serializable getEntity_id() {
    return getC_dyn_guide_row();
  }

} 
