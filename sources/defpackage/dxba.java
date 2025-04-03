package defpackage;

import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dxba {
    public static final dxba a;
    public static final dxba b;
    public static final dxba c;

    static {
        dxay c2 = c();
        c2.c(EnumSet.noneOf(dxaz.class));
        c2.b(false);
        a = c2.a();
        dxay c3 = c();
        c3.c(EnumSet.of(dxaz.ANY));
        c3.b(true);
        b = c3.a();
        dxay c4 = c();
        c4.c(EnumSet.of(dxaz.ANY));
        c4.b(false);
        c = c4.a();
    }

    public static dxay c() {
        dxaq dxaqVar = new dxaq();
        dxaqVar.b(false);
        return dxaqVar;
    }

    public abstract enip a();

    public abstract boolean b();
}
