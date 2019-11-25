package com.tinder.gradleenterprisereader

import org.jsoup.Jsoup

object  Reporter {


    @JvmStatic
    fun main(args: Array<String>) {
        Jsoup.connect("https://wh-gradle-02.gotinder.biz/cache-admin")
            .get().run {
            select("ge-content-body").forEachIndexed { index, element ->
                println(index)
                println(element)

            }
        }
    }

}