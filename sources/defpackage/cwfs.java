package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwfs {
    public static final void a(final cwec cwecVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hvi b;
        ebe ebfVar;
        hfm hfmVar;
        hvi b2;
        int i3 = i & 6;
        hfd b3 = hfdVar.b(-530729905);
        if (i3 == 0) {
            i2 = (true != b3.D(cwecVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b3.I()) {
            b3.s();
        } else {
            int i4 = i2 & 14;
            eey a = efb.a(0, b3, 3);
            if (cwecVar.f.b && cwecVar.e != null) {
                b2 = ebs.b(hvi.e, 1.0f);
                b = ebs.b(b2, 1.0f);
            } else if (cwecVar.b.isEmpty()) {
                b = ebs.d(hvi.e, 1.0f);
            } else {
                d = ebs.d(hvi.e, 1.0f);
                b = ebs.b(d, 1.0f);
            }
            b3.v(966190348);
            if (cwecVar.d != null) {
                b3.v(966193041);
                hfm hfmVar2 = (hfm) b3;
                Object R = hfmVar2.R();
                if (i4 == 4 || R == hfc.a) {
                    R = new ffji() { // from class: cwfc
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            jkv jkvVar = (jkv) obj;
                            jkvVar.getClass();
                            String str = cwec.this.d;
                            str.getClass();
                            jkr.o(jkvVar, str);
                            return ffcu.a;
                        }
                    };
                    hfmVar2.ad(R);
                }
                hfmVar2.Z();
                b = jjs.c(b, false, (ffji) R);
            }
            hfm hfmVar3 = (hfm) b3;
            hfmVar3.Z();
            b3.v(966197262);
            if (!cwecVar.f.a || cwecVar.b.isEmpty()) {
                ebfVar = new ebf(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                jzn jznVar = (jzn) b3.e(jdr.e);
                ebfVar = eba.h(0.0f, 0.0f, 0.0f, jznVar.ek(ecv.f(b3).a(jznVar)), 7);
            }
            hfmVar3.Z();
            hvi a2 = jfw.a(b, "ContactSuggestionList");
            int i5 = huo.a;
            ebe ebeVar = ebfVar;
            hun hunVar = hum.j;
            b3.v(966215914);
            Object R2 = hfmVar3.R();
            if (i4 == 4 || R2 == hfc.a) {
                R2 = new ffji() { // from class: cwfd
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        edp edpVar = (edp) obj;
                        edpVar.getClass();
                        cwec cwecVar2 = cwec.this;
                        if (!cwecVar2.b.isEmpty()) {
                            eek.a(edpVar, cwecVar2.a, cwdy.a, 2);
                        }
                        if (cwecVar2.f.b) {
                            eek.a(edpVar, "emergency", new hpw(-557073546, true, new cwfg(cwecVar2)), 2);
                        }
                        List list = cwecVar2.b;
                        edpVar.a(list.size(), new cwfp(new ffji() { // from class: cwff
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj2) {
                                cwgp cwgpVar = (cwgp) obj2;
                                cwgpVar.getClass();
                                return cwgpVar.b();
                            }
                        }, list), new cwfq(list), new hpw(-632812321, true, new cwfr(list)));
                        return ffcu.a;
                    }
                };
                hfmVar3.ad(R2);
            }
            hfmVar3.Z();
            boolean z = true;
            edh.a(a2, a, ebeVar, false, null, hunVar, null, false, null, (ffji) R2, b3, 0, 472);
            String str = cwecVar.a;
            b3.v(966290925);
            if (i4 != 4) {
                z = false;
            }
            boolean D = z | b3.D(a);
            Object R3 = hfmVar3.R();
            if (D || R3 == hfc.a) {
                R3 = new cwfo(cwecVar, a, null);
                hfmVar = hfmVar3;
                hfmVar.ad(R3);
            } else {
                hfmVar = hfmVar3;
            }
            hfmVar.Z();
            hgs.g(str, (ffjm) R3, b3);
        }
        hio L = b3.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cwfe
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    cwfs.a(cwec.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final boolean b(List list, String str) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (ffkj.e(((eei) it.next()).d.toString(), str)) {
                return true;
            }
        }
        return false;
    }
}
