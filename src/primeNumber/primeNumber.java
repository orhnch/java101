package primeNumber;

public class primeNumber {
    public static void main(String[] args) {

        int n = 100;

        for(int i=2; i<=n;i++){
            int a=0;
            for(int k=2;k<=i;k++){
                if(i%k==0 && i!=k){
                    a++;
                }
            }
            if(a==0){
                System.out.print(i+"\t");
            }
        }

    }
}
