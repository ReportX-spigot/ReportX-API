package dev.xwand.reportx.api;

import dev.xwand.reportx.api.api.IReportManager;

/**
 * ReportX API utility class. This class contains utility methods for the
 * ReportX API.
 * @since 0.1.0
 * @author xWand
 */
public class ReportXAPI {

    private static IReportX plugin;

    private ReportXAPI() {
    }

    /**
     * Set the plugin for the API.
     * <p>
     * <strong>WARNING</strong> This is for internal implementation <strong>ONLY</strong>.
     * @param plugin The API implementation.
     */
    public static void setPlugin(IReportX plugin) {
        ReportXAPI.plugin = plugin;
    }

    /**
     * Get the version of the plugin.
     * @return The plugin version.
     */
    public static String getVersion() {
        return plugin.getVersion();
    }

    /**
     * Get the author of the plugin.
     * @return The plugin author.
     */
    public static String getAuthor() {
        return plugin.getAuthor();
    }

    /**
     * Get an instance of the plugin API.
     * @return The plugin API.
     */
    public static IReportX getPlugin() {
        return plugin;
    }

    public static IReportManager getReportManager() {
        return plugin.getReportManager();
    }
}
