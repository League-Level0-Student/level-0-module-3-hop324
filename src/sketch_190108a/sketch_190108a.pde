
void setup(){
size(800, 800);
}
void draw(){
for(int i = 5; i > 0; i--){
int size = 1;
size *= (i*100);
if(i%2 == 0){
fill(255, 0, 0);
}
else if(i%2 == 1){
fill(0, 255, 0);
}
ellipse(400, 400, size, size);
}
}