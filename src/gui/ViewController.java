package gui;


import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import model.entity.Person;


public class ViewController  implements Initializable{
	
	@FXML
	private ComboBox<Person> comboPerson;
	
	@FXML
	private Button btAll;
	
	@FXML
	private void onBtAll() {
		for (Person person : comboPerson.getItems()) {
			System.out.println(person);
		}
	}
	
	private ObservableList<Person> obsList;
	@FXML
	private void onComboAction() {
		Person person = comboPerson.getSelectionModel().getSelectedItem();
		System.out.println(person);
		
	}
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	List<Person> list = new ArrayList<Person>();
	list.add(new Person(1, "maria", "maria@gmail.com"));
	list.add(new Person(2, "alex", "alex@gmail.com"));
	list.add(new Person(3, "bob", "bob@gmail.com"));
	
	obsList = FXCollections.observableArrayList(list);
	comboPerson.setItems(obsList);
	
		
	}
	
	

}
