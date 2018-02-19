/**
 * CronusServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cali.se.lu.ics.www;

public class CronusServiceSoapStub extends org.apache.axis.client.Stub implements cali.se.lu.ics.www.CronusServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[20];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetKeys");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "ArrayOfString"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetKeysResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetIndexes");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "ArrayOfString"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetIndexesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTableConstraints");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "ArrayOfString"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetTableConstraintsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTables");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "ArrayOfString"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetTablesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetColumnsForEmployeeTable");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "ArrayOfString"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetColumnsForEmployeeTableResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetIllestPerson");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "DataTuple"));
        oper.setReturnClass(cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetIllestPersonResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "Entry"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetIllPersonsByYear");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "startYear"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "endYear"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "ArrayOfDataTuple"));
        oper.setReturnClass(cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetIllPersonsByYearResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "DataTuple"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEmployeeAndRelatives");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "ArrayOfDataTuple"));
        oper.setReturnClass(cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeeAndRelativesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "DataTuple"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEmployeeData");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "ArrayOfDataTuple"));
        oper.setReturnClass(cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeeDataResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "DataTuple"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEmployeeAbsenceData");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "ArrayOfDataTuple"));
        oper.setReturnClass(cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeeAbsenceDataResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "DataTuple"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEmployeeRelativeData");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "ArrayOfDataTuple"));
        oper.setReturnClass(cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeeRelativeDataResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "DataTuple"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEmployeeQualificationData");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "ArrayOfDataTuple"));
        oper.setReturnClass(cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeeQualificationDataResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "DataTuple"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEmployeePortalSetupData");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "ArrayOfDataTuple"));
        oper.setReturnClass(cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeePortalSetupDataResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "DataTuple"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEmployeeStatisticsGroupData");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "ArrayOfDataTuple"));
        oper.setReturnClass(cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeeStatisticsGroupDataResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "DataTuple"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEmployeeMetadata");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "ArrayOfDataTuple"));
        oper.setReturnClass(cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeeMetadataResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "DataTuple"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEmployeeAbsenceMetadata");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "ArrayOfDataTuple"));
        oper.setReturnClass(cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeeAbsenceMetadataResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "DataTuple"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEmployeeRelativeMetadata");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "ArrayOfDataTuple"));
        oper.setReturnClass(cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeeRelativeMetadataResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "DataTuple"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEmployeeQualificationMetadata");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "ArrayOfDataTuple"));
        oper.setReturnClass(cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeeQualificationMetadataResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "DataTuple"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEmployeePortalSetupMetadata");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "ArrayOfDataTuple"));
        oper.setReturnClass(cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeePortalSetupMetadataResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "DataTuple"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEmployeeStatisticsGroupMetadata");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "ArrayOfDataTuple"));
        oper.setReturnClass(cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeeStatisticsGroupMetadataResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "DataTuple"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    public CronusServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CronusServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CronusServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "ArrayOfDataTuple");
            cachedSerQNames.add(qName);
            cls = cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "DataTuple");
            qName2 = new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "DataTuple");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "DataTuple");
            cachedSerQNames.add(qName);
            cls = cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "SerializableKeyValuePairOfStringString");
            qName2 = new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "Entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "SerializableKeyValuePairOfStringString");
            cachedSerQNames.add(qName);
            cls = cali.se.lu.ics.www.SerializableKeyValuePairOfStringString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public java.lang.String[] getKeys() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.ics.lu.se.cali/GetKeys");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetKeys"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getIndexes() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.ics.lu.se.cali/GetIndexes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetIndexes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getTableConstraints() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.ics.lu.se.cali/GetTableConstraints");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetTableConstraints"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getTables() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.ics.lu.se.cali/GetTables");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetTables"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getColumnsForEmployeeTable() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.ics.lu.se.cali/GetColumnsForEmployeeTable");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetColumnsForEmployeeTable"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[] getIllestPerson() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.ics.lu.se.cali/GetIllestPerson");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetIllestPerson"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[]) org.apache.axis.utils.JavaUtils.convert(_resp, cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getIllPersonsByYear(int startYear, int endYear) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.ics.lu.se.cali/GetIllPersonsByYear");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetIllPersonsByYear"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(startYear), new java.lang.Integer(endYear)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) org.apache.axis.utils.JavaUtils.convert(_resp, cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeAndRelatives() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.ics.lu.se.cali/GetEmployeeAndRelatives");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeeAndRelatives"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) org.apache.axis.utils.JavaUtils.convert(_resp, cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeData() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.ics.lu.se.cali/GetEmployeeData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeeData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) org.apache.axis.utils.JavaUtils.convert(_resp, cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeAbsenceData() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.ics.lu.se.cali/GetEmployeeAbsenceData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeeAbsenceData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) org.apache.axis.utils.JavaUtils.convert(_resp, cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeRelativeData() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.ics.lu.se.cali/GetEmployeeRelativeData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeeRelativeData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) org.apache.axis.utils.JavaUtils.convert(_resp, cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeQualificationData() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.ics.lu.se.cali/GetEmployeeQualificationData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeeQualificationData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) org.apache.axis.utils.JavaUtils.convert(_resp, cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeePortalSetupData() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.ics.lu.se.cali/GetEmployeePortalSetupData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeePortalSetupData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) org.apache.axis.utils.JavaUtils.convert(_resp, cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeStatisticsGroupData() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.ics.lu.se.cali/GetEmployeeStatisticsGroupData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeeStatisticsGroupData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) org.apache.axis.utils.JavaUtils.convert(_resp, cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeMetadata() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.ics.lu.se.cali/GetEmployeeMetadata");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeeMetadata"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) org.apache.axis.utils.JavaUtils.convert(_resp, cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeAbsenceMetadata() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.ics.lu.se.cali/GetEmployeeAbsenceMetadata");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeeAbsenceMetadata"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) org.apache.axis.utils.JavaUtils.convert(_resp, cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeRelativeMetadata() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.ics.lu.se.cali/GetEmployeeRelativeMetadata");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeeRelativeMetadata"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) org.apache.axis.utils.JavaUtils.convert(_resp, cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeQualificationMetadata() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.ics.lu.se.cali/GetEmployeeQualificationMetadata");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeeQualificationMetadata"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) org.apache.axis.utils.JavaUtils.convert(_resp, cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeePortalSetupMetadata() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.ics.lu.se.cali/GetEmployeePortalSetupMetadata");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeePortalSetupMetadata"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) org.apache.axis.utils.JavaUtils.convert(_resp, cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeStatisticsGroupMetadata() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.ics.lu.se.cali/GetEmployeeStatisticsGroupMetadata");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.ics.lu.se.cali/", "GetEmployeeStatisticsGroupMetadata"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][]) org.apache.axis.utils.JavaUtils.convert(_resp, cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
