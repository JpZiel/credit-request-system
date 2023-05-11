package me.dio.request.credit.system.service

import me.dio.request.credit.system.entity.Credit
import java.util.*

interface ICreditService {
    fun save (credit: Credit): Credit
    fun findByAllCustomer(customerId:Long): List<Credit>
    fun findByCreditCode(customerId: Long, creditCode: UUID): Credit

}