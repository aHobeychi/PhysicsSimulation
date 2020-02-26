/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assets;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;


public class assetManager {

    //Electricity and Magnetism 
    public static Image positiveChargeImage = new Image(("/assets/positiveCharge.png"));
    public static Image negativeChargeImage = new Image(("/assets/negativeCharge.png"));
    public static Image resistanceImage = new Image(("/assets/resistanceSymbol.JPG"));
    public static Image batteryImage = new Image(("/assets/batterySymbol.jpg"));
    public static Image closedSwitchImage = new Image(("/assets/closedSwitch.png"));
    public static Image openSwitchImage = new Image(("/assets/openSwitch.png"));
    public static Image projectileBackgroundImage = new Image(("/assets/projectileBackground.jpg"));
    public static Image tankBackground = new Image(("/assets/tankBackground.png"));
    public static Image tankNoseImage = new Image(("/assets/tankNose.png"));
    public static Image trackBackground = new Image(("/assets/newtonsBackground.jpg"));
    public static Image coulombBackground = new Image(("/assets/textureBackground.jpg"));
    public static Image circuitBackground = new Image(("/assets/textureBackground.jpg"));
    public static Image carImage = new Image(("/assets/carImage.png"));
    public static Image wavesBackground = new Image(("/assets/squaredPaper.jpg"));
    public static Image gifBackground = new Image(("/assets/cool.gif"));
    public static Image coilImage = new Image(("/assets/coil.png"));
    
    public static ImagePattern getpositivePattern() {
        return (new ImagePattern(positiveChargeImage));
    }

    public static ImagePattern getnegativePattern() {
        return (new ImagePattern(negativeChargeImage));
    }
    
    public static ImagePattern getCarPattern() {
        return (new ImagePattern(carImage));
    }
    
//    public static ImagePattern getTankNosePattern() {
//        return (new ImagePattern(tankNose));
//    }
}
