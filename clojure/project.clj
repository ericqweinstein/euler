(defproject euler "0.1.0"
  :description "Project Euler solutions in Clojure."
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/math.numeric-tower "0.0.4"]
                 [net.mikera/core.matrix "0.29.1"]]
  :profiles {:dev {:plugins [[lein-kibit "0.0.8"]
                             [lein-bikeshed "0.1.8"]]}}
  :aliases {"lint" ^{:doc "Lint Clojures."}
            ["do" "kibit," "bikeshed" "-m1000"]})
