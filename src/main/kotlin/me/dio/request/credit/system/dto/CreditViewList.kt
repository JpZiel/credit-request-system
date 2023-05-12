package me.dio.request.credit.system.dto

import me.dio.request.credit.system.entity.Credit
import java.math.BigDecimal
import java.util.UUID

data class CreditViewList (
    val creditCode: UUID,
    val creditValue: BigDecimal,
    val numberOfIstallments: Int

){
constructor(credit: Credit) : this (
    creditCode = credit.creditCode,
    creditValue = credit.creditValue,
    numberOfIstallments = credit.numberOfInstallments

)
}
