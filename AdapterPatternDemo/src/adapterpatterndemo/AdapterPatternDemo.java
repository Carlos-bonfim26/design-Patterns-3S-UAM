/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapterpatterndemo;

/**
 *
 * @author profslpa
 */
public class AdapterPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       AudioPlayer audioPlayer = new AudioPlayer();
       
       audioPlayer.play("mp4", "barões da pisadinha");
    }
    
}
