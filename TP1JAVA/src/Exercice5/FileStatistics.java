package Exercice5;

import java.io.*;

public class FileStatistics {
    private String filename;
    public FileStatistics(String filename){
        this.filename= filename;
    }
    public int getWordCount(){
        int i=0;
        File f=new File(filename);
        try{
            BufferedReader reader = new BufferedReader(new FileReader (f));
            String line =reader.readLine();
            while (line !=null){
                String[] wrds=line.split(("[\\n \\r \\f \\s!?.:]+"));
                i=i+wrds.length;
               line=reader.readLine();
            }

        }catch(Exception e){e.printStackTrace();}
        return i;
    }
    public int getParagraphCount(){

        int i=0;
        File f = new File(filename);
        try{
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String line = reader.readLine();
            while(line!=null){
                i++;
                line=reader.readLine();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return i;
    }
    public int getSentenceCount(){
        int i=0;
        try{
            File f = new File(filename);
            BufferedReader reader= new BufferedReader( new FileReader(f));
            String line = reader.readLine();
            while(line!=null){

                String[] sntnce= line.split("[.]+");
                i=i+sntnce.length;
            }


        }catch(Exception e ){e.printStackTrace();}
        return  i;
    }
    public int getCharCount(){
        int i=0;
        try{
            File f = new File(filename);
            BufferedReader reader= new BufferedReader( new FileReader(f));
            String line = reader.readLine();
            while(line!=null){

                String[] s= line.split("[\\s\\r\\n.,:;?!]");
                for( String str :s ){
                    i+=str.toCharArray().length;
                }
                line=reader.readLine();
            }


        }catch(Exception e ){e.printStackTrace();}
        return  i;
    }

}
