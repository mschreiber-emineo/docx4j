/*
 *  Copyright 2010-2012, Plutext Pty Ltd.
 *   
 *  This file is part of pptx4j, a component of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */
package org.pptx4j.pml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_TLCommandType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_TLCommandType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="evt"/&gt;
 *     &lt;enumeration value="call"/&gt;
 *     &lt;enumeration value="verb"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_TLCommandType")
@XmlEnum
public enum STTLCommandType {


    /**
     * Command Type Enum ( Event )
     * 
     */
    @XmlEnumValue("evt")
    EVT("evt"),

    /**
     * Command Type Enum ( Call )
     * 
     */
    @XmlEnumValue("call")
    CALL("call"),

    /**
     * Command Type Enum ( Verb )
     * 
     */
    @XmlEnumValue("verb")
    VERB("verb");
    private final String value;

    STTLCommandType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STTLCommandType fromValue(String v) {
        for (STTLCommandType c: STTLCommandType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}