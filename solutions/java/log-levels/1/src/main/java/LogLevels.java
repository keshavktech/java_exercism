public class LogLevels {
    
    public static String message(String logLine) {

        String content = logLine.split(":")[1];
        return content.trim();
    }

     public static String logLevel(String logLine) {
        String header = logLine.split(":")[0];
        return header.trim().replace("[","").replace("]","").toLowerCase();
     }

     public static String reformat(String logLine) { 
         String content = message(logLine);
         String header = logLevel(logLine);
         return content + " " +"("+header+")";
     }
}
