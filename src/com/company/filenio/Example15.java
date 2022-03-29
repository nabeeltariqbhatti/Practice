package com.company.filenio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/27/2022
 * @Time at 4:26 PM
 */
public class Example15 {

    public static void main(String[] args) {
      try{

          Files.list(Path.of(".")).filter(p->p.toString().endsWith("txt")).forEach(new Consumer<Path>() {
              @Override
              public void accept(Path path) {
                  System.out.println(path);
              }
          });
      }catch (Exception e){
          e.printStackTrace();
      }

    }
}
