import com.workintech.set.Task;
import com.workintech.set.TasksData;

public class Main {
    public static void main(String[] args) {
        TasksData tasksData= new TasksData();
        System.out.println(tasksData.getTasks("bob"));


    }
}