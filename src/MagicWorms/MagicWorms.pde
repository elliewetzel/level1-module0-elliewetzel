int x = 0;
int y = 0;
void setup() {
  size(500, 550);
background(#CFF7F2);
}
void draw() {
  makeMagical();
  for(int e = 0; e < 300; e++) {
    stroke(#000000);
    fill(#FFFFFF);
  ellipse(getWormX(x), getWormY(y), 30, 30);
  }
}
float frequency = .009;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}