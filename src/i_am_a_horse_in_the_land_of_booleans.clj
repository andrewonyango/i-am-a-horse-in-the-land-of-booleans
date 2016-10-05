(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (= true x))

(defn abs [x]
  (if (> 0 x)
    (- x)
    (x)))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
  ":(")

(defn teen? [age]
  (and (< age 20) (> age 12)))

(defn not-teen? [age]
  (and (< age 13) (> age 19)))

(defn generic-doublificate [x]
  (* 2 x))

(defn leap-year? [year]
  ":(")

; '_______'
