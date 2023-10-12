package Operaciones;

import Imagen.MiImagen;
import Pojo.Cliente;
import Titulos.Estados;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class NuevoCliente extends Canvas implements ChangeListener, ItemListener {
    private static ArrayList<Cliente> datos=new ArrayList<>();
    private JFrame jFrame;
    private JButton regresar, guardar;
    private JLabel  vacio3,vacio2,vacio1,vacio,nuevoCliente,datoPersonal,nombre,apellidoP,apellidoM,estado,ciudad,datoContacto,tieneTelefono,telefono,tieneCorreo,correo,datoUbicacion,colonia,codigoPostal;
    private JTextField text1,text2,text3,text4,text5,text6,text7,text8,text9;
    private JRadioButton si1,si2,no1,no2;
    private ButtonGroup grupo1,grupo2;
    private JPanel panelRadio1,panelRadio,panelContainer,panelButton,paneltext,panellabel,panelLabel1,paneltext1,panelLabel2,paneltext2,panelContent,panelImagen,panelDato,panelDato1,panelLabel3,paneltext3,panelVacio;
    private static final ArrayList<String> listaEstados = Estados.estado_mexico();
    private static final ArrayList<String> listaCiuidad = Estados.ciudad_estado();
    private JComboBox<String> ciudad1;
    private JComboBox<String> estado1;
    public NuevoCliente(){
        init();
        setupFrame();
        llenarCombo();

        si1.addChangeListener( this);
        no1.addChangeListener( this);
        si2.addChangeListener(this);
        no2.addChangeListener(this);

    }

    public void init(){
        jFrame=new JFrame();
        regresar=new JButton("Regresar");
        guardar=new JButton("Guardar");
        regresar.addActionListener(e -> {
            this.setVisible(false);
            new MiImagen().setVisible(true);
        });

        nuevoCliente=new JLabel("REGISTRO DE NUEVO CLIENTE");
        datoPersonal=new JLabel("DATOS PERSONALES");
        nombre=new JLabel("Nombre del cliente: ");
        apellidoP=new JLabel("Apellido paterno");
        apellidoM=new JLabel("Apellido materno");
        estado=new JLabel("Estado");
        ciudad=new JLabel("Ciudad");
        datoContacto=new JLabel("DATOS DE CONTACTO");
        tieneTelefono=new JLabel("¿Tiene telefono?");
        telefono=new JLabel("Telefono");
        tieneCorreo=new JLabel("¿Tienes correo");
        correo=new JLabel("Correo");
        datoUbicacion=new JLabel("DATOS DE UBICACION");
        colonia=new JLabel("Colonia");
        codigoPostal=new JLabel("Codigo postal");
        text1=new JTextField();
        text2=new JTextField();
        text3=new JTextField();
        text4=new JTextField();
        text5=new JTextField();
        text6=new JTextField();
        text7=new JTextField();
        text8=new JTextField();
        text9=new JTextField();
        panelContent=new JPanel();
        panelButton=new JPanel();
        panelContainer=new JPanel();
        panellabel=new JPanel();
        panelImagen=new JPanel();
        paneltext=new JPanel();
        panelDato=new JPanel();
        panelLabel1=new JPanel();
        paneltext1=new JPanel();
        panelDato1=new JPanel();
        vacio=new JLabel(" ");
        vacio1=new JLabel(" ");
        si1=new JRadioButton("Si");
        no1=new JRadioButton("No");
        si2=new JRadioButton("Si");
        no2=new JRadioButton("No");
        grupo1=new ButtonGroup();
        grupo2=new ButtonGroup();
        panelRadio=new JPanel();
        panelRadio1=new JPanel();
        vacio2=new JLabel();
        estado1=new JComboBox<>();
        ciudad1=new JComboBox<>();
        panelLabel2=new JPanel();
        paneltext2=new JPanel();
        estado1.addItemListener(this);
        ciudad1.addItemListener(this);
        vacio3=new JLabel();
        panelLabel3=new JPanel();
        paneltext3=new JPanel();
        panelVacio=new JPanel();
    }
    public void initbutton(){
        guardar.addActionListener(new EventClick());
    }

    private void setupFrame() {
        jFrame.setTitle("Registro cliente");
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(true);
        jFrame.setSize(900, 700);

        panelButton.setLayout(new FlowLayout());
        panelButton.setPreferredSize(new Dimension(250, 100));
        panelButton.add(guardar);
        panelButton.add(regresar);

        panellabel.setLayout(new GridLayout(4,1));
        panellabel.add(datoPersonal);
        panellabel.add(nombre);
        panellabel.add(apellidoP);
        panellabel.add(apellidoM);

        paneltext.setLayout(new GridLayout(4,1));
        paneltext.add(vacio);
        paneltext.add(text1);
        paneltext.add(text2);
        paneltext.add(text3);

        panelLabel1.setLayout(new GridLayout(5,1));
        panelLabel1.add(datoContacto);
        panelLabel1.add(tieneTelefono);
        panelLabel1.add(telefono);
        panelLabel1.add(tieneCorreo);
        panelLabel1.add(correo);

        panelRadio.setLayout(new FlowLayout());
        panelRadio.setPreferredSize(new Dimension(250, 5));
        grupo1.add(si1);
        grupo1.add(no1);
        panelRadio.add(si1);
        panelRadio.add(no1);

        panelRadio1.setLayout(new FlowLayout());
        panelRadio1.setPreferredSize(new Dimension(250, 5));
        grupo2.add(si2);
        grupo2.add(no2);
        panelRadio1.add(si2);
        panelRadio1.add(no2);

        paneltext1.setLayout(new GridLayout(5,1));
        paneltext1.add(vacio1);
        paneltext1.add(panelRadio);
        paneltext1.add(text4);
        paneltext1.add(panelRadio1);
        paneltext1.add(text5);

        panelLabel2.setLayout(new GridLayout(2,0));
        panelLabel2.add(estado);
        panelLabel2.add(ciudad);

        paneltext2.setLayout(new GridLayout(2,0));
        paneltext2.add(estado1);
        paneltext2.add(ciudad1);

        panelLabel3.setLayout(new GridLayout(2,0));
        panelLabel3.add(colonia);
        panelLabel3.add(codigoPostal);

        paneltext3.setLayout(new GridLayout(2,0));
        paneltext3.add(text6);
        paneltext3.add(text7);

        panelDato1.setLayout(new GridLayout(1,4));
        panelDato1.add(panelLabel2);
        panelDato1.add(paneltext2);
        panelDato1.add(panelLabel3);
        panelDato1.add(paneltext3);

        panelVacio.setLayout(new GridLayout(2,0));
        panelVacio.add(vacio3);
        panelVacio.add(vacio2);

        panelDato.setLayout(new GridLayout(1,4));
        panelDato.setPreferredSize(new Dimension(600,170));
        panelDato.add(panellabel);
        panelDato.add(paneltext);
        panelDato.add(panelLabel1);
        panelDato.add(paneltext1);


        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("C:\\Users\\livia\\Documents\\Paradigmas\\comedor.jpg");
        JLabel imageLabel = new JLabel(new ImageIcon(image));
        panelImagen.add(imageLabel);
        panelImagen.setPreferredSize(new Dimension(50,230));

        panelContent.setLayout(new BoxLayout(panelContent,BoxLayout.Y_AXIS));
        panelContent.add(nuevoCliente,BorderLayout.CENTER);
        panelContent.add(panelImagen,BorderLayout.NORTH);
        panelContent.add(panelDato);
        panelContent.add(panelVacio);
        panelContent.add(datoUbicacion,BorderLayout.CENTER);
        panelContent.add(panelDato1);
        panelContent.add(panelButton);

        jFrame.add(panelContent);
        jFrame.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    public void stateChanged(ChangeEvent e) {

        if (no1.isSelected()) {
            text4.setEditable(false);
        }
        if (si1.isSelected()) {
            text4.setEnabled(true);
        }
        if (no2.isSelected()){
            text5.setEditable(false);
        }
        if (si2.isSelected()) {
            text5.setEditable(true);
        }
    }
    private void llenarCombo() {
        for (String s : listaEstados) {
            estado1.addItem(s);
        }
        for (String semestreItem : listaCiuidad) {
            ciudad1.addItem(semestreItem);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource()==estado1){
            String item = (String) estado1.getSelectedItem();
            text8.setText(item);
        }
        if (e.getSource()==ciudad1){
            String item = (String) ciudad1.getSelectedItem();
            text9.setText(item);
        }
    }
    public class EventClick implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton boton= (JButton) e.getSource();
            String opcion=boton.getText();

            if (opcion.equals("Guardar")){
                String nombre=text1.getText();
                String apellidoP=text2.getText();
                String apellidoM=text3.getText();
                String estado=text8.getText();
                String ciudad=text9.getText();
                String telefono=text6.getText();
                String correo=text7.getText();
                String colonia=text5.getText();
                String codigoPostal=text4.getText();

                datos.add(new Cliente(nombre,apellidoP,  apellidoM, estado,  ciudad,  telefono,  correo,  colonia, codigoPostal));

                text1.setText(" ");
                text2.setText(" ");
                text3.setText(" ");
                text4.setText(" ");
                text5.setText(" ");
                text6.setText(" ");
                text7.setText(" ");
                text8.setText(" ");
                text9.setText(" ");
            }
        }
    }
}


