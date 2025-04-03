package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atv {
    public final bfh a;

    public atv() {
        bfh a = bfh.a();
        this.a = a;
        Class cls = (Class) a.m(bli.n, null);
        if (cls != null && !cls.equals(atu.class)) {
            throw new IllegalArgumentException(a.j(cls, this, "Invalid target class configuration for ", ": "));
        }
        a.c(bli.n, atu.class);
        if (a.m(bli.m, null) == null) {
            a.c(bli.m, a.u(atu.class));
        }
    }
}
