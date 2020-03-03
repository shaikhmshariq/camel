/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.fhir;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class FhirEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        FhirEndpoint target = (FhirEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": target.getConfiguration().setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "client": target.getConfiguration().setClient(property(camelContext, ca.uhn.fhir.rest.client.api.IGenericClient.class, value)); return true;
        case "clientfactory":
        case "clientFactory": target.getConfiguration().setClientFactory(property(camelContext, ca.uhn.fhir.rest.client.api.IRestfulClientFactory.class, value)); return true;
        case "compress": target.getConfiguration().setCompress(property(camelContext, boolean.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": target.getConfiguration().setConnectionTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "defermodelscanning":
        case "deferModelScanning": target.getConfiguration().setDeferModelScanning(property(camelContext, boolean.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "encoding": target.getConfiguration().setEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "fhircontext":
        case "fhirContext": target.getConfiguration().setFhirContext(property(camelContext, ca.uhn.fhir.context.FhirContext.class, value)); return true;
        case "fhirversion":
        case "fhirVersion": target.getConfiguration().setFhirVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "forceconformancecheck":
        case "forceConformanceCheck": target.getConfiguration().setForceConformanceCheck(property(camelContext, boolean.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "inbody":
        case "inBody": target.setInBody(property(camelContext, java.lang.String.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "log": target.getConfiguration().setLog(property(camelContext, boolean.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "prettyprint":
        case "prettyPrint": target.getConfiguration().setPrettyPrint(property(camelContext, boolean.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxypassword":
        case "proxyPassword": target.getConfiguration().setProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyuser":
        case "proxyUser": target.getConfiguration().setProxyUser(property(camelContext, java.lang.String.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "serverurl":
        case "serverUrl": target.getConfiguration().setServerUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "sessioncookie":
        case "sessionCookie": target.getConfiguration().setSessionCookie(property(camelContext, java.lang.String.class, value)); return true;
        case "sockettimeout":
        case "socketTimeout": target.getConfiguration().setSocketTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "summary": target.getConfiguration().setSummary(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "username": target.getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "validationmode":
        case "validationMode": target.getConfiguration().setValidationMode(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

