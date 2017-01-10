package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="DescriptorType")
public class DescriptorType {
	@Id @GeneratedValue
	private Long id;
	@Column (length=50)
	private String descriptorTypeCode;
	@Column(length=50)
	private String descriptorTypeName;
	@Column(length=50)
	private String descriptorTypeUnit;
	@Column(length=50)
	private String descriptorTypeDesc;
	@Column(length=50)
	private String descriptorTypeLength;
	
	
	
	public DescriptorType(String descriptorTypeCode, String descriptorTypeName, String descriptorTypeUnit,
			String descriptorTypeDesc, String descriptorTypeLength) {
		super();
		this.descriptorTypeCode = descriptorTypeCode;
		this.descriptorTypeName = descriptorTypeName;
		this.descriptorTypeUnit = descriptorTypeUnit;
		this.descriptorTypeDesc = descriptorTypeDesc;
		this.descriptorTypeLength = descriptorTypeLength;
	}
	public DescriptorType() {
		this("","","","","");
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDescriptorTypeCode() {
		return descriptorTypeCode;
	}
	public void setDescriptorTypeCode(String descriptorTypeCode) {
		this.descriptorTypeCode = descriptorTypeCode;
	}
	public String getDescriptorTypeName() {
		return descriptorTypeName;
	}
	public void setDescriptorTypeName(String descriptorTypeName) {
		this.descriptorTypeName = descriptorTypeName;
	}
	public String getDescriptorTypeUnit() {
		return descriptorTypeUnit;
	}
	public void setDescriptorTypeUnit(String descriptorTypeUnit) {
		this.descriptorTypeUnit = descriptorTypeUnit;
	}
	public String getDescriptorTypeDesc() {
		return descriptorTypeDesc;
	}
	public void setDescriptorTypeDesc(String descriptorTypeDesc) {
		this.descriptorTypeDesc = descriptorTypeDesc;
	}
	public String getDescriptorTypeLength() {
		return descriptorTypeLength;
	}
	public void setDescriptorTypeLength(String descriptorTypeLength) {
		this.descriptorTypeLength = descriptorTypeLength;
	}
	@Override
	public String toString() {
		return "DescriptorType [id=" + id + ", descriptorTypeCode=" + descriptorTypeCode + ", descriptorTypeName="
				+ descriptorTypeName + ", descriptorTypeUnit=" + descriptorTypeUnit + ", descriptorTypeDesc="
				+ descriptorTypeDesc + ", descriptorTypeLength=" + descriptorTypeLength + "]";
	}
	
	
	
}
