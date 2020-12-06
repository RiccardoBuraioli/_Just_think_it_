package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import bean.Shop_Home_Boundary;
import dao.ShopRepository;
import entity.ShopUser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;

public abstract class Registration_Shop_Manager_Controller implements Initializable {

	private ShopUser shop;
	private ShopRepository crep;
	private Shop_Home_Boundary  shop_b;

	public Registration_Shop_Manager_Controller() {
		shop_b = new Shop_Home_Boundary ();
	}

	public void backButtonNegPressed(Window window) {

		try {
			Parent root = FXMLLoader.load(getClass().getResource("/boundary/RegistrazioneMenu.fxml"));
			Stage signUp = (Stage) window.getScene().getWindow();
			Scene scene = new Scene(root, 600, 400);
			signUp.setScene(scene);
			signUp.show();
			signUp.setResizable(false);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public int registraNegozioPressed(Window window, int tipo, String nome, String pass, String via, String tel,String mail, String città) {

		shop = new ShopUser(nome, pass, via, tipo, tel, mail, città);
		crep = new ShopRepository();
		int id = crep.insertShop(shop);
		shop.setId(id);

		// Manda alla home Shop
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/boundary/ShopHomePage.fxml"));
			Parent root = loader.load();
			shop_b= loader.getController();

			Stage home = (Stage) window.getScene().getWindow();
			home.setScene(new Scene(root, 800, 600));

			home.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return 0;
	}

}