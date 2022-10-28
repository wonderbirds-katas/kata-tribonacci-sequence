(ns kata-tribonacci-sequence.core-test
  (:require [clojure.test :refer :all]
            [kata-tribonacci-sequence.core :refer :all]))

(defn tester [sequence n expected]
  (testing (str "(tribonacci " sequence " " n ")")
    (is (= (tribonacci sequence n) expected))))

(deftest tribonacci-test
  (tester [0 0 0] 0 '())
  (tester [0 0 0] 1 '(0))
  (tester [0 0 0] 4 '(0 0 0 0))
  (tester [1 0 0] 3 '(1 0 0))
  (tester [1 0 0] 4 '(1 0 0 1))
  (tester [1 0 0] 5 '(1 0 0 1 1))
  (tester [1 0 0] 7 '(1 0 0 1 1 2 4))
  (tester [1 2 3] 7 '(1 2 3 6 11 20 37)))

(deftest code-wars-tests
  (tester [1 1 1] 10 [1 1 1 3 5 9 17 31 57 105])
  (tester [0 0 1] 10 [0 0 1 1 2 4 7 13 24 44])
  (tester [0 1 1] 10 [0 1 1 2 4 7 13 24 44 81])
  (tester [1 0 0] 10 [1 0 0 1 1 2 4 7 13 24])
  (tester [0 0 0] 10 [0 0 0 0 0 0 0 0 0 0])
  (tester [1 2 3] 10 [1 2 3 6 11 20 37 68 125 230])
  (tester [3 2 1] 10 [3 2 1 6 9 16 31 56 103 190])
  (tester [1 1 1] 1 [1])
  (tester [300 200 100] 0 [])
  (tester [0.5 0.5 0.5] 30 [0.5 0.5 0.5 1.5 2.5 4.5 8.5 15.5 28.5 52.5 96.5 177.5 326.5 600.5 1104.5 2031.5 3736.5 6872.5 12640.5 23249.5 42762.5 78652.5 144664.5 266079.5 489396.5 900140.5 1655616.5 3045153.5 5600910.5 10301680.5]))