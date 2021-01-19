package com.example.demo;

import com.alibaba.rsocket.invocation.RSocketRemoteServiceBuilder;
import com.alibaba.rsocket.loadbalance.LoadBalancedRSocket;
import com.alibaba.rsocket.metadata.RSocketMimeType;
import com.alibaba.rsocket.upstream.UpstreamManager;
import com.alibaba.spring.boot.rsocket.hessian.HessianDecoder;
import com.alibaba.spring.boot.rsocket.hessian.HessianEncoder;
import com.example.demo.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.rsocket.RSocketRequester;
import org.springframework.messaging.rsocket.RSocketStrategies;
import org.springframework.util.MimeType;

@Configuration
public class ServiceConsumeConfiguration {

    @Bean
    public PersonService personService(@Autowired UpstreamManager upstreamManager) {
        return RSocketRemoteServiceBuilder
                .client(PersonService.class)
                .upstreamManager(upstreamManager)
                .build();
    }

}
