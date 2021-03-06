(defproject org.mobileink/migae.datastore "0.1.0-SNAPSHOT"
  :description "migae - MobileInk Google App Engine sdk for Clojure."
  :url "https://github.com/migae/datastore"
  :min-lein-version "2.0.0"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :aot [#".*"]
  :test-selectors {:fields :fields
                   :meta :meta
                   :infix :infix
                   :map :map
                   :emap :emap
                   :elist :elist
                   :entity :entity
                   :entities :entities
                   :keys :keys
                   :ancestor :ancestor
                   :query :query
                   :pred :pred
                   :fetch :fetch}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.google.appengine/appengine-api-1.0-sdk "1.9.17"]
                 [log4j "1.2.17" :exclusions [javax.mail/mail
                                              javax.jms/jms
                                              com.sun.jdmk/jmxtools
                                              com.sun.jmx/jmxri]]
                 [org.slf4j/slf4j-log4j12 "1.6.6"]
                 [org.clojure/tools.logging "0.2.3"]])

  ;; :profiles {:test {:dependencies [[com.google.appengine/appengine-api-stubs "1.8.4"]
  ;;                                  [com.google.appengine/appengine-testing "1.8.4"]
  ;;                                  [ring-zombie "1.0.1"]]}})

