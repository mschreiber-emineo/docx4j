/*
 *  Copyright 2007-2008, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

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


package org.docx4j.dml;

import org.docx4j.dml.ArrayListDml;
import java.util.List;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.ppp.Child;


/**
 * <p>Java class for CT_TextParagraph complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_TextParagraph"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pPr" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TextParagraphProperties" minOccurs="0"/&gt;
 *         &lt;group ref="{http://schemas.openxmlformats.org/drawingml/2006/main}EG_TextRun" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="endParaRPr" type="{http://schemas.openxmlformats.org/drawingml/2006/main}CT_TextCharacterProperties" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_TextParagraph", propOrder = {
    "pPr",
    "egTextRun",
    "endParaRPr"
})
public class CTTextParagraph implements Child
{

    protected CTTextParagraphProperties pPr;
    @XmlElements({
        @XmlElement(name = "r", type = CTRegularTextRun.class),
        @XmlElement(name = "br", type = CTTextLineBreak.class),
        @XmlElement(name = "fld", type = CTTextField.class)
    })
    protected List<Object> egTextRun = new ArrayListDml<Object>(this);
    protected CTTextCharacterProperties endParaRPr;
    @XmlTransient
    private Object parent;

    /**
     * Gets the value of the pPr property.
     * 
     * @return
     *     possible object is
     *     {@link CTTextParagraphProperties }
     *     
     */
    public CTTextParagraphProperties getPPr() {
        return pPr;
    }

    /**
     * Sets the value of the pPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTextParagraphProperties }
     *     
     */
    public void setPPr(CTTextParagraphProperties value) {
        this.pPr = value;
    }

    /**
     * Gets the value of the egTextRun property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the egTextRun property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEGTextRun().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTRegularTextRun }
     * {@link CTTextLineBreak }
     * {@link CTTextField }
     * 
     * 
     */
    public List<Object> getEGTextRun() {
        if (egTextRun == null) {
            egTextRun = new ArrayListDml<Object>(this);
        }
        return this.egTextRun;
    }

    /**
     * Gets the value of the endParaRPr property.
     * 
     * @return
     *     possible object is
     *     {@link CTTextCharacterProperties }
     *     
     */
    public CTTextCharacterProperties getEndParaRPr() {
        return endParaRPr;
    }

    /**
     * Sets the value of the endParaRPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTextCharacterProperties }
     *     
     */
    public void setEndParaRPr(CTTextCharacterProperties value) {
        this.endParaRPr = value;
    }

    /**
     * Gets the parent object in the object tree representing the unmarshalled xml document.
     * 
     * @return
     *     The parent object.
     */
    public Object getParent() {
        return this.parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    /**
     * This method is invoked by the JAXB implementation on each instance when unmarshalling completes.
     * 
     * @param parent
     *     The parent object in the object tree.
     * @param unmarshaller
     *     The unmarshaller that generated the instance.
     */
    public void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        setParent(parent);
    }

}