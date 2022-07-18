package dev.xwand.reportx.api.api.event;

import dev.xwand.reportx.api.api.report.ReportStatus;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * @author xWand
 */
public class PlayerReportEvent extends Event implements Cancellable {

    private boolean isCancelled;
    public static final HandlerList handlers = new HandlerList();

    private String id, sender, target, reason;
    private long dateTime;
    private ReportStatus status;

    public PlayerReportEvent(String id, String sender, String target, String reason, long dateTime) {
        this.id = id;
        this.sender = sender;
        this.target = target;
        this.reason = reason;
        this.dateTime = dateTime;
        this.status = ReportStatus.PENDING;
    }

    public String getId() {
        return id;
    }

    public String getSender() {
        return sender;
    }

    public String getTarget() {
        return target;
    }

    public String getReason() {
        return reason;
    }

    public long getDateTime() {
        return dateTime;
    }

    public ReportStatus getStatus() {
        return status;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        isCancelled = cancel;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
