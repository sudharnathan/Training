package access2;
import access1.Bigbrother;

public class Smallbrother extends Bigbrother {    //To achieve protected use inheritance technique

        public static void main(String[] args) {
        	Bigbrother obj = new Bigbrother();
                obj.msg();
                Smallbrother call = new Smallbrother();
                call.protect();
                //call.personal(); //Private cannot be accessible
                 

        }

}