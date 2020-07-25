int x = 100;
int speed = 1;
void setup() {
  size(1000, 500); 
  noFill();
  strokeWeight(3);
}

void draw() {
  background(200);
  //draw concentric circles
  for (int i = 1; i < 25; i++) {
    ellipse(x, 250, i*15, i * 15);
    ellipse(width - x, 250, i*15, i*15);
  }
  //move the x by speed
  x+=speed;
  //reverse speed if circles are off screen
  if (x < 0 || x > width) {
    speed = -speed;
  }
}

