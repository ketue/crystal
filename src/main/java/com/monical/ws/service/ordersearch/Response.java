//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.31 时间 05:47:53 PM CST 
//


package com.monical.ws.service.ordersearch;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Head" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Body" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OrderResponse" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="orderid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="mailno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="origincode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="destcode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="filter_result" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ERROR" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="service" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "head",
    "body",
    "error"
})
@XmlRootElement(name = "Response")
public class Response {

    @XmlElement(name = "Head")
    protected String head;
    @XmlElement(name = "Body")
    protected List<Response.Body> body;
    @XmlElement(name = "ERROR", nillable = true)
    protected List<Response.ERROR> error;
    @XmlAttribute(name = "service")
    protected String service;

    /**
     * 获取head属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHead() {
        return head;
    }

    /**
     * 设置head属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHead(String value) {
        this.head = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the body property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBody().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Response.Body }
     * 
     * 
     */
    public List<Response.Body> getBody() {
        if (body == null) {
            body = new ArrayList<Response.Body>();
        }
        return this.body;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getERROR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Response.ERROR }
     * 
     * 
     */
    public List<Response.ERROR> getERROR() {
        if (error == null) {
            error = new ArrayList<Response.ERROR>();
        }
        return this.error;
    }

    /**
     * 获取service属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * 设置service属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OrderResponse" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="orderid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="mailno" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="origincode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="destcode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="filter_result" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orderResponse"
    })
    public static class Body {

        @XmlElement(name = "OrderResponse")
        protected List<Response.Body.OrderResponse> orderResponse;

        /**
         * Gets the value of the orderResponse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orderResponse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrderResponse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Response.Body.OrderResponse }
         * 
         * 
         */
        public List<Response.Body.OrderResponse> getOrderResponse() {
            if (orderResponse == null) {
                orderResponse = new ArrayList<Response.Body.OrderResponse>();
            }
            return this.orderResponse;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="orderid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="mailno" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="origincode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="destcode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="filter_result" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OrderResponse {

            @XmlAttribute(name = "orderid")
            protected String orderid;
            @XmlAttribute(name = "mailno")
            protected String mailno;
            @XmlAttribute(name = "origincode")
            protected String origincode;
            @XmlAttribute(name = "destcode")
            protected String destcode;
            @XmlAttribute(name = "filter_result")
            protected String filterResult;

            /**
             * 获取orderid属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrderid() {
                return orderid;
            }

            /**
             * 设置orderid属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrderid(String value) {
                this.orderid = value;
            }

            /**
             * 获取mailno属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMailno() {
                return mailno;
            }

            /**
             * 设置mailno属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMailno(String value) {
                this.mailno = value;
            }

            /**
             * 获取origincode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrigincode() {
                return origincode;
            }

            /**
             * 设置origincode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrigincode(String value) {
                this.origincode = value;
            }

            /**
             * 获取destcode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDestcode() {
                return destcode;
            }

            /**
             * 设置destcode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDestcode(String value) {
                this.destcode = value;
            }

            /**
             * 获取filterResult属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFilterResult() {
                return filterResult;
            }

            /**
             * 设置filterResult属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFilterResult(String value) {
                this.filterResult = value;
            }

        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ERROR {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "code")
        protected String code;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * 获取code属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * 设置code属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

    }

}
