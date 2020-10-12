package infrastructure

import api.{API, ManageBike, ManageUser}
import domain.{Domain, NormalBike, User}

object UI extends Infrastructure with API with Domain{

  def main(args: Array[String]): Unit = {

    val manageUser: ManageUser = createManageUser
    val manageBike: ManageBike = createMangeBike
    val Stijn: User = manageUser.createUser("Stijn")
    val bike = NormalBike("Black", 50)

    manageUser.increaseBalance(Stijn, 25)
    manageBike.rentBike(Stijn, bike)
    manageUser.increaseBalance(Stijn, 25)
    manageBike.rentBike(Stijn, bike)
    println(Stijn.balace)
    manageBike.returnBike(Stijn,bike)
    println(Stijn.balace)

  }
}
