package controllers.ad.dbtables;

import model.ad.dbtables.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.hibernate.*;
import java.util.*;
import gs.common.jsf.jsf_funcs;
import gs.common.other_funcs;

@ManagedBean
@ViewScoped
public class C_Dyn_Guide_Row_Controller extends Abstract_Controller<C_Dyn_Guide_Row> {

  public C_Dyn_Guide_Row_Controller() {
    super(C_Dyn_Guide_Row.class, "c_dyn_guide_row_list.xhtml", false);
  }

  public static C_Dyn_Guide_Row_Controller getCurrentBean() {
    return jsf_funcs.findBean(C_Dyn_Guide_Row_Controller.class);
  }
  

  public C_Dyn_Guide_Row getC_dyn_guide_row() {
    return getAbstract_entity();
  }

  @Override
  protected void afterLoadDefaultRec() {
    getAbstract_entity().setIs_deleted(false);
  }

  @Override
  protected void deleteRec(Session session_) {
    getAbstract_entity().setIs_deleted(true);
    session_.merge(getAbstract_entity());
  }


}
