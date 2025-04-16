/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapterpatterndemo;

/**
 *
 * @author profslpa
 */
public class AudioPlayer implements MediaPlayer{

     private MediaAdapter mediaAdadpter;
    
    @Override
    public void play(String audioType, String fileName) {
      mediaAdadpter = new MediaAdapter(audioType);
      mediaAdadpter.play(audioType, fileName);
      
    }
    
}
