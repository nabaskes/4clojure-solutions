(fn istree [lst]
  (and
   (coll? lst)
   (= 3 (count lst))
   (or (= nil (second lst)) (istree (second lst)))
   (or (= nil (nth lst 2)) (istree (nth lst 2)))
   )
  )
