import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        JLabel temp = new JLabel("Esperando");
        temp.setBounds(400, 15,350,350);
        panel.add(temp);

        JButton botonCoca = new JButton("Coca");
        botonCoca.setBounds(233, 50, 70, 20);
        botonCoca.setFont(new Font("arial",Font.PLAIN,10));
        panel.add(botonCoca);
        ActionListener listenerCoca = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temp.setText("Coca");
            }
        };
        botonCoca.addActionListener(listenerCoca);

        JButton botonFanta = new JButton("Fanta");
        botonFanta.setBounds(233, 80, 70, 20);
        botonFanta.setFont(new Font("arial",Font.PLAIN,10));
        panel.add(botonFanta);
        ActionListener listenerFanta = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temp.setText("Fanta");
            }
        };
        botonFanta.addActionListener(listenerFanta);

        JButton botonSprite = new JButton("Sprite");
        botonSprite.setBounds(233, 110, 70, 20);
        botonSprite.setFont(new Font("arial",Font.PLAIN,10));
        panel.add(botonSprite);
        ActionListener listenerSprite = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temp.setText("Sprite");
            }
        };
        botonSprite.addActionListener(listenerSprite);

        JButton botonSnickers = new JButton("Snickers");
        botonSnickers.setBounds(233, 140, 70, 20);
        botonSnickers.setFont(new Font("arial",Font.PLAIN,9));
        panel.add(botonSnickers);
        ActionListener listenerSnickers = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temp.setText("Snickers");
            }
        };
        botonSnickers.addActionListener(listenerSnickers);

        JButton botonSuper8 = new JButton("Super8");
        botonSuper8.setBounds(233, 170, 70, 20);
        botonSuper8.setFont(new Font("arial",Font.PLAIN,10));
        panel.add(botonSuper8);
        ActionListener listenerSuper8 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temp.setText("Super8");
            }
        };
        botonSuper8.addActionListener(listenerSuper8);
    }
}
