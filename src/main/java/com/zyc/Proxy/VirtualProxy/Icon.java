package com.zyc.Proxy.VirtualProxy;

import java.awt.*;

public interface Icon {

    int getIconWidth();
    int getIconHeigh();
    void paintIcon(final Component component, Graphics graphics, int x, int y);
}