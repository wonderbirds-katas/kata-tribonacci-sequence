(ns kata-tribonacci-sequence.core)

(defn trib [[a b c]]
  (let [sum (+ a b c)]
    (lazy-seq (cons sum (trib [b c sum])))))

(defn prefix-trib-with [signature]
  (lazy-seq (concat signature (trib signature))))

(defn tribonacci [signature n]
       (take n (prefix-trib-with signature)))
