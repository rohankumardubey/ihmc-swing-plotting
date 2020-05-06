plugins {
   id("us.ihmc.ihmc-build") version "0.20.1"
   id("us.ihmc.ihmc-ci") version "5.3"
   id("us.ihmc.ihmc-cd") version "1.8"
}

ihmc {
   group = "us.ihmc"
   version = "0.16.0"
   vcsUrl = "https://github.com/ihmcrobotics/ihmc-swing-plotting"
   openSource = true
   
   configureDependencyResolution()
   configurePublications()
}

mainDependencies {
   api("org.apache.commons:commons-lang3:3.9")
   api("net.sf.trove4j:trove4j:3.0.3")
   api("org.jfree:jfreechart:1.0.17")
   api("org.jfree:jcommon:1.0.21")

   api("us.ihmc:euclid:0.14.0")
   api("us.ihmc:ihmc-commons:0.29.0")
   api("us.ihmc:ihmc-graphics-description:0.16.0")
}

testDependencies {
   api("us.ihmc:ihmc-commons-testing:0.29.0")
   api("us.ihmc:ihmc-graphics-description-test:0.16.0")
}