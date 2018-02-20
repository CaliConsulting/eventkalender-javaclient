/**
 * Event.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eventkalender.cali;

public class Event  implements java.io.Serializable {
    private int id;

    private java.lang.String name;

    private java.lang.String summary;

    private java.util.Calendar startTime;

    private java.util.Calendar endTime;

    private int nationId;

    private eventkalender.cali.Nation nation;

    private eventkalender.cali.Person[] persons;

    public Event() {
    }

    public Event(
           int id,
           java.lang.String name,
           java.lang.String summary,
           java.util.Calendar startTime,
           java.util.Calendar endTime,
           int nationId,
           eventkalender.cali.Nation nation,
           eventkalender.cali.Person[] persons) {
           this.id = id;
           this.name = name;
           this.summary = summary;
           this.startTime = startTime;
           this.endTime = endTime;
           this.nationId = nationId;
           this.nation = nation;
           this.persons = persons;
    }


    /**
     * Gets the id value for this Event.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Event.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Event.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Event.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the summary value for this Event.
     * 
     * @return summary
     */
    public java.lang.String getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this Event.
     * 
     * @param summary
     */
    public void setSummary(java.lang.String summary) {
        this.summary = summary;
    }


    /**
     * Gets the startTime value for this Event.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this Event.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this Event.
     * 
     * @return endTime
     */
    public java.util.Calendar getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this Event.
     * 
     * @param endTime
     */
    public void setEndTime(java.util.Calendar endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the nationId value for this Event.
     * 
     * @return nationId
     */
    public int getNationId() {
        return nationId;
    }


    /**
     * Sets the nationId value for this Event.
     * 
     * @param nationId
     */
    public void setNationId(int nationId) {
        this.nationId = nationId;
    }


    /**
     * Gets the nation value for this Event.
     * 
     * @return nation
     */
    public eventkalender.cali.Nation getNation() {
        return nation;
    }


    /**
     * Sets the nation value for this Event.
     * 
     * @param nation
     */
    public void setNation(eventkalender.cali.Nation nation) {
        this.nation = nation;
    }


    /**
     * Gets the persons value for this Event.
     * 
     * @return persons
     */
    public eventkalender.cali.Person[] getPersons() {
        return persons;
    }


    /**
     * Sets the persons value for this Event.
     * 
     * @param persons
     */
    public void setPersons(eventkalender.cali.Person[] persons) {
        this.persons = persons;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Event)) return false;
        Event other = (Event) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.summary==null && other.getSummary()==null) || 
             (this.summary!=null &&
              this.summary.equals(other.getSummary()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            this.nationId == other.getNationId() &&
            ((this.nation==null && other.getNation()==null) || 
             (this.nation!=null &&
              this.nation.equals(other.getNation()))) &&
            ((this.persons==null && other.getPersons()==null) || 
             (this.persons!=null &&
              java.util.Arrays.equals(this.persons, other.getPersons())));
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
        _hashCode += getId();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSummary() != null) {
            _hashCode += getSummary().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        _hashCode += getNationId();
        if (getNation() != null) {
            _hashCode += getNation().hashCode();
        }
        if (getPersons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPersons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPersons(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Event.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cali.eventkalender/", "Event"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cali.eventkalender/", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cali.eventkalender/", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cali.eventkalender/", "Summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cali.eventkalender/", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cali.eventkalender/", "EndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cali.eventkalender/", "NationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cali.eventkalender/", "Nation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cali.eventkalender/", "Nation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cali.eventkalender/", "Persons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cali.eventkalender/", "Person"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://cali.eventkalender/", "Person"));
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
