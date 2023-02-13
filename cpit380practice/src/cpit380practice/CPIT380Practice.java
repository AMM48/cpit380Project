/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit380practice;

//import java.awt.*;
import java.awt.Color;

//import java.awt.font.*;
//import java.awt.geom.*;
//import java.text.*;
/**
 *
 * @author Saim
 */
public class CPIT380Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fileName=FileChooser.pickAFile();
        Picture pic= new Picture(fileName);
         pic.show();
         Picture.changeAllColors_596(0, 0, 0);
        //pic.changeRed_myID();
        //pic.decreaseRed();
        
        //pic.copy_myID(pic, 0, 0, 0, 0, 0, 0);
        //pic.copy(pic, 0, 0, 0, 0, 0, 0);
               
        pic.show();
        
        
        //pic = pic.rotateLeft();
        
        //pic.myred(1.5);
        //pic.repaint();
        //pic.show();
        
        
       /*Pixel pixobj = pic.getPixel(0,0);
       System.out.println("The pixel at position (0,0 " + pixobj);
       
       int R = pixobj.getRed();1.5
       int G = pixobj.getGreen();
       int B = pixobj.getBlue();
       
       System.out.println (R);
       System.out.println (G);
       System.out.println (B);
         
       // We want to get all the pixels in the image
       
       Pixel [] arrayPixels = pic.getPixels();
      pic.lighten();
       
       Pixel pixelObject = arrayPixels[0];
       System.out.println(pixelObject);
       
       pixelObject.setRed(200);
       
       
         System.out.println(pixelObject);
         //pic.show();
         int i =0;
       while(i< arrayPixels.length)
{
   pixelObject= arrayPixels[i];
   pixelObject.setColor(Color.BLACK);
   i++;

}
       
       pic.show();*/

       /* System.out.println("This is CPIT380 Practice Session");
        String fileName = FileChooser.pickAFile();
        System.out.println(fileName);

        Picture picObject = new Picture(fileName);
        picObject.show();
        
        
        int width = picObject.getWidth();
        System.out.print("Width of Picture = ");
        System.out.println(width);
        int height = picObject.getHeight();
        System.out.print("Height of Picture = ");
        System.out.println(height);
        System.out.print("Total number of Pixels in the Picture = ");
        System.out.println(width * height);

        Pixel[] pixelArray = picObject.getPixels();

        // Change the color of image by using color object.
        for (int i = 0; i <= 255; i++) {
            Color colorObj = new Color(i, 255, 255-i);

            for (Pixel pixelObj : pixelArray) {
                pixelObj.setColor(colorObj);

            }

            picObject.repaint();
            picObject.show();

        }
        System.out.print("Done");
        
        

        //picObject.decreaseRed();
        //picObject.repaint();
        //picObject.show();

        /*for (int i = 0; i<=255 ; i++)
        {       
        
        // Use the method decreaseRed()...Green...Blue...
        picObject.decreaseRed();
        picObject.repaint();
        picObject.show();
       
        }
      
        picObject.rotateLeft();
        picObject.repaint();
        picObject.show();*/
    }

}
