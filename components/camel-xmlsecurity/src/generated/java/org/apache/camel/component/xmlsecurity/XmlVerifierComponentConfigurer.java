/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.xmlsecurity;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class XmlVerifierComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    private org.apache.camel.component.xmlsecurity.processor.XmlVerifierConfiguration getOrCreateConfiguration(XmlVerifierComponent target) {
        if (target.getVerifierConfiguration() == null) {
            target.setVerifierConfiguration(new org.apache.camel.component.xmlsecurity.processor.XmlVerifierConfiguration());
        }
        return target.getVerifierConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        XmlVerifierComponent target = (XmlVerifierComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "baseuri":
        case "baseUri": getOrCreateConfiguration(target).setBaseUri(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "clearheaders":
        case "clearHeaders": getOrCreateConfiguration(target).setClearHeaders(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "cryptocontextproperties":
        case "cryptoContextProperties": getOrCreateConfiguration(target).setCryptoContextProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "disallowdoctypedecl":
        case "disallowDoctypeDecl": getOrCreateConfiguration(target).setDisallowDoctypeDecl(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "keyselector":
        case "keySelector": getOrCreateConfiguration(target).setKeySelector(property(camelContext, javax.xml.crypto.KeySelector.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "omitxmldeclaration":
        case "omitXmlDeclaration": getOrCreateConfiguration(target).setOmitXmlDeclaration(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "outputnodesearch":
        case "outputNodeSearch": getOrCreateConfiguration(target).setOutputNodeSearch(property(camelContext, java.lang.Object.class, value)); return true;
        case "outputnodesearchtype":
        case "outputNodeSearchType": getOrCreateConfiguration(target).setOutputNodeSearchType(property(camelContext, java.lang.String.class, value)); return true;
        case "outputxmlencoding":
        case "outputXmlEncoding": getOrCreateConfiguration(target).setOutputXmlEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "removesignatureelements":
        case "removeSignatureElements": getOrCreateConfiguration(target).setRemoveSignatureElements(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "schemaresourceuri":
        case "schemaResourceUri": getOrCreateConfiguration(target).setSchemaResourceUri(property(camelContext, java.lang.String.class, value)); return true;
        case "securevalidation":
        case "secureValidation": getOrCreateConfiguration(target).setSecureValidation(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "uridereferencer":
        case "uriDereferencer": getOrCreateConfiguration(target).setUriDereferencer(property(camelContext, javax.xml.crypto.URIDereferencer.class, value)); return true;
        case "validationfailedhandler":
        case "validationFailedHandler": getOrCreateConfiguration(target).setValidationFailedHandler(property(camelContext, org.apache.camel.component.xmlsecurity.api.ValidationFailedHandler.class, value)); return true;
        case "verifierconfiguration":
        case "verifierConfiguration": target.setVerifierConfiguration(property(camelContext, org.apache.camel.component.xmlsecurity.processor.XmlVerifierConfiguration.class, value)); return true;
        case "xmlsignature2message":
        case "xmlSignature2Message": getOrCreateConfiguration(target).setXmlSignature2Message(property(camelContext, org.apache.camel.component.xmlsecurity.api.XmlSignature2Message.class, value)); return true;
        case "xmlsignaturechecker":
        case "xmlSignatureChecker": getOrCreateConfiguration(target).setXmlSignatureChecker(property(camelContext, org.apache.camel.component.xmlsecurity.api.XmlSignatureChecker.class, value)); return true;
        default: return false;
        }
    }

}

