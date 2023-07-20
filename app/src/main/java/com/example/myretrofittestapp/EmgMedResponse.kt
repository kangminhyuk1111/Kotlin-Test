package com.example.myretrofittestapp


import com.squareup.moshi.Json

/* retrofit 데이터 통신
* json 데이터 postman으로 조회
* moshi retrofit okhttp 라이브러리 싱크하기
* json beautify로 json 정리
* 새로운 파일 생성 json to dto 사용하여 dto파일로 변환
* dto : data to object의 약자로 json데이터를 파싱하는 느낌
* name = ? <- 이러한 값을 가져와서 상수로 변경해줌
*
*
*  */

data class EmgMedResponse(
    @Json(name = "EmgMedInfo")
    val emgMedInfo: List<EmgMedInfo?>?
) {
    data class EmgMedInfo(
        @Json(name = "head")
        val head: List<Head?>?,
        @Json(name = "row")
        val row: List<Row?>?
    ) {
        data class Head(
            @Json(name = "api_version")
            val apiVersion: String?,
            @Json(name = "list_total_count")
            val listTotalCount: Int?,
            @Json(name = "RESULT")
            val rESULT: RESULT?
        ) {
            data class RESULT(
                @Json(name = "CODE")
                val cODE: String?,
                @Json(name = "MESSAGE")
                val mESSAGE: String?
            )
        }

        data class Row(
            @Json(name = "DISTRCT_DIV_NM")
            val dISTRCTDIVNM: String?,
            @Json(name = "EMGNCY_CENTER_TELNO")
            val eMGNCYCENTERTELNO: String?,
            @Json(name = "MEDCARE_INST_NM")
            val mEDCAREINSTNM: String?,
            @Json(name = "REFINE_LOTNO_ADDR")
            val rEFINELOTNOADDR: String?,
            @Json(name = "REFINE_ROADNM_ADDR")
            val rEFINEROADNMADDR: String?,
            @Json(name = "REFINE_WGS84_LAT")
            val rEFINEWGS84LAT: String?,
            @Json(name = "REFINE_WGS84_LOGT")
            val rEFINEWGS84LOGT: String?,
            @Json(name = "REPRSNT_TELNO")
            val rEPRSNTTELNO: String?,
            @Json(name = "SIGUN_CD")
            val sIGUNCD: String?,
            @Json(name = "SIGUN_NM")
            val sIGUNNM: String?,
            @Json(name = "SUM_DE")
            val sUMDE: String?
        )
    }
}