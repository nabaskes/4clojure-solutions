(fn [s]
  (reduce
   +
   (map
    (fn [x] (x 1))
    (map
     vector
     (map read-string (reverse (map str (seq s))))
     (map
      (fn [x y] (* x y))
      (map
       #(reduce * (repeat % 2))
       (range (count (map read-string (reverse (map str (seq s)))))))
      (map read-string (reverse (map str (seq s))))
      )
     )
    )
   )
  )
