package mx.utng.practice.controller;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Fruit;
import mx.utng.practice.repository.FruitRepository;


@Named
@ViewScoped
public class FruitController {

	
	@Autowired
	private FruitRepository fruitRepository;
	private Fruit fruit=new Fruit();
	private List<Fruit>fruits;
	private boolean editMode=false;
	
	@PostConstruct
	public void init(){
		setFruits(fruitRepository.findAll());
	}
	public void save(){
		fruitRepository.save(fruit);
		if(!editMode){
			getFruits().add(fruit);
		}
		fruit=new Fruit();
		setEditMode(false);
	}
	
	public void delete(Fruit fruit){
		fruitRepository.delete(fruit);
		fruits.remove(fruit);
	}
	public void update(Fruit  fruit){
		
		setFruit(fruit);
		setEditMode(true);
	}
	public void cancel(){
		fruit =new Fruit();
		setEditMode(false);
	}
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	public List<Fruit> getFruits() {
		return fruits;
	}
	public void setFruits(List<Fruit> fruits) {
		this.fruits = fruits;
	}
	public boolean isEditMode() {
		return editMode;
	}
	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	
}