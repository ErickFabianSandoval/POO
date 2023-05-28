package fes.ico.ActividadExtraDiez.controlador;

import fes.ico.ActividadExtraDiez.vista.Ventana;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;

public class ControladorEjemplo extends MouseAdapter {
    private Ventana view;

    public ControladorEjemplo(Ventana view) {
        this.view = view;
        this.view.getBtnMensaje().addMouseListener(this);
        this.view.getBtnEntrada().addMouseListener(this);
        this.view.getBtnOpcion().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == view.getBtnMensaje()){
            //System.out.println("Mensaje");
            ImageIcon icono = new ImageIcon("exito.png");
            JOptionPane.showMessageDialog(view,
                    "Hola desde el Ejemplo",
                    "Título personalizado",
                    JOptionPane.WARNING_MESSAGE, icono);
        }
        if(e.getSource() == view.getBtnEntrada()){
            String datos = JOptionPane.showInputDialog(view, "Ejemplo de entrada",
                    "Titulo personalizado", JOptionPane.QUESTION_MESSAGE);
            this.view.getLblResultado().setText(datos);
        }
        if(e.getSource() == view.getBtnOpcion()){
            //System.out.println("Opción");
          int respuesta = JOptionPane.showConfirmDialog(view, "¿Estas seguro de borrar el registro?",
                    "Confirmación", JOptionPane.YES_NO_OPTION);

          if(respuesta == JOptionPane.YES_NO_OPTION){
              view.getLblResultado().setText("Elegiste opcion si");
          }else{
              view.getLblResultado().setText("Elegiste opcion no");
          }
        }
    }
}
