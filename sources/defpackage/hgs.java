package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgs {
    public static final hgp a = new hgp();

    public static final ffsk a(ffhd ffhdVar, hfd hfdVar) {
        ffhdVar.get(ffud.c);
        return new hjn(hfdVar.g(), ffhdVar);
    }

    public static final void b(Object obj, Object obj2, ffji ffjiVar, hfd hfdVar) {
        boolean D = hfdVar.D(obj) | hfdVar.D(obj2);
        hfm hfmVar = (hfm) hfdVar;
        Object R = hfmVar.R();
        if (D || R == hfc.a) {
            R = new hgn(ffjiVar);
            hfmVar.ad(R);
        }
    }

    public static final void c(Object obj, ffji ffjiVar, hfd hfdVar) {
        boolean D = hfdVar.D(obj);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            f = new hgn(ffjiVar);
            hfdVar.y(f);
        }
    }

    public static final void d(Object[] objArr, ffji ffjiVar, hfd hfdVar) {
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= hfdVar.D(obj);
        }
        Object f = hfdVar.f();
        if (z || f == hfc.a) {
            hfdVar.y(new hgn(ffjiVar));
        }
    }

    public static final void e(Object obj, Object obj2, Object obj3, ffjm ffjmVar, hfd hfdVar) {
        boolean D = hfdVar.D(obj) | hfdVar.D(obj2) | hfdVar.D(obj3);
        hfm hfmVar = (hfm) hfdVar;
        Object R = hfmVar.R();
        if (D || R == hfc.a) {
            R = new hhd(hfmVar.y, ffjmVar);
            hfmVar.ad(R);
        }
    }

    public static final void f(Object obj, Object obj2, ffjm ffjmVar, hfd hfdVar) {
        ffhd g = hfdVar.g();
        boolean D = hfdVar.D(obj) | hfdVar.D(obj2);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            f = new hhd(g, ffjmVar);
            hfdVar.y(f);
        }
    }

    public static final void g(Object obj, ffjm ffjmVar, hfd hfdVar) {
        ffhd g = hfdVar.g();
        boolean D = hfdVar.D(obj);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            f = new hhd(g, ffjmVar);
            hfdVar.y(f);
        }
    }

    public static final void h(Object[] objArr, ffjm ffjmVar, hfd hfdVar) {
        ffhd g = hfdVar.g();
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= hfdVar.D(obj);
        }
        Object f = hfdVar.f();
        if (z || f == hfc.a) {
            hfdVar.y(new hhd(g, ffjmVar));
        }
    }

    public static final void i(ffix ffixVar, hfd hfdVar) {
        hfdVar.r(ffixVar);
    }
}
