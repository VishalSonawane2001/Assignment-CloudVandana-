# Assignment-CloudVandana-
Assignment 1
# Simple Profile Card

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
* Customize the CSS in the `<style>` tag within the `bio.html` file to adjust the appearance of the card.
* Replace the placeholder image in the `<img>` tag with your own profile picture.
* Modify the social media links within the `<a>` tags to correspond to your own profiles.
* To change the social media icons, change the classnames of the `<i>` tags to the corresponding font awesome icons.

## Customization

* **Colors:** Change the background colors, text colors, and hover colors in the CSS to match your preferences.
* **Fonts:** Modify the `font-family` property to use a different font.
* **Size and Spacing:** Adjust the `width`, `padding`, and `margin` properties to change the size and spacing of the card.
* **Social Icons:** Add or remove social media icons as needed.
![Alt text](https://raw.githubusercontent.com/your-username/repository-name/main/Profile Card/Profile-card.png)

## Example

```html
<div class="profile-card">
        <img src="Adobe_Express_20240221_1950310_1.png" alt="Profile Picture">
        <h2>Vishal Sonawane</h2>
        <h4>Full Stack Developer</h4>
        <p>Vishal Sonawane | Java Full Stack Developer | Spring Boot, Angular, MySQL | Tech Enthusiast</p>
        <div class="social-icons">
            <a href="#"><img src="imageFB.png" alt="Facebook" class="icon"></a>
            <a href="#"><img src="imageIsta.png" alt="Instagram" class="icon"></a>
            <a href="#"><img src="imageWP.png" alt="Whatsapp" class="icon"></a>
            <a href="#"><img src="Linkedin.png" alt="Linkedin" class="icon"></a>
        </div>
    </div>
