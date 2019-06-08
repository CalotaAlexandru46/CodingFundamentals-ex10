import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner((System.in));
        System.out.println("Introduceti cuvantul:");
        String cuvant=input.nextLine();
        char[] elemente=cuvant.toCharArray();
        boolean valid=true;
        for(int i=0; i<elemente.length-1; i++){
            for(int j=i+1; j<elemente.length; j++){
                if(elemente[i]==elemente[j]){
                    valid=false;
                    break;
                }
            }
        }
        System.out.println(valid);

    }
}
