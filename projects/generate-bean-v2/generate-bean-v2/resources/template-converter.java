package converters;

import managers.%db_prefix%.dbtables.*;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import model.%db_prefix%.dbtables.*;

@FacesConverter(forClass = %class_name%.class)
public class %class_name%_Converter implements Converter {

  @Override
  public Object getAsObject(FacesContext context, UIComponent component, String value) {
    if (value == null || value.isEmpty()) {
      return null;
    }
    %class_name% res = %class_name%_Manager.getCI().get_rec_2(Integer.valueOf(value));
    return res;
  }

  @Override
  public String getAsString(FacesContext context, UIComponent component, Object value) {
    String res = null;
    if (value instanceof %class_name%) {
      res = String.valueOf(((%class_name%) value).get%get_table_pk_field_name%());
    } else if (value instanceof String) {
      res = ((String) value);
    } else if (value == null) {
      res = "";
    }
    return res;
  }

}
