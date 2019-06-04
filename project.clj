(defproject org.clojars.foundart/salesforce "1.0.2"
  :description "A clojure library for accessing the salesforce api"
  :url "https://github.com/whenceforth/salesforce"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [clj-http "3.10.0"]
                 [cheshire "5.8.1"]]

  :plugins [[lein-cljfmt "0.6.4"]
            [lein-ancient "0.6.15"]]) ; For detecting and fixing outdated dependencies. See https://github.com/xsc/lein-ancient
