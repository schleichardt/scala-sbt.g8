resolvers += Resolver.url(
  "sbt-plugin-releases", 
  new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/")
)(Resolver.ivyStylePatterns)

resolvers += "schleichardts Github" at "http://schleichardt.github.com/jvmrepo/"

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)

