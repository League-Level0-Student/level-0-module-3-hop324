int x1 = 200;
int x2 = 600;
int b = 50;
boolean flag = true;

void setup(){
size(800, 800);
background(#FFFFFF);

}
void draw(){
  noFill();
  background(#FFFFFF);
  for(int i = 20; i >0; i--){
      int size = 1;
      size *= (i*10);
      ellipse(x1,400, size, size);
      ellipse(x2, 400, size, size);
}

if(flag){
x1++;
x2--;
}
else{
x1--;
x2++;
}

if( x1 >= 400 || x2 <= 400){
flag = false;
}
else if( x1 <= 200 || x2 >= 600){
flag = true;
}

}