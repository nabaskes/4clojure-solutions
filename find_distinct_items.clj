(fn [lst]
  (let [l (keys (group-by
                 identity
                 lst)
                )]
    (if
      (> (count lst) 5)
      (sort l)
      l
      )
    )
  )
