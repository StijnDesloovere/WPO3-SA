package domain

class UserRepository {

  def createUser(name: String): User ={
    User(name)
  }

  def logIn(user: User): Unit ={
    user.status = "Logged in"
  }

  def logOut(user: User): Unit ={
    user.status = "Logged out"
  }
}
