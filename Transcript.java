package chatserver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Transcript {
    private List<String> transcript = Collections.synchronizedList(new ArrayList<String>());
    private List<String> currentlyLogged = Collections.synchronizedList(new ArrayList<String>());
    
    public Transcript() {
        
    }

    public void addToCurrentlyLogged(String handle){
        currentlyLogged.add(handle);
    }

    public void addComment(String comment) {
        transcript.add(comment);
    }

    public int getSize() {
        return transcript.size();
    }

    public String getComment(int n) {
        return transcript.get(n);
    }

    public String getUsers(){
        String people="";
        StringBuilder sb = new StringBuilder(people);
        for (int i = 0; i < currentlyLogged.size(); i++) {
            sb.append((currentlyLogged.get(i)+" "));
        }
        return sb.toString();
    }
}
