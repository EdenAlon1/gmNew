package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaff {
    public Long a;
    private long b;
    private byte c;

    public final eafp a() {
        if (this.c == 1) {
            return new eafg(this.a, this.b);
        }
        throw new IllegalStateException("Missing required properties: startTime");
    }

    public final void b(long j) {
        this.b = j;
        this.c = (byte) 1;
    }
}
