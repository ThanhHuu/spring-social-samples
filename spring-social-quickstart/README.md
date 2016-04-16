Spring Social Quickstart
========================
This sample is designed to get you up and running quickly.
See the walkthrough at: https://github.com/SpringSource/spring-social/wiki/Quick-Start
Step 1: Install spring-social-google
---------------------------------
Get spring-social-google from https://github.com/ThanhHuu/spring-social-google.git
Then run gradle install (gradlew install) to deploy library to maven local repository

Step 2: Register your application
---------------------------------
Before you can run the application, you'll need to obtain application credentials from Facebook, Twitter, LinkedIn and Google by registering the application with each of the service providers:

 * Facebook: https://developers.facebook.com/apps
 * Twitter: https://apps.twitter.com/
 * LinkedIn: https://www.linkedin.com/secure/developer
 * Google: https://console.developers.google.com

Be sure to read each platform's usage policies carefully and understand how they impact your use of Spring Social with those platforms.

Step 3: Edit application.properties
-----------------------------------
Once you have registered the application, you'll need to edit src/main/resources/application.properties, adding the credentials to the appropriate properties.

Step 4: Run the application
---------------------------
To run, simply import the project into your IDE and deploy to a Servlet 2.5 or > container such as Tomcat 6 or 7.
Access the project at http://localhost:8080/spring-social-quickstart

Alternatively, you can run the application using Gradle. To make it easier to build the project with Gradle, the Gradle wrapper has been included. The Gradle wrapper makes it possible to run Gradle without having to explicitly install Gradle to your system.

To run the application with Gradle:

```sh
$ gradlew tomcatRun
```

Step 5: Participate in the Spring Social community
--------------------------------------------------

Discuss Spring Social on StackOverflow at http://stackoverflow.com/questions/tagged/spring-social. We welcome you to ask questions and we encourage you to answer any you might have insight into.

If you run into any problems or have a suggested new feature, let us know at https://jira.spring.io/browse/SOCIAL. Or better yet, fork Spring Social on GitHub and send us a pull request to fix a bug or introduce a new feature.

