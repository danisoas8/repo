public class Cercle {
        private float x;
        private float y;

        Cercle(float xx, float yy) 
        {
            x=xx;
            y=yy;
        }

        Cercle(){
            x=0;
            y=0;
        }

        Cercle(Cercle c) {
            x = c.getX();
            y = c.getY();
        }

        public String toString() {
            return x= +x+ y= +y; 
        }

        public Boolean equals(Cercle c) {
            return p.getX()==x && p.getY()==y;
        }

	public static void main (String []args){
	 Cercle c=new Cercle(13.14,14.13);
   	 System.out.println("X: "+c.getX());
   	 System.out.println("Y: "+c.getY());

	 Cercle c2=new Cercle (1.2,2.1);
	 System.out.println("X: "+c2.getX());
	 System.out.println("Y: "+c2.getY());
        }
