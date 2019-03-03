(fn [n] (map
         (fn fib [n]
           (if
             (> 2 n)
             1
             (+ (fib (- n 1)) (fib (- n 2)))
             )
           )
         (range n)
         )
  )
