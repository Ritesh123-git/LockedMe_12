package com.lockedme;

public class LockedMeMain {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("LockedMe", "Ritesh Kumar Dwivedi");  // to display the welcome screen, it will display 
		// the Application name and the developer detail.
		HandleOptions.handleWelcomeScreenInput();
	}

	
}
