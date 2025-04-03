package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dyxf implements Serializable {
    public static final dyxf f;
    public static final dyxf g;

    static {
        dywy dywyVar = new dywy();
        dywyVar.c(0L);
        dywyVar.b(1.0d);
        dywyVar.e(0L);
        dywyVar.f(0);
        dywyVar.d(1);
        dywyVar.a();
        dywy dywyVar2 = new dywy();
        dywyVar2.c(1000L);
        dywyVar2.b(1.0d);
        dywyVar2.e(2000L);
        dywyVar2.f(1);
        dywyVar2.d(1000);
        f = dywyVar2.a();
        dywy dywyVar3 = new dywy();
        dywyVar3.c(1000L);
        dywyVar3.b(2.0d);
        dywyVar3.e(30000L);
        dywyVar3.f(3);
        dywyVar3.d(1000);
        g = dywyVar3.a();
    }

    public abstract double a();

    public abstract int b();

    public abstract int c();

    public abstract long d();

    public abstract long e();
}
