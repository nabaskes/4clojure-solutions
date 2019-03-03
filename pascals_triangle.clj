(fn pascrow [n]
    (map
     (fn [x] (/ (reduce * (range 1 n))
                (* (reduce * (range 1 (- n x)))
                   (reduce * (range 1 (inc x))))
                ))
     (range n)
     )
    )
