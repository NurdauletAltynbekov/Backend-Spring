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
@Table(name="c_tbl_fld")
@Proxy(lazy=false) 
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)

public class C_Tbl_Fld extends Abstract_Entity {

  //fields
  private Integer c_tbl_fld;
  private Integer c_tbl;
  private Long rec_id;
  private String name;
  private String description;
  private Boolean is_required;
  private Integer c_tbl_fld_type;
  private Integer c_java_data_type;
  private Integer i_tbl;
  private Integer i_tbl_fld;
  private Integer c_dyn_guide;
  private Integer size;
  private Boolean is_multi_select;
  private Integer decimal_places;
  private Integer order_num;
  private Boolean is_deleted;

  //transient fields
  private  c_tbl_t = null;
  private  c_tbl_fld_type_t = null;
  private  c_java_data_type_t = null;
  private  i_tbl_t = null;
  private  i_tbl_fld_t = null;
  private  c_dyn_guide_t = null;



  public C_Tbl_Fld() {

  }

  //fields getter and setter methods
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="c_tbl_fld", unique=true, nullable=false)
  public Integer getC_tbl_fld() {
    return this.c_tbl_fld;
  }
  public void setC_tbl_fld(Integer c_tbl_fld) {
    this.c_tbl_fld = c_tbl_fld;
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

  @Type(type="text")
  @Column(name="name", nullable=false)
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }

  @Type(type="text")
  @Column(name="description")
  public String getDescription() {
    return this.description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  @Column(name="is_required", nullable=false)
  public Boolean getIs_required() {
    return this.is_required;
  }
  public void setIs_required(Boolean is_required) {
    this.is_required = is_required;
  }

  @Column(name="c_tbl_fld_type", nullable=false)
  public Integer getC_tbl_fld_type() {
    return this.c_tbl_fld_type;
  }
  public void setC_tbl_fld_type(Integer c_tbl_fld_type) {
    this.c_tbl_fld_type = c_tbl_fld_type;
  }

  @Column(name="c_java_data_type")
  public Integer getC_java_data_type() {
    return this.c_java_data_type;
  }
  public void setC_java_data_type(Integer c_java_data_type) {
    this.c_java_data_type = c_java_data_type;
  }

  @Column(name="i_tbl")
  public Integer getI_tbl() {
    return this.i_tbl;
  }
  public void setI_tbl(Integer i_tbl) {
    this.i_tbl = i_tbl;
  }

  @Column(name="i_tbl_fld")
  public Integer getI_tbl_fld() {
    return this.i_tbl_fld;
  }
  public void setI_tbl_fld(Integer i_tbl_fld) {
    this.i_tbl_fld = i_tbl_fld;
  }

  @Column(name="c_dyn_guide")
  public Integer getC_dyn_guide() {
    return this.c_dyn_guide;
  }
  public void setC_dyn_guide(Integer c_dyn_guide) {
    this.c_dyn_guide = c_dyn_guide;
  }

  @Column(name="size")
  public Integer getSize() {
    return this.size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  @Column(name="is_multi_select")
  public Boolean getIs_multi_select() {
    return this.is_multi_select;
  }
  public void setIs_multi_select(Boolean is_multi_select) {
    this.is_multi_select = is_multi_select;
  }

  @Column(name="decimal_places")
  public Integer getDecimal_places() {
    return this.decimal_places;
  }
  public void setDecimal_places(Integer decimal_places) {
    this.decimal_places = decimal_places;
  }

  @Column(name="order_num", nullable=false)
  public Integer getOrder_num() {
    return this.order_num;
  }
  public void setOrder_num(Integer order_num) {
    this.order_num = order_num;
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
  public  getC_tbl_fld_type_t() {
    if (this.c_tbl_fld_type_t == null && this.getC_tbl_fld_type() != null) {
      this.c_tbl_fld_type_t = _Manager.getCI().get_rec(this.getC_tbl_fld_type()); 
    }
    return this.c_tbl_fld_type_t;
  }
  @Transient
  public  getC_tbl_fld_type_t_2(Session session_) {
    if (this.c_tbl_fld_type_t == null && this.getC_tbl_fld_type() != null) {
      this.c_tbl_fld_type_t = _Manager.getCI().get_rec(session_, this.getC_tbl_fld_type()); 
    }
    return this.c_tbl_fld_type_t;
  }
  public void setC_tbl_fld_type_t( c_tbl_fld_type_t) {
    this.c_tbl_fld_type_t = c_tbl_fld_type_t;
    this.c_tbl_fld_type = (this.c_tbl_fld_type_t != null?this.c_tbl_fld_type_t.get():null);
  }

  @Transient
  public  getC_java_data_type_t() {
    if (this.c_java_data_type_t == null && this.getC_java_data_type() != null) {
      this.c_java_data_type_t = _Manager.getCI().get_rec(this.getC_java_data_type()); 
    }
    return this.c_java_data_type_t;
  }
  @Transient
  public  getC_java_data_type_t_2(Session session_) {
    if (this.c_java_data_type_t == null && this.getC_java_data_type() != null) {
      this.c_java_data_type_t = _Manager.getCI().get_rec(session_, this.getC_java_data_type()); 
    }
    return this.c_java_data_type_t;
  }
  public void setC_java_data_type_t( c_java_data_type_t) {
    this.c_java_data_type_t = c_java_data_type_t;
    this.c_java_data_type = (this.c_java_data_type_t != null?this.c_java_data_type_t.get():null);
  }

  @Transient
  public  getI_tbl_t() {
    if (this.i_tbl_t == null && this.getI_tbl() != null) {
      this.i_tbl_t = _Manager.getCI().get_rec(this.getI_tbl()); 
    }
    return this.i_tbl_t;
  }
  @Transient
  public  getI_tbl_t_2(Session session_) {
    if (this.i_tbl_t == null && this.getI_tbl() != null) {
      this.i_tbl_t = _Manager.getCI().get_rec(session_, this.getI_tbl()); 
    }
    return this.i_tbl_t;
  }
  public void setI_tbl_t( i_tbl_t) {
    this.i_tbl_t = i_tbl_t;
    this.i_tbl = (this.i_tbl_t != null?this.i_tbl_t.get():null);
  }

  @Transient
  public  getI_tbl_fld_t() {
    if (this.i_tbl_fld_t == null && this.getI_tbl_fld() != null) {
      this.i_tbl_fld_t = _Manager.getCI().get_rec(this.getI_tbl_fld()); 
    }
    return this.i_tbl_fld_t;
  }
  @Transient
  public  getI_tbl_fld_t_2(Session session_) {
    if (this.i_tbl_fld_t == null && this.getI_tbl_fld() != null) {
      this.i_tbl_fld_t = _Manager.getCI().get_rec(session_, this.getI_tbl_fld()); 
    }
    return this.i_tbl_fld_t;
  }
  public void setI_tbl_fld_t( i_tbl_fld_t) {
    this.i_tbl_fld_t = i_tbl_fld_t;
    this.i_tbl_fld = (this.i_tbl_fld_t != null?this.i_tbl_fld_t.get():null);
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
    hash = 89 * hash + Objects.hashCode(this.getC_tbl_fld());
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
    final C_Tbl_Fld other = (C_Tbl_Fld) obj;
    if (!Objects.equals(this.getC_tbl_fld(), other.getC_tbl_fld())) {
      return false;
    }
    return true;
  }

  @Transient
  @Override
  public Serializable getEntity_id() {
    return getC_tbl_fld();
  }

} 
