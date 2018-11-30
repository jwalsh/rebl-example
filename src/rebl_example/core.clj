(ns rebl-example.core)

(def a 1)

(def b "b")

(def c (range 30))

(quote
 c

 )

(def b (/ 1 0))

(def c {:a 1
        :b 2})

(def d [1 2 3 4 5])

(def e (reduce + d))
(reduce + d)

(quote
 e

 )

(defn f
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(def s
  (slurp "https://www.gutenberg.org/files/3207/3207.txt"))

(reduce #(assoc %1 %2 (inc (%1 %2 0)))
        {}
        (re-seq #"\w+" s))

(for [suit [:♠ :♥ :♦ :♣]
      rank (range 1 14)]
  {:suit suit :rank rank})


(defrecord Transaction [id timestamp account])
(defrecord Account [customer])
(defrecord Card [customer])
(defrecord Customer [fname lname address email])
(defrecord Address [street city state zip])
