
import gui.Formulaire;
import gui.Login;
import gui.Root;

import javax.swing.*;


public class Test {

    public static void main(String[] args){
        Root root = new Root();
        root.add(new Login());
        root.setVisible(true);
    }

}

