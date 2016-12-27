
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.QueryBuilder;

import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) {
//        System.out.println("======= Hello MongoDB ========");

        try {

//            System.out.println("======= Hello MongoDB : FIND ALL ========");
            DBCursor employees = MongoDbHelper.getInstance().findAll("employees");
            try {
                while (employees.hasNext()) {
                    DBObject employee = employees.next();
//                    System.out.println(employee);
                }
            } finally {
                employees.close();
            }


//            System.out.println("======= Hello MongoDB : DROP ========");
            MongoDbHelper.getInstance().dropCollection("employees");

            // Add documents
//            System.out.println("======= Hello MongoDB : ADD ========");
            DBObject employee1 = new BasicDBObject().append("firstname", "Akalanka").append("lastname", "Senevirathne");
            MongoDbHelper.getInstance().insertDocument("employees", employee1);

            DBObject employee2 = new BasicDBObject().append("firstname", "Ruwan").append("lastname", "Samaraweera");
            MongoDbHelper.getInstance().insertDocument("employees", employee2);

            DBObject employee3 = new BasicDBObject().append("firstname", "Anushka").append("lastname", "Rajapaksha");
            MongoDbHelper.getInstance().insertDocument("employees", employee3);

            DBObject employee4 = new BasicDBObject().append("firstname", "Anushka").append("lastname", "Liyanage");
            MongoDbHelper.getInstance().insertDocument("employees", employee4);

            // Find documents
//            System.out.println("======= Hello MongoDB : FIND ONE ========");
            DBObject document = MongoDbHelper.getInstance().findOne("employees");
//            System.out.println(document);

//            System.out.println("======= Hello MongoDB : FIND ALL ========");
            employees = MongoDbHelper.getInstance().findAll("employees");
            try {
                while (employees.hasNext()) {
                    DBObject employee = employees.next();
//                    System.out.println(employee);
                }
            } finally {
                employees.close();
            }
//            System.out.println("======= Hello MongoDB : COUNT ========");
            long employeeCount = MongoDbHelper.getInstance().count("employees");
//            System.out.println("Employee count : " + employeeCount);

//            System.out.println("======= Hello MongoDB : FIND BY CRITERIA ========");
//            DBObject query = new BasicDBObject("firstname", "Anushka");
            // another way to create query using QueryBuilder
            QueryBuilder query = QueryBuilder.start("firstname").is("Anushka");
//            DBCursor employeesByCriteria = MongoDbHelper.getInstance().findByCriteria("employees", query);
            DBCursor employeesByCriteria = MongoDbHelper.getInstance().findByCriteria("employees", query.get());
            try {
                while (employeesByCriteria.hasNext()) {
                    DBObject employee = employeesByCriteria.next();
//                    System.out.println(employee);
                }
            } finally {
                employeesByCriteria.close();
            }

            // Update documents
//            System.out.println("Ruwan before update : " + MongoDbHelper.getInstance().findOne("employees",
                    new BasicDBObject("firstname", "Ruwan")));
            MongoDbHelper.getInstance().updateDocument("employees", new BasicDBObject("firstname", "Ruwan"),
                    new BasicDBObject("age", 51));
//            System.out.println("Ruwan after update : " + MongoDbHelper.getInstance().findOne("employees",
                    new BasicDBObject("firstname", "Ruwan")));

            // Remove documents
//            employeeCount = MongoDbHelper.getInstance().count("employees");
//            System.out.println("Employee count before remove : " + employeeCount);
//            QueryBuilder query2 = QueryBuilder.start("firstname").is("Anushka");
//            MongoDbHelper.getInstance().removeDocument("employees", query2.get());
//            employeeCount = MongoDbHelper.getInstance().count("employees");
//            System.out.println("Employee count after remove : " + employeeCount);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
