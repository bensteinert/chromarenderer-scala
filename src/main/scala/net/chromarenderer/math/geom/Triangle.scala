package net.chromarenderer.math.geom

import net.chromarenderer.math.Vector3
import net.chromarenderer.math.raytracing.Ray

/**
  * Chroma uses the right-hand-coordinate system. Think about three vertices specified counterclockwise on the floor.
  * The normal will always point upwards!
  *
  * @author bensteinert
  */

class Triangle(p0_in: Vector3, p1_in: Vector3, p2_in: Vector3, n_in: Vector3) {

  var p0: Vector3 = p0_in
  var p1: Vector3 = p1_in
  var p2: Vector3 = p2_in
  var n: Vector3 = n_in


  def this(p0: Vector3, p1: Vector3, p2: Vector3) {
    this(p0, p1, p2, (p1 - p0 % p2 - p0).norm())
  }

  def e1: Vector3 = {
    p1 - p0
  }

  def e2: Vector3 = {
    p2 - p0
  }


  def subdivide: Array[Triangle] = {

    val pOnE1 = p0 + p1 * 0.5f
    val pOnE2 = p0 + p2 * 0.5f
    val pOnE3 = p1 + p2 * 0.5f

    Array(
      new Triangle(p0, pOnE1, pOnE2, n),
      new Triangle(pOnE1, p1, pOnE3, n),
      new Triangle(pOnE3, p2, pOnE2, n),
      new Triangle(pOnE1, pOnE3, pOnE2, n)
    )
  }

  def intersect(ray: Ray): Float = {

  }

  
}
