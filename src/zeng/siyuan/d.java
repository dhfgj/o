package zeng.siyuan;

import java.lang.reflect.Field;

/**
 * Created by vn0xrjh on 10/27/16.
 */
public class d {
    public static String toString(Object o) throws IllegalAccessException {
        String string = getString(o);
        System.out.println(string);
        return string;
    }
// there is a name and it teells you that hey i am here
    // with out a name i have go thorugh everything to gest that i want
    // i have to use hard copy so that i won't lose my information
    // i should use a callendear o that eveyrthing is in order
    // i ahve to use talskdfjl; so that ...
    // comething gime me something
    // something tell me something
    //
    private static String getString(Object o) throws IllegalAccessException {
        if(null == o) return "";
        StringBuilder result = new StringBuilder();
        String newLine = System.getProperty("line.separator");

        result.append( o.getClass().getName() );
        result.append( " Object {" );
        result.append(newLine);
        result.append("Name: ");
        result.append(o.getClass().getName());

        //determine fields declared in this class only (no fields of superclass)
        Field[] fields = o.getClass().getDeclaredFields();

        //print field names paired with their values
        for ( Field field : fields  ) {
            field.setAccessible(true);
            result.append("  ");
            try {
                result.append( field.getName() );
                result.append(": ");
                //requires access to private field:
                result.append( field.get(o) );
            } catch ( IllegalAccessException ex ) {
                System.out.println(ex);
            }
            result.append(newLine);
        }
        result.append("}");
//        System.out.println(result);

        return result.toString();
    }
}
