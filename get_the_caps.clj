(fn [s]
  (clojure.string/join
  ""
   (filter
    #(Character/isUpperCase %)
    s
    )
   )
  )
