package io.neko.service;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ServiceServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.debug("contextInitialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.debug("contextDestroyed");
    }

}
