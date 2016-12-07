//package test;
//
//import com.datastax.driver.core.Session;
//
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Time;
//
//
//class Test implements Comparable{
//
//
//    int id;
//
//
//    Test(int id){
//
//
//        this.id = id;
//
//
//    }
//
//
//    public static void main(String[] args) {
//        Button button = new Button();
//
//
//
//
//
//
//        button.addActionListener(new ActionListener() {
//
//
//            public void actionPerformed(ActionEvent ae) {
//
//
//                CD cd = new CD(artistField.getText(),
//
//
//                        titleField.getText(),
//
//
//                new Date(),
//
//
//                Double.parseDouble(costField.getText()));
//
//
//                listModel.addCD(cd);
//
//
//                try {
//
//
//                    Session session = sessionFactory.openSession();
//
//
//                    session.save(cd);
//
//
//                    session.flush();
//
//
//                    session.close();
//
//
//                }
//
//
//    catch (Exception e) {
//
//
//                    e.printStackTrace();
//
//
//                }
//
//
//                IDLabel.setText("");
//
//
//                titleField.setText("");
//
//
//                artistField.setText("");
//
//
//                costField.setText("");
//
//
//            }
//
//
//        });
//
//
//    }
//
//}