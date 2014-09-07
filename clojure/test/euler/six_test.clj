(ns euler.six-test
  (:require [clojure.test :refer :all]
            [euler.six :refer :all]))

(deftest problem-six-test
  (testing "Problem 6"
    (is (= 25164150 (problem-six)))))
