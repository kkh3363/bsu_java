## Complete environment

### 1. JDK installation
-  Download Java SE Development Kit 25.0.4.1 downloads
- https://www.oracle.com/kr/java/technologies/downloads/#java25
- https://download.oracle.com/java/25/latest/jdk-25_windows-x64_bin.exe
- dk-25_windows-x64_bin.exe excute.

### 2. set environment
#### Step 1: Copy the JDK Installation Path
  - Open File Explorer and navigate to your Java installation folder (usually C:\Program Files\Java\).
  - Open the specific JDK folder (e.g., jdk-25 or jdk-21).
  - Click on the address bar at the top, copy the full folder path (e.g., C:\Program Files\Java\jdk-25), and save it for later.
#### Step 2: Open System Environment 
  - VariablesPress the Windows Key, type environment variables, and select Edit the system environment variables.
  - In the System Properties window that opens, click the Environment Variables... button at the bottom.
#### Step 3: Create the JAVA_HOME 
  - VariableUnder the System variables section (bottom half), click the New... button.
  - For Variable name, type JAVA_HOME.
  - For Variable value, paste the JDK folder path you copied in Step 1 (do not include the \bin folder here).
  - Click OK.
#### Step 4: Update the Path Variable
  - In the same System variables section, scroll down, select the Path variable, and click Edit....
  - Click the New button on the right side of the window.
  - Type %JAVA_HOME%\bin and press Enter.(Alternatively, you can paste the absolute path directly to the bin folder, such as C:\Program Files\Java\jdk-25\bin).
  - Click OK on all open windows to save your changes.
#### Step 5: Verify the Configuration
  - Open a new Command Prompt (type cmd in the Windows start menu).
  - Run the command java -version and press Enter.
  - Run the command javac -version and press Enter.
If both commands return the correct version number without errors, your configuration is complete.
