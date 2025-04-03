package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dkjw {
    public static final dkjw c;
    public static final dkjw d;
    public static final dkjw e;
    public static final dkjw f;
    public static final dkjw g;

    static {
        dkjv d2 = d();
        d2.d(1);
        c = d2.a();
        dkjv d3 = d();
        d3.d(2);
        d = d3.a();
        dkjv d4 = d();
        d4.d(3);
        e = d4.a();
        dkjv d5 = d();
        d5.d(4);
        f = d5.a();
        dkjv d6 = d();
        d6.d(5);
        g = d6.a();
        dkjv d7 = d();
        d7.d(6);
        d7.a();
    }

    public static dkjv d() {
        dkjb dkjbVar = new dkjb();
        dkjbVar.b(0);
        dkjbVar.c(Duration.ZERO);
        return dkjbVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract Duration c();
}
