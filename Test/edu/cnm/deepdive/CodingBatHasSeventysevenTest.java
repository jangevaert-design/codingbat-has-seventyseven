package edu.cnm.deepdive;

import static edu.cnm.deepdive.CodingBatHasSeventyseven.has77;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatHasSeventysevenTest {

  private int[][] seventysevenParams = {
      {1, 7, 7},
  {1, 7, 1, 7},
  {1, 7, 1, 1, 7},
  {7, 7, 1, 1, 7},
  {2, 7, 2, 2, 7, 2},
  {2, 7, 2, 2, 7, 7},
  {7, 2, 7, 2, 2, 7},
  {7, 2, 6, 2, 2, 7},
  {7, 7, 7},
  {7, 1, 7},
  {7, 1, 1},
  {1, 2},
  {1, 7},
  {7}
  };

  private boolean[] seventySevenExpected = {true, true, false, true, false, true, true, false, true,
  true, false, false, false, false};

  @Test
  void seventySevenTest() {
    for (int i = 0; i < seventysevenParams.length; i++) {
      boolean actual = has77(seventysevenParams[i]);
      Assertions.assertEquals(actual, seventySevenExpected[i]);
    }
  }
}