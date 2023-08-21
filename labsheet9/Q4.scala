class Account(initialBalance: Double) {
  private var balance: Double = initialBalance

  def getBalance: Double = balance

  def deposit(amount: Double): Unit = {
    require(amount > 0, "Amount must be positive")
    balance += amount
  }

  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Amount must be positive")
    require(balance >= amount, "Insufficient balance")
    balance -= amount
  }

  def applyInterest(): Unit = {
    if (balance > 0) {
      balance += balance * 0.05
    } else {
      balance += balance * 0.1
    }
  }
}

object Bank {
  def negativeBalanceAccounts(accounts: List[Account]): List[Account] = {
    accounts.filter(account => account.getBalance < 0)
  }

  def totalBalance(accounts: List[Account]): Double = {
    accounts.map(_.getBalance).sum
  }

  def applyInterestToAccounts(accounts: List[Account]): Unit = {
    accounts.foreach(_.applyInterest())
  }
}

object Q4 {

  def main(args: Array[String]): Unit = {
    val account1 = new Account(1000.0)
    val account2 = new Account(-500.0)
    val account3 = new Account(200.0)

    val bankAccounts = List(account1, account2, account3)

    println("Accounts with negative balances:")
    Bank.negativeBalanceAccounts(bankAccounts).foreach(account => println(account.getBalance))

    val totalBalances = Bank.totalBalance(bankAccounts)
    println(s"Total balance of all accounts: $totalBalances")

    Bank.applyInterestToAccounts(bankAccounts)

    println("Final balances after applying interest:")
    bankAccounts.foreach(account => println(account.getBalance))

  }
}


