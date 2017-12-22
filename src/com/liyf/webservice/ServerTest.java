package com.liyf.webservice;  
  
import javax.xml.ws.Endpoint;  
  
import com.liyf.webservice.WeatherService;  
  /*发布服务 查看wsdl*/
/*到此为止，服务器端程序创建成功，运行后可在浏览器中访问
 * http://localhost:8080/ws_server/weather?wsdl查看是否发布成功*/
/*总结：
如何发布一个Web服务：
a,在类上添加@WebService注解
（注：此注解是jdk1.6提供的，位于javax.jws.WebService包中）
b,通过EndPoint(端点服务)发布一个WebService
（注：EndPoint是jdk提供的一个专门用于发布服务的类，该类的publish方法接收两个参数，一个是本地的服务地址，二是提供服务的类。位于 javax.xml.ws.Endpoint包中）
c，注：
类上添加注解@WebService，类中所有非静态方法都会被发布；
静态方法和final方法不能被发布；
方法上加@WebMentod(exclude=true)后，此方法不被发布；*/

public class ServerTest {  
  
    public static void main(String[] args) {  
        Endpoint.publish("http://localhost:8080/ws_server/weather", new WeatherService());  
        System.out.println("publish success...");  
        
        /** 
         *参数1：服务的发布地址 
         *参数2：服务的实现者 
         */  
        //Endpoint.publish("http://192.168.24.138:456/helloWord",new HelloWebService());  
        
    }  
}  