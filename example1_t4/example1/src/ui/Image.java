package ui;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Image extends JLabel {
    private String path;
    private ImageIcon image;

    public Image() {
        super();
    }

    public void setSource(String path, Integer width, Integer height) {
        this.path = path;
        this.image = new ImageIcon(path);
        java.awt.Image imageScale = this.image.getImage();
        java.awt.Image newimg = imageScale.getScaledInstance(width, height,
                java.awt.Image.SCALE_SMOOTH);
        ImageIcon newImageIcon = new ImageIcon(newimg);
        this.setIcon(newImageIcon);
    }

    public void setSource(String path) {
        this.path = path;
        this.image = new ImageIcon(path);
        this.setIcon(image);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

}
