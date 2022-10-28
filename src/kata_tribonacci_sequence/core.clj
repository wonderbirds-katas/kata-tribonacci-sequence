(ns kata-tribonacci-sequence.core)

(defn trib [[a b c]]
  (lazy-seq (cons a (trib [b c (+ a b c)]))))

(defn tribonacci [signature n]
       (take n (trib signature)))
