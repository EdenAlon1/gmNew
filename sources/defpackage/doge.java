package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doge {
    public static final void a(final dofy dofyVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(181274209);
        if (i3 == 0) {
            i2 = (true != b.D(dofyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            hvi a2 = hxo.a(ebs.h(hvi.e, 40.0f), gft.c(b).c);
            if (dofyVar instanceof dofu) {
                b.v(1591313706);
                a = dee.a(hxo.a(ebs.h(hvi.e, 40.0f), eqm.a), gft.a(b).a, idb.a);
                int i4 = huo.a;
                ipn a3 = dyc.a(hum.e, false);
                int a4 = hey.a(b);
                hfm hfmVar = (hfm) b;
                hqb ai = hfmVar.ai();
                hvi b2 = huz.b(b, a);
                int i5 = ist.a;
                ffix ffixVar = iss.a;
                b.x();
                if (hfmVar.z) {
                    b.j(ffixVar);
                } else {
                    b.z();
                }
                hlc.b(b, a3, iss.e);
                hlc.b(b, ai, iss.d);
                ffjm ffjmVar = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                    Integer valueOf = Integer.valueOf(a4);
                    hfmVar.ad(valueOf);
                    b.h(valueOf, ffjmVar);
                }
                hlc.b(b, b2, iss.c);
                dwho.a(dnaa.a(((dofu) dofyVar).a, b), null, jfw.a(eba.j(hvi.e, 0.0f, 8.0f, 0.0f, 8.0f, 5), "snippet_icon_thumbnail"), gft.a(b).b, b, 384, 0);
                b.n();
                hfmVar.Z();
            } else if (dofyVar instanceof dofv) {
                b.v(2086592381);
                Uri uri = ((dofv) dofyVar).a;
                int i6 = inp.a;
                dnac.a(uri, "", a2, null, null, null, ino.a, null, 0.0f, null, null, null, "snippet_image_thumbnail", null, null, null, b, 12582960, 196608, 491384);
                b = b;
                ((hfm) b).Z();
            } else {
                if (dofyVar instanceof dofw) {
                    b.v(2086849712);
                    jfw.a(ebs.h(hvi.e, 40.0f), "snippet_monogram_thumbnail");
                    throw null;
                }
                if (!(dofyVar instanceof dofx)) {
                    b.v(1591312702);
                    ((hfm) b).Z();
                    throw new ffcd();
                }
                b.v(2087026877);
                Uri uri2 = ((dofx) dofyVar).a;
                int i7 = inp.a;
                dnac.a(uri2, "", a2, null, null, null, ino.a, null, 0.0f, null, null, null, "snippet_video_thumbnail", null, null, null, b, 12582960, 196608, 491384);
                b = b;
                ((hfm) b).Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dogd
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i8 = i;
                    doge.a(dofy.this, (hfd) obj, hip.a(i8 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
