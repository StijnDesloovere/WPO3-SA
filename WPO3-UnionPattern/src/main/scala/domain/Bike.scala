package domain

abstract sealed class Bike  {
  var status: String
  var price: Int
}

case class NormalBike(color: String, bikePrice: Int) extends Bike{
  var status = "Free"
  var price = bikePrice
}

