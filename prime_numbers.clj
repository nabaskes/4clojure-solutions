(fn primes [n]
  (loop
    [x 2 result []]
    (cond
     (= (count result) n)
     result
     (= 1 (reduce +
                   (filter
                    #(= 0 (mod x %))
                    (range 1 x)
                    )
                   )
        )
     (recur (inc x) (conj result x))
     :else
     (recur (inc x) result)
     )
    )
  )
