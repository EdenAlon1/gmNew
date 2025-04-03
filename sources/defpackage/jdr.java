package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jdr {
    public static final hik a = new hky(jct.a);
    private static final hik s = new hky(jcu.a);
    private static final hik t = new hky(jcw.a);
    private static final hik u = new hky(jcv.a);
    public static final hik b = new hky(jcy.a);
    public static final hik c = new hky(jcx.a);
    public static final hik d = new hky(jde.a);
    public static final hik e = new hky(jda.a);
    public static final hik f = new hky(jdb.a);
    private static final hik v = new hky(jdd.a);
    public static final hik g = new hky(jdc.a);
    public static final hik h = new hky(jdf.a);
    public static final hik i = new hky(jdg.a);
    public static final hik j = new hky(jdh.a);
    private static final hik w = new hky(jdl.a);
    public static final hik k = new hky(jdk.a);
    public static final hik l = new hky(jdm.a);
    public static final hik m = new hky(jdn.a);
    public static final hik n = new hky(jdo.a);
    public static final hik o = new hky(jdp.a);
    public static final hik p = new hky(jdi.a);
    public static final hik q = new hgq(hla.a, jdj.a);
    public static final hik r = new hky(jcz.a);

    public static final void a(iwx iwxVar, jci jciVar, ffjm ffjmVar, hfd hfdVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        hfd b2 = hfdVar.b(874662829);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? b2.D(iwxVar) : b2.F(iwxVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? b2.D(jciVar) : b2.F(jciVar)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b2.F(ffjmVar) ? 128 : 256;
        }
        if (b2.J((i3 & 147) != 146, i3 & 1)) {
            AndroidComposeView androidComposeView = (AndroidComposeView) iwxVar;
            hfz.b(new hil[]{a.c(androidComposeView.o), s.c(androidComposeView.r), u.c(androidComposeView.s), t.c(androidComposeView.p), b.c(androidComposeView.t), c.c(androidComposeView.u), e.c(iwxVar.m()), f.c(androidComposeView.d), v.d(androidComposeView.Q), g.d(iwxVar.l()), h.c(androidComposeView.F), i.c(androidComposeView.G), j.c(iwxVar.n()), w.c(androidComposeView.E), k.c(androidComposeView.P), l.c(androidComposeView.R), m.c(jciVar), n.c(androidComposeView.h), o.c(androidComposeView.g), p.c(androidComposeView.S), d.c(androidComposeView.T)}, ffjmVar, b2, ((i3 >> 3) & 112) | 8);
        } else {
            b2.s();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new jdq(iwxVar, jciVar, ffjmVar, i2);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(a.a(str, "CompositionLocal ", " not present"));
    }
}
