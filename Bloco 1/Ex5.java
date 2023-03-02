import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) throws IOException{
        
        Path path=Paths.get("numbers.txt");
        long coun = Files.lines(path).count();
        int count=Long.valueOf(coun).intValue();
        List<String> lines = Files.readAllLines(path); 
        String[] numbers=new String[count];
        String[] num=new String[count];
        int i=0;
        int nfinal=0;
        int ff=0;
        String aa=" ";


        for (String line: lines){
            String[] lineWords = line.split(" - ");
            numbers[i]=lineWords[0];
            num[i]=lineWords[1];
            i++;        
        } 

        for(int a=0;a<args.length;a++){
            if(args[a]=="and"){
                continue;
            }
            for(int n=0;n<num.length-3;n++){
                if(args[a].equals(num[n])){
                    aa=num[n];
                    ff=Integer.parseInt(numbers[n]);
                }
            }   
            if(a!=0){
                if(args[a-1].equals(aa)){
                    for(int las=num.length-4;las<num.length;las++){
                        if(args[a].equals(num[las])){
                            int fff=Integer.parseInt(numbers[las]);
                                ff=ff*fff;
                            }
                        }
                        // if(args[a].equals(num[28])){
                        //     for(int la=num.length-3;la<num.length;la++){
                        //         if(args[a+1].equals(num[la])){
                        //             int ffff=Integer.parseInt(numbers[la]);
                        //             meiof=meiof*ffff;
                        //             a++;
                        //         }
                        //     }
                        // }
                        // if(args[a+1].equals(num[29])){
                        //     if(args[a+2].equals(num[30])){
                        //         int fffff=Integer.parseInt(numbers[30]);
                        //         ff=ff*fffff;
                        //         a++;
                        //     }
                        // } 
                    }
            }
            nfinal+=ff;
            ff=0;
        }

        System.out.println(nfinal);
    }
}