package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffrt {
    public final Throwable b;
    public final ffqk c;

    public ffrt(Throwable th, boolean z) {
        this.b = th;
        this.c = new ffqk(z, ffqo.a);
    }

    public final boolean a() {
        return this.c.b();
    }

    public final String toString() {
        return ffsp.a(this) + "[" + this.b + "]";
    }

    public /* synthetic */ ffrt(Throwable th) {
        this(th, false);
    }
}
