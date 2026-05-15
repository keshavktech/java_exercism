import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
         if(languages.size()==0)
             return true;
        return false;
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
        
    }

    public String firstLanguage() {
       return languages.get(0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {

        for(int i = 0 ; i < languages.size() ; i++)
            {
                if(languages.get(i)==language)
                    return true;
            }
        return false;
    }

    public boolean isExciting() {
     boolean j = false;
     boolean k = false;

        for(int i = 0 ; i < languages.size() ; i++)
            {
                if(languages.get(i)=="Java")
                    j = true;
                if(languages.get(i)=="Kotlin")
                    k = true;
                
            }
      return j||k;
            
    }
}
