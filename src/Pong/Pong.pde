int X = 1;
void setup() {
  size(500, 500);
background(#FFFFFF);
}
void draw() {
  background(#FFFFFF);
  fill(#FFD6CE);
  stroke(0, 0, 0);
  ellipse(X+=8, 200, 50, 50);
  if(X == 499){
    X = X-=8;
    ellipse(X, 200, 50, 50);
  }
  else if(X == 1) {
    X = X+=8;
    ellipse(X, 200, 50, 50);
  }
}