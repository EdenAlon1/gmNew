package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajve {
    public static final void a(final hvi hviVar, final ajvg ajvgVar, final ffbr ffbrVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(1940913646);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(ajvgVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hvi h = ebs.h(hviVar, jif.a(R.dimen.snippet_thumbnail_size, b));
            if (ajvgVar instanceof ajvf) {
                b.v(-1863934267);
                a = dee.a(hxo.a(h, eqm.a), gft.a(b).a, idb.a);
                int i4 = huo.a;
                ipn a2 = dyc.a(hum.e, false);
                int a3 = hey.a(b);
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
                hlc.b(b, a2, iss.e);
                hlc.b(b, ai, iss.d);
                ffjm ffjmVar = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                    Integer valueOf = Integer.valueOf(a3);
                    hfmVar.ad(valueOf);
                    b.h(valueOf, ffjmVar);
                }
                hlc.b(b, b2, iss.c);
                geq.a(jie.a(((ajvf) ajvgVar).a, b, 0), null, jfw.a(eba.j(hvi.e, 0.0f, jif.a(R.dimen.snippet_thumbnail_icon_padding, b), 0.0f, jif.a(R.dimen.snippet_thumbnail_icon_padding, b), 5), "tag_reply_thumbnail_icon"), gft.a(b).b, b, 48, 0);
                b.n();
                hfmVar.Z();
            } else {
                if (!(ajvgVar instanceof ajup)) {
                    b.v(-1863935613);
                    ((hfm) b).Z();
                    throw new ffcd();
                }
                b.v(-1863914444);
                ajuj.a(((ajup) ajvgVar).a, jfw.a(hxo.a(h, eqm.b(jif.a(R.dimen.snippet_thumbnail_corner, b))), "tag_reply_thumbnail_uri"), b, 0);
                ((hfm) b).Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: ajvd
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    ajvg ajvgVar2 = ajvgVar;
                    int i6 = i;
                    ajve.a(hviVar2, ajvgVar2, ffbrVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
