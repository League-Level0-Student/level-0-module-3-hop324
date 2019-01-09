int x1 = 200;
int x2 = 600;
int b = 50;
void setup(){
size(800, 800);
background(#FFFFFF);
}
void draw(){
  noFill();
  background(#FFFFFF);
for(int i = 20; i >0; i--){

int size = 1;
//if(i%2 == 0){
//x1++;
//}
//else{
//x2--;
//}

size *= (i*10);
ellipse(x1,400, size, size);
ellipse(x2, 400, size, size);
}
if(b%2 == 0){
for(int x = 50; x > 0; x--){
x1+=0.1;
x2-=0.1;
}
}
else if(b%2 == 1){
for(int y = 50; y > 0; y--){
x1-=0.1;
x2+=0.1;
}
if(x1 == x2){
  if(b%2 == 0){
for(int x = 50; x > 0; x--){
x1-=0.1;
x2+=0.1;
}
}
else if(b%2 == 1){
for(int y = 50; y > 0; y--){
x1+=0.1;
x2-=0.1;
}
}

}

}}