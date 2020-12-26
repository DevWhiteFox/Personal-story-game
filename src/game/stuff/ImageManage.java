package game.stuff;

import javax.swing.ImageIcon;

public class ImageManage {
    public static ImageIcon createImageIcon(String path) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        java.net.URL imgURL = classLoader.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
}
