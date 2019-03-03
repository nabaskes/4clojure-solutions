(fn gby-type [lst]
  (set
   (vals
    (group-by type lst))
   )
  )
