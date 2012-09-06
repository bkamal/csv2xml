/*
 * Copyright 2012 Shared Learning Collaborative, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.20 at 03:09:04 PM EDT 
//


package org.slc.sli.sample.entities;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Grade Point Average computed for a gradng period or cumulatively.
 * 
 * <p>Java class for GradePointAverage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GradePointAverage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GPA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="GPAWeighted" type="{http://ed-fi.org/0100}GPAWeightedType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GradePointAverage", propOrder = {
    "gpa"
})
public class GradePointAverage {

    @XmlElement(name = "GPA", required = true)
    protected BigDecimal gpa;
    @XmlAttribute(name = "GPAWeighted")
    protected GPAWeightedType gpaWeighted;

    /**
     * Gets the value of the gpa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGPA() {
        return gpa;
    }

    /**
     * Sets the value of the gpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGPA(BigDecimal value) {
        this.gpa = value;
    }

    /**
     * Gets the value of the gpaWeighted property.
     * 
     * @return
     *     possible object is
     *     {@link GPAWeightedType }
     *     
     */
    public GPAWeightedType getGPAWeighted() {
        return gpaWeighted;
    }

    /**
     * Sets the value of the gpaWeighted property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPAWeightedType }
     *     
     */
    public void setGPAWeighted(GPAWeightedType value) {
        this.gpaWeighted = value;
    }

}
