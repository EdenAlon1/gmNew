package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum pqp {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public final boolean a() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
