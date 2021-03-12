package com.quyunshuo.aop.demo.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * 这是一个测试的自定义Plugin
 * 该Plugin的配置在 buildSrc/src/main/resources/META-INF/gradle-plugins/QuYunshuo-TestPlugin.properties
 *
 * @author Qu Yunshuo
 * @since 3/12/21 11:33 PM
 */
class TestPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.logger.error("====================>> 自定义Plugin开始运行 <<====================")
        // 设置task名字
        target.task("test-task") {
            target.logger.error("====================>> test-task <<====================")
        }
        target.logger.error("====================>> 自定义Plugin运行结束 <<====================")
    }
}