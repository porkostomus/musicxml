(ns porkostomus.musicxml
  (:require [clojure.data.xml :as xml]))

(comment
  (let [input-xml (slurp "resources/xmlsamples/ActorPreludeSample.musicxml")]
    (xml/parse-str input-xml))
  )