/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The rest component is used for either hosting REST services (consumer) or
 * calling external REST services (producer).
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface RestEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the REST component.
     */
    public interface RestEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedRestEndpointConsumerBuilder advanced() {
            return (AdvancedRestEndpointConsumerBuilder) this;
        }
        /**
         * Media type such as: 'text/xml', or 'application/json' this REST
         * service accepts. By default we accept all kinds of types.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default RestEndpointConsumerBuilder consumes(String consumes) {
            doSetProperty("consumes", consumes);
            return this;
        }
        /**
         * To declare the incoming POJO binding type as a FQN class name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default RestEndpointConsumerBuilder inType(String inType) {
            doSetProperty("inType", inType);
            return this;
        }
        /**
         * To declare the outgoing POJO binding type as a FQN class name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default RestEndpointConsumerBuilder outType(String outType) {
            doSetProperty("outType", outType);
            return this;
        }
        /**
         * Media type such as: 'text/xml', or 'application/json' this REST
         * service returns.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default RestEndpointConsumerBuilder produces(String produces) {
            doSetProperty("produces", produces);
            return this;
        }
        /**
         * Name of the route this REST services creates.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default RestEndpointConsumerBuilder routeId(String routeId) {
            doSetProperty("routeId", routeId);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default RestEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default RestEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * The Camel Rest component to use for (consumer) the REST transport,
         * such as jetty, servlet, undertow. If no component has been explicit
         * configured, then Camel will lookup if there is a Camel component that
         * integrates with the Rest DSL, or if a
         * org.apache.camel.spi.RestConsumerFactory is registered in the
         * registry. If either one is found, then that is being used.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default RestEndpointConsumerBuilder consumerComponentName(
                String consumerComponentName) {
            doSetProperty("consumerComponentName", consumerComponentName);
            return this;
        }
        /**
         * Human description to document this REST service.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default RestEndpointConsumerBuilder description(String description) {
            doSetProperty("description", description);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the REST component.
     */
    public interface AdvancedRestEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default RestEndpointConsumerBuilder basic() {
            return (RestEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedRestEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedRestEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedRestEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedRestEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedRestEndpointConsumerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedRestEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedRestEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedRestEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the REST component.
     */
    public interface RestEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedRestEndpointProducerBuilder advanced() {
            return (AdvancedRestEndpointProducerBuilder) this;
        }
        /**
         * Media type such as: 'text/xml', or 'application/json' this REST
         * service accepts. By default we accept all kinds of types.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default RestEndpointProducerBuilder consumes(String consumes) {
            doSetProperty("consumes", consumes);
            return this;
        }
        /**
         * To declare the incoming POJO binding type as a FQN class name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default RestEndpointProducerBuilder inType(String inType) {
            doSetProperty("inType", inType);
            return this;
        }
        /**
         * To declare the outgoing POJO binding type as a FQN class name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default RestEndpointProducerBuilder outType(String outType) {
            doSetProperty("outType", outType);
            return this;
        }
        /**
         * Media type such as: 'text/xml', or 'application/json' this REST
         * service returns.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default RestEndpointProducerBuilder produces(String produces) {
            doSetProperty("produces", produces);
            return this;
        }
        /**
         * Name of the route this REST services creates.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default RestEndpointProducerBuilder routeId(String routeId) {
            doSetProperty("routeId", routeId);
            return this;
        }
        /**
         * The openapi api doc resource to use. The resource is loaded from
         * classpath by default and must be in JSon format.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default RestEndpointProducerBuilder apiDoc(String apiDoc) {
            doSetProperty("apiDoc", apiDoc);
            return this;
        }
        /**
         * Configures the binding mode for the producer. If set to anything
         * other than 'off' the producer will try to convert the body of the
         * incoming message from inType to the json or xml, and the response
         * from json or xml to outType.
         * 
         * The option is a:
         * <code>org.apache.camel.spi.RestConfiguration$RestBindingMode</code>
         * type.
         * 
         * Group: producer
         */
        default RestEndpointProducerBuilder bindingMode(
                RestBindingMode bindingMode) {
            doSetProperty("bindingMode", bindingMode);
            return this;
        }
        /**
         * Configures the binding mode for the producer. If set to anything
         * other than 'off' the producer will try to convert the body of the
         * incoming message from inType to the json or xml, and the response
         * from json or xml to outType.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.RestConfiguration$RestBindingMode</code>
         * type.
         * 
         * Group: producer
         */
        default RestEndpointProducerBuilder bindingMode(String bindingMode) {
            doSetProperty("bindingMode", bindingMode);
            return this;
        }
        /**
         * Host and port of HTTP service to use (override host in openapi
         * schema).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default RestEndpointProducerBuilder host(String host) {
            doSetProperty("host", host);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default RestEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default RestEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The Camel Rest component to use for (producer) the REST transport,
         * such as http, undertow. If no component has been explicit configured,
         * then Camel will lookup if there is a Camel component that integrates
         * with the Rest DSL, or if a org.apache.camel.spi.RestProducerFactory
         * is registered in the registry. If either one is found, then that is
         * being used.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default RestEndpointProducerBuilder producerComponentName(
                String producerComponentName) {
            doSetProperty("producerComponentName", producerComponentName);
            return this;
        }
        /**
         * Query parameters for the HTTP service to call.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default RestEndpointProducerBuilder queryParameters(
                String queryParameters) {
            doSetProperty("queryParameters", queryParameters);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the REST component.
     */
    public interface AdvancedRestEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default RestEndpointProducerBuilder basic() {
            return (RestEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedRestEndpointProducerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedRestEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedRestEndpointProducerBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedRestEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the REST component.
     */
    public interface RestEndpointBuilder
            extends
                RestEndpointConsumerBuilder,
                RestEndpointProducerBuilder {
        default AdvancedRestEndpointBuilder advanced() {
            return (AdvancedRestEndpointBuilder) this;
        }
        /**
         * Media type such as: 'text/xml', or 'application/json' this REST
         * service accepts. By default we accept all kinds of types.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default RestEndpointBuilder consumes(String consumes) {
            doSetProperty("consumes", consumes);
            return this;
        }
        /**
         * To declare the incoming POJO binding type as a FQN class name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default RestEndpointBuilder inType(String inType) {
            doSetProperty("inType", inType);
            return this;
        }
        /**
         * To declare the outgoing POJO binding type as a FQN class name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default RestEndpointBuilder outType(String outType) {
            doSetProperty("outType", outType);
            return this;
        }
        /**
         * Media type such as: 'text/xml', or 'application/json' this REST
         * service returns.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default RestEndpointBuilder produces(String produces) {
            doSetProperty("produces", produces);
            return this;
        }
        /**
         * Name of the route this REST services creates.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default RestEndpointBuilder routeId(String routeId) {
            doSetProperty("routeId", routeId);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the REST component.
     */
    public interface AdvancedRestEndpointBuilder
            extends
                AdvancedRestEndpointConsumerBuilder,
                AdvancedRestEndpointProducerBuilder {
        default RestEndpointBuilder basic() {
            return (RestEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedRestEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedRestEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedRestEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedRestEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.spi.RestConfiguration$RestBindingMode</code> enum.
     */
    enum RestBindingMode {
        auto,
        off,
        json,
        xml,
        json_xml;
    }

    public interface RestBuilders {
        /**
         * REST (camel-rest)
         * The rest component is used for either hosting REST services
         * (consumer) or calling external REST services (producer).
         * 
         * Category: core,rest
         * Since: 2.14
         * Maven coordinates: org.apache.camel:camel-rest
         * 
         * Syntax: <code>rest:method:path:uriTemplate</code>
         * 
         * Path parameter: method (required)
         * HTTP method to use.
         * The value can be one of: get, post, put, delete, patch, head, trace,
         * connect, options
         * 
         * Path parameter: path (required)
         * The base path
         * 
         * Path parameter: uriTemplate
         * The uri template
         */
        default RestEndpointBuilder restEndpoint(String path) {
            return RestEndpointBuilderFactory.restEndpoint(path);
        }
    }
    /**
     * REST (camel-rest)
     * The rest component is used for either hosting REST services (consumer) or
     * calling external REST services (producer).
     * 
     * Category: core,rest
     * Since: 2.14
     * Maven coordinates: org.apache.camel:camel-rest
     * 
     * Syntax: <code>rest:method:path:uriTemplate</code>
     * 
     * Path parameter: method (required)
     * HTTP method to use.
     * The value can be one of: get, post, put, delete, patch, head, trace,
     * connect, options
     * 
     * Path parameter: path (required)
     * The base path
     * 
     * Path parameter: uriTemplate
     * The uri template
     */
    static RestEndpointBuilder restEndpoint(String path) {
        class RestEndpointBuilderImpl extends AbstractEndpointBuilder implements RestEndpointBuilder, AdvancedRestEndpointBuilder {
            public RestEndpointBuilderImpl(String path) {
                super("rest", path);
            }
        }
        return new RestEndpointBuilderImpl(path);
    }
}