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
public class Ad_Ad_Controller extends Abstract_Controller<Ad_Ad> {

  public Ad_Ad_Controller() {
    super(Ad_Ad.class, "ad_ad_list.xhtml", false);
  }

  public static Ad_Ad_Controller getCurrentBean() {
    return jsf_funcs.findBean(Ad_Ad_Controller.class);
  }
  

  public Ad_Ad getAd_ad() {
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
