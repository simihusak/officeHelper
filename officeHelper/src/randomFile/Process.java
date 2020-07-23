package randomFile;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Process {

	public static void run(String path) {
    	Path paths = Paths.get(path);
    	try {
    		Stream<Path> walk = Files.walk(paths);
    		List<String> result = walk.filter(Files:: isRegularFile).map(x->x.toString()).collect(Collectors.toList());

    		String[] resultInList = new String[result.size()];
    		result.toArray(resultInList);
    		
    		double x = (Math.random() * ((resultInList.length - 0) + 1)) + 0;
    		int y = (int) x;
    		System.out.println(resultInList[y]);
    		String file = resultInList[y];
    		play(file);
    		
    	} catch(Exception e){
    		System.out.println("Instert true folder path!");
    	}
    }
    public static void play(String pathfile) {
    	File file = new File(pathfile);   
    	Desktop desktop = Desktop.getDesktop(); 
    	try {
			desktop.open(file);
		} catch (IOException e) {
			System.out.println("Instert true folder path!");
		} 
    }

}
