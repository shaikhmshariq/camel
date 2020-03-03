/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ganglia;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GangliaEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GangliaEndpoint target = (GangliaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "dmax": target.getConfiguration().setDmax(property(camelContext, int.class, value)); return true;
        case "groupname":
        case "groupName": target.getConfiguration().setGroupName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "metricname":
        case "metricName": target.getConfiguration().setMetricName(property(camelContext, java.lang.String.class, value)); return true;
        case "mode": target.getConfiguration().setMode(property(camelContext, info.ganglia.gmetric4j.gmetric.GMetric.UDPAddressingMode.class, value)); return true;
        case "prefix": target.getConfiguration().setPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "slope": target.getConfiguration().setSlope(property(camelContext, info.ganglia.gmetric4j.gmetric.GMetricSlope.class, value)); return true;
        case "spoofhostname":
        case "spoofHostname": target.getConfiguration().setSpoofHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tmax": target.getConfiguration().setTmax(property(camelContext, int.class, value)); return true;
        case "ttl": target.getConfiguration().setTtl(property(camelContext, int.class, value)); return true;
        case "type": target.getConfiguration().setType(property(camelContext, info.ganglia.gmetric4j.gmetric.GMetricType.class, value)); return true;
        case "units": target.getConfiguration().setUnits(property(camelContext, java.lang.String.class, value)); return true;
        case "wireformat31x":
        case "wireFormat31x": target.getConfiguration().setWireFormat31x(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

