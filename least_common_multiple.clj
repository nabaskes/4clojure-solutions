(fn [& args]
  (reduce
   (fn lcm [x y]
     (/
      (* x y)
      ((fn gcd [a b]
         (if
           (= b 0)
           a
           (recur b (mod a b))
           )
         )
       x y)
      )
     )
   args
   )
  )
