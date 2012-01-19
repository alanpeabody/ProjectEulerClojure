(ns project-euler.core)

(def whole-numbers (iterate inc 1))

(def fib (map first (iterate (fn [[a b]] [b (+ a b)]) [0 1])))

(defn one
  "Returns the sum of all multiple of 3 or 5 from 0 to range end"
  [end]
  (let [multiple? #(or (= 0 (mod % 3)) (= 0 (mod % 5)))]
    (reduce + 0 (filter multiple? (take end whole-numbers)))))

(defn two
  "Returns the sum of all even numbers of the fib seq under max"
  [max]
  (reduce + 0 (filter even? (take-while #(< % max) fib))))
