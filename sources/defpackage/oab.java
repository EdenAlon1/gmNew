package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class oab {
    public static final oab a = new nwz();
    public static final oab b = new nzu();
    public static final oab c = new nwx();
    public static final oab d = new nwy();
    public static final oab e = new nxc();
    public static final oab f = new nxa();
    public static final oab g = new nxb();
    public static final oab h = new nww();
    public static final oab i = new nwu();
    public static final oab j = new nwv();
    public static final oab k = new nws();
    public static final oab l = new nwq();
    public static final oab m = new nwr();
    public static final oab n = new oar();
    public static final oab o = new oap();
    public static final oab p = new oaq();
    public final boolean q;

    public oab(boolean z) {
        this.q = z;
    }

    public abstract Object b(Bundle bundle, String str);

    public abstract Object c(String str);

    public Object d(String str, Object obj) {
        return c(str);
    }

    public String e() {
        throw null;
    }

    public abstract void f(Bundle bundle, String str, Object obj);

    public String h(Object obj) {
        return String.valueOf(obj);
    }

    public final String toString() {
        return e();
    }
}
