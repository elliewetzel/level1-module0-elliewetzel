int score = 0;
int Y = 0;
int randomNumber = (int) random(width);

void setup() {
  size(600, 600);
}
void draw() {
  background(#D8D8D8);
  fill(#0099FC);
  stroke(#000000);
  ellipse(randomNumber, Y+=10, 25, 87);
  if(Y == 600) {
  checkCatch(randomNumber);
  randomNumber = (int) random(width);
  Y = 0;
  ellipse(randomNumber, Y+=10, 25, 87);
  }
  fill(#6A3D34);
  stroke(#000000);
  rect(mouseX, 500, 100, 150);
  
  
  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);
}
void checkCatch(int x){
     if (x > mouseX && x < mouseX+100)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }