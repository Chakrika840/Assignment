import java.util.Scanner;
class Character
{
   public static void main(String args[])
   {
      Scanner obj=new Scanner(System.in);
      String str=obj.nextLine();
       char [] arr=str.toCharArray();
       System.out.println("Character count: "+str.length());
       int cnt=0;
       System.out.println("Enter the character you want the count of:");
       char x=obj.next().charAt(0);
       for(int i=0;i<str.length();i++)
       {
           if(x==str.charAt(i))
            cnt++;
       }
       System.out.println("Count of character "+x+" is "+cnt);
         
        int[] arr1=new int[str.length()];
        for(int i=0;i<arr.length;i++)
         {
              arr1[i]=1;
            for(int j=i+1;j<arr.length;j++)
             {
                   
                 if(str.charAt(i)==str.charAt(j))
                  {
                       arr1[i]++;
                        arr[j]='0';
                   }
             }
         }
          for(int i=0;i<str.length();i++)
          {
               if(arr[i]=='0')
                    continue;
               if(arr[i]!='0'||arr[i]!='\s')
                  System.out.println(arr[i]+"  "+arr1[i]);
           }       
       
   
            
 }     
   
      
}
