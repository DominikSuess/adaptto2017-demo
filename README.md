# adaptto2017-demo

## Prepwork:
(Build Feature Launcher POC from Carstens Whiteboard)
svn co svn.apache.org/repos/asf/sling/whiteboard/cziegeler/
cd cziegeler
mvn clean install -DskipTests

## Executing Demo:
`cd demosite`

`mvn clean install` 

Copy content of "feature-model" folder to the „examples/featuremodel“ folder of Carstens Whiteboard (svn checkout done in prepwork)

In „examples“ folder:

Build: `java -jar ~/.m2/repository/org/apache/sling/org.apache.sling.feature.applicationbuilder/0.0.1-SNAPSHOT/org.apache.sling.feature.applicationbuilder-0.0.1-SNAPSHOT.jar -d sling -f featuremodel/pkginstaller.json,featuremodel/demosite.json -u ~/.m2/repository -o demosite.json`

Analyze: `java -jar ~/.m2/repository/org/apache/sling/org.apache.sling.feature.analyser/0.0.1-SNAPSHOT/org.apache.sling.feature.analyser-0.0.1-SNAPSHOT.jar demosite.json`
(Note - the Analyzer will report errors and warnings due to a flaw in the startlevel handling of the bundles that need to fixed - anyhow moving on to launcher)

Launch: `java -jar ~/.m2/repository/org/apache/sling/org.apache.sling.feature.launcher/0.0.1-SNAPSHOT/org.apache.sling.feature.launcher-0.0.1-SNAPSHOT.jar  -I -v -a demosite.json`
Visit localhost:8080/content/demosite.html

Build: `java -jar ~/.m2/repository/org/apache/sling/org.apache.sling.feature.applicationbuilder/0.0.1-SNAPSHOT/org.apache.sling.feature.applicationbuilder-0.0.1-SNAPSHOT.jar -d sling -f featuremodel/pkginstaller.json,featuremodel/demosite-2.json,featuremodel/joke.json -u ~/.m2/repository -o demosite2.json`

Analyze: 
`java -jar ~/.m2/repository/org/apache/sling/org.apache.sling.feature.analyser/0.0.1-SNAPSHOT/org.apache.sling.feature.analyser-0.0.1-SNAPSHOT.jar demosite2.json`
(Note - the Analyzer will report errors and warnings due to a flaw in the startlevel handling of the bundles that need to fixed - anyhow moving on to launcher)

(TBD - some glitch is added to the second step that requires fixing before moving on)

Launch: `java -jar ~/.m2/repository/org/apache/sling/org.apache.sling.feature.launcher/0.0.1-SNAPSHOT/org.apache.sling.feature.launcher-0.0.1-SNAPSHOT.jar  -I -v -a demosite2.json`

Crosscheck localhost:8080/content/demosite.html


