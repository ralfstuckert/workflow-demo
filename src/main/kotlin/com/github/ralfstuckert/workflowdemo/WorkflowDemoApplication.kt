package com.github.ralfstuckert.workflowdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WorkflowDemoApplication

fun main(args: Array<String>) {
	runApplication<WorkflowDemoApplication>(*args)
}
