package Methods

import breeze.linalg.DenseMatrix
import breeze.stats.distributions.Gaussian

/**
 * Created by Yuto Suzuki on 15/08/23.
 */
object SampleMatrix {

  def gaussianMatrix(row: Int, col: Int): DenseMatrix[Double] = {
    val normalGaussian = Gaussian(0, 1)
    DenseMatrix.fill(row, col)(normalGaussian.draw())
  }
}