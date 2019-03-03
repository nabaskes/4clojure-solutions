(fn isperf [n]
  (= n
     (reduce +
      ((fn p-factors [x]
         (filter
          #(= 0 (mod x %))
          (range 1 x)
          )
         )
       n
       )
      )
     )
  )
