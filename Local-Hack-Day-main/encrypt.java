import java.util.Scanner;  // Import the Scanner class

class encrypt {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");
    String myObj = sc.nextLine();
    int i =0;
    int inc = 3;
    int[] a = new int[(myObj.length())];
    for(i=0;i<(myObj.length());i++){
        a[i]= myObj.charAt(i);
        a[i] = a[i] + inc;
    }
    StringBuffer result= new StringBuffer();
    String str;
        for(int j: a){
            str = Character.toString((char)j);
            result.append(str);
        }
        System.out.println("Decrypted Text is :"+result);
  }
}
