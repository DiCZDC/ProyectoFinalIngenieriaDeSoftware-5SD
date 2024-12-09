package Metodos;

import java.io.*;
import javax.swing.*;

public class saveImage {
    
    public static void main(String[] args) {
        new saveImage().selectImage("PolizaSeguro",1);
    }

    public void selectImage(String tipo,int id){
        try {
            // Cambiar el look and feel a Windows
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        
        MoveImage(fileChooser.getSelectedFile(),tipo,id);
    }
    public void MoveImage(File image,String tipo, int id){
        String ubiCarpeta = new File("").getAbsolutePath()+ File.separator + "Documentos"+File.separator+tipo;
        File destFile = new File(ubiCarpeta + File.separator + id + ".png");
        if (image.renameTo(destFile)) {
            try {
                // Cambiar el look and feel a Windows antes de mostrar el JOptionPane
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            } catch (Exception e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "Archivo seleccionado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Error al mover el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
