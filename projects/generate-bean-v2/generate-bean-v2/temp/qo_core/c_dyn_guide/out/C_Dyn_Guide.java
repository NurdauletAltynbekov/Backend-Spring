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
@Table(name="c_dyn_guide")
@Proxy(lazy=false) 
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)

public class C_Dyn_Guide extends Abstract_Entity {

  //fields
  private Integer c_dyn_guide;
  private Integer c_proj;
  private String code;
  private String name;
  private Boolean is_deleted;

  //transient fields
  private  c_proj_t = null;



  public C_Dyn_Guide() {

  }

  //fields getter and setter methods
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="c_dyn_guide", unique=true, nullable=false)
  public Integer getC_dyn_guide() {
    return this.c_dyn_guide;
  }
  public void setC_dyn_guide(Integer c_dyn_guide) {
    this.c_dyn_guide = c_dyn_guide;
  }

  @Column(name="c_proj", nullable=false)
  public Integer getC_proj() {
    return this.c_proj;
  }
  public void setC_proj(Integer c_proj) {
    this.c_proj = c_proj;
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


  @Transient
  public  getC_proj_t() {
    if (this.c_proj_t == null && this.getC_proj() != null) {
      this.c_proj_t = _Manager.getCI().get_rec(this.getC_proj()); 
    }
    return this.c_proj_t;
  }
  @Transient
  public  getC_proj_t_2(Session session_) {
    if (this.c_proj_t == null && this.getC_proj() != null) {
      this.c_proj_t = _Manager.getCI().get_rec(session_, this.getC_proj()); 
    }
    return this.c_proj_t;
  }
  public void setC_proj_t( c_proj_t) {
    this.c_proj_t = c_proj_t;
    this.c_proj = (this.c_proj_t != null?this.c_proj_t.get():null);
  }





  
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 89 * hash + Objects.hashCode(this.getC_dyn_guide());
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
    final C_Dyn_Guide other = (C_Dyn_Guide) obj;
    if (!Objects.equals(this.getC_dyn_guide(), other.getC_dyn_guide())) {
      return false;
    }
    return true;
  }

  @Transient
  @Override
  public Serializable getEntity_id() {
    return getC_dyn_guide();
  }

} 
