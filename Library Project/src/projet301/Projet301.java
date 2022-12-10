package projet301;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

public class Projet301 {

    public static void main(String[] args) {
        try {
            // UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        new LoginForm().setVisible(true);
    }

}
