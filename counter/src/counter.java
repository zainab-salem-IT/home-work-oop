public class counter {
    int max=13;
     private  int value=3;
      public void increment()
      {
          for(int i=value;i<max;i++)
          {
              value=value+1;
              System.out.print(value+"\n");
          }
          System.out.print("Stop");
      }
      public int getvalue()
      {
          return value;
      }


}
