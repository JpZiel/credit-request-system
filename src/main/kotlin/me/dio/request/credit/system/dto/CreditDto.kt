package me.dio.request.credit.system.dto

import me.dio.request.credit.system.entity.Credit
import me.dio.request.credit.system.entity.Customer
import java.math.BigDecimal
import java.time.LocalDate

data class CreditDto (
    val creditValue:BigDecimal,
    val dayFirstOfInstallment: LocalDate,
    val numberOdInstallments: Int,
    val customerId: Long
){
    fun toEntity(): Credit = Credit(
        creditValue = this.creditValue,
        dayFirstInstallment = this.dayFirstOfInstallment,
        numberOfInstallments = this.numberOdInstallments,
        customer = Customer(id = this.customerId)
    )

}
