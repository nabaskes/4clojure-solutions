(fn gcd [x y]
 ( (fn is-it-np [n]
    (if
      (and
       (= 0 (mod x n))
       (= 0 (mod y n))
       )
      n
      (recur (dec n))
      )
    )
  y)
  )
