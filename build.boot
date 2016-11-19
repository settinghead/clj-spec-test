(set-env!
 :dependencies '[[org.clojure/test.check "0.9.0"]
                 [proto-repl "0.3.1"]])

(deftask dev []
  (comp
    identity))
