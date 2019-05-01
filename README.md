# SciFi UI Project

Name:Seungmin Lee

Student Number: C17315456

Fork this repository and use it a starter project for your assignment

# Description of the assignment
This project if about a spaceship trys not to get hit by comets while it travel.
In the left side of the window, there is a interface of the spaceship.
In the right side, there is where the spaceship moves around.
In the interface there is radar pointing the comets and the energy bars to show how much energy that spaceship has it and the triangle moving in the circle which shows the situation of the spaceship. 


# Instructions
User should be able to move the spaceship around the space by moving their mouse around.

# How it works
I used shape to draw a spaceship, however I was not able to make a separate class to alocate. 
Therefore I made code it at the bottom of the page to prevent it to disturb other code. 
I used translate(mouseX, mouseY) to make the spaceship follows the mouse and put it into if(mouseX>390 && mouseX<1100) statement to make sure it does not follow into the interface of the spaceship.
For the falling comet, I used Array and random in for loop to make it 6 of them at the same time in a different locations.
The comet is moved by move1 in Comet.java file.  'y = y + ui.random(1,10);' this will change the speed of the comet falling down. I wanted to set the speed of the each of the comits, however I could not figure out and used random instead to at least if changes the speed.
I wanted to make effect and reduce of energy bar every time when the spaceship hits the comet, however I could not figure out how to.
The bottom left of the window, there is a triangle twisting inside the circle. I made it like an interface that shows the situation of the spaceship, like if it's turing left or right. However, it is not effected by how user moving the spaceship.
This is used by 'public void update' in MovingSS.java.I used if statements to let the sides of the triangle constantly moving at the same time prevent it to get outside of the circle. This was able to do by keep multiplying -1 to their movement everytime they reach the limit that I set. 
The rectangle in the middle of the left is like a connection screen. the yellow bars are constantly moving left to right to right to left. I used the similer method as the situation interface which is using a if statements and for loops. And the colour of each bars are different as I set the B to be change from RGB whenever the bar is made.



# What I am most proud of in the assignment
/*I am most proud of the fact that I did understand the a lot of parts of OOP JAVA. I could not make it the assignment how I want, however I am proud of how I did so far and that I understanded the concept of OOP by useing different classes. (Wonder if I meant to write down in this section)*/

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube]](https://www.youtube.com/watch?v=Ip6CvKTyQZw&feature=youtu.be)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

