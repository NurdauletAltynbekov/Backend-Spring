package model.%db_prefix%.dbtables;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;
import org.hibernate.annotations.Proxy;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import gs.common.model.db.Abstract_Entity;
import managers.%db_prefix%.dbtables.*;
import org.hibernate.Session;

@Entity
@Table(name="%table_name%")
@Proxy(lazy=false) 
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
%head_annotations%
public class %class_name% extends Abstract_Entity {

  //fields
%fields_str%


  public %class_name%() {

  }

  //fields getter and setter methods
%fields_get_set_methods%
  
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 89 * hash + Objects.hashCode(this.get%get_table_pk_field_name%());
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
    final %class_name% other = (%class_name%) obj;
    if (!Objects.equals(this.get%get_table_pk_field_name%(), other.get%get_table_pk_field_name%())) {
      return false;
    }
    return true;
  }

  @Transient
  @Override
  public Serializable getEntity_id() {
    return get%get_table_pk_field_name%();
  }

} 
