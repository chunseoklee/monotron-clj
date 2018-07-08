(ns monotron-clj.core
  (:use overtone.live)
  (:require [seesaw.core]))

(def f 
  (seesaw.core/frame :title "Hello",
	:content "Monoroton",
	:on-close :exit))

(seesaw.core/listen f
  :key-pressed (fn [e] (println "key pressed")))

(defn -main [& args]
  (seesaw.core/invoke-later
   (-> f
       seesaw.core/pack!
       seesaw.core/show!))
  (demo 4 (saw))
  )

(comment (defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!")))
