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
public class C_Dyn_Guide_Manager extends Abstract_Controller_Manager<C_Dyn_Guide> {

  private static C_Dyn_Guide_Manager currentInstance = null;

  public static C_Dyn_Guide_Manager getCI() {
    if (currentInstance == null) {
      currentInstance = new C_Dyn_Guide_Manager();
    }
    return currentInstance;
  }

  public C_Dyn_Guide_Manager() {
    super(C_Dyn_Guide.class);
  }

}
