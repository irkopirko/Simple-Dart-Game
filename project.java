package project;
import java.util.Scanner;
/**
 *
 * @author iremcelik
 */
public class Project {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("DART GAME !");
        System.out.println("Enter the number of darts to be thrown: ");
        int number=input.nextInt();
    int counter1=0;
    int counter2=0;
    int counter3=0;
    int counter4=0;
    int counter5=0;
    int counter6=0;
    int counter7=0;
    int counter8=0;
    int counter9=0;
    
        int i ; i=1;
        while (i<=number) {
            double x=( -5  + (Math.random()*10)) ;
            x=(int)(x*10.0)/10.0;
            double y=( -5  + (Math.random()*10)) ; 
            y=(int)(y*10.0)/10.0;
            double d1 = Math.pow(x+3,2); // (x-a)*(x-a) + (y-b)*(y-b) = r*r
            double d2 = Math.pow(y-3,2);
           
            
           
            
                   if (x>0 && y>0 && x+y<5) {
                
                            System.out.println("Dart " + i + ":");
                            System.out.println("Coordinates: (" + x + "," + y + ")");
                            System.out.println("Region: A" );
                            counter1+=1;
                   
                        }
                    else if(x>0 && y>0 && x+y>5){
                              
                        System.out.println("Dart " + i + ":");
                            System.out.println("Coordinates: (" + x + "," + y + ")");
                            System.out.println("Region: B" );
                            counter2+=1;
                    
                                }
                            else if(x<0 && y>0 && d1+d2<1 ){
               
                            System.out.println("Dart " + i + ":");
                            System.out.println("Coordinates: (" + x + "," + y + ")");
                            System.out.println("Region: C" );
                            counter3+=1;
                 
                       }
                                    else if(x<0 && y<0 && x<y ){
                         
                            System.out.println("Dart " + i + ":");
                            System.out.println("Coordinates: (" + x + "," + y + ")");
                            System.out.println("Region: D"  );
                            counter4+=1;
         
                        }
                                    else if(x<0 && y<0 && y<x){
                     
                            System.out.println("Dart " + i + ":");
                            System.out.println("Coordinates: (" + x + "," + y + ")");
                            System.out.println("Region: E"  );
                            counter5+=1;
                    
                        }
                                            else if(x<5 && y>-5 && x>0 && y<0){
                        
                            System.out.println("Dart " + i + ":");
                            System.out.println("Coordinates: (" + x + "," + y + ")");
                            System.out.println("Region: F"  );
                            counter6+=1;
                    
                        }
                           else if (x<0 && y>0 && d1+d2>0 ) {
                     
                            System.out.println("Dart " + i + ":");
                            System.out.println("Coordinates: (" + x + "," + y + ")");
                            System.out.println("Region: G"  );
                            counter7+=1;
                    
                        }
                          else if (x+y==5 || x*y==0 || x==5 || y==5 || x>5 || y>5 || x<-5 || y<-5 || d1+d2==1) {
                                                         
            System.out.println("Undecided. ");
            counter8+=1;
                                                         }
        
                         else if ( x<0 && y<0 && x==y && x==-1 && x==-2 && x==-3 && x==-4 && x==-5 ) {
                                                        
            System.out.println("Undecided. ");
            counter9+=1;
                                                      }
        
                                                      
                                                     i++;
                                                            
                    
        }
        
        System.out.println("Region Statics:");
        System.out.println("A  " + counter1 + " dart (" + ((counter1*100)/(number)) + ".0%)");
        System.out.println("B  " + counter2 + " dart (" + ((counter2*100)/(number)) + ".0%)");
        System.out.println("C  " + counter3 + " dart (" + ((counter3*100)/(number)) + ".0%)");
        System.out.println("D  " + counter4 + " dart (" + ((counter4*100)/(number)) + ".0%)");
        System.out.println("E  " + counter5 + " dart (" + ((counter5*100)/(number)) + ".0%)");  
        System.out.println("F  " + counter6 + " dart (" + ((counter6*100)/(number)) + ".0%)");
        System.out.println("G  " + counter7 + " dart (" + ((counter7*100)/(number)) + ".0%)");
        System.out.println("Undecided:  " + (counter8+counter9)  + " dart (" + ((counter8+counter9)*100/number) + ".0%)");
        
    }
    
}
