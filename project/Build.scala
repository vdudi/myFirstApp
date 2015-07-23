import sbt._
import Keys._
import PlayProject._
//import play.Project._

object ApplicationBuild extends Build {

    val appName         = "myFirstApp"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here      
    )

}