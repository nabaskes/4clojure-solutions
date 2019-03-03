(fn freq [lst]
  ((fn [dct]
    (zipmap
     (keys dct)
     (map
      count
      (vals dct)
      )
     )
    )
  (group-by #(identity %) lst)
  )
  )
