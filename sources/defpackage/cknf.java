package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cknf {
    private long a;

    public cknf(long j) {
        this.a = j;
    }

    public final cknh a() {
        return new cknh(this.a);
    }

    public final void b(ckng ckngVar) {
        this.a &= ~ckngVar.e;
    }

    public final void c(ckng ckngVar) {
        this.a |= ckngVar.e;
    }
}
