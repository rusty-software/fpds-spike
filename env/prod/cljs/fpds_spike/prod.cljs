(ns fpds-spike.prod
  (:require [fpds-spike.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
