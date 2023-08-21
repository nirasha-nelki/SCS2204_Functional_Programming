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

  def transfer(amount: Double, targetAccount: Account): Unit = {
    require(amount > 0, "Amount must be positive")
    require(balance >= amount, "Insufficient balance")

    withdraw(amount)
    targetAccount.deposit(amount)
  }
}

object Q3 {

  def main(args: Array[String]): Unit = {
    val account1 = new Account(1000.0)
    val account2 = new Account(500.0)

    println(s"Account 1 Balance: ${account1.getBalance}")
    println(s"Account 2 Balance: ${account2.getBalance}")
    account1.deposit(200.0)
    account2.withdraw(100.0)
    account1.transfer(300.0, account2)

    println(s"Account 1 Balance after transactions: ${account1.getBalance}")
    println(s"Account 2 Balance after transactions: ${account2.getBalance}")
  }
}

