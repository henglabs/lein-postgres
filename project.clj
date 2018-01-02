(defproject lein-postgres "0.1.3-SNAPSHOT"
  :description "Lein plugin wrapping the open table java embedded postgres component"
  :url "http://github.com/whostolebenfrog/lein-postgres"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :dependencies [[com.opentable.components/otj-pg-embedded "0.11.0"]]
  :plugins []
  :repositories {"nexus-releases" {:url "https://nexus.hengshi.org/content/repositories/releases" :sign-releases false}
                 "nexus-snapshots" {:url "https://nexus.hengshi.org/content/repositories/snapshots"
                                    :snapshots true
                                    :sign-releases false
                                    :update :always}
                 "nexus-thirdparty" "https://nexus.hengshi.org/content/repositories/thirdparty"}
  :deploy-repositories [["snapshots" {:url "https://nexus.hengshi.org/content/repositories/snapshots"}]
                        ["releases" {:url "https://nexus.hengshi.org/content/repositories/releases"}]]
                 )
