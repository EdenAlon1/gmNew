package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qjx {
    static qhv a(qlk qlkVar, qci qciVar) {
        return new qhv(h(qlkVar, qciVar, qka.a));
    }

    public static qhw b(qlk qlkVar, qci qciVar) {
        return c(qlkVar, qciVar, true);
    }

    public static qhw c(qlk qlkVar, qci qciVar, boolean z) {
        return new qhw(i(qlkVar, z ? qlw.a() : 1.0f, qciVar, qkf.a));
    }

    static qhx d(qlk qlkVar, qci qciVar, int i) {
        return new qhx(h(qlkVar, qciVar, new qki(i)));
    }

    static qhy e(qlk qlkVar, qci qciVar) {
        return new qhy(h(qlkVar, qciVar, qkl.a));
    }

    static qia f(qlk qlkVar, qci qciVar) {
        return new qia(qko.a(qlkVar, qciVar, qlw.a(), qkt.a, true));
    }

    static qic g(qlk qlkVar, qci qciVar) {
        return new qic(i(qlkVar, qlw.a(), qciVar, qkz.a));
    }

    public static List h(qlk qlkVar, qci qciVar, qlf qlfVar) {
        return qko.a(qlkVar, qciVar, 1.0f, qlfVar, false);
    }

    public static List i(qlk qlkVar, float f, qci qciVar, qlf qlfVar) {
        return qko.a(qlkVar, qciVar, f, qlfVar, false);
    }
}
