package domain

class BikeRepository {

  def rentBike(bike: Bike): Unit ={
    bike.status = "rented"
  }

  def returnBike(bike: Bike): Unit ={
    bike.status = "free"
  }
}
