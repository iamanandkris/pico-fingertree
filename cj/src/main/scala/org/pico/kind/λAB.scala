package org.pico.kind

import scala.language.higherKinds

trait λab[T[_, _], X] {
  type a[A] = T[A, X]

  type b[B] = T[X, B]
}
