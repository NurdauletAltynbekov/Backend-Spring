package filters.%db_prefix%.dbtables;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;
import gs.common.jsf.bundle_funcs;
import model.%db_prefix%.dbtables.*;
import gs.common.jsf.jsf_funcs;
import gs.common.other_funcs;

@ManagedBean
@SessionScoped
public class %class_name%_Filter_Bean extends Abstract_Filter_Bean<%class_name%> {

  public %class_name%_Filter_Bean() {
    super(%class_name%.class, "%table_name%", "desc");
    getSort_field_name_list().add(new SelectItem("%table_pk_field_name%", bundle_funcs.getBundleValue("Identifikator")));
  }

  public static %class_name%_Filter_Bean getCurrentBean() {
    return jsf_funcs.findBean(%class_name%_Filter_Bean.class);
  }

  public %class_name% getFilter_entity_wrapped() {
    return getFilter_entity();
  }

  public %class_name% get%get_table_name%() {
    return getFilter_entity();
  }

}
