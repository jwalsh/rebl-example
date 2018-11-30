(ns rebl-example.core)

(def a 1)

(def b "b")

(def c (range 30))

(def b (/ 1 0))

(def c {:a 1
        :b 2})

(def d [1 2 3 4 5])

(defn f
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
