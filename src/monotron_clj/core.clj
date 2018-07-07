(ns monotron-clj.core
  (:use overtone.live)
  (:require [seesaw.core]))

(defn -main [& args]
  (seesaw.core/invoke-later
   (-> (seesaw.core/frame :title "Hello",
           :content "Hello, Seesaw",
           :on-close :exit)
       seesaw.core/pack!
       seesaw.core/show!))
  (demo 4 (saw))
  )

(comment (defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!")))
