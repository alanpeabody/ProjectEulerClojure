(ns project-euler.test.core
  (:use [project-euler.core])
  (:use [clojure.test]))

(deftest test-problem-one
         (is (= (project-euler.core/one 9) 23))
         (is (= (project-euler.core/one 999) 233168)))

(deftest test-problem-two
         (is (= (project-euler.core/two 20) 10))
         (is (= (project-euler.core/two 4000000) 4613732)))

