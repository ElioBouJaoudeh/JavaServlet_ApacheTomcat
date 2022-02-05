# Java Servlet on Apache Tomcat
Implementation and Deployment of a Java Servlet on Apache Tomcat

## Steps to Follow:

1) Install Apache Tomcat's latest version (9.0.58 as of February 2022) from its official webpage:

![install tomcat](https://user-images.githubusercontent.com/88712232/152638076-f31cc6a0-8695-4673-9069-637e45e59c3d.png)



2) Unzip the downloaded compressed file on your PC:

![unzip](https://user-images.githubusercontent.com/88712232/152638117-da09441d-4f5d-48e8-8b8e-8c4da9deaf67.png)



3) Double click on the startup.bat file to start your Apache Tomcat Server:

![startup](https://user-images.githubusercontent.com/88712232/152638185-29627770-3d92-45c2-ac9e-26f3a4cd9506.png)

![startup window](https://user-images.githubusercontent.com/88712232/152638198-9f114f64-deb8-403f-a5dc-51eb1dd8bd30.png)



4) Create the *HelloWorld* folder inside of the *webapps* folder:

![helloName folder](https://user-images.githubusercontent.com/88712232/152638225-1f0763c1-2cd5-4785-91f0-0a70f4ee4fca.png)



5) Configurate the *HelloName.html* file alongside **WEB-INF** folder:

![HelloName html](https://user-images.githubusercontent.com/88712232/152638347-226638f9-3cc0-47a9-b30d-a73adacc6819.png)



6) Sun Microsystem defines a unique directory structure that must be followed to create a servlet application. It is given in the following picture:

![structure](https://user-images.githubusercontent.com/88712232/152638350-9b9c9b5d-13d8-4fb5-bc91-f76a238662ff.png)



7) Create a Deployment Descriptor:
Deployment Descriptor (DD) is an XML document that is used by Web Container to run Servlets and JSP pages. DD is used for several important purposes such as:

* Mapping URL to Servlet class
* Initializing parameters
* Defining Error page
* Security roles
* Declaring tag libraries

Set up the *web.xml* file:

![web xml](https://user-images.githubusercontent.com/88712232/152638496-c0ebd9ab-2248-4f31-bde6-0576f8bd54d7.png)



8) Inside the *src* file, type the code that will allow you to display **Hello + Name** on the browser:

![HelloName java](https://user-images.githubusercontent.com/88712232/152638532-91ade6bd-bdaa-44e3-a5f0-301a54fc44fa.png)



9) Compiling a Servlet with the required JAR file. In Apache Tomcat server **servlet-api.jar** file is required to compile the servlet class:

![compiling](https://user-images.githubusercontent.com/88712232/152638620-f579472d-080f-448d-8cb8-45eb951e90a7.png)



10) Move the *HelloName.class* to the *classes* folder:

![move to classes folder](https://user-images.githubusercontent.com/88712232/152638681-f6e9a9f9-5b58-4be9-897e-11f9c33b762a.PNG)



11) Open Browser and type **http:localhost:8080/helloName/HelloName.html**:

![browser](https://user-images.githubusercontent.com/88712232/152638729-984ad327-411c-405f-9e5d-976b0847cda0.png)



12) Click on *Click to execute the Servlet* and the browser will redirect you to the servlet:

![bonjour](https://user-images.githubusercontent.com/88712232/152638854-70833d33-1839-4407-8647-cbbd89d8bd35.png)
