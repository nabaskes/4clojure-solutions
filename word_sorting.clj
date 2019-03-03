(fn sort-words [st]
  (let [strip (fn [coll chars] (apply str (remove #((set chars) %) coll)))]
    (sort
     (fn [x y] (compare (clojure.string/lower-case x) (clojure.string/lower-case y)))
     (map
      (fn [x] (strip x ".,!?;:`~"))
      (clojure.string/split st #" ")
      )
     )
    )
  )
