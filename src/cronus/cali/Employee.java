/**
 * Employee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cronus.cali;

public class Employee implements java.io.Serializable {
	private byte[] timestamp;

	private java.lang.String no;

	private java.lang.String firstName;

	private java.lang.String middleName;

	private java.lang.String lastName;

	private java.lang.String initials;

	private java.lang.String jobTitle;

	private java.lang.String searchName;

	private java.lang.String address;

	private java.lang.String address2;

	private java.lang.String city;

	private java.lang.String postCode;

	private java.lang.String county;

	private java.lang.String phoneNo;

	private java.lang.String mobilePhoneNo;

	private java.lang.String email;

	private java.lang.String altAddressCode;

	private java.util.Calendar altAddressStartDate;

	private java.util.Calendar altAddressEndDate;

	private byte[] picture;

	private java.util.Calendar birthDate;

	private java.lang.String socialSecurityNo;

	private java.lang.String unionCode;

	private java.lang.String unionMembershipNo;

	private int sex;

	private java.lang.String countryRegionCode;

	private java.lang.String managerNo;

	private java.lang.String employmentContractCode;

	private java.lang.String statisticsGroupCode;

	private java.util.Calendar employmentDate;

	private int status;

	private java.util.Calendar inactiveDate;

	private java.lang.String causeOfInactivityCode;

	private java.util.Calendar terminationDate;

	private java.lang.String groundsForTermCode;

	private java.lang.String globalDimension1Code;

	private java.lang.String globalDimension2Code;

	private java.lang.String resourceNo;

	private java.util.Calendar lastDateModified;

	private java.lang.String extension;

	private java.lang.String pager;

	private java.lang.String faxNo;

	private java.lang.String companyEmail;

	private java.lang.String title;

	private java.lang.String salesPersPurchCode;

	private java.lang.String noSeries;

	public Employee() {
	}

	public Employee(byte[] timestamp, java.lang.String no, java.lang.String firstName, java.lang.String middleName,
			java.lang.String lastName, java.lang.String initials, java.lang.String jobTitle,
			java.lang.String searchName, java.lang.String address, java.lang.String address2, java.lang.String city,
			java.lang.String postCode, java.lang.String county, java.lang.String phoneNo,
			java.lang.String mobilePhoneNo, java.lang.String email, java.lang.String altAddressCode,
			java.util.Calendar altAddressStartDate, java.util.Calendar altAddressEndDate, byte[] picture,
			java.util.Calendar birthDate, java.lang.String socialSecurityNo, java.lang.String unionCode,
			java.lang.String unionMembershipNo, int sex, java.lang.String countryRegionCode, java.lang.String managerNo,
			java.lang.String employmentContractCode, java.lang.String statisticsGroupCode,
			java.util.Calendar employmentDate, int status, java.util.Calendar inactiveDate,
			java.lang.String causeOfInactivityCode, java.util.Calendar terminationDate,
			java.lang.String groundsForTermCode, java.lang.String globalDimension1Code,
			java.lang.String globalDimension2Code, java.lang.String resourceNo, java.util.Calendar lastDateModified,
			java.lang.String extension, java.lang.String pager, java.lang.String faxNo, java.lang.String companyEmail,
			java.lang.String title, java.lang.String salesPersPurchCode, java.lang.String noSeries) {
		this.timestamp = timestamp;
		this.no = no;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.initials = initials;
		this.jobTitle = jobTitle;
		this.searchName = searchName;
		this.address = address;
		this.address2 = address2;
		this.city = city;
		this.postCode = postCode;
		this.county = county;
		this.phoneNo = phoneNo;
		this.mobilePhoneNo = mobilePhoneNo;
		this.email = email;
		this.altAddressCode = altAddressCode;
		this.altAddressStartDate = altAddressStartDate;
		this.altAddressEndDate = altAddressEndDate;
		this.picture = picture;
		this.birthDate = birthDate;
		this.socialSecurityNo = socialSecurityNo;
		this.unionCode = unionCode;
		this.unionMembershipNo = unionMembershipNo;
		this.sex = sex;
		this.countryRegionCode = countryRegionCode;
		this.managerNo = managerNo;
		this.employmentContractCode = employmentContractCode;
		this.statisticsGroupCode = statisticsGroupCode;
		this.employmentDate = employmentDate;
		this.status = status;
		this.inactiveDate = inactiveDate;
		this.causeOfInactivityCode = causeOfInactivityCode;
		this.terminationDate = terminationDate;
		this.groundsForTermCode = groundsForTermCode;
		this.globalDimension1Code = globalDimension1Code;
		this.globalDimension2Code = globalDimension2Code;
		this.resourceNo = resourceNo;
		this.lastDateModified = lastDateModified;
		this.extension = extension;
		this.pager = pager;
		this.faxNo = faxNo;
		this.companyEmail = companyEmail;
		this.title = title;
		this.salesPersPurchCode = salesPersPurchCode;
		this.noSeries = noSeries;
	}

	/**
	 * Gets the timestamp value for this Employee.
	 * 
	 * @return timestamp
	 */
	public byte[] getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the timestamp value for this Employee.
	 * 
	 * @param timestamp
	 */
	public void setTimestamp(byte[] timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * Gets the no value for this Employee.
	 * 
	 * @return no
	 */
	public java.lang.String getNo() {
		return no;
	}

	/**
	 * Sets the no value for this Employee.
	 * 
	 * @param no
	 */
	public void setNo(java.lang.String no) {
		this.no = no;
	}

	/**
	 * Gets the firstName value for this Employee.
	 * 
	 * @return firstName
	 */
	public java.lang.String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the firstName value for this Employee.
	 * 
	 * @param firstName
	 */
	public void setFirstName(java.lang.String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the middleName value for this Employee.
	 * 
	 * @return middleName
	 */
	public java.lang.String getMiddleName() {
		return middleName;
	}

	/**
	 * Sets the middleName value for this Employee.
	 * 
	 * @param middleName
	 */
	public void setMiddleName(java.lang.String middleName) {
		this.middleName = middleName;
	}

	/**
	 * Gets the lastName value for this Employee.
	 * 
	 * @return lastName
	 */
	public java.lang.String getLastName() {
		return lastName;
	}

	/**
	 * Sets the lastName value for this Employee.
	 * 
	 * @param lastName
	 */
	public void setLastName(java.lang.String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the initials value for this Employee.
	 * 
	 * @return initials
	 */
	public java.lang.String getInitials() {
		return initials;
	}

	/**
	 * Sets the initials value for this Employee.
	 * 
	 * @param initials
	 */
	public void setInitials(java.lang.String initials) {
		this.initials = initials;
	}

	/**
	 * Gets the jobTitle value for this Employee.
	 * 
	 * @return jobTitle
	 */
	public java.lang.String getJobTitle() {
		return jobTitle;
	}

	/**
	 * Sets the jobTitle value for this Employee.
	 * 
	 * @param jobTitle
	 */
	public void setJobTitle(java.lang.String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * Gets the searchName value for this Employee.
	 * 
	 * @return searchName
	 */
	public java.lang.String getSearchName() {
		return searchName;
	}

	/**
	 * Sets the searchName value for this Employee.
	 * 
	 * @param searchName
	 */
	public void setSearchName(java.lang.String searchName) {
		this.searchName = searchName;
	}

	/**
	 * Gets the address value for this Employee.
	 * 
	 * @return address
	 */
	public java.lang.String getAddress() {
		return address;
	}

	/**
	 * Sets the address value for this Employee.
	 * 
	 * @param address
	 */
	public void setAddress(java.lang.String address) {
		this.address = address;
	}

	/**
	 * Gets the address2 value for this Employee.
	 * 
	 * @return address2
	 */
	public java.lang.String getAddress2() {
		return address2;
	}

	/**
	 * Sets the address2 value for this Employee.
	 * 
	 * @param address2
	 */
	public void setAddress2(java.lang.String address2) {
		this.address2 = address2;
	}

	/**
	 * Gets the city value for this Employee.
	 * 
	 * @return city
	 */
	public java.lang.String getCity() {
		return city;
	}

	/**
	 * Sets the city value for this Employee.
	 * 
	 * @param city
	 */
	public void setCity(java.lang.String city) {
		this.city = city;
	}

	/**
	 * Gets the postCode value for this Employee.
	 * 
	 * @return postCode
	 */
	public java.lang.String getPostCode() {
		return postCode;
	}

	/**
	 * Sets the postCode value for this Employee.
	 * 
	 * @param postCode
	 */
	public void setPostCode(java.lang.String postCode) {
		this.postCode = postCode;
	}

	/**
	 * Gets the county value for this Employee.
	 * 
	 * @return county
	 */
	public java.lang.String getCounty() {
		return county;
	}

	/**
	 * Sets the county value for this Employee.
	 * 
	 * @param county
	 */
	public void setCounty(java.lang.String county) {
		this.county = county;
	}

	/**
	 * Gets the phoneNo value for this Employee.
	 * 
	 * @return phoneNo
	 */
	public java.lang.String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * Sets the phoneNo value for this Employee.
	 * 
	 * @param phoneNo
	 */
	public void setPhoneNo(java.lang.String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * Gets the mobilePhoneNo value for this Employee.
	 * 
	 * @return mobilePhoneNo
	 */
	public java.lang.String getMobilePhoneNo() {
		return mobilePhoneNo;
	}

	/**
	 * Sets the mobilePhoneNo value for this Employee.
	 * 
	 * @param mobilePhoneNo
	 */
	public void setMobilePhoneNo(java.lang.String mobilePhoneNo) {
		this.mobilePhoneNo = mobilePhoneNo;
	}

	/**
	 * Gets the email value for this Employee.
	 * 
	 * @return email
	 */
	public java.lang.String getEmail() {
		return email;
	}

	/**
	 * Sets the email value for this Employee.
	 * 
	 * @param email
	 */
	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	/**
	 * Gets the altAddressCode value for this Employee.
	 * 
	 * @return altAddressCode
	 */
	public java.lang.String getAltAddressCode() {
		return altAddressCode;
	}

	/**
	 * Sets the altAddressCode value for this Employee.
	 * 
	 * @param altAddressCode
	 */
	public void setAltAddressCode(java.lang.String altAddressCode) {
		this.altAddressCode = altAddressCode;
	}

	/**
	 * Gets the altAddressStartDate value for this Employee.
	 * 
	 * @return altAddressStartDate
	 */
	public java.util.Calendar getAltAddressStartDate() {
		return altAddressStartDate;
	}

	/**
	 * Sets the altAddressStartDate value for this Employee.
	 * 
	 * @param altAddressStartDate
	 */
	public void setAltAddressStartDate(java.util.Calendar altAddressStartDate) {
		this.altAddressStartDate = altAddressStartDate;
	}

	/**
	 * Gets the altAddressEndDate value for this Employee.
	 * 
	 * @return altAddressEndDate
	 */
	public java.util.Calendar getAltAddressEndDate() {
		return altAddressEndDate;
	}

	/**
	 * Sets the altAddressEndDate value for this Employee.
	 * 
	 * @param altAddressEndDate
	 */
	public void setAltAddressEndDate(java.util.Calendar altAddressEndDate) {
		this.altAddressEndDate = altAddressEndDate;
	}

	/**
	 * Gets the picture value for this Employee.
	 * 
	 * @return picture
	 */
	public byte[] getPicture() {
		return picture;
	}

	/**
	 * Sets the picture value for this Employee.
	 * 
	 * @param picture
	 */
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	/**
	 * Gets the birthDate value for this Employee.
	 * 
	 * @return birthDate
	 */
	public java.util.Calendar getBirthDate() {
		return birthDate;
	}

	/**
	 * Sets the birthDate value for this Employee.
	 * 
	 * @param birthDate
	 */
	public void setBirthDate(java.util.Calendar birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * Gets the socialSecurityNo value for this Employee.
	 * 
	 * @return socialSecurityNo
	 */
	public java.lang.String getSocialSecurityNo() {
		return socialSecurityNo;
	}

	/**
	 * Sets the socialSecurityNo value for this Employee.
	 * 
	 * @param socialSecurityNo
	 */
	public void setSocialSecurityNo(java.lang.String socialSecurityNo) {
		this.socialSecurityNo = socialSecurityNo;
	}

	/**
	 * Gets the unionCode value for this Employee.
	 * 
	 * @return unionCode
	 */
	public java.lang.String getUnionCode() {
		return unionCode;
	}

	/**
	 * Sets the unionCode value for this Employee.
	 * 
	 * @param unionCode
	 */
	public void setUnionCode(java.lang.String unionCode) {
		this.unionCode = unionCode;
	}

	/**
	 * Gets the unionMembershipNo value for this Employee.
	 * 
	 * @return unionMembershipNo
	 */
	public java.lang.String getUnionMembershipNo() {
		return unionMembershipNo;
	}

	/**
	 * Sets the unionMembershipNo value for this Employee.
	 * 
	 * @param unionMembershipNo
	 */
	public void setUnionMembershipNo(java.lang.String unionMembershipNo) {
		this.unionMembershipNo = unionMembershipNo;
	}

	/**
	 * Gets the sex value for this Employee.
	 * 
	 * @return sex
	 */
	public int getSex() {
		return sex;
	}

	/**
	 * Sets the sex value for this Employee.
	 * 
	 * @param sex
	 */
	public void setSex(int sex) {
		this.sex = sex;
	}

	/**
	 * Gets the countryRegionCode value for this Employee.
	 * 
	 * @return countryRegionCode
	 */
	public java.lang.String getCountryRegionCode() {
		return countryRegionCode;
	}

	/**
	 * Sets the countryRegionCode value for this Employee.
	 * 
	 * @param countryRegionCode
	 */
	public void setCountryRegionCode(java.lang.String countryRegionCode) {
		this.countryRegionCode = countryRegionCode;
	}

	/**
	 * Gets the managerNo value for this Employee.
	 * 
	 * @return managerNo
	 */
	public java.lang.String getManagerNo() {
		return managerNo;
	}

	/**
	 * Sets the managerNo value for this Employee.
	 * 
	 * @param managerNo
	 */
	public void setManagerNo(java.lang.String managerNo) {
		this.managerNo = managerNo;
	}

	/**
	 * Gets the employmentContractCode value for this Employee.
	 * 
	 * @return employmentContractCode
	 */
	public java.lang.String getEmploymentContractCode() {
		return employmentContractCode;
	}

	/**
	 * Sets the employmentContractCode value for this Employee.
	 * 
	 * @param employmentContractCode
	 */
	public void setEmploymentContractCode(java.lang.String employmentContractCode) {
		this.employmentContractCode = employmentContractCode;
	}

	/**
	 * Gets the statisticsGroupCode value for this Employee.
	 * 
	 * @return statisticsGroupCode
	 */
	public java.lang.String getStatisticsGroupCode() {
		return statisticsGroupCode;
	}

	/**
	 * Sets the statisticsGroupCode value for this Employee.
	 * 
	 * @param statisticsGroupCode
	 */
	public void setStatisticsGroupCode(java.lang.String statisticsGroupCode) {
		this.statisticsGroupCode = statisticsGroupCode;
	}

	/**
	 * Gets the employmentDate value for this Employee.
	 * 
	 * @return employmentDate
	 */
	public java.util.Calendar getEmploymentDate() {
		return employmentDate;
	}

	/**
	 * Sets the employmentDate value for this Employee.
	 * 
	 * @param employmentDate
	 */
	public void setEmploymentDate(java.util.Calendar employmentDate) {
		this.employmentDate = employmentDate;
	}

	/**
	 * Gets the status value for this Employee.
	 * 
	 * @return status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * Sets the status value for this Employee.
	 * 
	 * @param status
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * Gets the inactiveDate value for this Employee.
	 * 
	 * @return inactiveDate
	 */
	public java.util.Calendar getInactiveDate() {
		return inactiveDate;
	}

	/**
	 * Sets the inactiveDate value for this Employee.
	 * 
	 * @param inactiveDate
	 */
	public void setInactiveDate(java.util.Calendar inactiveDate) {
		this.inactiveDate = inactiveDate;
	}

	/**
	 * Gets the causeOfInactivityCode value for this Employee.
	 * 
	 * @return causeOfInactivityCode
	 */
	public java.lang.String getCauseOfInactivityCode() {
		return causeOfInactivityCode;
	}

	/**
	 * Sets the causeOfInactivityCode value for this Employee.
	 * 
	 * @param causeOfInactivityCode
	 */
	public void setCauseOfInactivityCode(java.lang.String causeOfInactivityCode) {
		this.causeOfInactivityCode = causeOfInactivityCode;
	}

	/**
	 * Gets the terminationDate value for this Employee.
	 * 
	 * @return terminationDate
	 */
	public java.util.Calendar getTerminationDate() {
		return terminationDate;
	}

	/**
	 * Sets the terminationDate value for this Employee.
	 * 
	 * @param terminationDate
	 */
	public void setTerminationDate(java.util.Calendar terminationDate) {
		this.terminationDate = terminationDate;
	}

	/**
	 * Gets the groundsForTermCode value for this Employee.
	 * 
	 * @return groundsForTermCode
	 */
	public java.lang.String getGroundsForTermCode() {
		return groundsForTermCode;
	}

	/**
	 * Sets the groundsForTermCode value for this Employee.
	 * 
	 * @param groundsForTermCode
	 */
	public void setGroundsForTermCode(java.lang.String groundsForTermCode) {
		this.groundsForTermCode = groundsForTermCode;
	}

	/**
	 * Gets the globalDimension1Code value for this Employee.
	 * 
	 * @return globalDimension1Code
	 */
	public java.lang.String getGlobalDimension1Code() {
		return globalDimension1Code;
	}

	/**
	 * Sets the globalDimension1Code value for this Employee.
	 * 
	 * @param globalDimension1Code
	 */
	public void setGlobalDimension1Code(java.lang.String globalDimension1Code) {
		this.globalDimension1Code = globalDimension1Code;
	}

	/**
	 * Gets the globalDimension2Code value for this Employee.
	 * 
	 * @return globalDimension2Code
	 */
	public java.lang.String getGlobalDimension2Code() {
		return globalDimension2Code;
	}

	/**
	 * Sets the globalDimension2Code value for this Employee.
	 * 
	 * @param globalDimension2Code
	 */
	public void setGlobalDimension2Code(java.lang.String globalDimension2Code) {
		this.globalDimension2Code = globalDimension2Code;
	}

	/**
	 * Gets the resourceNo value for this Employee.
	 * 
	 * @return resourceNo
	 */
	public java.lang.String getResourceNo() {
		return resourceNo;
	}

	/**
	 * Sets the resourceNo value for this Employee.
	 * 
	 * @param resourceNo
	 */
	public void setResourceNo(java.lang.String resourceNo) {
		this.resourceNo = resourceNo;
	}

	/**
	 * Gets the lastDateModified value for this Employee.
	 * 
	 * @return lastDateModified
	 */
	public java.util.Calendar getLastDateModified() {
		return lastDateModified;
	}

	/**
	 * Sets the lastDateModified value for this Employee.
	 * 
	 * @param lastDateModified
	 */
	public void setLastDateModified(java.util.Calendar lastDateModified) {
		this.lastDateModified = lastDateModified;
	}

	/**
	 * Gets the extension value for this Employee.
	 * 
	 * @return extension
	 */
	public java.lang.String getExtension() {
		return extension;
	}

	/**
	 * Sets the extension value for this Employee.
	 * 
	 * @param extension
	 */
	public void setExtension(java.lang.String extension) {
		this.extension = extension;
	}

	/**
	 * Gets the pager value for this Employee.
	 * 
	 * @return pager
	 */
	public java.lang.String getPager() {
		return pager;
	}

	/**
	 * Sets the pager value for this Employee.
	 * 
	 * @param pager
	 */
	public void setPager(java.lang.String pager) {
		this.pager = pager;
	}

	/**
	 * Gets the faxNo value for this Employee.
	 * 
	 * @return faxNo
	 */
	public java.lang.String getFaxNo() {
		return faxNo;
	}

	/**
	 * Sets the faxNo value for this Employee.
	 * 
	 * @param faxNo
	 */
	public void setFaxNo(java.lang.String faxNo) {
		this.faxNo = faxNo;
	}

	/**
	 * Gets the companyEmail value for this Employee.
	 * 
	 * @return companyEmail
	 */
	public java.lang.String getCompanyEmail() {
		return companyEmail;
	}

	/**
	 * Sets the companyEmail value for this Employee.
	 * 
	 * @param companyEmail
	 */
	public void setCompanyEmail(java.lang.String companyEmail) {
		this.companyEmail = companyEmail;
	}

	/**
	 * Gets the title value for this Employee.
	 * 
	 * @return title
	 */
	public java.lang.String getTitle() {
		return title;
	}

	/**
	 * Sets the title value for this Employee.
	 * 
	 * @param title
	 */
	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	/**
	 * Gets the salesPersPurchCode value for this Employee.
	 * 
	 * @return salesPersPurchCode
	 */
	public java.lang.String getSalesPersPurchCode() {
		return salesPersPurchCode;
	}

	/**
	 * Sets the salesPersPurchCode value for this Employee.
	 * 
	 * @param salesPersPurchCode
	 */
	public void setSalesPersPurchCode(java.lang.String salesPersPurchCode) {
		this.salesPersPurchCode = salesPersPurchCode;
	}

	/**
	 * Gets the noSeries value for this Employee.
	 * 
	 * @return noSeries
	 */
	public java.lang.String getNoSeries() {
		return noSeries;
	}

	/**
	 * Sets the noSeries value for this Employee.
	 * 
	 * @param noSeries
	 */
	public void setNoSeries(java.lang.String noSeries) {
		this.noSeries = noSeries;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.timestamp == null && other.getTimestamp() == null)
						|| (this.timestamp != null && java.util.Arrays.equals(this.timestamp, other.getTimestamp())))
				&& ((this.no == null && other.getNo() == null) || (this.no != null && this.no.equals(other.getNo())))
				&& ((this.firstName == null && other.getFirstName() == null)
						|| (this.firstName != null && this.firstName.equals(other.getFirstName())))
				&& ((this.middleName == null && other.getMiddleName() == null)
						|| (this.middleName != null && this.middleName.equals(other.getMiddleName())))
				&& ((this.lastName == null && other.getLastName() == null)
						|| (this.lastName != null && this.lastName.equals(other.getLastName())))
				&& ((this.initials == null && other.getInitials() == null)
						|| (this.initials != null && this.initials.equals(other.getInitials())))
				&& ((this.jobTitle == null && other.getJobTitle() == null)
						|| (this.jobTitle != null && this.jobTitle.equals(other.getJobTitle())))
				&& ((this.searchName == null && other.getSearchName() == null)
						|| (this.searchName != null && this.searchName.equals(other.getSearchName())))
				&& ((this.address == null && other.getAddress() == null)
						|| (this.address != null && this.address.equals(other.getAddress())))
				&& ((this.address2 == null && other.getAddress2() == null)
						|| (this.address2 != null && this.address2.equals(other.getAddress2())))
				&& ((this.city == null && other.getCity() == null)
						|| (this.city != null && this.city.equals(other.getCity())))
				&& ((this.postCode == null && other.getPostCode() == null)
						|| (this.postCode != null && this.postCode.equals(other.getPostCode())))
				&& ((this.county == null && other.getCounty() == null)
						|| (this.county != null && this.county.equals(other.getCounty())))
				&& ((this.phoneNo == null && other.getPhoneNo() == null)
						|| (this.phoneNo != null && this.phoneNo.equals(other.getPhoneNo())))
				&& ((this.mobilePhoneNo == null && other.getMobilePhoneNo() == null)
						|| (this.mobilePhoneNo != null && this.mobilePhoneNo.equals(other.getMobilePhoneNo())))
				&& ((this.email == null && other.getEmail() == null)
						|| (this.email != null && this.email.equals(other.getEmail())))
				&& ((this.altAddressCode == null && other.getAltAddressCode() == null)
						|| (this.altAddressCode != null && this.altAddressCode.equals(other.getAltAddressCode())))
				&& ((this.altAddressStartDate == null && other.getAltAddressStartDate() == null)
						|| (this.altAddressStartDate != null
								&& this.altAddressStartDate.equals(other.getAltAddressStartDate())))
				&& ((this.altAddressEndDate == null && other.getAltAddressEndDate() == null)
						|| (this.altAddressEndDate != null
								&& this.altAddressEndDate.equals(other.getAltAddressEndDate())))
				&& ((this.picture == null && other.getPicture() == null)
						|| (this.picture != null && java.util.Arrays.equals(this.picture, other.getPicture())))
				&& ((this.birthDate == null && other.getBirthDate() == null)
						|| (this.birthDate != null && this.birthDate.equals(other.getBirthDate())))
				&& ((this.socialSecurityNo == null && other.getSocialSecurityNo() == null)
						|| (this.socialSecurityNo != null && this.socialSecurityNo.equals(other.getSocialSecurityNo())))
				&& ((this.unionCode == null && other.getUnionCode() == null)
						|| (this.unionCode != null && this.unionCode.equals(other.getUnionCode())))
				&& ((this.unionMembershipNo == null && other.getUnionMembershipNo() == null)
						|| (this.unionMembershipNo != null
								&& this.unionMembershipNo.equals(other.getUnionMembershipNo())))
				&& this.sex == other.getSex()
				&& ((this.countryRegionCode == null && other.getCountryRegionCode() == null)
						|| (this.countryRegionCode != null
								&& this.countryRegionCode.equals(other.getCountryRegionCode())))
				&& ((this.managerNo == null && other.getManagerNo() == null)
						|| (this.managerNo != null && this.managerNo.equals(other.getManagerNo())))
				&& ((this.employmentContractCode == null && other.getEmploymentContractCode() == null)
						|| (this.employmentContractCode != null
								&& this.employmentContractCode.equals(other.getEmploymentContractCode())))
				&& ((this.statisticsGroupCode == null && other.getStatisticsGroupCode() == null)
						|| (this.statisticsGroupCode != null
								&& this.statisticsGroupCode.equals(other.getStatisticsGroupCode())))
				&& ((this.employmentDate == null && other.getEmploymentDate() == null)
						|| (this.employmentDate != null && this.employmentDate.equals(other.getEmploymentDate())))
				&& this.status == other.getStatus()
				&& ((this.inactiveDate == null && other.getInactiveDate() == null)
						|| (this.inactiveDate != null && this.inactiveDate.equals(other.getInactiveDate())))
				&& ((this.causeOfInactivityCode == null && other.getCauseOfInactivityCode() == null)
						|| (this.causeOfInactivityCode != null
								&& this.causeOfInactivityCode.equals(other.getCauseOfInactivityCode())))
				&& ((this.terminationDate == null && other.getTerminationDate() == null)
						|| (this.terminationDate != null && this.terminationDate.equals(other.getTerminationDate())))
				&& ((this.groundsForTermCode == null && other.getGroundsForTermCode() == null)
						|| (this.groundsForTermCode != null
								&& this.groundsForTermCode.equals(other.getGroundsForTermCode())))
				&& ((this.globalDimension1Code == null && other.getGlobalDimension1Code() == null)
						|| (this.globalDimension1Code != null
								&& this.globalDimension1Code.equals(other.getGlobalDimension1Code())))
				&& ((this.globalDimension2Code == null && other.getGlobalDimension2Code() == null)
						|| (this.globalDimension2Code != null
								&& this.globalDimension2Code.equals(other.getGlobalDimension2Code())))
				&& ((this.resourceNo == null && other.getResourceNo() == null)
						|| (this.resourceNo != null && this.resourceNo.equals(other.getResourceNo())))
				&& ((this.lastDateModified == null && other.getLastDateModified() == null)
						|| (this.lastDateModified != null && this.lastDateModified.equals(other.getLastDateModified())))
				&& ((this.extension == null && other.getExtension() == null)
						|| (this.extension != null && this.extension.equals(other.getExtension())))
				&& ((this.pager == null && other.getPager() == null)
						|| (this.pager != null && this.pager.equals(other.getPager())))
				&& ((this.faxNo == null && other.getFaxNo() == null)
						|| (this.faxNo != null && this.faxNo.equals(other.getFaxNo())))
				&& ((this.companyEmail == null && other.getCompanyEmail() == null)
						|| (this.companyEmail != null && this.companyEmail.equals(other.getCompanyEmail())))
				&& ((this.title == null && other.getTitle() == null)
						|| (this.title != null && this.title.equals(other.getTitle())))
				&& ((this.salesPersPurchCode == null && other.getSalesPersPurchCode() == null)
						|| (this.salesPersPurchCode != null
								&& this.salesPersPurchCode.equals(other.getSalesPersPurchCode())))
				&& ((this.noSeries == null && other.getNoSeries() == null)
						|| (this.noSeries != null && this.noSeries.equals(other.getNoSeries())));
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
		if (getTimestamp() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getTimestamp()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getTimestamp(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getNo() != null) {
			_hashCode += getNo().hashCode();
		}
		if (getFirstName() != null) {
			_hashCode += getFirstName().hashCode();
		}
		if (getMiddleName() != null) {
			_hashCode += getMiddleName().hashCode();
		}
		if (getLastName() != null) {
			_hashCode += getLastName().hashCode();
		}
		if (getInitials() != null) {
			_hashCode += getInitials().hashCode();
		}
		if (getJobTitle() != null) {
			_hashCode += getJobTitle().hashCode();
		}
		if (getSearchName() != null) {
			_hashCode += getSearchName().hashCode();
		}
		if (getAddress() != null) {
			_hashCode += getAddress().hashCode();
		}
		if (getAddress2() != null) {
			_hashCode += getAddress2().hashCode();
		}
		if (getCity() != null) {
			_hashCode += getCity().hashCode();
		}
		if (getPostCode() != null) {
			_hashCode += getPostCode().hashCode();
		}
		if (getCounty() != null) {
			_hashCode += getCounty().hashCode();
		}
		if (getPhoneNo() != null) {
			_hashCode += getPhoneNo().hashCode();
		}
		if (getMobilePhoneNo() != null) {
			_hashCode += getMobilePhoneNo().hashCode();
		}
		if (getEmail() != null) {
			_hashCode += getEmail().hashCode();
		}
		if (getAltAddressCode() != null) {
			_hashCode += getAltAddressCode().hashCode();
		}
		if (getAltAddressStartDate() != null) {
			_hashCode += getAltAddressStartDate().hashCode();
		}
		if (getAltAddressEndDate() != null) {
			_hashCode += getAltAddressEndDate().hashCode();
		}
		if (getPicture() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getPicture()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getPicture(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getBirthDate() != null) {
			_hashCode += getBirthDate().hashCode();
		}
		if (getSocialSecurityNo() != null) {
			_hashCode += getSocialSecurityNo().hashCode();
		}
		if (getUnionCode() != null) {
			_hashCode += getUnionCode().hashCode();
		}
		if (getUnionMembershipNo() != null) {
			_hashCode += getUnionMembershipNo().hashCode();
		}
		_hashCode += getSex();
		if (getCountryRegionCode() != null) {
			_hashCode += getCountryRegionCode().hashCode();
		}
		if (getManagerNo() != null) {
			_hashCode += getManagerNo().hashCode();
		}
		if (getEmploymentContractCode() != null) {
			_hashCode += getEmploymentContractCode().hashCode();
		}
		if (getStatisticsGroupCode() != null) {
			_hashCode += getStatisticsGroupCode().hashCode();
		}
		if (getEmploymentDate() != null) {
			_hashCode += getEmploymentDate().hashCode();
		}
		_hashCode += getStatus();
		if (getInactiveDate() != null) {
			_hashCode += getInactiveDate().hashCode();
		}
		if (getCauseOfInactivityCode() != null) {
			_hashCode += getCauseOfInactivityCode().hashCode();
		}
		if (getTerminationDate() != null) {
			_hashCode += getTerminationDate().hashCode();
		}
		if (getGroundsForTermCode() != null) {
			_hashCode += getGroundsForTermCode().hashCode();
		}
		if (getGlobalDimension1Code() != null) {
			_hashCode += getGlobalDimension1Code().hashCode();
		}
		if (getGlobalDimension2Code() != null) {
			_hashCode += getGlobalDimension2Code().hashCode();
		}
		if (getResourceNo() != null) {
			_hashCode += getResourceNo().hashCode();
		}
		if (getLastDateModified() != null) {
			_hashCode += getLastDateModified().hashCode();
		}
		if (getExtension() != null) {
			_hashCode += getExtension().hashCode();
		}
		if (getPager() != null) {
			_hashCode += getPager().hashCode();
		}
		if (getFaxNo() != null) {
			_hashCode += getFaxNo().hashCode();
		}
		if (getCompanyEmail() != null) {
			_hashCode += getCompanyEmail().hashCode();
		}
		if (getTitle() != null) {
			_hashCode += getTitle().hashCode();
		}
		if (getSalesPersPurchCode() != null) {
			_hashCode += getSalesPersPurchCode().hashCode();
		}
		if (getNoSeries() != null) {
			_hashCode += getNoSeries().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Employee.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://cali.cronus/", "Employee"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("timestamp");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "Timestamp"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("no");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "No"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("firstName");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "FirstName"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("middleName");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "MiddleName"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lastName");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "LastName"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("initials");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "Initials"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("jobTitle");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "JobTitle"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("searchName");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "SearchName"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("address");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "Address"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("address2");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "Address2"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("city");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "City"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("postCode");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "PostCode"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("county");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "County"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("phoneNo");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "PhoneNo"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("mobilePhoneNo");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "MobilePhoneNo"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("email");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "Email"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("altAddressCode");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "AltAddressCode"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("altAddressStartDate");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "AltAddressStartDate"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("altAddressEndDate");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "AltAddressEndDate"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("picture");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "Picture"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("birthDate");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "BirthDate"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("socialSecurityNo");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "SocialSecurityNo"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("unionCode");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "UnionCode"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("unionMembershipNo");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "UnionMembershipNo"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sex");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "Sex"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("countryRegionCode");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "CountryRegionCode"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("managerNo");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "ManagerNo"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("employmentContractCode");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "EmploymentContractCode"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("statisticsGroupCode");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "StatisticsGroupCode"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("employmentDate");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "EmploymentDate"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("status");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "Status"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("inactiveDate");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "InactiveDate"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("causeOfInactivityCode");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "CauseOfInactivityCode"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("terminationDate");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "TerminationDate"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("groundsForTermCode");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "GroundsForTermCode"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("globalDimension1Code");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "GlobalDimension1Code"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("globalDimension2Code");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "GlobalDimension2Code"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("resourceNo");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "ResourceNo"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lastDateModified");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "LastDateModified"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("extension");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "Extension"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pager");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "Pager"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("faxNo");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "FaxNo"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("companyEmail");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "CompanyEmail"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("title");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "Title"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("salesPersPurchCode");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "SalesPersPurchCode"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("noSeries");
		elemField.setXmlName(new javax.xml.namespace.QName("http://cali.cronus/", "NoSeries"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
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
