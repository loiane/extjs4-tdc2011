package br.com.thedevelopersconference.loiane.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.thedevelopersconference.loiane.model.Contact;

/**
 * Util class, returns a Map in the format Ext JS expects
 * 
 * Projeto Exemplo apresentado no TDC 2011
 * The Developer's Conference
 * Sao Paulo - SP - 6 a 10 de Julho de 2011
 * http://www.thedevelopersconference.com.br/
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
@Component
public class ExtJSReturn {

	/**
	 * Generates modelMap to return in the modelAndView
	 * @param contacts
	 * @return
	 */
	public static Map<String,Object> mapOK(List<Contact> contacts){
		
		Map<String,Object> modelMap = new HashMap<String,Object>(3);
		modelMap.put("total", contacts.size());
		modelMap.put("data", contacts);
		modelMap.put("success", true);
		
		return modelMap;
	}
	
	/**
	 * Generates modelMap to return in the modelAndView
	 * @param contacts
	 * @return
	 */
	public static Map<String,Object> mapOK(List<Contact> contacts, int total){
		
		Map<String,Object> modelMap = new HashMap<String,Object>(3);
		modelMap.put("total", total);
		modelMap.put("data", contacts);
		modelMap.put("success", true);
		
		return modelMap;
	}
	
	/**
	 * Generates modelMap to return in the modelAndView in case
	 * of exception
	 * @param msg message
	 * @return
	 */
	public static Map<String,Object> mapError(String msg){

		Map<String,Object> modelMap = new HashMap<String,Object>(2);
		modelMap.put("message", msg);
		modelMap.put("success", false);

		return modelMap;
	} 
}
