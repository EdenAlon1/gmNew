package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ric {
    RUNNING(false),
    PAUSED(false),
    CLEARED(false),
    SUCCESS(true),
    FAILED(true);

    public final boolean f;

    ric(boolean z) {
        this.f = z;
    }
}
