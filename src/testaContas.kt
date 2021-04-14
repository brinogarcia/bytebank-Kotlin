fun testaContas() {
    val contaCorrente = ContaCorrente("Teste1", 1000)
    val contaPoupanca = ContaPoupanca("Test2", 1001)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    println()
    println("Saldo conta corrente: ${contaCorrente.saldo}")
    println("Saldo conta poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.00)
    contaPoupanca.saca(100.00)
    println()
    println("Saldo conta corrente após saque: ${contaCorrente.saldo}")
    println("Saldo conta poupança após saque: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)
    println()
    println("Saldo conta corrente após transferencia: ${contaCorrente.saldo}")
    println("Saldo conta poupança após transferencia: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(10.0, contaCorrente)
    println()
    println("Saldo conta corrente após transferencia: ${contaCorrente.saldo}")
    println("Saldo conta poupança após transferencia: ${contaPoupanca.saldo}")
}