
# Assignment-CloudVandana

# 1. Simple Profile Card (HTML & CSS)

This project demonstrates a simple and responsive profile card implemented using HTML and CSS.

## Features

* **Responsive Design:** Adapts well to various screen sizes.
* **Clean and Modern UI:** Uses subtle shadows, rounded corners, and smooth transitions for a visually appealing design.
* **Profile Information:** Displays a profile picture, name, designation, and a short bio.
* **Social Media Icons:** Includes social media icons for easy access to user profiles.
* **Hover Effect:** Provides a subtle lift and color change on hover for interactive feedback.

## Technologies Used

* HTML5
* CSS3
* Font Awesome (for social media icons)

## Getting Started

1.  **Clone the repository:**

    ```bash
    git clone <repository_url>
    ```

2.  **Open `index.html` in your web browser.**

## Usage

* Modify the `bio.html` file to change the profile picture, name, designation, bio, and social media links.
* Customize the CSS in the `<style>` tag within the `bio.html` file to adjust the card's appearance.
* Replace the placeholder image in the `<img>` tag with your own profile picture.
* Modify the social media links within the `<a>` tags to correspond to your profiles.
* To change the social media icons, change the classnames of the `<i>` tags to the corresponding font-awesome icons.

## Customization

* **Colors:** You can change the background, text, and hover colors in the CSS to match your preferences.
* **Fonts:** Modify the `font-family` property to use a different font.
* **Size and Spacing:** To change the size and spacing of the card, adjust the `width`, `padding`, and `margin` properties.
* **Social Icons:** Add or remove social media icons as needed.

## Output!  

![Alt text](https://github.com/VishalSonawane2001/Assignment-CloudVandana-/blob/main/Profile%20Card/Profile-card.png)



# 2. String Manipulation - Anagram Check (Java)
This project contains a Java program that determines whether two input strings are anagrams of each other. Anagrams are strings that contain the same characters, but in a different order.

## Description

The `AnagramCheck.java` file contains a Java program that:

1.  Takes two strings as input.
2.  Checks if the lengths of the strings are equal. If not, they cannot be anagrams.
3.  Converts the strings to character arrays.
4.  Sorts both character arrays.
5.  Compares the sorted arrays. If they are equal, the strings are anagrams.

## Files

* `AnagramCheck.java`: The Java source code file.

## Usage

1.  **Prerequisites:** Ensure you have a Java Development Kit (JDK) installed.
2.  **Compilation:**
    * Open a terminal or command prompt.
    * Navigate to the directory containing `AnagramCheck.java`.
    * Compile the program using the command: `javac AnagramCheck.java`
3.  **Execution:**
    * Run the compiled program using the command: `java AnagramCheck`
    * The program will execute and output whether the test strings within the main method are anagrams. You can modify the strings within the main method of the java file to test other strings.

## Output
![Alt text](https://github.com/VishalSonawane2001/Assignment-CloudVandana-/blob/main/Anagram-Check/Output_for_Angram.png)



# 3. Employee Management System

## 📌 Project Overview
The **Employee Management System** is a simple Java-based application that demonstrates Object-Oriented Programming (OOP) concepts. It allows users to:
- Store and manage employee details (ID, name, salary)
- Display a list of all employees
- Add new employees manually

## 🛠️ Technologies Used
- **Java** (Core Java, OOP concepts)
- **Eclipse IDE** (Recommended for development)
- **Collections Framework** (ArrayList for storing employees)
- **Scanner Class** (For user input)

## 📜 Class Descriptions
### 1️⃣ **Employee.java**
- A simple class representing an **Employee** with:
  - `id` (int) - Employee ID
  - `name` (String) - Employee Name
  - `salary` (double) - Employee Salary
- Contains a `displayDetails()` method to print employee details.

### 2️⃣ **EmployeeService.java**
- Manages a **list of employees** using `ArrayList<Employee>`.
- Provides methods to:
  - Add new employees
  - Display all employees

### 3️⃣ **EmployeeManagement.java** (Main Class)
- Initializes **three default employees**.
- Allows the user to **manually add new employees** interactively.
- Displays the final employee list.

## 🚀 How to Run the Project
### **Step 1: Setup**
1. Open **Eclipse IDE** (or any Java-supported IDE).
2. Create a new **Java Project** (File → New → Java Project).
3. Copy the `Employee.java`, `EmployeeService.java`, and `EmployeeManagement.java` files into the **src** folder.

### **Step 2: Compile & Run**
1. Right-click on **EmployeeManagement.java** → `Run As` → `Java Application`.
2. The program will:
   - Display the initial list of employees.
   - Ask if you want to **add more employees manually**.
   - Display the final updated list.

##  Output

![Alt text](https://github.com/VishalSonawane2001/Assignment-CloudVandana-/blob/main/src/EmpManegement/Output.png)

# 4. Simple Image Slider

This project demonstrates a basic image slider implemented using HTML, CSS, and JavaScript.

## Description

The project consists of an image slider that allows users to cycle through a series of images using "Previous" and "Next" buttons. The slider uses CSS transitions for smooth animations and JavaScript for dynamic image shifting.

## Files

* `slider.html`: The HTML structure of the image slider.
* `slider.css`: The CSS styles for the slider.
* `slider.js`: The JavaScript logic for handling image transitions.

## Usage

1.  **Open `slider.html`:** Open the `slider.html` file in a web browser.
2.  **Navigate Images:**
    * Click the "Previous" button (◀) to go to the previous image.
    * Click the "Next" button (▶) to go to the next image.
3.  **Image Looping:** The slider loops back to the beginning or end when reaching the last or first image, respectively.

## Output


![Demo Video](https://github.com/VishalSonawane2001/Assignment-CloudVandana-/blob/main/Image-Slider/Image%20Slider.mp4)

