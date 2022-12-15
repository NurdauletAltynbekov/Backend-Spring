package lists.%db_prefix%.dbtables;

import filters.%db_prefix%.dbtables.*;
import model.%db_prefix%.dbtables.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.model.LazyDataModel;
import gs.common.jsf.jsf_funcs;
import gs.common.model.db.*;
import java.util.*;
import org.hibernate.Session;
import others.CustomLogger;
import gs.common.other_funcs;
import model.%db_prefix%.dbutil.*;

@ManagedBean
@SessionScoped
public class %class_name%_List_Bean extends Abstract_List_Bean<%class_name%> {

  public %class_name%_List_Bean() {
    super("%class_name%", (%class_name%_Filter_Bean) jsf_funcs.findBean(%class_name%_Filter_Bean.class));
  }

  public static %class_name%_List_Bean getCurrentBean() {
    return jsf_funcs.findBean(%class_name%_List_Bean.class);
  }

  public LazyDataModel<%class_name%> getConverted_rec_list() {
    return getRec_list();
  }

  public List<%class_name%> getConverted_rec_array_list() {
    return getRec_array_list();
  }
  
  public %class_name%_Filter_Bean getFilter_bean_wrapped() {
    return (%class_name%_Filter_Bean) getFilter_bean();
  }

%additional%
  
  @Override
  protected Object rec_list_getRowData(String rowKey) {
    List<%class_name%> list_ = (List<%class_name%>) getConverted_rec_list().getWrappedData();
    Integer value = Integer.valueOf(rowKey);
    for (%class_name% rec : list_) {
      if (rec.get%get_table_pk_field_name%().equals(value)) {
        return rec;
      }
    }
    return null;
  }
  
  @Override
  protected void error(Exception e) {
    CustomLogger.error(e);
  }

  @Override
  protected Session getOpenedSession() {
    return %db_prefix_with_first_char_upper%SessionFactoryUtil.getSessionFactoryUtilInstance().openSession();
  }

  @Override
  protected Session getCurrentSession() {
    return %db_prefix_with_first_char_upper%SessionFactoryUtil.getSessionFactoryUtilInstance().getCurrentSession();
  }

%deleteRec_code%  
  
}
