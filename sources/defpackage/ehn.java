package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehn {
    private final long a;

    public ehn(long j) {
        this.a = j;
    }

    public final long a() {
        return Math.max(0L, this.a - System.nanoTime());
    }
}
