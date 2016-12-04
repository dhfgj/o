package main.core;

import zeng.siyuan.reuseutil.r;

import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import java.io.*;
import java.util.*;

public class TodoApp {
	public static transient Properties prop;


	public static void c1come2melater(String c1, String c1Path) {
		c1s();
		OutputStream output = null;
		OutputStream output_solr = null;
		try {
			output = new FileOutputStream("C:\\Development_Base\\maxcox\\maxcox-master\\src\\main\\resources\\c1s.properties");

				File directory = new File("C:\\Users\\SiyuanZeng's\\Videos\\Movie\\Xu Wei");
				//get all the files from a directory
				File[] fList = directory.listFiles();
				for (File file : fList){
					if (file.isFile()){
						c1 = file.getName().replace(" ", "%20");
						System.out.println("c1come2melater();");
						// set the properties value
						prop.setProperty(c1, file.getAbsolutePath());
					}
				}


			// save properties to project root folder
			prop.store(output, null);






//			output_solr = new FileOutputStream("/Users/vn0xrjh/daniel/14_GUIcopymacosx/c1comehere/c1s.properties.solr");

//			int count = 0;
//			for (Map.Entry<Object, Object> e : prop.entrySet()) {
//				String key = ((String) e.getKey()).replace("%20", " ");
//				String v = (String) e.getValue();
//				output_solr.write(String.valueOf(count).getBytes());
//				output_solr.write(',');
//				output_solr.write(key.getBytes());
//				output_solr.write(',');
//				output_solr.write(v.getBytes());
//				output_solr.write(System.getProperty("line.separator").getBytes());
//				count++;
//			}
//
			c1s();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
					output_solr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}



	public static void c1s() {
		prop = new Properties();
		Properties temprop = new Properties();
		InputStream input = null;

		try {
			input = new FileInputStream("C:\\Development_Base\\maxcox\\maxcox-master\\src\\main\\resources\\c1s.properties");
			// fjlasdjfl a properties file
			temprop.load(input);


			for (Map.Entry<Object, Object> e : temprop.entrySet()) {
				String key = ((String) e.getKey()).replace("%20", " ");
				String v = (String) e.getValue();
				prop.put(key, v);
			}
			System.out.println("Done Propertiesy loading");

/*
            SolrDataDAO solrBaseDAO = null;
            try {
                solrBaseDAO = new SolrDataDAO();
            } catch (Exception e) {
                e.printStackTrace();
            }


            int count =1;
            for (Map.Entry<Object, Object> e : prop.entrySet()) {
                System.out.println(count);
                String key = ((String) e.getKey()).replace("%20", " ");
                String v = (String) e.getValue();
                try {
                    solrBaseDAO.addData(count, key,v);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                count++;
            }
            System.out.println("stop");

*/



		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
//		TodoApp.todo();
		c1come2melater(null, null);
	}

	public static void todo() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		c1s();

		configureLookAndFeel();
		Iterator itr = prop.keySet().iterator();
		List<String> lists = new ArrayList<String>();
		while(itr.hasNext()) {
			lists.add((String) itr.next());
		}
		main.core.TodoList t = new main.core.TodoList(lists);
		MainWindow window = new MainWindow(t, prop);
		window.setLocationRelativeTo( null );
		window.setVisible(true);
	}

	public static void dkk() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		c1s();

		Iterator itr = prop.keySet().iterator();
		List<String> lists = new ArrayList<String>();
		while(itr.hasNext()) {
			lists.add((String) itr.next());
		}

		Random random = new Random();
		String s = lists.get(r.randInt(0,lists.size()-1));
		r.open((String) prop.get(s));
	}

	private static void configureLookAndFeel() {
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("GTK+".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break; //preferred!
		        }
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		        }
		    }
		} catch (Exception e) {}
	}
}
