(fn not-all-true [& args]
  (and
   (not (reduce (fn [a b] (and a b)) args))
   (reduce (fn [a b] (or a b)) args)
   )
  )
