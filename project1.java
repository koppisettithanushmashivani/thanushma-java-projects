import java.util.Scanner;
public class project1 {
    public static void main(String[] args) {
        
                int BEE=66;
                int EDC=71;
                int C_LANG=82;
                double YEAR1_RESULT=(BEE+EDC+C_LANG)/300d*100;
                int EWS=90;
                int PHY=60;
                int M_1=83;
                double YEAR2_RESULT=(EWS+PHY+M_1)/300d*100;
                int CVTT=52;
                int EMTL=86;
                int SSP=67;
                double YEAR3_RESULT=(CVTT+EMTL+SSP)/300d*100;
                int DSP=77;
                int VLSI=92;
                int CS=49;
                double YEAR4_RESULT=(DSP+VLSI+CS)/300d*100;
                System.out.println("enter the year number to get result: ");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        switch(i){
            case 1:
            System.out.println("year 1 marks:");
            int k=sc.nextInt();
            if(k==1){
               
                System.out.println("BEE: "+BEE);
                System.out.println("EDC: "+EDC);
                System.out.println("C_LANG: "+C_LANG);
                System.out.println("YEAR1_RESULT: "+YEAR1_RESULT);

            }
            break;
            case 2 :
            System.out.println("year 2 marks:");
            int l=sc.nextInt();
            if(l==1){
               
               System.out.println("EWS: "+EWS);
               System.out.println("PHY: "+PHY);
               System.out.println("M_1: "+M_1);
               System.out.println("YEAR2_RESULT: "+YEAR2_RESULT);
            }
            break;
            case 3:
            System.out.println("year 3 marks:");
            int m=sc.nextInt();
            if (m==1) {
                
                System.out.println("CVTT: "+CVTT);
                System.out.println("EMTL: "+EMTL);
                System.out.println("SSP: "+SSP);
                System.out.println("YEAR3_RESULT: "+YEAR3_RESULT);

                
            }
            break;
            case 4:
            System.out.println("year 4 marks:");
            int n=sc.nextInt();
            if (n==1) {
               
                System.out.println("DSP: "+DSP);
                System.out.println("VLSI: "+VLSI);
                System.out.println("CS: "+CS);
                System.out.println("YEAR4_RESULT: "+YEAR4_RESULT);
                
            }
            break;
            case 5:
            System.out.println("overall grade");
            int o=sc.nextInt();
            if(o==1){
                double OVERALL_GRADE=(YEAR1_RESULT+YEAR2_RESULT+YEAR3_RESULT+YEAR4_RESULT)/4;
                System.out.println("OVERALL_GRADE: "+OVERALL_GRADE);
            }
            break;
            default:
            System.out.println("details not found");
        }
        sc.close();
    }
}

 

