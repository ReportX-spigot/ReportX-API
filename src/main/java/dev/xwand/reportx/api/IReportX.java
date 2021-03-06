package dev.xwand.reportx.api;

import dev.xwand.reportx.api.api.report.IReportManager;

/**
 * @author xWand
 */
public interface IReportX {

    public String getVersion();

    public String getAuthor();

    public IReportManager getReportManager();
}
