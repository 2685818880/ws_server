package com.liyf.webservice;  
  
import javax.jws.WebMethod;
import javax.jws.WebService;  
/** 
 *  @WebService － 它是一个注解，用在类上指定将此类发布成一个ws. 
    Endpoint – 此类为端点服务类，它的方法publish用于将一个已经添加了@WebService注解对象绑定到一个地址的端口上。 
  
 * @author  
 * 
 */   
/*创建接口的实现类。*/
@WebService  
public class WeatherService implements WeatherServiceInter {  
  
    @Override  
    public String getWeatherByCityname(String name) {  
        System.out.println(name+"天气晴朗。");  
        return name+"天气晴朗";  
    }  
    /** 
     *添加exclude=true后，HelloWord2()方法不会被发布 
     * @param name 
     * @return 
     */  
    @WebMethod(exclude=true)  
    public String HelloWord2(String name)
    {  
     return"Hello: "+name; 
    }
    
}  