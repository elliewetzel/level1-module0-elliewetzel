PImage backgroundImage;
import ddf.minim.*;  
Minim minim;
AudioSample sound;
int X = 1;
int Xspeed = 8;
int Y = 200;
int Yspeed = 8;
void setup() {
  size(500, 500);
background(#FFFFFF);
minim = new Minim (this);
sound = minim.loadSample("pong.wav", 128);
backgroundImage = loadImage("image.jpg");
}
void draw() {
  image(backgroundImage, 0, 0);
image(backgroundImage, 0, 0, width, height);
  fill(#FFD6CE);
  stroke(0, 0, 0);
  ellipse(X, Y, 50, 50);
  X += Xspeed;
  Y += Yspeed;
 if(X >= 499) {
  Xspeed = -Xspeed;
 }
 else if(X <= 2) {
  Xspeed = -Xspeed;
 }
 if(Y <= 2) {
  Yspeed = -Yspeed;
 }
 else if(Y > 550) {
  sound.trigger();
  fill(#000000);
  text("You died", 20, 20);
  fill(#FFD6CE);
 }
 
 rect(mouseX, 450, 200, 50);
 if(intersects(X, Y+25, mouseX, 450, 200)) {
   Yspeed = -Yspeed;
   Xspeed = -Xspeed;
 }
 
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
  println(ballX + " " + ballY);
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}