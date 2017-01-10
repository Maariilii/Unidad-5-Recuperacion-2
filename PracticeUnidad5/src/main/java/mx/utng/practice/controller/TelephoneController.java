package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import mx.utng.practice.model.Telephone;
import mx.utng.practice.repository.TelephoneRepository;


@Named
@ViewScoped
public class TelephoneController {

	
	@Autowired
	private TelephoneRepository telephoneRepository;
	private Telephone telephone=new Telephone();
	private List<Telephone>telephones;
	private boolean editMode=false;
	
	@PostConstruct
	public void init(){
		setNotes(telephoneRepository.findAll());
	}
	public void save(){
		telephoneRepository.save(telephone);
		if(!editMode){
			getTelephones().add(telephone);
		}
		telephone=new Telephone();
		setEditMode(false);
	}
	
	public void delete(Telephone telephone){
		telephoneRepository.delete(telephone);
		telephones.remove(telephone);
	}
	public void update(Telephone telephone){
		setTelephone(telephone);
		setEditMode(true);
	}
	public void cancel(){
		telephone =new Telephone();
		setEditMode(false);
	}
	public Telephone getTelephone() {
		return telephone;
	}
	public void setTelephone(Telephone telephone) {
		this.telephone = telephone;
	}
	public List<Telephone> getTelephones() {
		return telephones;
	}
	public void setNotes(List<Telephone> telephones) {
		this.telephones = telephones;
	}
	public boolean isEditMode() {
		return editMode;
	}
	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
}
