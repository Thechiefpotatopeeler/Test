
/**
 * Write a description of class PrimitiveStuff here.
 *
 * @author Thomas Jackson
 * @version 14/02/23
 */
public class PrimitiveStuff
{
    public int x1 =345678;
    public int y1 = 4648653;
    public float x2 = 5343.546f;
    public float y2 = 879564.3f;
    public long x3 = 864453285145535545l;
    public long y3 = 234197l;
    public double x4 = 19614761946.596328485;
    public double y4 = 2433243.1949;
    public byte x5 = 123;
    public byte y5 = -9;
    public short x6 = 1358;
    public short y6 = 8988;
    public char x7 = 'f';
    public char y7 = 'x';
    public boolean x8 = true;
    public boolean y8= false;
    public PrimitiveStuff(){
        x4 +=y4;
        y4 += y2;
        x5 *= 1.3f; //Should be 159.9 but reads -97 because of the way bytes work 
        y5 *= -30; //Goes over the length of a byte
        System.out.println(x4);
        System.out.println(y4);
        System.out.println(x5);
        System.out.println(y5);
    }
}
