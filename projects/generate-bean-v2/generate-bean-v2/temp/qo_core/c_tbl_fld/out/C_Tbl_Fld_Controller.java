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
public class C_Tbl_Fld_Controller extends Abstract_Controller<C_Tbl_Fld> {

  public C_Tbl_Fld_Controller() {
    super(C_Tbl_Fld.class, "c_tbl_fld_list.xhtml", false);
  }

  public static C_Tbl_Fld_Controller getCurrentBean() {
    return jsf_funcs.findBean(C_Tbl_Fld_Controller.class);
  }
  

  public C_Tbl_Fld getC_tbl_fld() {
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
