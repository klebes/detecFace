package reconhecimento;

//import org.bytedeco.javacpp.opencv_face.FaceRecognizer;
//import static org.bytedeco.javacpp.opencv_face.EigenFaceRecognizer; 
import org.bytedeco.opencv.opencv_face.EigenFaceRecognizer;
import org.bytedeco.opencv.opencv_face.FaceRecognizer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KDS
 */
public class Teste {
    public static void main(String[] args) {
        FaceRecognizer r = EigenFaceRecognizer.create();
    }
}
