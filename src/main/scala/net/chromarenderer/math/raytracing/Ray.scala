package net.chromarenderer.math.raytracing

import net.chromarenderer.math.Vector3

/**
  * @author bensteinert
  */
//object Ray {
//  val NOWHERE = new Ray(Vector3.FLT_MAX, Vector3.Z_AXIS)
//}

class Ray(origin_in: Vector3, dir_in: Vector3, tMin_in: Float, tMax_in:Float) {

  var origin: Vector3 = origin_in
  var dir: Vector3 = dir_in
  //var invDir = dir_in.inverse

}

