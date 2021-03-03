/**
 * GetPageTittleResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Selenium;

public class GetPageTittleResponse  implements java.io.Serializable {
    private java.lang.String getPageTittleReturn;

    public GetPageTittleResponse() {
    }

    public GetPageTittleResponse(
           java.lang.String getPageTittleReturn) {
           this.getPageTittleReturn = getPageTittleReturn;
    }


    /**
     * Gets the getPageTittleReturn value for this GetPageTittleResponse.
     * 
     * @return getPageTittleReturn
     */
    public java.lang.String getGetPageTittleReturn() {
        return getPageTittleReturn;
    }


    /**
     * Sets the getPageTittleReturn value for this GetPageTittleResponse.
     * 
     * @param getPageTittleReturn
     */
    public void setGetPageTittleReturn(java.lang.String getPageTittleReturn) {
        this.getPageTittleReturn = getPageTittleReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPageTittleResponse)) return false;
        GetPageTittleResponse other = (GetPageTittleResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPageTittleReturn==null && other.getGetPageTittleReturn()==null) || 
             (this.getPageTittleReturn!=null &&
              this.getPageTittleReturn.equals(other.getGetPageTittleReturn())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetPageTittleReturn() != null) {
            _hashCode += getGetPageTittleReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPageTittleResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Selenium", ">getPageTittleResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPageTittleReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Selenium", "getPageTittleReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
