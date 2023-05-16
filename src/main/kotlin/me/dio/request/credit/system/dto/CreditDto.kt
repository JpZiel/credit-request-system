package me.dio.request.credit.system.dto

import jakarta.validation.constraints.Future
import jakarta.validation.constraints.NotNull
import me.dio.request.credit.system.entity.Credit
import me.dio.request.credit.system.entity.Customer
import java.math.BigDecimal
import java.time.LocalDate

data class CreditDto(
    @field:NotNull(message = "Invalid Input") val creditValue: BigDecimal,
    @field:Future val dayFirstOfInstallment: LocalDate,
    val numberOdInstallments: Int,
    @field:NotNull(message = "Invalid Input") val customerId: Long
) {
    fun toEntity(): Credit = Credit(
        creditValue = this.creditValue,
        dayFirstInstallment = this.dayFirstOfInstallment,
        numberOfInstallments = this.numberOdInstallments,
        customer = Customer(id = this.customerId)
    )

}
