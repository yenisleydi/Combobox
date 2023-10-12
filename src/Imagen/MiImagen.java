package Imagen;
import Operaciones.NuevoAdeudo;
import Operaciones.NuevoCliente;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class MiImagen extends Canvas{
    private JFrame jFrame;
    private JButton registrarCliente, registrarAdeudo, consultar;
    private JPanel panelButton, panelContainer, panelContent;

    public MiImagen() {
        initButton();
        initPanels();
        setupFrame();
    }

    public void initButton() {
        registrarCliente = new JButton("Registrar nuevo cliente");
        registrarAdeudo = new JButton("Registrar nuevo adeudo");
        consultar = new JButton("Consultar adeudos");
        registrarCliente.addActionListener(e -> {
            this.setVisible(false);
            new NuevoCliente().setVisible(true);
        });
        registrarAdeudo.addActionListener(e -> {
            this.setVisible(false);
            new NuevoAdeudo().setVisible(true);
        });
    }
    public void initPanels() {
        panelButton = new JPanel();
        panelContainer = new JPanel();
        panelContent = new JPanel();
        jFrame = new JFrame();
    }

    private void setupFrame() {
        jFrame.setTitle("Porton azul");
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(true);
        jFrame.setSize(600, 400);

        panelButton.setLayout(new FlowLayout());
        panelButton.setPreferredSize(new Dimension(250, 400));
        panelButton.add(registrarCliente);
        panelButton.add(registrarAdeudo);
        panelButton.add(consultar);

        panelContainer.setLayout(new BorderLayout());

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("C:\\Users\\livia\\Documents\\Paradigmas\\comedor.jpg");
        JLabel imageLabel = new JLabel(new ImageIcon(image));

        panelContent.setLayout(new BorderLayout());
        panelContent.add(imageLabel, BorderLayout.CENTER);
        panelContent.add(panelButton, BorderLayout.SOUTH);

        panelContainer.add(panelContent, BorderLayout.CENTER);

        jFrame.getContentPane().add(panelContainer);

        jFrame.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

}
