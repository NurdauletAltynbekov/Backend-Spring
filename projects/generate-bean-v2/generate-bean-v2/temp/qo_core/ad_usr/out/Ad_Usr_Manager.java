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
public class Ad_Usr_Manager extends Abstract_Controller_Manager<Ad_Usr> {

  private static Ad_Usr_Manager currentInstance = null;

  public static Ad_Usr_Manager getCI() {
    if (currentInstance == null) {
      currentInstance = new Ad_Usr_Manager();
    }
    return currentInstance;
  }

  public Ad_Usr_Manager() {
    super(Ad_Usr.class);
  }

}
