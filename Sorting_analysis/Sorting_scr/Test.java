import java.io.*;

public class Test {
    

    	 public static void main(String[] args) {

    	        String csvFile = "/home/karthik/workspace/Sorting_analysis/Sorting_scr/IRIS.csv";
    	        BufferedReader br = null;
    	        String line = "";
    	        String cvsSplitBy = ",";

    	        try {

    	            br = new BufferedReader(new FileReader(csvFile));
    	            while ((line = br.readLine()) != null) {

    	               // We can use this later during data analysis
    	                String[] country = line.split(cvsSplitBy);

    	                System.out.println(line);

    	            }

    	        } 
    	        
    	        catch (FileNotFoundException e) {
    	            e.printStackTrace();
    	        }
    	        
    	        catch (IOException e) {
    	            e.printStackTrace();
    	        } 
    	        finally {
    	            if (br != null) {
    	                try {
    	                    br.close();
    	                } catch (IOException e) {
    	                    e.printStackTrace();
    	                }
    	            }
    	        }

    	    }
}


