 package com.adobe.aem.may.batch.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true, enabled = true, service = Demo.class, name = "DemoServices")
public class Demo {

    private static final Logger LOG = LoggerFactory.getLogger(Demo.class);

    @Activate
    public void activate() {
        LOG.info("Message coming from the activate()");
    }

    @Deactivate
    public void deactivate() {
        LOG.info("Message coming from the deactivate()");
    }

    @Modified
    public void update() {
        LOG.info("Message coming from the update()");
    }
}