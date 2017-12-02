void setup(){
  size(1000, 500);
}
    int x1 = 200;
    int x2 = 800;
    
   boolean we = false;
  void draw(){

     background(100, 100, 100); 
noFill();
for(int i = 0; i < 400; i++){
 
if(i%20 == 0)  {
ellipse( x1, 250, 400 -i, 400 - i);
ellipse( x2, 250, 400 -i, 400 -i);
}
}


if(we==false){
x1=x1+1;
x2=x2-1;
}
if(we==true){
x1=x1-1;
x2=x2+1;
}
if(x1>800){
  we=true;
}
if(x1<200){
we=false;
}

  };