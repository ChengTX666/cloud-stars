package nefu.shop.Controller;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.api.naming.NamingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("config/")
public class NacosController {
//    @NacosInjected
//    private NamingService namingService;
//
//    @GetMapping("get")
//    public boolean get() {
//        return useLocalCache;
//    }
}
