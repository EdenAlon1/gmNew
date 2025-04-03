package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awp {
    public static final awp a = new awp(false, 0);
    public static final awp b = new awp(true, 500);
    public static final awp c;
    public final long d;
    public final boolean e;
    public final boolean f;

    static {
        new awp(true, 100L);
        c = new awp(false, 0L, true);
    }

    private awp(boolean z, long j) {
        this(z, j, false);
    }

    private awp(boolean z, long j, boolean z2) {
        this.e = z;
        this.d = j;
        if (z2) {
            ksw.b(!z, "shouldRetry must be false when completeWithoutFailure is set to true");
        }
        this.f = z2;
    }
}
