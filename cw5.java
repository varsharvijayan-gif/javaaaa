public class cw5 {
    public static void main(String arg[]) {
        int [] arr ={96, 85, 73, 12, 88};   
        for(int i=0; i<arr.length; i++){
          if(arr[i]>=90){
            System.out.println("Exellent");
          }
           else if(arr[i]>=75 && arr[i]<89){
            System.out.println("Good");
        }
        else if(arr[i]>=50 && arr[i]<74){
            System.out.println("Average");
        }
        else if(arr[i]<=50){
            System.out.println("Fail");
        }
        else{
            System.out.println("Invalid Score");
        }
    }
    }
}