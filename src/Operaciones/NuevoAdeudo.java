package Operaciones;

import javax.swing.*;
import java.awt.*;

public class NuevoAdeudo extends JFrame {
    private JPanel panel1;

    public NuevoAdeudo(){
        setupFrame();
    }
    public void setupFrame(){
        setTitle("NEVO ADEUDO");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setSize(900, 700);
        add(panel1);
    }

}
