PImage face;
void setup() {
  face = loadImage("download.jpg");
  size(800,600);
  face.resize(width,height);
}

void draw() {
  background(face);
  fill(#FFFCFC);
  ellipse(173,193,50,50);
  ellipse(290,173,50,50);
  if (161<mouseX&&mouseX<185){
  if(171<mouseY&&205>mouseY){
  fill(#050000);
  ellipse(mouseX,mouseY,25,25);
  ellipse(mouseX+117,mouseY-20,25,25);
  }
  else{
     fill(#050000);
  ellipse(173,193,25,25);
  ellipse(173+117,193-20,25,25);
  }
  }
  else{
   fill(#050000);
  ellipse(173,193,25,25);
  ellipse(173+117,193-20,25,25); 
  }
  
}
