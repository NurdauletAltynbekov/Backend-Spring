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
public class Ad_Ad_Status_Controller extends Abstract_Controller<Ad_Ad_Status> {

  public Ad_Ad_Status_Controller() {
    super(Ad_Ad_Status.class, "ad_ad_status_list.xhtml", false);
  }

  public static Ad_Ad_Status_Controller getCurrentBean() {
    return jsf_funcs.findBean(Ad_Ad_Status_Controller.class);
  }
  

  public Ad_Ad_Status getAd_ad_status() {
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
