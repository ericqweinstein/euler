(ns euler.ten-test
  (:require [clojure.test :refer :all]
            [euler.ten :refer :all]))

(deftest problem-ten-test
  (testing "Problem 10"
    (is (= 142913828922 (problem-ten 2000000)))))
