package net.chromarenderer.math

class Vector3(x_in: Float, y_in: Float, z_in: Float) {

  def x = x_in

  def y = y_in

  def z = z_in

  def +(other: Vector3): Vector3 = {
    new Vector3(x + other.x, y + other.y, z + other.z)
  }

  def -(other: Vector3): Vector3 = {
    new Vector3(x - other.x, y - other.y, z - other.z)
  }


  override def toString = s"Vector3($x, $y, $z)"
}