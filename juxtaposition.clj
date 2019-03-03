(fn juxtapose [& args]
  (fn [& l] (map #(apply % l) args))
  )
