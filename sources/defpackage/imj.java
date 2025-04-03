package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imj {
    public final imi a = new imi(1, 1);
    public final imi b = new imi(1, 1);
    public long c;

    public final void a(long j, long j2) {
        this.a.b(j, Float.intBitsToFloat((int) (j2 >> 32)));
        this.b.b(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public final void b() {
        this.a.c();
        this.b.c();
        this.c = 0L;
    }
}
