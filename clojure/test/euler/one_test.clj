(ns euler.one-test
  (:require [clojure.test :refer :all]
            [euler.one :refer :all]))

(deftest problem-one-test
  (testing "Problem 1"
    (is (= 233168 (problem-one 1000)))))
