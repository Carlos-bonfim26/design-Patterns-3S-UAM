/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapterpatterndemo;

/**
 *
 * @author profslpa
 */
public class Mp4Player implements AdvanceMediaPlayer{

    @Override
    public void playVic(String fileName) {

    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("tocando arquivo mp4 " + fileName);
    }
    
}
