//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.12 at 01:48:04 PM CEST 
//


package de.tum.in.i22.uc.pdp.xsd.event;

import ae.javax.xml.bind.annotation.XmlEnum;
import ae.javax.xml.bind.annotation.XmlEnumValue;
import ae.javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventParameterDataTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventParameterDataTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="string"/>
 *     &lt;enumeration value="data"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EventParameterDataTypes")
@XmlEnum
public enum EventParameterDataTypes {

    @XmlEnumValue("string")
    STRING("string"),
    @XmlEnumValue("data")
    DATA("data");
    private final String value;

    EventParameterDataTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventParameterDataTypes fromValue(String v) {
        for (EventParameterDataTypes c: EventParameterDataTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
