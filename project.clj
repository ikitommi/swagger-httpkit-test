(defproject swagger-httpkit-test "0.1.0-SNAPSHOT"
  :description "Testing ring-swagger with httpkit"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [http-kit "2.1.16"]
                 [ring "1.2.1"]
                 [ring/ring-json "0.2.0"]
                 [metosin/compojure-api "0.6.0"]
                 [metosin/ring-swagger-ui "2.0.10"]]
  :profiles {:uberjar {:resource-paths ["swagger-ui"]
                       :main swagger-httpkit-test.server
                       :aot [swagger-httpkit-test.server]}})
