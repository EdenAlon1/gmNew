package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyvm {
    public static final void a(final cvo cvoVar, final cyvj cyvjVar, final crw crwVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final cvo cvoVar2;
        final crw crwVar2;
        hvi hviVar2;
        hvi a;
        hvi a2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1794834812);
        if (i3 == 0) {
            i2 = (true != b.D(cvoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(cyvjVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(crwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(hviVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
            cvoVar2 = cvoVar;
            crwVar2 = crwVar;
        } else {
            if (cyvjVar == null) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: cyvk
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            cvo cvoVar3 = cvo.this;
                            crw crwVar3 = crwVar;
                            cyvm.a(cvoVar3, null, crwVar3, hviVar, (hfd) obj, hip.a(i | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            b.v(-1613958793);
            if (cyvjVar.b.a) {
                cvoVar2 = cvoVar;
                crwVar2 = crwVar;
                hviVar2 = hviVar;
            } else {
                hve hveVar = hvi.e;
                cvn b2 = cvoVar.b("photoSelector_0", b);
                int i4 = cvm.c;
                cvm a3 = cvl.a();
                cyh cyhVar = cyvc.a;
                cvoVar2 = cvoVar;
                hvi a4 = cvg.a(cvoVar2, hveVar, b2, crwVar, ctt.l(cxu.c(500, 0, cyvc.a, 2), 2), ctt.m(cxu.c(150, 0, cyvc.a, 2), 2), a3);
                crwVar2 = crwVar;
                hviVar2 = hviVar.a(a4);
            }
            dnym dnymVar = cyvjVar.a;
            ((hfm) b).Z();
            a = dee.a(hxo.a(hviVar2, eqm.b(24.0f)), gft.a(b).I, idb.a);
            a2 = dlsj.a(a, jii.a(R.string.conversation_icon, b), true);
            dnxw.j(dnymVar, a2, b, 0);
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: cyvl
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cvo cvoVar3 = cvo.this;
                    cyvj cyvjVar2 = cyvjVar;
                    crw crwVar3 = crwVar2;
                    cyvm.a(cvoVar3, cyvjVar2, crwVar3, hviVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
