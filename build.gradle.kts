plugins {
    application
    id("maven-publish")
}

group = "top.devopsdoc"
version = "1.0-SNAPSHOT"


dependencies {
    testImplementation(platform(libs.junitBom))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

application {
    mainClass.set("top.devopsdoc.Main")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "top.devopsdoc"
            artifactId = "gradle-demo"
            version = "1.0-SNAPSHOT"
            from(components["java"])
        }
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

tasks.test {
    useJUnitPlatform()
}

// 任务依赖测试
tasks.register("hello") {
    doLast {
        println("hello")
    }
}

tasks.register("world") {
    doLast {
        println("world")
    }
    dependsOn("hello")
}