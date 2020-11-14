/*
 * Author: Roshan George
 * Date: 14/11/2020
 * Description: Main test class. Has dummy students, modules, and courses. 
 * 				Tests the functionality of classes. Student/Module/CourseProgramme
 * 				classes imported as a dependency through JitPack.
 */

package com.cipipelineb;

import org.joda.time.DateTime;

import com.cipipeline.*;
import com.cipipeline.Module;

public class MainDriverTest {
	public static void main(String[] args) {
		// Creating mock students
		Student student_1 = new Student("MadaYehaf", "01-02-00", 21, 17672317);
		Student student_2 = new Student("DustinHoffman", "22-04-01", 20, 18154545);
		Student student_3 = new Student("LiamGrendwald", "12-06-00", 21, 14156846);
		Student student_4 = new Student("MarkRober", "09-07-02", 19, 00145574);
		Student student_5 = new Student("CiaraAxelrod", "13-02-00", 21, 44582269);

		// Creating mock modules
		Module module_1 = new Module("EE451");
		Module module_2 = new Module("CT417");
		Module module_3 = new Module("EE323");
		Module module_4 = new Module("EE220");
		Module module_5 = new Module("CT123");

		// Creating mock courses
		CourseProgramme course_1 = new CourseProgramme("BP", new DateTime("2019-09-01T00:00:00Z"),
				new DateTime("2020-05-01T00:00:00Z"));
		CourseProgramme course_2 = new CourseProgramme("BL", new DateTime("2019-09-01T00:00:00Z"),
				new DateTime("2020-05-01T00:00:00Z"));

		// Adding modules to a course
		course_1.addModuleCourse(module_1);
		course_1.addModuleCourse(module_2);
		course_1.addModuleCourse(module_3);
		course_1.addModuleCourse(module_4);

		course_2.addModuleCourse(module_1);
		course_2.addModuleCourse(module_3);
		course_2.addModuleCourse(module_4);
		course_2.addModuleCourse(module_5);

		// Adding students to a course
		course_1.addStudentCourse(student_1);
		course_1.addStudentCourse(student_2);
		course_1.addStudentCourse(student_3);

		course_2.addStudentCourse(student_4);
		course_2.addStudentCourse(student_5);

		// Adding students to modules
		module_1.addStudentModule(student_1);
		module_1.addStudentModule(student_2);
		module_1.addStudentModule(student_3);
		module_2.addStudentModule(student_1);
		module_2.addStudentModule(student_2);
		module_2.addStudentModule(student_3);
		module_3.addStudentModule(student_1);
		module_3.addStudentModule(student_2);
		module_3.addStudentModule(student_3);
		module_4.addStudentModule(student_1);
		module_4.addStudentModule(student_2);
		module_4.addStudentModule(student_3);

		module_1.addStudentModule(student_4);
		module_1.addStudentModule(student_5);
		module_3.addStudentModule(student_4);
		module_3.addStudentModule(student_5);
		module_4.addStudentModule(student_4);
		module_4.addStudentModule(student_5);
		module_5.addStudentModule(student_4);
		module_5.addStudentModule(student_5);

		// Printing out results.
		System.out.println(course_1.toString());
		System.out.println("*********************************");
		System.out.println(course_2.toString());

	}
}
