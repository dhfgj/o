import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;



public class EnumerateWindows {
    private static final int MAX_TITLE_LENGTH = 1024;

    public static void main(String[] args) throws Exception {

        while (true) {
            Thread.sleep(500);
            char[] buffer = new char[MAX_TITLE_LENGTH * 2];
            User32DLL.GetWindowTextW(User32DLL.GetForegroundWindow(), buffer, MAX_TITLE_LENGTH);
//            System.out.println("Active window title: " + Native.toString(buffer));

            PointerByReference pointer = new PointerByReference();
            User32DLL.GetWindowThreadProcessId(User32DLL.GetForegroundWindow(), pointer);
            Pointer process = Kernel32.OpenProcess(Kernel32.PROCESS_QUERY_INFORMATION | Kernel32.PROCESS_VM_READ, false, pointer.getValue());
            Psapi.GetModuleBaseNameW(process, null, buffer, MAX_TITLE_LENGTH);
//            System.out.println("Active window process: " + Native.toString(buffer));
        }
    }

}