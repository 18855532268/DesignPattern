package Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/21 22:05
 */
// 网站工厂类  根据需要返回一个工厂
public class WebSiteFactory {

    private HashMap pool = new HashMap<String, ConcreteWebSite>();

    public WebSite getWebSiteCategory(String type){
        if (!pool.containsKey(type)){
            pool.put(type, new ConcreteWebSite(type));
        }
        return (WebSite) pool.get(type);
    }

    public int getWebSizeCount(){
        return pool.size();
    }

}
