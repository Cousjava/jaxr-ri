/*
 * Copyright (c) 2007, 2019 Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 2020 Payara Services Ltd.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-3010 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.11.29 at 04:18:06 PM IST 
//


package com.sun.xml.registry.uddi.bindings_v2_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>Java class for save_binding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="save_binding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:uddi-org:api_v2}authInfo"/>
 *         &lt;element ref="{urn:uddi-org:api_v2}bindingTemplate" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="generic" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "save_binding")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "save_binding", propOrder = {
    "authInfo",
    "bindingTemplate"
})
public class SaveBinding {

    @XmlElement(namespace = "urn:uddi-org:api_v2")
    protected String authInfo;
    @XmlElement(namespace = "urn:uddi-org:api_v2")
    protected List<BindingTemplate> bindingTemplate;
    @XmlAttribute(required = true)
    protected String generic;

    /**
     * Gets the value of the authInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthInfo() {
        return authInfo;
    }

    /**
     * Sets the value of the authInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthInfo(String value) {
        this.authInfo = value;
    }

    /**
     * Gets the value of the bindingTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bindingTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBindingTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BindingTemplate }
     * 
     * 
     */
    public List<BindingTemplate> getBindingTemplate() {
        if (bindingTemplate == null) {
            bindingTemplate = new ArrayList<BindingTemplate>();
        }
        return this.bindingTemplate;
    }

    /**
     * Gets the value of the generic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneric() {
        return generic;
    }

    /**
     * Sets the value of the generic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneric(String value) {
        this.generic = value;
    }

}
