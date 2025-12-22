package me.kosik.interwalled.ailist

case class AIListConfig(
  maximumComponentsCount: Int,
  intervalsCountToCheckLookahead: Int,
  intervalsCountToTriggerExtraction: Int,
  minimumComponentSize: Int,
  isInputDataSorted: Boolean
)

object AIListConfig {
  val DEFAULT = AIListConfig(10, 20, 10, 64, isInputDataSorted = false)
}