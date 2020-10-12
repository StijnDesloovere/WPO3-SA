package api
import domain.{Bike, BikeRepository, User}

class ManageBike(repository: BikeRepository) {

  def rentBike(user: User, bike: Bike): Unit ={
    if((bike.status == "Free") && (user.balace >= bike.price)){
      repository.rentBike(bike)
      user.balace -= bike.price
      println("Rented a bike")
    } else  {
      println("Can't rent the bike")
    }
  }

  def returnBike(user: User, bike: Bike): Unit ={
    repository.returnBike(bike)
    user.balace += bike.price
  }

}
