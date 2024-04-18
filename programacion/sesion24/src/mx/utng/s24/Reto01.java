package mx.utng.s24;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.omg.PortableInterceptor.SUCCESSFUL;

import mx.utng.s24.dp.factory.Cliente;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


    



//declarar un jframe. lo qe es un cudaro de dialogo o ventana en java

public class Reto01 extends JFrame{
    //declarar dos cajas de texto
    private JTextField num1;
    private JTextField num2;

//crando los elementos de inicio de la ventana
    public Reto01() {
        //llama al constructor y coloca titulo
        super("Suma");
        //pongo una operacion de cierre en el bton x
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //coloco las dimensiones de ancho y alto
        setSize(300, 150);

        //defino contenedor de elementos visuales
        JPanel panel=new JPanel();
        //al panel le doy un diseño
        panel.setLayout(new GridLayout(3,2));
        //etqueta para el ususario
        JLabel lblnum1=new JLabel("Numeero 1");
        JLabel lblnum2=new JLabel("Numero 2 ");
        //creamos caja texto
        num1=new JTextField();
        num2= new JTextField();

        

        //crear boton
        JButton btnLogin=new JButton("Sumar");
        btnLogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Float  n1=Float.parseFloat(num1.getText());
                Float n2 =Float.parseFloat (num2.getText());
                //String password =new String(caraPassword);
                suma(n1, n2);
                JOptionPane.showInputDialog(suma(n1, n2));
            }
            

             });
        //añadimos los elementos visuales al contenedor
        panel.add(lblnum1);
        panel.add(num1);
        panel.add(lblnum2);
        panel.add(num2);
        panel.add(btnLogin);
        //agregar a la ventana el panel
        add(panel);
        //hacemos visible a la ventana
        setVisible(true);
        //centramos a la ventana
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new Reto01();
    }

    private Float suma(Float n1,Float n2){
        return  n1+n2;
    }
}

