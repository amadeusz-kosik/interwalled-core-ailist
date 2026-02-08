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
        int maximumComponentsCount,
        int intervalsCountToCheckLookahead,
        int intervalsCountToTriggerExtraction,
        int minimumComponentSize,
        boolean checkLookbehindCoverage,
        boolean isInputDataSorted
) {

    final public static AIListConfiguration DEFAULT =
            new AIListConfiguration(32, 24, 10, 64, true, false);
}
