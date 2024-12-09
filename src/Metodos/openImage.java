package Metodos;

import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class openImage{
    String extensiones [] = {"jpg", "png", "jpeg"};
    public static void main(String[] args)throws IOException {
        openImage o = new openImage();
        o.buscar("polizaSeguro", 1);
    }
    public void buscar(String tipo, int id)throws IOException{ 
        String ubiCarpeta = new File("").getAbsolutePath()+ File.separator + "Documentos"+File.separator+tipo;
        System.out.println(ubiCarpeta);
        for(String extension: extensiones){
            File imageFile = new File(new File(ubiCarpeta), id+"."+extension);
            
            if(imageFile.exists()){
                abrir(imageFile,tipo);
                return;
            }
        }
        
        JOptionPane.showMessageDialog(null, "No se encontro la imagen", "Error", JOptionPane.ERROR_MESSAGE);
    }
    public void abrir(File imagenAct,String tipoString)throws IOException{
            BufferedImage image = ImageIO.read(imagenAct);
            JLabel picLabel = new JLabel(new ImageIcon(image));
            JOptionPane.showMessageDialog(null, picLabel, tipoString, JOptionPane.PLAIN_MESSAGE, null);
    }

}