 class Ellipses {
    
        private int x,y;
        private double a,b;
        private double h,k;
        public Ellipses(int x,int y,double a,double b,double h,double k) {
          this.a = a;
          this.b = b;
          this.x = x;
          this.y = y;
          this.h = h;
          this.k = k;
        }
       
        public double getEllipses() {
          return  ((x-h)*(x-h))/a*a + ((y-k)*(y-k))/b*b ;
        }
        
        }
        class Parabola{
            private int t,s;
            public Parabola(int t,int s){
                this .t = t;
                this .s = s;
            }
            public int getParabolas(){
                return ((t-s)*(t-s));
            }
        }
        class Hyperbola{
            private double p,q;
            private int r,c,d;
            public Hyperbola(double p,double q,int r,int c,int d){
                this.r=r;
                this.q=q;
                this.c=c;
                this.d=d;
                this.q=q;
            }
            public double getHyperbola(){
                return ((p-r)*(p-r))/c*c - ((q-c)*(q-c))/d*d;
            }
        }
        public class Ellipse{
            public static void main(String[] args) {
                int x=7,y=5,t=9,s=6,r=3,c=4,d=5;
                double a=2.0,b=3.0,h=4.0,k=5.0,p=7.8,q=5.7;

                
        Ellipses ellipses = new Ellipses(x,y,a,b,h,k);
        System.out.println("The Ellipses of  " + ellipses.getEllipses());
        Parabola s1 =new Parabola(t, s);
        System.out.println("The parabola of="+ s1.getParabolas());
        Hyperbola s2=new Hyperbola(p, q, r, c, d);
        System.out.println("The hypobola of ="+s2.getHyperbola());

                
            }

        }
    

