package com.liyf.webservice;  
  
import javax.jws.WebMethod;  
import javax.jws.WebService;  
  
/*创建接口*/
/*说明：接口用@WebService注解，方法用@WebMethod注解。*/
@WebService  
public interface WeatherServiceInter {  
  
    @WebMethod  
    public String getWeatherByCityname(String name);  
    
    @WebMethod  
    public String HelloWord2(String name);  
}  