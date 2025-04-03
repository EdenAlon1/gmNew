package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svw {
    public static final void a(final sxc sxcVar, final fnx fnxVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hfd hfdVar2;
        sxcVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-691222728);
        if (i3 == 0) {
            i2 = (true != b.D(sxcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(fnxVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            String str = sxcVar.a;
            str.getClass();
            final String b2 = jii.b(R.string.unblocked_toast_message, new Object[]{str}, b);
            b.v(-1067744208);
            boolean D = b.D(b2) | ((i2 & 14) == 4) | ((i2 & 112) == 32);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new ffix() { // from class: svt
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        sxc sxcVar2 = sxc.this;
                        String str2 = sxcVar2.a;
                        str2.getClass();
                        sxcVar2.d.a(str2, new svv(fnxVar, b2, null));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            float a = jif.a(R.dimen.blocked_participant_list_item_view_padding, b);
            float a2 = jif.a(R.dimen.contact_list_row_icon_size, b);
            d = ebs.d(eba.d(hvi.e, a), 1.0f);
            hvi d2 = dfb.d(d, false, null, (ffix) R, 7);
            dxj dxjVar = dxu.g;
            int i4 = huo.a;
            ipn a3 = ebm.a(dxjVar, hum.n, b, 54);
            int a4 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b, d2);
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
            hlc.b(b, b3, iss.c);
            b.v(-1871819792);
            Uri uri = sxcVar.b;
            if (uri != null) {
                ajuj.a(uri.toString(), ebs.m(hvi.e, a2, a2), b, 0);
            }
            hfmVar.Z();
            hfdVar2 = b;
            fqi.b(sxcVar.c, eba.d(hvi.e, a), gft.a(b).o, 0L, 0L, 0L, 2, false, 1, 0, null, null, hfdVar2, 0, 3120, 120824);
            fqi.b(jii.a(R.string.tap_to_unblock_message, b), eba.d(hvi.e, a), gft.a(b).a, 0L, 0L, 0L, 0, false, 0, 0, null, null, hfdVar2, 0, 0, 131064);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: svu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    sxc sxcVar2 = sxc.this;
                    int i6 = i;
                    svw.a(sxcVar2, fnxVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
