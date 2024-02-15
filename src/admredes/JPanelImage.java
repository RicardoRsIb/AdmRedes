/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admredes;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Ricardo R. Ibarra
 */
public class JPanelImage extends JLabel{
    private  int x;
    private  int y;
    private final String path;
    
    public JPanelImage(JPanel panel, String path){
        this.path = path;
        this.x = panel.getWidth();
        this.y = panel.getHeight();
        this.setSize(x, y);
    }
    
    @Override
    public void paint(Graphics g){
        ImageIcon img = new ImageIcon(path);
        g.drawImage(img.getImage(), 0, 0, x, y, null);
    }
}
