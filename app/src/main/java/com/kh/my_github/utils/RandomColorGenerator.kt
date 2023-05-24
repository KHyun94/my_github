package com.kh.my_github.utils

import java.security.MessageDigest

// 입력받은 문자열 기반으로 랜덤색상 출력
object RandomColorGenerator {
    fun hashStringToColor(input: String): String {
        // 해시 처리
        val md = MessageDigest.getInstance("SHA-256")
        val hash = md.digest(input.toByteArray())
        val hexString = hash.joinToString("") { "%02x".format(it) }

        // 16진수 문자열에서 색상값 추출
        val r = hexString.substring(0, 2).toInt(16)
        val g = hexString.substring(2, 4).toInt(16)
        val b = hexString.substring(4, 6).toInt(16)

        // 밝은 계열의 값이 높은 색상 선택(추후 색상 배합을 할 수 있도록 수정)
        val color = when {
            r >= g && r >= b -> "${r.toString(16).padStart(2, '0')}${
                ((g + b) / 2).toString(16).padStart(2, '0')
            }"
            g >= r && g >= b -> "${((r + b) / 2).toString(16).padStart(2, '0')}${
                g.toString(16).padStart(2, '0')
            }"
            else -> "${((r + g) / 2).toString(16).padStart(2, '0')}${
                b.toString(16).padStart(2, '0')
            }"
        }
        return "#${color.padStart(6, 'f')}"
    }
}