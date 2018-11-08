package com.company;


import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;

public class QRImage extends ImageView {

    public QRImage(){
        this.setImage(this.createQRImage());

    }

    public WritableImage createQRImage(){
        WritableImage QRCode = new WritableImage(100, 100);

        for(int i = 0; i < 100; i++){
            for(int y = 0; y < 100; y++){
                if((i+y) % 2 == 0){
                    QRCode.getPixelWriter().setColor(i, y, Color.BLACK);
                } else {
                    QRCode.getPixelWriter().setColor(i, y, Color.WHITE);
                }
            }
        }
        return QRCode;
    }



}
