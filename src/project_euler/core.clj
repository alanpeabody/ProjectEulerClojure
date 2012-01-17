(ns project-euler.core)

(def whole-numbers (iterate inc 1))

(defn one
  "Returns the sum of all multiple of 3 or 5 from 0 to range end"
  [end]
  (let [multiple? #(or (= 0 (mod % 3)) (= 0 (mod % 5)))]
    (reduce + 0 (filter multiple? (take end whole-numbers)))))

