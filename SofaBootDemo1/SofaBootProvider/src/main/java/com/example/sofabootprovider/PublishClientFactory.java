package com.example.sofabootprovider;

import com.alipay.sofa.runtime.api.aware.ClientFactoryAware;
import com.alipay.sofa.runtime.api.client.ClientFactory;
import com.alipay.sofa.runtime.api.client.ServiceClient;
import com.alipay.sofa.runtime.api.client.param.ServiceParam;
import com.example.sofabootfacade.service.HelloWorldService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 通过client的API发布服务
 */
@Component
public class PublishClientFactory implements ClientFactoryAware {

    private ClientFactory clientFactory;

    @PostConstruct
    public void init() {
        ServiceClient serviceClient = clientFactory.getClient(ServiceClient.class);
        ServiceParam serviceParam = new ServiceParam();
        serviceParam.setInterfaceType(HelloWorldService.class);
        ServiceImpl service = new ServiceImpl();
        service.setType("api");
        serviceParam.setInstance(service);
        serviceParam.setUniqueId("apiService");
        serviceClient.service(serviceParam);
    }

    @Override
    public void setClientFactory(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

}
