import processing.core.PApplet;

public class Sketch extends PApplet {

  /**
   * Assignment: 5.9 Processing Task 7 - Images and Animation
   * Author: Lydia He
   * Date: Tue Apr 19, 2022
   * Description: A program that implements the 
   * following: an image background, an animated image, 
   * an animated shape, basic edge detection. The image 
   * moves in a non-linear path. 
   */

  // state variables
  PImage background;
  float x = 0;
  float y = 0;
  float xSpeed = 8;
  float ySpeed = 2;
  
  public void setup() {
    int width = 400;
    int height = 400;
    size(width, height);

    // image background
    background = loadImage("background1.jpeg");
  }

  public void draw() {
    // draw image
    image(background, 0, 0);

    // animate basic edge detection
    ellipse(x, y, 50, 50);

    x += xSpeed;
    y += ySpeed;
  
    if (x < 0 || x > width) {
      xSpeed *= -1;
    }
  
    if (y < 0  || y > height) {
      ySpeed *= -1;
    }
      
  }
}