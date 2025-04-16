/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapterpatterndemo;

/**
 *
 * @author profslpa
 */
public class MediaAdapter implements MediaPlayer{
  private  AdvanceMediaPlayer advanceplayer;

  
    
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vic")){
            advanceplayer = new VicPlayer();
        } else if(audioType.equalsIgnoreCase("mp4")){
            advanceplayer = new Mp4Player();
        }
    }
    
     @Override
    public void play(String audioType, String fileName) {
         if(audioType.equalsIgnoreCase("vic")){
            advanceplayer.playVic(fileName);
        } else if(audioType.equalsIgnoreCase("mp4")){
            advanceplayer.playMP4(fileName);
        }
    }
}
