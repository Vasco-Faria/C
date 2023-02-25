//COmpiladores

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ex4 {
    public static void main(String args[]) throws IOException {
        Path path=Paths.get("numbers.txt");
        long coun = Files.lines(path).count();
        int count=Long.valueOf(coun).intValue();
        List<String> lines = Files.readAllLines(path); 
        String[] numbers=new String[count];
        String[] num=new String[count];
        int i=0;
        int c=0;
        int cnt=0;
        String[] finalnumbers=new String[args.length+args.length];


        for (String line: lines){
            String[] lineWords = line.split(" - ");
            numbers[i]=lineWords[0];
            num[i]=lineWords[1];
            i++;        
        } 


        if(args.length<5){
            System.err.println("Invalid Input");
        }


        boolean ways2=false;
        for(int a=4;a<args.length;a++){
            for(int v=0;v<args[a].length();v++){
                if(args[a].charAt(v)=='-'){
                    ways2=true;
                    break;
                }
            }
            if(ways2==false){
                for (int j=0;j<num.length;j++){
                    if(args[a].equals(num[j])){
                        finalnumbers[c]=numbers[j];
                        cnt++;
                        c++;
                    }
                }
            }else{
                String[] narg=args[a].split("-");
                for (String ar:narg){
                    for (int j=0;j<num.length;j++){
                        if (ar.equals(num[j])){
                            finalnumbers[c]=numbers[j];
                            cnt++;
                            c++;
                        }
                    }
                }
            }
        }

        String[] finalnumbers2=new String[cnt];

        for(int comp=0;comp<finalnumbers2.length;comp++){
            finalnumbers2[comp]=finalnumbers[comp];

        }
        System.out.print("A list of numbers: ");
        for(int b=0;b<finalnumbers2.length;b++){
            if(b==finalnumbers2.length-1){
                System.out.println(finalnumbers2[b]);
            }else{
                System.out.print(finalnumbers2[b]+" ");
            }

        }

        
    }
}
