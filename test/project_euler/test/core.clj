(ns project-euler.test.core
  (:use [project-euler.core])
  (:use [clojure.test]))

(deftest test-problem-one
         (is (= (project-euler.core/one 9) 23))
         (is (= (project-euler.core/one 999) 233168)))
