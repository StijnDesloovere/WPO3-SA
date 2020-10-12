package domain

abstract trait Domain {

  def createBikeRepository: BikeRepository
  def createUserRepository: UserRepository

}
