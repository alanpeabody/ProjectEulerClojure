(ns project-euler.test.core
  (:use [project-euler.core])
  (:use [clojure.test]))

(deftest test-problem-one
         (is (= (project-euler.core/one 9) 23))
         (is (= (project-euler.core/one 999) 233168)))

(deftest test-problem-two
         (is (= (project-euler.core/two 20) 10))
         (is (= (project-euler.core/two 4000000) 4613732)))

(deftest test-problem-three
         (is (= (project-euler.core/three 13195) 29))
         (is (= (project-euler.core/three 600851475143) 6857)))

(deftest test-prime?
         (is (true? (project-euler.core/prime? 2)))
         (is (true? (project-euler.core/prime? 3)))
         (is (true? (project-euler.core/prime? 29)))
         (is (false? (project-euler.core/prime? 4)))
         (is (false? (project-euler.core/prime? 10))))
