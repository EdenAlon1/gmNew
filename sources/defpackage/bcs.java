package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum bcs {
    RELEASED(false),
    RELEASING(true),
    CLOSED(false),
    PENDING_OPEN(false),
    CLOSING(true),
    OPENING(true),
    OPEN(true),
    CONFIGURED(true);

    public final boolean i;

    bcs(boolean z) {
        this.i = z;
    }
}
