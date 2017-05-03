package de.wwu.pi.fooddelivery.web;

import java.util.Collection;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("SelectItemsConverter")
public class SelectItemsConverter<T> implements Converter {
	
	private Collection<T> selectItems;

	public SelectItemsConverter(Collection<T> selectItems){
		this.selectItems = selectItems;
	}
	
	@Override
	public T getAsObject(FacesContext context, UIComponent component, String value) {
		if(selectItems == null) return null;
		
		for(T item : selectItems){
			if(item.toString().equals(value)) {
				return item;
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value == null) {
			return "";
		}

		return value.toString();
	}
}
