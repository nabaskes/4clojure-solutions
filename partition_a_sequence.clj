(fn part [n lst]
  ((fn [x s result]
     (if
       (> (count s) (dec x))
       (recur x (drop x s) (conj result (take x s)))
       result
       )
     )
   n
   lst
   []
   )
  )
