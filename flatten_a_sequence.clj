(fn flatn [lst]
  (reduce
   concat
   (map
    (fn [x]
      (if
        (coll? x)
        (flatn x)
        (list x)
        )
      )
    lst
    )
   )
  )
