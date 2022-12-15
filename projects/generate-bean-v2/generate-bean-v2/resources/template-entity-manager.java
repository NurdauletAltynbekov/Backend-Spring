package managers.%db_prefix%.dbtables;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import model.%db_prefix%.dbtables.*;
import gs.common.managers.My_Abstract_Controller_Manager;
import gs.common.model.db.*;
import org.hibernate.*;
import others.CustomLogger;
import gs.common.hibernate_funcs;
import java.util.*;
import java.text.*;

@ManagedBean
@ApplicationScoped
public class %class_name%_Manager extends Abstract_Controller_Manager<%class_name%> {

  private static %class_name%_Manager currentInstance = null;

  public static %class_name%_Manager getCI() {
    if (currentInstance == null) {
      currentInstance = new %class_name%_Manager();
    }
    return currentInstance;
  }

  public %class_name%_Manager() {
    super(%class_name%.class);
  }

}
