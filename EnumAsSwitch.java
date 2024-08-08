enum Status{
    
    Running,Failed,Pending,Success;

}
/**
 * EnumAsSwitch
 */
public class EnumAsSwitch {

    public static void main(String[] args) {
        Status s= Status.Success;
        switch (s) {
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Wait");
                break;
             case Running:
                System.out.println("On going");
                break;
        
            default:
            System.out.println("Done");//we can do that using if -else if 
                break;
        }

    }
}
