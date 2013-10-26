import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class AmericanFlag {

        private int height;
        private int width;
        private double scale;
        private Rectangle[] stripes;
        private Rectangle redRec;
        private Rectangle union;
        private Stars star;
        private Stars[] states;
        public AmericanFlag(int width, int height, double scale) {
                double diameter = (.0616*height);
                int starOffsetY = 0;
                int starOffsetX = (int)(height*0.0315);
                this.states = new Stars[4];
                this.stripes = new Rectangle[6];
                int yOffset = (int)(height/13.0);
                this.height = height * (int)scale;
                this.width = width * (int)scale;
                this.redRec = new Rectangle(this.width, this.height, Color.RED, new Point(0,0));
                this.union = new Rectangle((int)(((double)this.height) * 0.76), (int)yOffset * 7, Color.BLUE, new Point(0,0));
                for (int i = 0; i < stripes.length; i++) {
                        stripes[i] = new Rectangle(this.width, this.height/13, Color.WHITE, new Point(0,yOffset));
                        yOffset = yOffset + (((int)this.height/13) * 2);
                }
                //this.star = new Stars(diameter, new Point((int)(height*0.0315), (int)(height*0.054)), Color.WHITE);
                for (int i = 0; i < states.length; i++) {
                        states[i] = new Stars(diameter, new Point(((int)(height*0.0315)+starOffsetX), starOffsetY), Color.WHITE);
                        starOffsetX = (starOffsetX*i);
                        starOffsetY = (starOffsetY);
                }

        }

        public void draw(Graphics g){
               
                redRec.paint(g);
                for (int i = 0; i < stripes.length; i++) {
                        stripes[i].paint(g);
                }
                union.paint(g);
                for (int i = 0; i<states.length; i++) {
                        states[i].paint(g);
                }
        }
}