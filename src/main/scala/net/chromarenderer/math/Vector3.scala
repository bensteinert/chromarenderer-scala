package net.chromarenderer.math

import org.apache.commons.math3.util.FastMath

class Vector3(x_in: Float, y_in: Float, z_in: Float) {

  var x: Float = x_in

  var y: Float = y_in

  var z: Float = z_in

  def +(other: Vector3): Vector3 = {
    new Vector3(x + other.x, y + other.y, z + other.z)
  }

  def -(other: Vector3): Vector3 = {
    new Vector3(x - other.x, y - other.y, z - other.z)
  }

  def *(other: Float): Vector3 = {
    new Vector3(x * other, y * other, z * other)
  }

  def *(other: Vector3): Float = {
    x * other.x + y * other.y + z * other.z
  }

  def /(other: Float): Vector3 = {
    this * (1/other)
  }

  def %(other: Vector3): Vector3 = {
    new Vector3(
      y * other.z - z * other.y,
      z * other.x - x * other.z,
      x * other.y - y * other.x
    )
  }

  def length: Float = {
    FastMath.sqrt(x*x + y*y + z*z).toFloat
  }

  def norm(): Vector3 = {
    this / length
  }

  override def toString = s"Vector3($x, $y, $z)"

}