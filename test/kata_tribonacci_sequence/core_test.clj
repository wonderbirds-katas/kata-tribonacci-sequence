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
  ;(tester [1 0 0] 3 '(1 0 0))
  )
