fun testaFuncionarios() {
    println()
    println()
    val bia = Analista("Bia", "30320210144", 2000.00)
    println("nome: ${bia.nome}")
    println("cpf: ${bia.cpf}")
    println("salario: ${bia.salario}")
    println("bonificação: ${bia.bonificacao}")


    val alberto = Gerente(
        "Alberto",
        "30340450577",
        4000.00,
        123456789
    )
    println()
    println()
    println("############")
    println("############")
    println()
    println()
    println("nome: ${alberto.nome}")
    println("cpf: ${alberto.cpf}")
    println("salario: ${alberto.salario}")
    println("bonificação: ${alberto.bonificacao}")

    println()
    println()

    if (alberto.autentica(12345678)) {
        println("Autenticado com sucesso!")
    } else {
        println("Falha na autenticação!")
    }


    val tony = Diretor(
        "Tony",
        "40470790988",
        5000.00,
        9000,
        9000.00
    )
    println()
    println()
    println("############")
    println("############")
    println()
    println()
    println("nome: ${tony.nome}")
    println("cpf: ${tony.cpf}")
    println("salario: ${tony.salario}")
    println("bonificação: ${tony.bonificacao}")
    println("plr: ${tony.plr}")
    println()
    println()

    if (tony.autentica(9000)) {
        println("Autenticado com sucesso!")
    } else {
        println("Falha na autenticação!")
    }
    println()
    println()
    println("############")
    println("############")
    println()
    println()

    val maria = Analista("Maria", "44498790321", 1800.00)
    println("nome: ${maria.nome}")
    println("cpf: ${maria.cpf}")
    println("salario: ${maria.salario}")
    println("bonificação: ${maria.bonificacao}")
    println()
    println()
    println("###### Calculo de bonificação ######")
    val calculadora = CalculadoraBonificacao()
    calculadora.registra(bia)
    calculadora.registra(alberto)
    calculadora.registra(tony)
    calculadora.registra(maria)

    println("Total da nossa bonificação é: ${calculadora.total}")
}