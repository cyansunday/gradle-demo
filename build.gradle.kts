plugins {
    id("java")
}

group = "top.devopsdoc"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    testImplementation(platform(libs.junitBom))
    testImplementation("org.junit.jupiter:junit-jupiter")
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