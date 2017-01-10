package mx.utng.practice.controller;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.DescriptorType;
import mx.utng.practice.repository.DescriptorTypeRepository;


@Named
@ViewScoped
public class DescriptorTypeController {

	
	@Autowired
	private DescriptorTypeRepository descriptorTypeRepository;
	private DescriptorType descriptorType=new DescriptorType();
	private List<DescriptorType>descriptorTypes;
	private boolean editMode=false;
	
	@PostConstruct
	public void init(){
		setDescriptorTypes(descriptorTypeRepository.findAll());
	}
	public void save(){
		descriptorTypeRepository.save(descriptorType);
		if(!editMode){
			getDescriptorTypes().add(descriptorType);
		}
		descriptorType = new DescriptorType();
		setEditMode(false);
	}
	
	public void delete(DescriptorType descriptorType){
		descriptorTypeRepository.delete(descriptorType);
		descriptorTypes.remove(descriptorType);
	}
	public void update(DescriptorType  descriptorType){
		
		setDescriptorType(descriptorType);
		setEditMode(true);
	}
	public void cancel(){
		descriptorType =new DescriptorType();
		setEditMode(false);
	}
	public DescriptorType getDescriptorType() {
		return descriptorType;
	}
	public void setDescriptorType(DescriptorType descriptorType) {
		this.descriptorType = descriptorType;
	}
	public List<DescriptorType> getDescriptorTypes() {
		return descriptorTypes;
	}
	public void setDescriptorTypes(List<DescriptorType> descriptorTypes) {
		this.descriptorTypes = descriptorTypes;
	}
	public boolean isEditMode() {
		return editMode;
	}
	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	
}