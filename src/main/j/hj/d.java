package main.j.hj;

import main.k.MainWindow;
import org.apache.commons.io.FilenameUtils;
import zeng.siyuan.reuseutil.r;
import zeng.siyuan.solr.test.param.dao.SolrDataDAO;

import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import java.io.*;
import java.util.*;

public class d {
	public static transient Properties prop;


	public static void c1come2melater(String c1, String c1Path) {
		c1s();
		OutputStream output = null;
		OutputStream output_solr = null;
		try {
			output = new FileOutputStream("C:\\Development_Base\\maxcox\\maxcox-master\\src\\main\\j\\resources\\c1s.properties");

//				File directory = new File("C:\\Users\\SiyuanZeng's\\Videos\\Movie\\Xu Wei");
				//get all the files from a directory
//				File[] fList = directory.listFiles();

			String[] extensions = new String[] {
					"3G2",
					"3GP",
					"ASF",
					"AVI",
					"FLV",
					"M4V",
					"MOV",
					"MP4",
					"MPG",
					"RM",
					"SRT",
					"SWF",
					"VOB",
					"WMV",
					"AIF",
					"IFF",
					"M3U",
					"M4A",
					"MID",
					"MP3",
					"MPA",
					"VOB",
					"WAV",
					"WMA"

			};


			SolrDataDAO solrBaseDAO = null;
			try {
				solrBaseDAO = new SolrDataDAO();
			} catch (Exception e) {
				e.printStackTrace();
			}


			int count =1 + solrBaseDAO.kpp(1, null, null);
//            for (Map.Entry<Object, Object> e : p.entrySet()) {
//                System.out.println(count);
//                String key = ((String) e.getKey()).replace("%20", " ");
//                String v = (String) e.getValue();
			try {
				solrBaseDAO.addData(count, c1,c1Path);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			count++;
//            }
//			System.out.println("stop");

//			File dir = new File();

			listAllFiles("C:\\Users\\SiyuanZeng's\\Music\\Canon");




			// save properties to project root folder
			prop.store(output, null);






//			output_solr = new FileOutputStream("/Users/vn0xrjh/daniel/14_GUIcopymacosx/c1comehere/c1s.properties.solr");

//			int count = 0;
//			for (Map.Entry<Object, Object> e : p.entrySet()) {
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
		} catch (Exception e) {
			e.printStackTrace();
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


	public static void listAllFiles(String path) {
		File root = new File(path);
		File[] list = root.listFiles();
		if (list != null) {  // In case of access error, list is null
			for (File file : list) {
				if (file.isDirectory()) {
					listAllFiles(file.getAbsolutePath());
				} else {
					String ext1 = FilenameUtils.getExtension(file.getAbsolutePath());
					boolean f = !ext1.equalsIgnoreCase("jpg") &&
					!ext1.equalsIgnoreCase("txt") &&
					!ext1.equalsIgnoreCase("ini") &&
					!ext1.equalsIgnoreCase("lrc");
							if (file.isFile() && f) {
							String c1 = file.getName().replace(" ", "%20");
							// set the properties value
							prop.setProperty(c1, file.getAbsolutePath());
//					System.out.println(file.getAbsoluteFile());
						}
					}

				}
			}
	}




	public static void c1s() {
		prop = new Properties();
		Properties temprop = new Properties();
		InputStream input = null;

		try {
			input = new FileInputStream("C:\\Development_Base\\maxcox\\maxcox-master\\src\\main\\j\\resources\\c1s.properties");
			// fjlasdjfl a properties file
			temprop.load(input);


			for (Map.Entry<Object, Object> e : temprop.entrySet()) {
				String key = ((String) e.getKey()).replace("%20", " ");
				String v = (String) e.getValue();
				prop.put(key, v);
			}
//			System.out.println("Done Propertiesy loading");

///*
            SolrDataDAO solrBaseDAO = null;
            try {
                solrBaseDAO = new SolrDataDAO();
            } catch (Exception e) {
                e.printStackTrace();
            }


            int count =1;
                count =1 + solrBaseDAO.kpp(1, null, null);
            for (Map.Entry<Object, Object> e : prop.entrySet()) {

//            for (Map.Entry<Object, Object> e : p.entrySet()) {
//                System.out.println(count);
                String key = ((String) e.getKey()).replace("%20", " ");
                String v = (String) e.getValue();
                try {
                    solrBaseDAO.addData(count, key,v);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                count++;
//                System.out.println(count);
//  }
//                System.out.println("stop");

            }
//            System.out.println("stop");

//*/



		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (Exception e) {
            e.printStackTrace();
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
		d.d();
		c1come2melater(null, null);
	}

	public static void d() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		c1s();

		configureLookAndFeel();
		Iterator itr = prop.keySet().iterator();
		List<String> lists = new ArrayList<String>();
		while(itr.hasNext()) {
			lists.add((String) itr.next());
		}
		main.k.TodoList t = new main.k.TodoList(lists);
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
