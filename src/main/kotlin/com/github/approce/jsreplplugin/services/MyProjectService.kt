package com.github.approce.jsreplplugin.services

import com.intellij.openapi.project.Project
import com.github.approce.jsreplplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
