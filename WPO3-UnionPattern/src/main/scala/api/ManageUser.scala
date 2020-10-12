package api

import domain.{User, UserRepository}

class ManageUser(repository: UserRepository){

  def createUser(name: String): User ={
    repository.createUser(name)
  }

  def loginUser(user: User): Unit ={
    repository.logIn(user)
  }

  def logoutUser(user: User): Unit ={
    repository.logOut(user)
  }

  def increaseBalance(user: User, amount: Int): Unit ={
    user.balace += amount
  }

  def decreaseBalance(user: User, amount: Int): Unit ={
    user.balace -= amount
  }
}
