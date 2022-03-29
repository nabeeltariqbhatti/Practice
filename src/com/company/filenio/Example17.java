package com.company.filenio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/27/2022
 * @Time at 4:26 PM
 */
public class Example17 {

    public static void main(String[] args) {
      try{

          Files.find(Path.of("."), 3, new BiPredicate<Path, BasicFileAttributes>() {
              @Override
              public boolean test(Path path, BasicFileAttributes basicFileAttributes) {
                  return basicFileAttributes.size()<100;
              }
          }).forEach(new Consumer<Path>() {
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
