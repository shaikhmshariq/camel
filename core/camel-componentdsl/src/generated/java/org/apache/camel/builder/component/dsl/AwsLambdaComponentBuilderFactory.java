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
import org.apache.camel.component.aws.lambda.LambdaComponent;

/**
 * The aws-lambda is used for managing and invoking functions from Amazon
 * Lambda.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AwsLambdaComponentBuilderFactory {

    /**
     * AWS Lambda (camel-aws-lambda)
     * The aws-lambda is used for managing and invoking functions from Amazon
     * Lambda.
     * 
     * Category: cloud,computing,serverless
     * Since: 2.20
     * Maven coordinates: org.apache.camel:camel-aws-lambda
     */
    static AwsLambdaComponentBuilder awsLambda() {
        return new AwsLambdaComponentBuilderImpl();
    }

    /**
     * Builder for the AWS Lambda component.
     */
    interface AwsLambdaComponentBuilder
            extends
                ComponentBuilder<LambdaComponent> {
        /**
         * The AWS Lambda default configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.lambda.LambdaConfiguration</code> type.
         * 
         * Group: producer
         */
        default AwsLambdaComponentBuilder configuration(
                org.apache.camel.component.aws.lambda.LambdaConfiguration configuration) {
            doSetProperty("configuration", configuration);
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
        default AwsLambdaComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to perform. It can be listFunctions, getFunction,
         * createFunction, deleteFunction or invokeFunction.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.lambda.LambdaOperations</code>
         * type.
         * 
         * Default: invokeFunction
         * Group: producer
         */
        default AwsLambdaComponentBuilder operation(
                org.apache.camel.component.aws.lambda.LambdaOperations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Amazon AWS Region. When using this parameter, the configuration will
         * expect the capitalized name of the region (for example AP_EAST_1)
         * You'll need to use the name Regions.EU_WEST_1.name().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsLambdaComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * To use a existing configured AwsLambdaClient as client.
         * 
         * The option is a: <code>com.amazonaws.services.lambda.AWSLambda</code>
         * type.
         * 
         * Group: advanced
         */
        default AwsLambdaComponentBuilder awsLambdaClient(
                com.amazonaws.services.lambda.AWSLambda awsLambdaClient) {
            doSetProperty("awsLambdaClient", awsLambdaClient);
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
        default AwsLambdaComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To define a proxy host when instantiating the Lambda client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default AwsLambdaComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Lambda client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: proxy
         */
        default AwsLambdaComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Lambda client.
         * 
         * The option is a: <code>com.amazonaws.Protocol</code> type.
         * 
         * Default: HTTPS
         * Group: proxy
         */
        default AwsLambdaComponentBuilder proxyProtocol(
                com.amazonaws.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default AwsLambdaComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default AwsLambdaComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    class AwsLambdaComponentBuilderImpl
            extends
                AbstractComponentBuilder<LambdaComponent>
            implements
                AwsLambdaComponentBuilder {
        @Override
        protected LambdaComponent buildConcreteComponent() {
            return new LambdaComponent();
        }
        private org.apache.camel.component.aws.lambda.LambdaConfiguration getOrCreateConfiguration(
                org.apache.camel.component.aws.lambda.LambdaComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws.lambda.LambdaConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configuration": ((LambdaComponent) component).setConfiguration((org.apache.camel.component.aws.lambda.LambdaConfiguration) value); return true;
            case "lazyStartProducer": ((LambdaComponent) component).setLazyStartProducer((boolean) value); return true;
            case "operation": getOrCreateConfiguration((LambdaComponent) component).setOperation((org.apache.camel.component.aws.lambda.LambdaOperations) value); return true;
            case "region": getOrCreateConfiguration((LambdaComponent) component).setRegion((java.lang.String) value); return true;
            case "awsLambdaClient": getOrCreateConfiguration((LambdaComponent) component).setAwsLambdaClient((com.amazonaws.services.lambda.AWSLambda) value); return true;
            case "basicPropertyBinding": ((LambdaComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "proxyHost": getOrCreateConfiguration((LambdaComponent) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((LambdaComponent) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((LambdaComponent) component).setProxyProtocol((com.amazonaws.Protocol) value); return true;
            case "accessKey": getOrCreateConfiguration((LambdaComponent) component).setAccessKey((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((LambdaComponent) component).setSecretKey((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}