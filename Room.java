
/**
 * Write a description of class Room here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Room
{
    // instance variables - replace the example below with your own
    public String name, description;
    public int n, s, w, e;
    
    public Room(String title, String describe) {
        name = title;
        description = describe;
        n = 0;
        s = 0;
        w = 0;
        e = 0;
    }
    
    public void setExit(char c) {
        switch(c) {
            case 'n':
                n=1;
                break;
            case 's':
                s=1;
                break;
            case 'w':
                w=1;
                break;
            case 'e':
                e=1;
                break;
            default:
                System.out.println("Invalid exit direction");
        }
    }
}
