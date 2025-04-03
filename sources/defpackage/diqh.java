package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class diqh {
    public static final diqh c;
    public static final diqh d;
    public static final diqh e;
    public static final diqh f;

    static {
        diqg c2 = c();
        c2.c(1);
        c = c2.a();
        diqg c3 = c();
        c3.c(2);
        d = c3.a();
        diqg c4 = c();
        c4.c(3);
        e = c4.a();
        diqg c5 = c();
        c5.c(4);
        f = c5.a();
    }

    public static diqg c() {
        diqc diqcVar = new diqc();
        diqcVar.b(Duration.ZERO);
        return diqcVar;
    }

    public abstract int a();

    public abstract Duration b();
}
