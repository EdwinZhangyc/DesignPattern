package com.zyc.Proxy.VirtualProxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {

    ImageIcon imageIcon;
    URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public int getIconWidth() {
        if (imageIcon !=  null)
            return imageIcon.getIconWidth();
        return 800;
    }

    @Override
    public int getIconHeigh() {
        if (imageIcon != null)
            return imageIcon.getIconHeight();
        return 400;
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int x, int y) {
        if (imageIcon != null)
            imageIcon.paintIcon(component, graphics, x, y);
        else {
            graphics.drawString("Loading CD cover, please wait...", x + 300, y + 190);
            if (!retrieving){
                retrieving = true;
                retrievalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        try{
                            imageIcon = new ImageIcon(imageURL, "CD cover");
                            component.repaint();
                        } catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                });
                retrievalThread.start();
            }
        }
    }
}