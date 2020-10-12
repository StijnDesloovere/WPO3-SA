package api

import domain.Domain

abstract trait API {
  this: Domain =>

  def createManageUser: ManageUser
  def createMangeBike: ManageBike

}
