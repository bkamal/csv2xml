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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TitleIPartASchoolDesignationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TitleIPartASchoolDesignationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Not designated as a Title I Part A school"/>
 *     &lt;enumeration value="Title I Part A Schoolwide Assistance Program School"/>
 *     &lt;enumeration value="Title I Part A Targeted Assistance School"/>
 *     &lt;enumeration value="Title I targeted eligible school - no program"/>
 *     &lt;enumeration value="Title I targeted school"/>
 *     &lt;enumeration value="Title I school wide eligible - Title I targeted program"/>
 *     &lt;enumeration value="Title I school wide eligible school - no program"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TitleIPartASchoolDesignationType")
@XmlEnum
public enum TitleIPartASchoolDesignationType {

    @XmlEnumValue("Not designated as a Title I Part A school")
    NOT_DESIGNATED_AS_A_TITLE_I_PART_A_SCHOOL("Not designated as a Title I Part A school"),
    @XmlEnumValue("Title I Part A Schoolwide Assistance Program School")
    TITLE_I_PART_A_SCHOOLWIDE_ASSISTANCE_PROGRAM_SCHOOL("Title I Part A Schoolwide Assistance Program School"),
    @XmlEnumValue("Title I Part A Targeted Assistance School")
    TITLE_I_PART_A_TARGETED_ASSISTANCE_SCHOOL("Title I Part A Targeted Assistance School"),
    @XmlEnumValue("Title I targeted eligible school - no program")
    TITLE_I_TARGETED_ELIGIBLE_SCHOOL_NO_PROGRAM("Title I targeted eligible school - no program"),
    @XmlEnumValue("Title I targeted school")
    TITLE_I_TARGETED_SCHOOL("Title I targeted school"),
    @XmlEnumValue("Title I school wide eligible - Title I targeted program")
    TITLE_I_SCHOOL_WIDE_ELIGIBLE_TITLE_I_TARGETED_PROGRAM("Title I school wide eligible - Title I targeted program"),
    @XmlEnumValue("Title I school wide eligible school - no program")
    TITLE_I_SCHOOL_WIDE_ELIGIBLE_SCHOOL_NO_PROGRAM("Title I school wide eligible school - no program");
    private final String value;

    TitleIPartASchoolDesignationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TitleIPartASchoolDesignationType fromValue(String v) {
        for (TitleIPartASchoolDesignationType c: TitleIPartASchoolDesignationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}