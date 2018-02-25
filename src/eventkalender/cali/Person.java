/**
 * Person.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eventkalender.cali;

public class Person implements java.io.Serializable {
	private int id;

	private java.lang.String firstName;

	private java.lang.String lastName;

	private eventkalender.cali.Event[] events;

	public Person() {
	}

	public Person(int id, java.lang.String firstName, java.lang.String lastName, eventkalender.cali.Event[] events) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.events = events;
	}

	/**
	 * Gets the id value for this Person.
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id value for this Person.
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the firstName value for this Person.
	 * 
	 * @return firstName
	 */
	public java.lang.String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the firstName value for this Person.
	 * 
	 * @param firstName
	 */
	public void setFirstName(java.lang.String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the lastName value for this Person.
	 * 
	 * @return lastName
	 */
	public java.lang.String getLastName() {
		return lastName;
	}

	/**
	 * Sets the lastName value for this Person.
	 * 
	 * @param lastName
	 */
	public void setLastName(java.lang.String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the events value for this Person.
	 * 
	 * @return events
	 */
	public eventkalender.cali.Event[] getEvents() {
		return events;
	}

	/**
	 * Sets the events value for this Person.
	 * 
	 * @param events
	 */
	public void setEvents(eventkalender.cali.Event[] events) {
		this.events = events;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && this.id == other.getId()
				&& ((this.firstName == null && other.getFirstName() == null)
						|| (this.firstName != null && this.firstName.equals(other.getFirstName())))
				&& ((this.lastName == null && other.getLastName() == null)
						|| (this.lastName != null && this.lastName.equals(other.getLastName())))
				&& ((this.events == null && other.getEvents() == null)
						|| (this.events != null && java.util.Arrays.equals(this.events, other.getEvents())));
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
		if (getFirstName() != null) {
			_hashCode += getFirstName().hashCode();
		}
		if (getLastName() != null) {
			_hashCode += getLastName().hashCode();
		}
		if (getEvents() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getEvents()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getEvents(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Person.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://cali.eventkalender/", "Person"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("id");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.eventkalender/", "Id"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("firstName");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.eventkalender/", "FirstName"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lastName");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.eventkalender/", "LastName"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("events");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.eventkalender/", "Events"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://cali.eventkalender/", "Event"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("http://cali.eventkalender/", "Event"));
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
	public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType,
			java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType,
			java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
	}

}
