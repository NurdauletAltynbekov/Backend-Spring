package managers.ad.dbtables;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import model.ad.dbtables.*;
import gs.common.managers.My_Abstract_Controller_Manager;
import gs.common.model.db.*;
import org.hibernate.*;
import others.CustomLogger;
import gs.common.hibernate_funcs;
import java.util.*;
import java.text.*;

@ManagedBean
@ApplicationScoped
public class Ad_Ad_Manager extends Abstract_Controller_Manager<Ad_Ad> {

  private static Ad_Ad_Manager currentInstance = null;

  public static Ad_Ad_Manager getCI() {
    if (currentInstance == null) {
      currentInstance = new Ad_Ad_Manager();
    }
    return currentInstance;
  }

  public Ad_Ad_Manager() {
    super(Ad_Ad.class);
  }

}
