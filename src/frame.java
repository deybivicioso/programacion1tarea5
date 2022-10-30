import javax.print.attribute.PrintRequestAttribute;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.geom.*;

public class frame extends JFrame {
    panel diseño = new panel();

    public frame() {
        setVisible(true);
        setTitle("cambiar tamaño controles");
        setSize(790, 565);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(diseño);
    }

    class panel extends JPanel {
        public panel() {
            setLayout(null);
            CuadoTexto();
            Botones1();
            lamina1();
            lamina2();
            cuadroTexto();
            lamina3();
            botones3();
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            // texto archivos
            Graphics2D g2 = (Graphics2D) g;
            g2.drawString("archivos", 15, 25);
            // texto propiedades, tamaño
            g2.drawString("propiedades", 20, 55);
            g2.drawString("tamaño", 325, 55);
            g2.drawString("tamaño y posiciones", 18, 285);
            g2.drawString("left=3088 TOP=442", 350, 285);
        }

        public void CuadoTexto() {
            JTextField cuadro1 = new JTextField("", 20);
            cuadro1.setBounds(65, 11, 495, 20);
            add(cuadro1);
        }

        public void Botones1() {
            JButton examinar = new JButton("Examinar");
            examinar.setBounds(564, 11, 88, 20);
            add(examinar);
        }

        public void lamina1() {
            // campo nombre...
            JLabel nombre = new JLabel("nombre Compl.");
            nombre.setBounds(10, 7, 95, 35);
            JTextField nombre2 = new JTextField("");
            nombre2.setBounds(99, 13, 165, 20);
            // campo directorio
            JLabel directorio = new JLabel("Directorio");
            directorio.setBounds(10, 40, 60, 20);
            JTextField directorio2 = new JTextField();
            directorio2.setBounds(99, 40, 165, 20);
            // campo nombre..
            JLabel name = new JLabel("nombre");
            name.setBounds(10, 65, 95, 35);
            JTextField name2 = new JTextField("");
            name2.setBounds(99, 70, 165, 20);
            // checkbox solo lectura...
            JCheckBox check = new JCheckBox("solo lectura");
            check.setBounds(99, 100, 100, 20);
            // campo extension...
            JLabel extension = new JLabel("Extension");
            extension.setBounds(285, 7, 95, 35);
            JTextField extension2 = new JTextField();
            extension2.setBounds(350, 13, 165, 20);
            // Campo fecha cre.
            JLabel fechaCre = new JLabel("fecha cre.");
            fechaCre.setBounds(285, 30, 65, 35);
            JTextField fechacre2 = new JTextField();
            fechacre2.setBounds(350, 40, 165, 20);
            // campo fecha mod...
            JLabel fechaMod = new JLabel("fecha mod");
            fechaMod.setBounds(285, 65, 65, 35);
            JTextField fechaMod2 = new JTextField();
            fechaMod2.setBounds(350, 70, 165, 20);
            // botones radio..
            JRadioButton horaLocal = new JRadioButton("hora local", true);
            horaLocal.setBounds(350, 100, 90, 20);
            JRadioButton horaUTC = new JRadioButton("Hora UTC", false);
            horaUTC.setBounds(350, 125, 80, 20);
            ButtonGroup grupo = new ButtonGroup();
            grupo.add(horaLocal);
            grupo.add(horaUTC);
            // layout..
            JPanel lamina1 = new JPanel();
            lamina1.setLayout(null);
            lamina1.setBounds(10, 58, 550, 200);
            lamina1.setBorder(BorderFactory.createEtchedBorder());
            lamina1.add(nombre);
            lamina1.add(nombre2);
            lamina1.add(directorio);
            lamina1.add(directorio2);
            lamina1.add(name);
            lamina1.add(name2);
            lamina1.add(check);
            lamina1.add(extension);
            lamina1.add(extension2);
            lamina1.add(fechaCre);
            lamina1.add(fechacre2);
            lamina1.add(fechaMod);
            lamina1.add(fechaMod2);
            lamina1.add(horaLocal);
            lamina1.add(horaUTC);
            add(lamina1);
        }

        public void lamina2() {
            // panel de tamaño...
            JLabel tamaño = new JLabel("tamaño:");
            tamaño.setBounds(10, 25, 55, 20);
            JTextArea tamaño2 = new JTextArea(
                    "Width=1018Height=687\n{01:34-30}\nWidth=1018 Height=687 \n{01:34-30}\n\n\n\n");
            JScrollPane tamaño3 = new JScrollPane(tamaño2);
            tamaño3.setBounds(100, 20, 188, 88);
            // panel de fuente......
            JLabel fuente = new JLabel("Fuente: ");
            fuente.setBounds(300, 25, 55, 20);
            JTextArea fuente2 = new JTextArea(
                    "Fuente Size= 11.7\nName= Segoe UI\n(10:34:30)\nFuente Size= 11.7\n\n\n\n");
            JScrollPane fuente3 = new JScrollPane(fuente2);
            fuente3.setBounds(345, 25, 188, 88);
            // layout.....
            JPanel lamina2 = new JPanel();
            lamina2.setLayout(null);
            lamina2.setBounds(10, 290, 550, 125);
            lamina2.setBorder(BorderFactory.createEtchedBorder());
            lamina2.add(tamaño);
            lamina2.add(tamaño3);
            lamina2.add(fuente);
            lamina2.add(fuente3);
            add(lamina2);
        }

        // cuadro de texto inferior....
        public void cuadroTexto() {
            JTextArea cuadroTexto = new JTextArea("cambiado el tamaño de los controles");
            JScrollPane cuadroT = new JScrollPane(cuadroTexto);
            cuadroT.setBounds(10, 425, 550, 90);
            add(cuadroT);

        }

        public void lamina3() {
            // componentes que van dentro del layout...
            // raiobutton...
            JRadioButton ampliar = new JRadioButton("Ampliar", true);
            ampliar.setBounds(65, 20, 75, 15);
            JRadioButton reducir = new JRadioButton("Reducir", false);
            reducir.setBounds(65, 45, 75, 15);
            ButtonGroup cambiarT = new ButtonGroup();
            cambiarT.add(ampliar);
            cambiarT.add(reducir);
            // menu de tamaño de letra...
            String[] numeros = { "8", "10", "11", "12", "14", "16", "22", "24", "30" };
            JComboBox porciento = new JComboBox<>(numeros);
            porciento.setBounds(96, 75, 80, 25);
            JLabel cleo = new JLabel("%");
            cleo.setBounds(75, 75, 10, 15);
            // boton de cambiar
            JButton cambiar = new JButton("Cambiar");
            cambiar.setBounds(96, 115, 94, 25);
            // boton restablecer fuentes..
            JButton rF=new JButton("Restablecer Fuentes");
            rF.setBounds(10, 170, 182, 25);         
            // layout....
            JPanel lamina3 = new JPanel();
            lamina3.setLayout(null);
            lamina3.setBounds(564, 50, 200, 210);
            lamina3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Cambiar Tamaño"));
            lamina3.add(ampliar);
            lamina3.add(reducir);
            lamina3.add(porciento);
            lamina3.add(cleo);
            lamina3.add(cambiar);
            lamina3.add(rF);
            add(lamina3);
        }
        public void botones3(){
            //boton mostrar form2...
            JButton mostrarF=new JButton("Restablecer Form2");
            mostrarF.setBounds(564, 265, 200, 25);
            add(mostrarF);
            //boton aceptar...
            JButton cept=new JButton("Aceptar");
            cept.setBounds(670, 440, 94, 25);
            add(cept);
            //boton cancelar...
            JButton cancel=new JButton("Aceptar");
            cancel.setBounds(670, 470, 94, 25);
            add(cancel);
        }
    }

}