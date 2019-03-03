(fn why-would-i-want-that [f]
  (fn [& args]
    (apply f (reverse args))
    )
  )
