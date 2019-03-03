(fn [s]
  (clojure.string/join ","
  (filter
   (fn [x] (and
            (= (int (Math/sqrt (read-string x)))
               (int (Math/ceil (Math/sqrt (read-string x))))
               )
            (not= "1" x))
     )
   (clojure.string/split s #",")
   )
  )
  )
