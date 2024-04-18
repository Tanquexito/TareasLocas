package mx.utng.s24.dp.factory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.omg.PortableInterceptor.SUCCESSFUL;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//declarar un jframe. lo qe es un cudaro de dialogo o ventana en java

public class Cliente extends JFrame{
    //declarar dos cajas de texto
    private JTextField txtUser;
    private JPasswordField txtPassword;

//crando los elementos de inicio de la ventana
    public Cliente() {
        //llama al constructor y coloca titulo
        super("Login");
        //pongo una operacion de cierre en el bton x
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //coloco las dimensiones de ancho y alto
        setSize(300, 150);

        //defino contenedor de elementos visuales
        JPanel panel=new JPanel();
        //al panel le doy un diseño
        panel.setLayout(new GridLayout(3,2));
        //etqueta para el ususario
        JLabel lblUsuario=new JLabel("Usuario");
        JLabel lblPassword=new JLabel("Contraseña ");
        //creamos caja texto
        txtUser=new JTextField();
        txtPassword= new JPasswordField();

        

        //crear boton
        JButton btnLogin=new JButton("Login");
        btnLogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String usuario=txtUser.getText();
                char[] caraPassword = txtPassword.getPassword();
                String password =new String(caraPassword);
                if (validarLogin(usuario, password)){
                    JOptionPane.showMessageDialog(Cliente.this, "Login correcto","Validacion",JOptionPane.INFORMATION_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(Cliente.this, "Intento Incorrecto!","VAlidacion",JOptionPane.ERROR_MESSAGE);

                }
                JOptionPane.showMessageDialog(btnLogin, e, password, ABORT);

            }
            

        });
        //añadimos los elementos visuales al contenedor
        panel.add(lblUsuario);
        panel.add(txtUser);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(btnLogin);
        //agregar a la ventana el panel
        add(panel);
        //hacemos visible a la ventana
        setVisible(true);
        //centramos a la ventana
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new Cliente();
    }

    private boolean validarLogin(String usuario,String password){
        return usuario.equals("sama") && password.equals("loco");
    }


    
    
}
