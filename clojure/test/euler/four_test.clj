(ns euler.four-test
  (:require [clojure.test :refer :all]
            [euler.four :refer :all]))

(deftest problem-four-test
  (testing "Problem 4"
    (is (= 906609 (problem-four)))))
