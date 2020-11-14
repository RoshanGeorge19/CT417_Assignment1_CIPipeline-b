import org.joda.time.DateTime;

import com.cipipeline.*;
import com.cipipeline.Module;

public class MainDriverTest {
	public static void main(String[] args) {
		Student student_1 = new Student("MadaYehaf", "01-02-00", 21, 17672317);
		Student student_2 = new Student("DustinHoffman", "22-04-01", 20, 18154545);
		Student student_3 = new Student("LiamGrendwald", "12-06-00", 21, 14156846);
		Student student_4 = new Student("MarkRober", "09-07-02", 19, 00145574);
		Student student_5 = new Student("CiaraAxelrod", "13-02-00", 21, 44582269);
		
		Module module_1 = new Module("EE451");
		Module module_2 = new Module("CT417");
		Module module_3 = new Module("EE323");
		Module module_4 = new Module("EE220");
		Module module_5 = new Module("CT123");
		
		CourseProgramme course_1 = new CourseProgramme("BP", new DateTime("2019-09-01T00:00:00Z"), new DateTime("2020-05-01T00:00:00Z"));
		CourseProgramme course_2 = new CourseProgramme("BL", new DateTime("2019-09-01T00:00:00Z"), new DateTime("2020-05-01T00:00:00Z"));	
	}
}
