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
        
        }
