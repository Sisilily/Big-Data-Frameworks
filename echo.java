public class echo {
    public static void main(String[] args) {
        // write your code here
        if(args.length==0) {

        } //if no argument is given, then do nothing
        else {
            for(int i=0;i<args.length-1;i++) {
                System.out.print(args[args.length-1-i] +" ");        }
            System.out.println(args[0]);
        } 


    }
}
