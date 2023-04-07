# FirmataTemplate
 Template Maven Project with Firmata on the Arduino, for FRC Team #3341's Offseason Learning

## Purpose
In previous years, students have had a disconnect between Java knowledge and Arduino skills. The usage of Firmata and Java aims to bridge this gap between Java and Arduino, by offering a means of remote control via a connected computer. Although somewhat limiting, students should also feel challenged with a lack of C++ libraries, with an aim of teaching them about OOP Java classes and methods.

### Blink Demo GIF
![Alt Text](https://j.gifs.com/XQ9wNo.gif)


## How to use

### Brief overview of steps
- Install VSCode (development environment)

- Install any Java JDK (Oracle or Adoptium works)

- (If using Windows or Mac) Install Maven (compiler) from Apache Website

- Install recommended VSCode extensions for Java

- Set up appropriate environment variable for JAVA_HOME, set Maven location in VSCode

- Fork + Clone + Run this repository

## Details
### Install the JDK
- VSCode recommends to install Adoptium JDK: https://adoptium.net/
- Alternatively, a pre-existing OpenJDK or Oracle JDK could be used


### Install Maven
- Follow: https://maven.apache.org/install.html
- Unzip the Maven zip, and place this new folder somewhere safe (such as where Java is located or in Documents)


### Install Recommended Extensions
#### Recommended:
- Language Support Extension (RedHat)
- Test Runner for Java (Microsoft)
- Debugger for Java (Microsoft)
- Extension Pack for Java (Microsoft)
- Maven for Java (Microsoft)
- Project Manager for Java (Microsoft)

### Set up Environment Variables (Windows)
- Open up the System Environment Variables, and add JAVA_HOME + edit its value
  * This value could be for example: `C:\Program Files\Eclipse Adoptium\jdk-17.0.5.8-hotspot\`


- Click on Maven for Java Extension Settings (in the extension tab)
  * Edit the Executable Path to include the mvn application
  * For example: `C:\Program Files\Java\apache-maven-3.9.1\bin\mvn`
