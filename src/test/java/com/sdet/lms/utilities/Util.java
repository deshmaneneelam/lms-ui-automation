package com.sdet.lms.utilities;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Util {

	public static final long PAGE_LOAD_TIMEOUT = 20;
	public static final long IMPLICIT_WAIT = 20;
	public static final String TITLE = "LMS";
	public static final String SEARCH_TEXT = "Search...";
	public static final String IN_TOTAL_STR1 = "In total there are ";
	public static final String IN_TOTAL_STR2 = " programs.";

	public static final String IN_TOTAL_STR3 = "assignments.";

	public static final String CHECK_HIGHLIGHT = "p-highlight";
	public static final String CONFIRM_ALERT = "Confirm";
	public static final String DELETE_SUCCESS_MSG = "Successful Program Deleted";
	public static final String LOGIN_HEADING = "Please login to LMS application";
	public static final String SUCCESS_STR = "Successful";
	public static final String DELETE_MULTIPLE_MSG = "Successful Programs Deleted";

	public static boolean isAlphaNumeric(String s) {
		return s != null && s.matches("^[a-zA-Z0-9]*$");
	}

	public static Map<String, String> getScenarioData() {
		Map<String, String> scenarioDataMap = new HashMap<>();
		List<String> scenarioDataList;
		try {

			String fileName = "src/test/resources/testdata/LMSRegistrationData.csv";
			try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
				scenarioDataList = stream.collect(Collectors.toList());

			}

			for (String scenario : scenarioDataList) {

				String data[] = scenario.split("\\,");
				if (data.length == 2)
					scenarioDataMap.put(data[0], data[1]);
				else if (data.length == 1)
					scenarioDataMap.put(data[0], null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return scenarioDataMap;

	}

	public static final String HOME_PAGE_HEADING = "LMS - Learning Management System";
	public static final String PROGRAM_BTN = "Program";
	public static final String BATCH_BTN = "Batch";
	public static final String USER_BTN = "User";
	public static final String ASSIGNMENT_BTN = "Assignment";
	public static final String ATTENDANCE_BTN = "Attendance";
	public static final String LOGOUT_BTN = "Logout";

}
