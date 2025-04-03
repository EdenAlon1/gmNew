package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dstl {
    public static final hvi a(hvi hviVar, dyn dynVar, dsss dsssVar, hfd hfdVar) {
        hviVar.getClass();
        hfdVar.v(-1469461224);
        float d = dynVar.d();
        float c = dynVar.c();
        float c2 = dsssVar.c();
        float b = dsssVar.b();
        jzn jznVar = (jzn) hfdVar.e(jdr.e);
        hfdVar.v(-516912195);
        boolean A = hfdVar.A(c2) | hfdVar.A(b) | hfdVar.A(d) | hfdVar.A(c);
        Object f = hfdVar.f();
        if (A || f == hfc.a) {
            int em = (int) jznVar.em(d);
            int em2 = (int) jznVar.em(c);
            float d2 = ffmk.d(Math.min(em / c2, em2 / b), 3.0f);
            f = new jzv(jzr.b(((jzq) ffmk.n(new jzq(jznVar.eg(c2 * d2)), new jzq(jznVar.ek(em)))).a, ((jzq) ffmk.n(new jzq(jznVar.eg(b * d2)), new jzq(jznVar.ek(em2)))).a));
            hfdVar.y(f);
        }
        long j = ((jzv) f).a;
        hfdVar.o();
        hvi l = ebs.l(hviVar, j);
        hfdVar.o();
        return l;
    }
}
