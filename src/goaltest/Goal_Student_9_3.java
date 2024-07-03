package goaltest;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;

public class Goal_Student_9_3 {

  
   
    private Image dukeImage;
    private ImageView dukeImageView;
    private Image gloveImage;
    private ImageView gloveImageView;
    private AudioClip tone;
   
      public Image getDukeImage() {
        return dukeImage;
    }

    public void setDukeImage(Image dukeImage) {
        this.dukeImage = dukeImage;
    }

    public ImageView getDukeImageView() {
        return dukeImageView;
    }

    public void setDukeImageView(ImageView dukeImageView) {
        this.dukeImageView = dukeImageView;
    }
     public Image getGloveImage() {
        return gloveImage;
    }

    public void setGloveImage(Image gloveImage) {
        this.gloveImage = gloveImage;
    }

    public ImageView getGloveImageView() {
        return gloveImageView;
    }

    public void setGloveImageView(ImageView gloveImageView) {
        this.gloveImageView = gloveImageView;
    }
    
    public AudioClip getTone() {
        return tone;
    }

  
    
    
    public Goal_Student_9_3(){

        String imagePathDuke = "/goaltest/Images/Duke.png";
        Image image1 = new Image(getClass().getResource(imagePathDuke).toString());
        
        dukeImage = image1;
        ImageView dukeView = new ImageView(dukeImage);
        dukeImageView = dukeView;
        
        dukeImageView.setLayoutX(100);
        dukeImageView.setLayoutY(50);
        
        String imagePathGlove = "/goaltest/Images/Glove.png";
        Image image2 = new Image(getClass().getResource(imagePathGlove).toString());
        gloveImage = image2;
        
        ImageView gloveView = new ImageView(gloveImage);
        gloveImageView = gloveView;
        
        gloveImageView.setLayoutX(120);
        gloveImageView.setLayoutY(50);
        gloveImageView.setPreserveRatio(true);
        gloveView.setFitWidth(25);
        
        String tonePath = "/goaltest/Audio/Note5.wav";
        AudioClip audio1 = new AudioClip(getClass().getResource(tonePath).toString());
        tone = audio1;
        
        GoalTest_Student_9_3.root.getChildren().addAll();
        interactions();
    }
    
    private void interactions(){
        //Exercise 4   
        dukeImageView.setOnMouseDragged((MouseEvent me)-> 
        {
            System.out.println(me.getSceneX());
            System.out.println(me.getSceneY());
        });
        
        dukeImageView.setOnMousePressed((MouseEvent me)->
        {
            getTone().play();
        }
        );
    }
}
