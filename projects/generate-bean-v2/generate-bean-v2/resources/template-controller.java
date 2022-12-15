package controllers.%db_prefix%.dbtables;

import model.%db_prefix%.dbtables.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.hibernate.*;
import java.util.*;
import gs.common.jsf.jsf_funcs;
import gs.common.other_funcs;

@ManagedBean
@ViewScoped
public class %class_name%_Controller extends Abstract_Controller<%class_name%> {

  public %class_name%_Controller() {
    super(%class_name%.class, "%table_name%_list.xhtml", false);
  }

  public static %class_name%_Controller getCurrentBean() {
    return jsf_funcs.findBean(%class_name%_Controller.class);
  }
  

  public %class_name% get%get_table_name%() {
    return getAbstract_entity();
  }

%additional%

}
