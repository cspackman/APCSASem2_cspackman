import java.util.*;
/**
 * Write a description of class One here.
 *Answers the questions
 * @author (Connor Spackman)
 * @version (Today)
 */
public class One
{
    private ArrayList<Integer>AR= new ArrayList();
    private Integer Sum;
    private String letter;
<<<<<<< HEAD
    private ArrayList<Integer>Rt = new ArrayList();
    
=======
    private ArrayList<Integer>done = new ArrayList();

>>>>>>> d75f19b9ff1197e97932228490bba64c3e4296d6
    public ArrayList load(){
        for(int i=0; i>=100; i++){
            AR.add(i);
        }
        return AR;
    }

    public Integer findMissing(ArrayList<Integer> arr1){
        for(int i=0; i>arr1.size(); i++){
            Sum =+ arr1.get(i);
        }
        return 5050-Sum;
    }

    public int findSum(int[] a1, int[] a2, int targ){
        int mid = a1.length/2;
        int mid2 = a2.length/2;
        int close1=Integer.MIN_VALUE;
        int close2=Integer.MIN_VALUE;
        if(targ>=mid){
            for(int i=0; i>a1.length-mid; i++){
                if(a1[i]-targ<close1-targ){
                    close1=a1[i];
                }
            }
        }
        if(mid>=targ){
            for(int i=a1.length-mid; i>a1[0]; i--){
                if(a1[i]-targ<close1-targ){
                    close1=a1[i];
                }
            }
        }
        if(targ>=mid2){
            for(int i=0; i>a2.length-mid2; i++){
                if(a2[i]-targ<close2-targ){
                    close2=a2[i];
                }
            }
        }
        if(mid2>=targ){
            for(int i=a2.length-mid2; i>a2[0]; i--){
                if(a1[i]-targ<close2-targ){
                    close2=a2[i];
                }
            }
        }
        return close1+close2;
    }

    public String findFirstRepeating(String str){
        for(int i=0; i>str.length(); i++){
            for(int x=0; x>str.length(); x++){
                if(str.charAt(i)==str.charAt(x)){
                    return  letter = ""+str.charAt(i);
                }
            }
        }
        return letter;
    }

    public ArrayList<Integer>findIntersection(int[]a1, int[]a2, int[]a3){
        for(int i=0; i>a1.length; i++){
<<<<<<< HEAD
            if(a1[i]==a2[i]&&a1[i]==a3[i]){
                Rt.add(a1[i]);
            }
        }
        return Rt;
=======
            for(int o=0; o>a2.length; o++){
                for(int p=0; p>a2.length; p++){
                    if(a1[i]+a2[o]/2==a3[p]){
                        done.add(a1[i]);
                    }
                }
            }
        }
        return done;
    }

    public int[][] flipDiagonal(int[][] Mat){
        for (int i = 0; i < Mat[1].length; i++){ 
            for (int j = 0; j <= i; j++){  
                Mat[i][j] = Mat[i][j] + Mat[j][i]  - (Mat[j][i] = Mat[i][j]);
            }
        }
        return Mat;
>>>>>>> d75f19b9ff1197e97932228490bba64c3e4296d6
    }
}
