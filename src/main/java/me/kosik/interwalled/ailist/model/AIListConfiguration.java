package me.kosik.interwalled.ailist.model;


/**
 *
 * @param maximumComponentsCount
 * @param intervalsCountToCheckLookahead
 * @param intervalsCountToTriggerExtraction
 * @param minimumComponentSize
 * @param isInputDataSorted
 */
public record AIListConfiguration(
        Integer maximumComponentsCount,
        Integer intervalsCountToCheckLookahead,
        Integer intervalsCountToTriggerExtraction,
        Integer minimumComponentSize,
        Boolean isInputDataSorted
) {

    final public static AIListConfiguration DEFAULT =
            new AIListConfiguration(10, 20, 10, 64, false);
}
