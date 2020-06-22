package sprint1;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;



public class Imagen extends JPanel{
    
    String ruta;
    
    public Imagen (int x, int y, String ruta) {
        
        this.setSize(x,y);
        this.ruta=ruta;       
    }
    
    public void paint(Graphics g){
        
        Dimension height = getSize();
   //   ImageIcon img = new ImageIcon(getClass().getResource(ruta));
        Image imgExt = new ImageIcon(ruta).getImage();
     
     
     
     
        g.drawImage(imgExt, 0, 0, height.width, height.height, null);
        setOpaque(false);
        super.paintComponent(g);
    
    
    
    } 
    
}
