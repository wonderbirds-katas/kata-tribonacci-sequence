(ns kata-tribonacci-sequence.core)

(defn trib [signature]
      (lazy-seq (concat signature (trib signature))))

(defn tribonacci [signature n]
       (take n (trib signature)))
