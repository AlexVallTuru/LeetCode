import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeSubFoldersFilesystem {

    public static void main(String[] args) {
    
        System.out.println("Hello LeetCoder!!");
    
        removeSubFoldersFilesystem r = new removeSubFoldersFilesystem();

        List<String> result = r.removeSubfolders(new String[]{"/a","/a/b","/c/d","/c/d/e","/c/f"});

    }

    public List<String> removeSubfolders(String[] folder) {
    
        Arrays.sort(folder);
        
        List<String> result = new ArrayList<>();

        String lastfolder = "";
        
        for(String carpeta: folder) {
            if((!carpeta.startsWith(lastfolder + "/")) ||  lastfolder.equals("")){
                result.add(carpeta);
                lastfolder = carpeta;
            }
        }
        return result;
    }

}