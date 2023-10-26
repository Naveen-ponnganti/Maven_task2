class attackers{
float max = 400;
float min = 1;
float posx = (int)Math.floor(Math.random()*(max-min+1)+min);
float posy = 400;
float speed = 1;
}
attackers one, two, three, four;
 
 float DefenderX= 100; 
float DefenderY=100;

void setup()
{
  one = new attackers();
  two = new attackers();
  three = new attackers();
  four = new attackers();
  
  size(400,400); //fairly large relative to objects
  rectMode(CENTER); //set rect x,y to be the centre.
}



float gunX=40;
boolean dropping = false;
int countA = 0;



void draw()
{
  
  
  
  background(#0000FF);  //clear background
  ellipse(DefenderX,DefenderY,20,20);//Draw player  current position (x,y)
  if ( abs(DefenderX - one.posx)<20 && abs(DefenderY-one.posy )<20 ||
       abs(DefenderX - two.posx)<20 && abs(DefenderY-two.posy )<20 ||
       abs(DefenderX - three.posx)<20 && abs(DefenderY-three.posy )<20 ||
       abs(DefenderX - four.posx)<20 && abs(DefenderY-four.posy )<20
  )//are they close together?
  {
   print ("GAMEOVER!");
   
  }
float bulletY = DefenderY;
  float bulletX= DefenderX;
  
  
  rect(bulletX, bulletY, 8, 8);
  text("score: ", countA, 20, 80);
  if (keyPressed && key==CODED && key == 's')// if the space bar is pressed
  {
    dropping = true;
    print("its working");
    if (bulletY<=400)
    bulletY= bulletY + 1;
  }
  if(dropping == true){
    }
    
    if(bulletY>=400){dropping = false;
    bulletY=DefenderY;
    bulletX=DefenderX +30;}
    
  int randomattack, randomattack1, randomattack2, randomattack3;
  
  
   randomattack = (int)Math.floor(Math.random()*(two.max-two.min+1)+two.min);
  ellipse(one.posx,one.posy, 10,10);   //draw ball at current position : x, y fixed at 125!
  one.posy = one.posy - 1;
  
  
  if (abs(one.posy -1 )<1 )
  {one.posy = one.posy+ 400;
  one.posx = randomattack;}
  randomattack1 = (int)Math.floor(Math.random()*(two.max-two.min+1)+two.min);
  
  
ellipse(two.posx,two.posy, 10,10);   //draw ball at current position : x, y fixed at 125!
  two.posy = two.posy - 1;
  if (abs(two.posy -1 )<1 )
  {two.posy = two.posy+ 400;
  two.posx = randomattack1;}
  
  randomattack2 = (int)Math.floor(Math.random()*(two.max-two.min+1)+two.min);
 ellipse(three.posx,three.posy, 10,10);   //draw ball at current position : x, y fixed at 125!
  three.posy = three.posy - 1;
if (abs(three.posy -1 )<1 )
  {three.posy = three.posy+ 400;
  three.posx = randomattack2;}
    
    
randomattack3 = (int)Math.floor(Math.random()*(one.max-one.min+1)+one.min);
 ellipse(four.posx,four.posy, 10,10);   //draw ball at current position : x, y fixed at 125!
  four.posy = four.posy - 1;
if (abs(four.posy -1 )<1 )
  {four.posy = four.posy+ 400;
  four.posx = randomattack3;}
}void keyPressed()
{
  if (key==CODED)
  {
    if (keyCode == LEFT)
    {  DefenderX = DefenderX - 5; }
    if (keyCode == RIGHT)
    {  DefenderX = DefenderX + 5; } 
}
}