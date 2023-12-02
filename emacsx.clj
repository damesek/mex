#!/usr/bin/env bb

(require '[babashka.process :refer [shell exec]]
         '[clojure.string :as str])

(println " ********** Starting Emacs on OSX ************ ")
(def brew-prefix (->> (shell {:out :string} "brew" "--prefix") :out str/trim)) 
(def emacs-path (str brew-prefix "/opt/emacs-mac/Emacs.app/Contents/MacOS/Emacs.sh"))
(exec emacs-path "$@")


