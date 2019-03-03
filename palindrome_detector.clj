(fn [pal]
  (if
    (> 2 (count pal))
    'true
    (if
      (= (first pal) (first (reverse pal)))
      (recur (rest (reverse (rest pal))))
      'false)
    )
  )
