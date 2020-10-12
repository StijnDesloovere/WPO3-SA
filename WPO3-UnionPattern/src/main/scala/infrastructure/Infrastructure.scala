package infrastructure
import api.{API, ManageBike, ManageUser}
import domain.{BikeRepository, Domain, UserRepository}

trait Infrastructure {
  this:API with Domain =>

  override def createBikeRepository: BikeRepository = {
    new BikeRepository
  }

  override def createUserRepository: UserRepository = {
    new UserRepository
  }

  override def createManageUser: ManageUser = {
    new ManageUser(createUserRepository)
  }

  override def createMangeBike: ManageBike = {
    new ManageBike(createBikeRepository)
  }

}
