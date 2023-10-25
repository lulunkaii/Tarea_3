import javax.swing.*;
import java.awt.*;

public class InterfazExpendedor extends JFrame {
    JPanel panel;
    public InterfazExpendedor() {
        this.setSize(1400,800);
        setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Ejemplo");
        this.setVisible(true);
        IniciarComponentes();
    }
    private void IniciarComponentes(){
        ColocarPaneles();
        PonerEtiquetas();
        colocarBotones();
    }
    private void ColocarPaneles(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        panel.setBackground(Color.WHITE);
    }
    private void PonerEtiquetas(){
        //Etiqueta imagen
        ImageIcon imagen = new ImageIcon("Expendedor.png");
        JLabel etiqueta = new JLabel(new ImageIcon(imagen.getImage().getScaledInstance(350,350,Image.SCALE_SMOOTH)));
        etiqueta.setBounds(5, 15,350,350);
        panel.add(etiqueta);
    }
    private void colocarBotones() {
        JButton boton1 = new JButton("Coca");
        boton1.setBounds(233, 50, 70, 20);
        boton1.setFont(new Font("arial",Font.PLAIN,10));
        panel.add(boton1);

        JButton boton2 = new JButton("Fanta");
        boton2.setBounds(233, 80, 70, 20);
        boton2.setFont(new Font("arial",Font.PLAIN,10));
        panel.add(boton2);

        JButton boton3 = new JButton("Sprite");
        boton3.setBounds(233, 110, 70, 20);
        boton3.setFont(new Font("arial",Font.PLAIN,10));
        panel.add(boton3);

        JButton boton4 = new JButton("Snickers");
        boton4.setBounds(233, 140, 70, 20);
        boton4.setFont(new Font("arial",Font.PLAIN,9));
        panel.add(boton4);

        JButton boton5 = new JButton("Super8");
        boton5.setBounds(233, 170, 70, 20);
        boton5.setFont(new Font("arial",Font.PLAIN,10));
        panel.add(boton5);


    }
}
