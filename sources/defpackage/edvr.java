package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class edvr {
    public abstract long a();

    public abstract long b();

    public abstract long c();

    public abstract long d();

    public final String e() {
        return String.format("%s-%s-%s-%s", Long.valueOf(a()), Long.valueOf(c()), Long.valueOf(b()), Long.valueOf(d()));
    }
}
