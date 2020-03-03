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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.sjms2.Sjms2Component;

/**
 * The sjms2 component (simple jms) allows messages to be sent to (or consumed
 * from) a JMS Queue or Topic (uses JMS 2.x API).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface Sjms2ComponentBuilderFactory {

    /**
     * Simple JMS2 (camel-sjms2)
     * The sjms2 component (simple jms) allows messages to be sent to (or
     * consumed from) a JMS Queue or Topic (uses JMS 2.x API).
     * 
     * Category: messaging
     * Since: 2.19
     * Maven coordinates: org.apache.camel:camel-sjms2
     */
    static Sjms2ComponentBuilder sjms2() {
        return new Sjms2ComponentBuilderImpl();
    }

    /**
     * Builder for the Simple JMS2 component.
     */
    interface Sjms2ComponentBuilder extends ComponentBuilder<Sjms2Component> {
        /**
         * The maximum number of connections available to endpoints started
         * under this component.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Default: 1
         * Group: common
         */
        default Sjms2ComponentBuilder connectionCount(
                java.lang.Integer connectionCount) {
            doSetProperty("connectionCount", connectionCount);
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
        default Sjms2ComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Backoff in millis on consumer pool reconnection attempts.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 5000
         * Group: consumer
         */
        default Sjms2ComponentBuilder reconnectBackOff(long reconnectBackOff) {
            doSetProperty("reconnectBackOff", reconnectBackOff);
            return this;
        }
        /**
         * Try to apply reconnection logic on consumer pool.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default Sjms2ComponentBuilder reconnectOnError(boolean reconnectOnError) {
            doSetProperty("reconnectOnError", reconnectOnError);
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
        default Sjms2ComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default Sjms2ComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * The client ID to use when creating javax.jms.Connection when using
         * the default
         * org.apache.camel.component.sjms.jms.ConnectionFactoryResource.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default Sjms2ComponentBuilder connectionClientId(
                java.lang.String connectionClientId) {
            doSetProperty("connectionClientId", connectionClientId);
            return this;
        }
        /**
         * A ConnectionFactory is required to enable the SjmsComponent. It can
         * be set directly or set set as part of a ConnectionResource.
         * 
         * The option is a: <code>javax.jms.ConnectionFactory</code> type.
         * 
         * Group: advanced
         */
        default Sjms2ComponentBuilder connectionFactory(
                javax.jms.ConnectionFactory connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
            return this;
        }
        /**
         * The max wait time in millis to block and wait on free connection when
         * the pool is exhausted when using the default
         * org.apache.camel.component.sjms.jms.ConnectionFactoryResource.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 5000
         * Group: advanced
         */
        default Sjms2ComponentBuilder connectionMaxWait(long connectionMaxWait) {
            doSetProperty("connectionMaxWait", connectionMaxWait);
            return this;
        }
        /**
         * A ConnectionResource is an interface that allows for customization
         * and container control of the ConnectionFactory. See Plugable
         * Connection Resource Management for further details.
         * 
         * The option is a:
         * <code>org.apache.camel.component.sjms.jms.ConnectionResource</code>
         * type.
         * 
         * Group: advanced
         */
        default Sjms2ComponentBuilder connectionResource(
                org.apache.camel.component.sjms.jms.ConnectionResource connectionResource) {
            doSetProperty("connectionResource", connectionResource);
            return this;
        }
        /**
         * When using the default
         * org.apache.camel.component.sjms.jms.ConnectionFactoryResource then
         * should each javax.jms.Connection be tested (calling start) before
         * returned from the pool.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: advanced
         */
        default Sjms2ComponentBuilder connectionTestOnBorrow(
                boolean connectionTestOnBorrow) {
            doSetProperty("connectionTestOnBorrow", connectionTestOnBorrow);
            return this;
        }
        /**
         * To use a custom DestinationCreationStrategy.
         * 
         * The option is a:
         * <code>org.apache.camel.component.sjms.jms.DestinationCreationStrategy</code> type.
         * 
         * Group: advanced
         */
        default Sjms2ComponentBuilder destinationCreationStrategy(
                org.apache.camel.component.sjms.jms.DestinationCreationStrategy destinationCreationStrategy) {
            doSetProperty("destinationCreationStrategy", destinationCreationStrategy);
            return this;
        }
        /**
         * Pluggable strategy for encoding and decoding JMS keys so they can be
         * compliant with the JMS specification. Camel provides one
         * implementation out of the box: default. The default strategy will
         * safely marshal dots and hyphens (. and -). Can be used for JMS
         * brokers which do not care whether JMS header keys contain illegal
         * characters. You can provide your own implementation of the
         * org.apache.camel.component.jms.JmsKeyFormatStrategy and refer to it
         * using the # notation.
         * 
         * The option is a:
         * <code>org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy</code>
         * type.
         * 
         * Group: advanced
         */
        default Sjms2ComponentBuilder jmsKeyFormatStrategy(
                org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy) {
            doSetProperty("jmsKeyFormatStrategy", jmsKeyFormatStrategy);
            return this;
        }
        /**
         * To use the given MessageCreatedStrategy which are invoked when Camel
         * creates new instances of javax.jms.Message objects when Camel is
         * sending a JMS message.
         * 
         * The option is a:
         * <code>org.apache.camel.component.sjms.jms.MessageCreatedStrategy</code> type.
         * 
         * Group: advanced
         */
        default Sjms2ComponentBuilder messageCreatedStrategy(
                org.apache.camel.component.sjms.jms.MessageCreatedStrategy messageCreatedStrategy) {
            doSetProperty("messageCreatedStrategy", messageCreatedStrategy);
            return this;
        }
        /**
         * To use a custom TimedTaskManager.
         * 
         * The option is a:
         * <code>org.apache.camel.component.sjms.taskmanager.TimedTaskManager</code> type.
         * 
         * Group: advanced
         */
        default Sjms2ComponentBuilder timedTaskManager(
                org.apache.camel.component.sjms.taskmanager.TimedTaskManager timedTaskManager) {
            doSetProperty("timedTaskManager", timedTaskManager);
            return this;
        }
        /**
         * To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter
         * header to and from Camel message.
         * 
         * The option is a:
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * 
         * Group: filter
         */
        default Sjms2ComponentBuilder headerFilterStrategy(
                org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * The password to use when creating javax.jms.Connection when using the
         * default
         * org.apache.camel.component.sjms.jms.ConnectionFactoryResource.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default Sjms2ComponentBuilder connectionPassword(
                java.lang.String connectionPassword) {
            doSetProperty("connectionPassword", connectionPassword);
            return this;
        }
        /**
         * The username to use when creating javax.jms.Connection when using the
         * default
         * org.apache.camel.component.sjms.jms.ConnectionFactoryResource.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default Sjms2ComponentBuilder connectionUsername(
                java.lang.String connectionUsername) {
            doSetProperty("connectionUsername", connectionUsername);
            return this;
        }
        /**
         * To configure which kind of commit strategy to use. Camel provides two
         * implementations out of the box, default and batch.
         * 
         * The option is a:
         * <code>org.apache.camel.component.sjms.TransactionCommitStrategy</code> type.
         * 
         * Group: transaction
         */
        default Sjms2ComponentBuilder transactionCommitStrategy(
                org.apache.camel.component.sjms.TransactionCommitStrategy transactionCommitStrategy) {
            doSetProperty("transactionCommitStrategy", transactionCommitStrategy);
            return this;
        }
    }

    class Sjms2ComponentBuilderImpl
            extends
                AbstractComponentBuilder<Sjms2Component>
            implements
                Sjms2ComponentBuilder {
        @Override
        protected Sjms2Component buildConcreteComponent() {
            return new Sjms2Component();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "connectionCount": ((Sjms2Component) component).setConnectionCount((java.lang.Integer) value); return true;
            case "bridgeErrorHandler": ((Sjms2Component) component).setBridgeErrorHandler((boolean) value); return true;
            case "reconnectBackOff": ((Sjms2Component) component).setReconnectBackOff((long) value); return true;
            case "reconnectOnError": ((Sjms2Component) component).setReconnectOnError((boolean) value); return true;
            case "lazyStartProducer": ((Sjms2Component) component).setLazyStartProducer((boolean) value); return true;
            case "basicPropertyBinding": ((Sjms2Component) component).setBasicPropertyBinding((boolean) value); return true;
            case "connectionClientId": ((Sjms2Component) component).setConnectionClientId((java.lang.String) value); return true;
            case "connectionFactory": ((Sjms2Component) component).setConnectionFactory((javax.jms.ConnectionFactory) value); return true;
            case "connectionMaxWait": ((Sjms2Component) component).setConnectionMaxWait((long) value); return true;
            case "connectionResource": ((Sjms2Component) component).setConnectionResource((org.apache.camel.component.sjms.jms.ConnectionResource) value); return true;
            case "connectionTestOnBorrow": ((Sjms2Component) component).setConnectionTestOnBorrow((boolean) value); return true;
            case "destinationCreationStrategy": ((Sjms2Component) component).setDestinationCreationStrategy((org.apache.camel.component.sjms.jms.DestinationCreationStrategy) value); return true;
            case "jmsKeyFormatStrategy": ((Sjms2Component) component).setJmsKeyFormatStrategy((org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy) value); return true;
            case "messageCreatedStrategy": ((Sjms2Component) component).setMessageCreatedStrategy((org.apache.camel.component.sjms.jms.MessageCreatedStrategy) value); return true;
            case "timedTaskManager": ((Sjms2Component) component).setTimedTaskManager((org.apache.camel.component.sjms.taskmanager.TimedTaskManager) value); return true;
            case "headerFilterStrategy": ((Sjms2Component) component).setHeaderFilterStrategy((org.apache.camel.spi.HeaderFilterStrategy) value); return true;
            case "connectionPassword": ((Sjms2Component) component).setConnectionPassword((java.lang.String) value); return true;
            case "connectionUsername": ((Sjms2Component) component).setConnectionUsername((java.lang.String) value); return true;
            case "transactionCommitStrategy": ((Sjms2Component) component).setTransactionCommitStrategy((org.apache.camel.component.sjms.TransactionCommitStrategy) value); return true;
            default: return false;
            }
        }
    }
}