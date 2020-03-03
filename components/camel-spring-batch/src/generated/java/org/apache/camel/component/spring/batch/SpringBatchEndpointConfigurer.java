/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.spring.batch;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SpringBatchEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SpringBatchEndpoint target = (SpringBatchEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "jobfromheader":
        case "jobFromHeader": target.setJobFromHeader(property(camelContext, boolean.class, value)); return true;
        case "joblauncher":
        case "jobLauncher": target.setJobLauncher(property(camelContext, org.springframework.batch.core.launch.JobLauncher.class, value)); return true;
        case "jobregistry":
        case "jobRegistry": target.setJobRegistry(property(camelContext, org.springframework.batch.core.configuration.JobRegistry.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

