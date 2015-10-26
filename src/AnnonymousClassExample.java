/**
 * Created by BennettIronYard on 10/26/15.
 */
    public class AnnonymousClassExample {
         public static void main(String[] args) {
        //create alligator from separate class
            Alligator al =new Alligator();
             System.out.println(al);

             //Create
             Reptile a2 = new Reptile() {
                 public String toString() {
                     return "Alligator";
                 }
             };
             System.out.println(a2);
          }
    }

    class Alligator extends Reptile {
        @Override
        public String toString() {
            return "Alligator";
        }
    }


