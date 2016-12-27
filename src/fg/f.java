/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fg;

//Imports

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import main.k.TodoApp;
import zeng.siyuan.C1comehere.ListFilesUtil;
import zeng.siyuan.reuseutil.r;

import javax.swing.*;
import java.io.IOException;


/**
 *
 * @author ex094
 */
public class f {
    public static void a() throws IOException {
        //Configuration Object
        Configuration configuration = new Configuration();

        // Set path to the acoustic model.
        configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        // Set path to the dictionary.
        configuration.setDictionaryPath("file:C:\\Development_Base\\maxcox\\maxcox-master\\src\\fg\\7707.dic");
        // Set path to the language model.
        configuration.setLanguageModelPath("file:C:\\Development_Base\\maxcox\\maxcox-master\\src\\fg\\7707.lm");
        
        //Recognizer object, Pass the Configuration object
        LiveSpeechRecognizer recognize = new LiveSpeechRecognizer(configuration);
        
        //Start Recognition Process (The bool parameter clears the previous cache if true)
        recognize.startRecognition(true);
        
        //Creating SpeechResult object
        SpeechResult result;
        
        //Check if recognizer recognized the speech
        while ((result = recognize.getResult()) != null) {
            
            //Get the recognized speech
            String command = result.getHypothesis();
            String work = null;
            Process p;


//            System.out.println("djlfkadsjf   " +command);

            //Some Extra Commands from my Corpus File
            if(command.equalsIgnoreCase("open search")) {
                work = "google-chrome http://www.google.com";
                break;
            } else if (command.equalsIgnoreCase("new tab")) {
                work = "google-chrome \\c";
            break;}

            else if (command.equalsIgnoreCase("mail")) {
                r.o("https://outlook.live.com/owa/");
                break;}
            else if (command.equalsIgnoreCase("open mail")) {
                r.o("https://outlook.live.com/owa/");
                break;}
            else if (command.equalsIgnoreCase("hey computer mail")) {
                r.o("https://outlook.live.com/owa/");
                break;}

            else if (command.equalsIgnoreCase("hey computer hang out")) {
                r.o("https://hangouts.google.com/");
                break;}
            else if (command.equalsIgnoreCase("hey computer let's work")) {
                r.o("https://hangouts.google.com/");
                r.o("https://onedrive.live.com/edit.aspx?cid=6a74652c5386c5a5&page=view&resid=6A74652C5386C5A5!9569&parId=6A74652C5386C5A5!114&app=Word");


                break;}
            else if (command.equalsIgnoreCase("work")) {
                r.o("https://hangouts.google.com/");
                r.o("https://onedrive.live.com/edit.aspx?cid=6a74652c5386c5a5&page=view&resid=6A74652C5386C5A5!9569&parId=6A74652C5386C5A5!114&app=Word");


                break;}
            else if (command.equalsIgnoreCase("hang out")) {
                r.o("https://hangouts.google.com/");
                break;}


            else if (command.equalsIgnoreCase("hey open mail")) {
                r.o("https://outlook.live.com/owa/");
                break;}

            else if (command.equalsIgnoreCase("open linked in")) {
                work = "google-chrome linkedin.com";
                break;}

            else if (command.equalsIgnoreCase("open blog")) {
                work = "google-chrome procurity.wordpress.com";



                break;}
                else if (command.equalsIgnoreCase("open git hub")) {
                r.o("https://github.com/SiyuanZeng");
                break;}

            else if (command.equalsIgnoreCase("hey git hub")) {
                r.o("https://github.com/SiyuanZeng");
                break;}

            else if (command.equalsIgnoreCase("open computer git hub")) {
                r.o("https://github.com/SiyuanZeng");
                break;}
            else if (command.equalsIgnoreCase("open computer one drive")) {
                r.o("https://onedrive.live.com/?id=root&cid=6A74652C5386C5A5");
                break;}
            else if (command.equalsIgnoreCase("open computer data model")) {
                r.o("http://www.speech.cs.cmu.edu/tools/lmtool-new.html");
                break;}


            else if (command.equalsIgnoreCase("browser")) {
                r.o("http://www.yahoo.com");
                break;}

            else if (command.equalsIgnoreCase("hey computer bing")) {
                r.o("http://www.bing.com");
                break;}

            else if (command.equalsIgnoreCase("hey bing")) {
                r.o("http://www.bing.com");
                break;}

            else if (command.equalsIgnoreCase("bing")) {
                r.o("http://www.bing.com");
                break;}

            else if (command.equalsIgnoreCase("hey computer browser")) {
                r.o("http://www.yahoo.com");
                break;}

            else if (command.equalsIgnoreCase("hey computer open browser")) {
                r.o("http://www.yahoo.com");
                break;}

            else if (command.equalsIgnoreCase("hey computer music")) {
                try {
                    TodoApp.dkk();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
                break;}

            else if (command.equalsIgnoreCase("hey computer play music")) {
                try {
                    TodoApp.dkk();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
                break;}

            else if (command.equalsIgnoreCase("hey lap top play music")) {
                try {
                    TodoApp.dkk();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
                break;}

            else if (command.equalsIgnoreCase("hey lap top music")) {
                try {
                    TodoApp.dkk();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
                break;}

            else if (command.equalsIgnoreCase("lap top music")) {
                try {
                    TodoApp.dkk();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
                break;}

            else if (command.equalsIgnoreCase("hey computer play movie")) {
                    ListFilesUtil.pss("C:\\Users\\SiyuanZeng's\\Videos\\Movie");
                break;}

            else if (command.equalsIgnoreCase("hey computer movie")) {
                    ListFilesUtil.pss("C:\\Users\\SiyuanZeng's\\Videos\\Movie");
                break;}

            else if (command.equalsIgnoreCase("movie")) {
                    ListFilesUtil.pss("C:\\Users\\SiyuanZeng's\\Videos\\Movie");
                break;}


            else if (command.equalsIgnoreCase("music")) {
                try {
                    TodoApp.dkk();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
                break;}
            else if (command.equalsIgnoreCase("play music")) {
                try {
                    TodoApp.dkk();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }break;}
            else if (command.equalsIgnoreCase("terminal")) {
                work = "gnome-terminal";
                break;}
            else if (command.equalsIgnoreCase("file manager")) {
                work = "nautilus";
                break;}

            if(work != null) {
                p = Runtime.getRuntime().exec(work);
            }
        }
        
    }
    
}
