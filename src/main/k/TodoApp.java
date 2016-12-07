package main.k;

import org.apache.commons.io.FilenameUtils;
import zeng.siyuan.C1comehere.Beep;
import zeng.siyuan.reuseutil.r;

import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
//			File dir = new File();

			listAllFiles("C:\\Users\\SiyuanZeng's\\Music\\Canon");




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
					System.out.println(file.getAbsoluteFile());
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


			Thread a = new Thread(() -> {
				try {

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
                    solrBaseDAO.k(count, key,v);
                } catch (Exception e1) {
					System.out.print("nb");
                }
                count++;
            }
            System.out.println("stop");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			);
			a.start();

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
		try
		{
			Process p=Runtime.getRuntime().exec("cmd /c C:\\solr-6.2.0\\bin\\solr start");
			p.waitFor();
			BufferedReader reader=new BufferedReader(
					new InputStreamReader(p.getInputStream())
			);
			String line;
			while((line = reader.readLine()) != null)
			{
				System.out.println(line);
			}

		}
		catch(IOException e1) {}
		catch(InterruptedException e2) {}
		finally {

		}


		TodoApp.todo();
//		c1come2melater(null, null);
	}

	public static void todo() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		c1s();

		configureLookAndFeel();
		Iterator itr = prop.keySet().iterator();
		List<String> lists = new ArrayList<String>();
		while (itr.hasNext()) {
			lists.add((String) itr.next());
		}
		main.k.TodoList t = new main.k.TodoList(lists);
		MainWindow window = new MainWindow(t, prop);
		window.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				try {
					Process p = Runtime.getRuntime().exec("cmd /c C:\\solr-6.2.0\\bin\\solr stop -all");
					p.waitFor();
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(p.getInputStream())
					);
					String line;
					while ((line = reader.readLine()) != null) {
						System.out.println(line);
					}
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				} finally {

				}

			}
		});


		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JTextAreaExample(window, window.getNewTaskField(), null);
			}
		});

		window.getNewTaskField().addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {

			}

			// nobody know swhat he is doing
			public void keyPressed(KeyEvent e) {

				//                if (e.getModifiers() == KeyEvent.CTRL_MASK && e.getKeyChar() == KeyEvent.VK_ENTER) {
				//change maxc os mattping to ctrl and enter button
				if (e.getModifiers() == KeyEvent.CTRL_MASK && e.getKeyChar() == KeyEvent.VK_ENTER) {
					e.consume();
					Beep.sound(2000, 150);
					r.open(((String) (prop.get(window.getNewTaskField().getText().trim()))));
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

		});


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
