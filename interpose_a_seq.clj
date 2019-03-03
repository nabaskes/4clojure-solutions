(fn interpos [mixin lst]
  (reverse
   (rest
    (reverse
     (reduce
      concat
      (map
       (fn [x] (cons x (list mixin)))
       lst)
      )
     )
    )
   )
  )
