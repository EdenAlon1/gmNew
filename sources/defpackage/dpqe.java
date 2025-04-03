package defpackage;

import android.content.Context;
import androidx.camera.view.PreviewView;
import com.google.android.apps.messaging.R;
import j$.time.Duration;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpqe {
    /* JADX WARN: Removed duplicated region for block: B:42:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.hvi r26, final defpackage.ffxx r27, defpackage.hfd r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpqe.a(hvi, ffxx, hfd, int, int):void");
    }

    public static final void b(final float f, final ffji ffjiVar, final atl atlVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hfm hfmVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1538225022);
        if (i3 == 0) {
            i2 = (true != b.A(f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjiVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(atlVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(hviVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            final lkr lkrVar = (lkr) b.e(lnr.a);
            b.v(-1907972743);
            hfm hfmVar2 = (hfm) b;
            Object R = hfmVar2.R();
            if (R == hfc.a) {
                R = cxk.a(0.0f);
                hfmVar2.ad(R);
            }
            final cxj cxjVar = (cxj) R;
            hfmVar2.Z();
            Object R2 = hfmVar2.R();
            if (R2 == hfc.a) {
                R2 = hgs.a(ffhe.a, b);
                hfmVar2.ad(R2);
            }
            final ffsk ffskVar = (ffsk) R2;
            int i4 = true != ffkj.e(atlVar, atl.a) ? R.string.camera_selector_button_front_content_description : R.string.camera_selector_button_rear_content_description;
            long j = dptv.a;
            hvi a = dee.a(hviVar, dptv.c, eqm.a);
            der a2 = des.a(2.0f, ibw.d);
            eql eqlVar = eqm.a;
            ebf ebfVar = new ebf(10.0f, 10.0f, 10.0f, 10.0f);
            b.v(-1907961696);
            boolean F = ((i2 & 112) == 32) | b.F(ffskVar) | b.F(cxjVar) | b.F(lkrVar);
            Object R3 = hfmVar2.R();
            if (F || R3 == hfc.a) {
                R3 = new ffix() { // from class: dppb
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffqy.d(ffsk.this, null, null, new dppx(cxjVar, null), 3);
                        ffjiVar.invoke(lkrVar);
                        return ffcu.a;
                    }
                };
                hfmVar = hfmVar2;
                hfmVar.ad(R3);
            } else {
                hfmVar = hfmVar2;
            }
            hfmVar.Z();
            fwa.b((ffix) R3, a, false, eqlVar, null, a2, ebfVar, hpx.d(1646262224, new dppy(hviVar, cxjVar, f, i4), b), b, 819462144);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dppc
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    float f2 = f;
                    ffji ffjiVar2 = ffjiVar;
                    atl atlVar2 = atlVar;
                    dpqe.b(f2, ffjiVar2, atlVar2, hviVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(305232009);
        if (i3 == 0) {
            i2 = (true != b.F(ffjmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            final lkr lkrVar = (lkr) b.e(lnr.a);
            dmhu[] dmhuVarArr = new dmhu[2];
            String a = jii.a(R.string.camera_mode_photo, b);
            String a2 = jii.a(R.string.camera_mode_photo_content_description, b);
            b.v(114864660);
            boolean z = (i2 & 14) == 4;
            boolean F = b.F(lkrVar) | z;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new ffix() { // from class: dpor
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffjm.this.a(lkrVar, 1);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            dmhuVarArr[0] = new dmhu(a, a2, (ffix) R);
            String a3 = jii.a(R.string.camera_mode_video, b);
            String a4 = jii.a(R.string.camera_mode_video_content_description, b);
            b.v(114872980);
            boolean F2 = z | b.F(lkrVar);
            Object R2 = hfmVar.R();
            if (F2 || R2 == hfc.a) {
                R2 = new ffix() { // from class: dpos
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffjm.this.a(lkrVar, 4);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            dmhuVarArr[1] = new dmhu(a3, a4, (ffix) R2);
            dmip dmipVar = new dmip(ffdx.g(dmhuVarArr));
            d = ebs.d(hvi.e, 1.0f);
            dmio.f(dmipVar, d, b, 48);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpot
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dpqe.c(ffjm.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(boolean z, hfd hfdVar, final int i) {
        int i2;
        final boolean z2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1921055058);
        if (i3 == 0) {
            i2 = (true != b.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            z2 = z;
        } else {
            z2 = z;
            cru.b(z2, null, ctt.l(cxu.c(100, 0, cyp.d, 2), 2), ctt.m(new dbu(300, 100, cyp.d), 2), null, dptu.a, b, (i2 & 14) | 196608, 18);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpou
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dpqe.d(z2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final dptl dptlVar, final float f, hvi hviVar, boolean z, hfd hfdVar, final int i, final int i2) {
        int i3;
        final hvi hviVar2;
        final boolean z2;
        int i4 = i2 & 1;
        hfd b = hfdVar.b(-653746324);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(dptlVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.A(f) ? 16 : 32;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != b.D(hviVar) ? 128 : 256;
        }
        int i6 = i2 & 8;
        boolean z3 = i6 == 0;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= true != b.E(z) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && b.I()) {
            b.s();
            hviVar2 = hviVar;
            z2 = z;
        } else {
            if (i5 != 0) {
                hviVar = hvi.e;
            }
            hvi hviVar3 = hviVar;
            boolean z4 = (!z3) | z;
            boolean z5 = dptlVar.r;
            b.v(-1351875125);
            j(dptlVar, f, hviVar3, z4, b, i3 & 8190);
            ((hfm) b).Z();
            acu.a(false, dptlVar.n, b, 0, 1);
            hviVar2 = hviVar3;
            z2 = z4;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dppk
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dptl dptlVar2 = dptl.this;
                    float f2 = f;
                    hvi hviVar4 = hviVar2;
                    dpqe.e(dptlVar2, f2, hviVar4, z2, (hfd) obj, hip.a(i | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final boolean f(hho hhoVar) {
        return ((Boolean) hhoVar.a()).booleanValue();
    }

    public static final void g(final dptl dptlVar, final float f, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        float f2;
        int i3;
        hvi a;
        hvi a2;
        hfd hfdVar2;
        hvi a3;
        int i4 = i & 6;
        hfd b = hfdVar.b(-285778221);
        if (i4 == 0) {
            i2 = (true != b.D(dptlVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.A(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            final lkr lkrVar = (lkr) b.e(lnr.a);
            int i5 = huo.a;
            ipn a4 = dyo.a(dxu.c, hum.k, b, 54);
            int a5 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hviVar);
            int i6 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a4, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a5))) {
                Integer valueOf = Integer.valueOf(a5);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            b.v(1579032604);
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar = (hho) R;
            hfmVar.Z();
            Object obj = null;
            if (!f(hhoVar) || dptlVar.f) {
                f2 = 24.0f;
                i3 = 6;
                b.v(1706184127);
                ebv.a(ebs.e(hvi.e, 24.0f), b);
                dpxn.a(dptlVar.g, null, f, b, (i2 << 3) & 896);
                hfmVar.Z();
            } else {
                b.v(1705481047);
                Iterator it = dptlVar.m.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((dpwn) next).c) {
                        obj = next;
                        break;
                    }
                }
                dpwn dpwnVar = (dpwn) obj;
                if (dpwnVar == null) {
                    dpwnVar = (dpwn) ffdx.K(dptlVar.m);
                    dpwnVar.f.invoke(lkrVar);
                }
                int i7 = i2;
                List list = dptlVar.m;
                hvi a6 = hxo.a(eba.j(hvi.e, 8.0f, 0.0f, 8.0f, 0.0f, 10), eqm.a);
                long j = dptv.a;
                a3 = dee.a(a6, dptv.c, idb.a);
                b.v(1579051705);
                boolean F = b.F(lkrVar);
                Object R2 = hfmVar.R();
                if (F || R2 == hfc.a) {
                    R2 = new ffji() { // from class: dpow
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj2) {
                            dpwn dpwnVar2 = (dpwn) obj2;
                            dpwnVar2.getClass();
                            dpwnVar2.f.invoke(lkr.this);
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R2);
                }
                hfmVar.Z();
                i3 = 6;
                f2 = 24.0f;
                dpwy.c(list, dpwnVar.d, a3, f, (ffji) R2, b, (i7 << 6) & 7168);
                hfmVar.Z();
            }
            ebv.a(ebs.e(hvi.e, f2), b);
            dxj dxjVar = dxu.e;
            hus husVar = hum.n;
            hve hveVar = hvi.e;
            ipn a7 = ebm.a(dxjVar, husVar, b, 54);
            int a8 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, hveVar);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a7, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a8))) {
                Integer valueOf2 = Integer.valueOf(a8);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b3, iss.c);
            ebr ebrVar = ebr.a;
            a = ebrVar.a(hvi.e, 1.0f, true);
            ipn a9 = ebm.a(dxu.e, hum.m, b, i3);
            int a10 = hey.a(b);
            hqb ai3 = hfmVar.ai();
            hvi b4 = huz.b(b, a);
            ffix ffixVar3 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar3);
            } else {
                b.z();
            }
            hlc.b(b, a9, iss.e);
            hlc.b(b, ai3, iss.d);
            ffjm ffjmVar3 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a10))) {
                Integer valueOf3 = Integer.valueOf(a10);
                hfmVar.ad(valueOf3);
                b.h(valueOf3, ffjmVar3);
            }
            hlc.b(b, b4, iss.c);
            cru.c(ebr.a, (dptlVar.m.isEmpty() || dptlVar.f) ? false : true, null, ctt.n(q(), 0.0f, 0L, i3), ctt.o(q(), 0.0f, 0L, i3), null, hpx.d(1133410173, new dppp(f, hhoVar), b), b, 1572870, 18);
            b.n();
            ffix ffixVar4 = dptlVar.k;
            dpvl dpvlVar = dptlVar.p;
            boolean z = dptlVar.f;
            Duration duration = dptlVar.e;
            int i8 = dptlVar.a;
            hve hveVar2 = hvi.e;
            long j2 = dptv.a;
            dpvi.b(ffixVar4, dpvlVar, z, duration, i8, ebs.k(hveVar2, 76.0f), b, 196608);
            a2 = ebrVar.a(hvi.e, 1.0f, true);
            ipn a11 = ebm.a(dxu.e, hum.m, b, 6);
            int a12 = hey.a(b);
            hqb ai4 = hfmVar.ai();
            hvi b5 = huz.b(b, a2);
            ffix ffixVar5 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar5);
            } else {
                b.z();
            }
            hlc.b(b, a11, iss.e);
            hlc.b(b, ai4, iss.d);
            ffjm ffjmVar4 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a12))) {
                Integer valueOf4 = Integer.valueOf(a12);
                hfmVar.ad(valueOf4);
                b.h(valueOf4, ffjmVar4);
            }
            hlc.b(b, b5, iss.c);
            cru.c(ebr.a, !dptlVar.f, null, ctt.n(q(), 0.0f, 0L, 6), ctt.o(q(), 0.0f, 0L, 6), null, hpx.d(-1765418138, new dppq(f, dptlVar), b), b, 1572870, 18);
            b.n();
            b.n();
            ebv.a(ebs.e(hvi.e, 26.0f), b);
            css.a(Boolean.valueOf(dptlVar.f), null, cxu.c(300, 0, new cyh(0.0f, 0.0f, 0.0f, 1.0f), 2), "Recording timer crossfade animation.", hpx.d(-60941506, new dppr(dptlVar), b), b, 28032, 2);
            hfdVar2 = b;
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpox
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dptl dptlVar2 = dptl.this;
                    float f3 = f;
                    int i9 = i;
                    dpqe.g(dptlVar2, f3, hviVar, (hfd) obj2, hip.a(i9 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void h(final hvi hviVar, final dptl dptlVar, final float f, final ixm ixmVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        hvi a2;
        hvi d;
        hvi d2;
        int i3 = i & 6;
        hfd b = hfdVar.b(669038023);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dptlVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.A(f) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? b.D(ixmVar) : b.F(ixmVar)) ? 1024 : 2048;
        }
        int i4 = i2;
        if ((i4 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            long j = dptv.a;
            a = dee.a(dptv.d, ibw.a, idb.a);
            hvi a3 = hviVar.a(a);
            int i5 = huo.a;
            ipn a4 = dyc.a(hum.b, false);
            int a5 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a3);
            int i6 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a4, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a5))) {
                Integer valueOf = Integer.valueOf(a5);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            dyi dyiVar = dyi.a;
            a2 = dee.a(hvi.e, ibw.a, idb.a);
            ipn a6 = dyo.a(dxu.c, hum.k, b, 54);
            int a7 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, a2);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a6, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a7))) {
                Integer valueOf2 = Integer.valueOf(a7);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b3, iss.c);
            d = ebs.d(hvi.e, 1.0f);
            boolean z = dptlVar.r;
            int i7 = (i4 >> 3) & 126;
            e(dptlVar, f, d, false, b, i7, 8);
            boolean z2 = dptlVar.q;
            l(ixmVar, dptv.e, b, ((i4 >> 9) & 14) | 392);
            b.n();
            d2 = ebs.d(eba.j(hvi.e, 0.0f, 0.0f, 0.0f, 24.0f, 7), 1.0f);
            g(dptlVar, f, dyiVar.a(d2, hum.h), b, i7);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpoz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    dptl dptlVar2 = dptlVar;
                    float f2 = f;
                    dpqe.h(hviVar2, dptlVar2, f2, ixmVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void i(final hvi hviVar, dptl dptlVar, float f, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        hvi d;
        final dptl dptlVar2;
        final float f2;
        hvi b;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-554663565);
        if (i3 == 0) {
            i2 = (true != b2.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.D(dptlVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.A(f) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b2.I()) {
            b2.s();
            dptlVar2 = dptlVar;
            f2 = f;
        } else {
            long j = dptv.a;
            a = dee.a(dptv.d, gft.a(b2).p, idb.a);
            hvi a2 = hviVar.a(a);
            int i4 = huo.a;
            ipn a3 = dyc.a(hum.b, false);
            int a4 = hey.a(b2);
            hfm hfmVar = (hfm) b2;
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, a2);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar);
            } else {
                b2.z();
            }
            hlc.b(b2, a3, iss.e);
            hlc.b(b2, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar);
            }
            hlc.b(b2, b3, iss.c);
            hvi hviVar2 = dptv.e;
            ipn a5 = dyo.a(dxu.c, hum.k, b2, 48);
            int a6 = hey.a(b2);
            hqb ai2 = hfmVar.ai();
            hvi b4 = huz.b(b2, hviVar2);
            ffix ffixVar2 = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar2);
            } else {
                b2.z();
            }
            hlc.b(b2, a5, iss.e);
            hlc.b(b2, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a6))) {
                Integer valueOf2 = Integer.valueOf(a6);
                hfmVar.ad(valueOf2);
                b2.h(valueOf2, ffjmVar2);
            }
            hlc.b(b2, b4, iss.c);
            d = ebs.d(hvi.e, 1.0f);
            boolean z = dptlVar.r;
            hvi a7 = hvr.a(d, 2.0f);
            int i6 = i2 >> 3;
            dptlVar2 = dptlVar;
            f2 = f;
            e(dptlVar2, f2, a7, false, b2, (i6 & 14) | 3072 | (i6 & 112), 0);
            b = dys.b(hvi.e, 1.0f, true);
            dpyr.c(b, dpym.a, b2, 48);
            b2.n();
            b2.n();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpoq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    dptl dptlVar3 = dptlVar2;
                    int i7 = i;
                    dpqe.i(hviVar3, dptlVar3, f2, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void j(final dptl dptlVar, final float f, final hvi hviVar, final boolean z, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(69585416);
        if (i3 == 0) {
            i2 = (true != b.D(dptlVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.A(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.E(z) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            dweu.a(dptu.b, hviVar, hpx.d(470540366, new dpqa(dptlVar), b), hpx.d(280256951, new dpqb(dptlVar, z, f), b), 0.0f, null, dwkh.b(ibw.g, 0L, 0L, b, 62), null, b, ((i2 >> 3) & 112) | 3462, 176);
            b = b;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dppf
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dptl dptlVar2 = dptl.this;
                    float f2 = f;
                    hvi hviVar2 = hviVar;
                    dpqe.j(dptlVar2, f2, hviVar2, z, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void k(hvi hviVar, final dptl dptlVar, final float f, final ixm ixmVar, hfd hfdVar, final int i) {
        hvi hviVar2;
        hvi a;
        hvi d;
        hvi d2;
        hfd b = hfdVar.b(470506709);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= true != b.D(dptlVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.A(f) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? b.D(ixmVar) : b.F(ixmVar)) ? 1024 : 2048;
        }
        int i3 = i2;
        if ((i3 & 1171) == 1170 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            hviVar2 = hvi.e;
            long j = dptv.a;
            a = dee.a(dptv.d, gft.a(b).p, idb.a);
            int i4 = huo.a;
            ipn a2 = dyc.a(hum.b, false);
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
            dyi dyiVar = dyi.a;
            hvi hviVar3 = dptv.e;
            ipn a4 = dyc.a(hum.b, false);
            int a5 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, hviVar3);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a4, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b3, iss.c);
            dyi dyiVar2 = dyi.a;
            d = ebs.d(hvi.e, 1.0f);
            boolean z = dptlVar.r;
            int i6 = (i3 >> 3) & 126;
            e(dptlVar, f, hvr.a(d, 2.0f), false, b, i6, 8);
            boolean z2 = dptlVar.q;
            l(ixmVar, dyiVar2.b(hvi.e), b, ((i3 >> 9) & 14) | 8);
            dput.a(dyiVar2, dptlVar.o, b, 6);
            b.n();
            d2 = ebs.d(eba.j(hvi.e, 0.0f, 0.0f, 0.0f, ((jzq) cxo.b(true != dptlVar.o.a() ? 4.0f : 32.0f, cxu.c(500, 0, new cyh(0.2f, 0.0f, 0.0f, 1.0f), 2), b, 48, 12).a()).a, 7), 1.0f);
            g(dptlVar, f, dyiVar.a(d2, hum.h), b, i6);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            final hvi hviVar4 = hviVar2;
            L.d = new ffjm() { // from class: dpov
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar5 = hvi.this;
                    dptl dptlVar2 = dptlVar;
                    float f2 = f;
                    dpqe.k(hviVar5, dptlVar2, f2, ixmVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void l(final ixm ixmVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1546219229);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? b.D(ixmVar) : b.F(ixmVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(false) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            final lkr lkrVar = (lkr) b.e(lnr.a);
            b.v(960759627);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            final hho hhoVar = (hho) R;
            hfmVar.Z();
            int i4 = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hviVar);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            b.v(561729725);
            int i6 = i2 & 112;
            Object R2 = hfmVar.R();
            if (i6 == 32 || R2 == hfc.a) {
                R2 = new ffji() { // from class: dppg
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        context.getClass();
                        PreviewView previewView = new PreviewView(context);
                        previewView.setClipToOutline(true);
                        return previewView;
                    }
                };
                hfmVar.ad(R2);
            }
            ffji ffjiVar = (ffji) R2;
            hfmVar.Z();
            c = ebs.c(hvi.e, 1.0f);
            b.v(561739067);
            boolean F = ((i2 & 14) == 4 || ((i2 & 8) != 0 && b.F(ixmVar))) | b.F(lkrVar);
            Object R3 = hfmVar.R();
            if (F || R3 == hfc.a) {
                R3 = new ffji() { // from class: dpph
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        PreviewView previewView = (PreviewView) obj;
                        previewView.getClass();
                        ixm.this.a = previewView;
                        final hho hhoVar2 = hhoVar;
                        previewView.e.f(lkrVar, new dpqd(new ffji() { // from class: dpoo
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj2) {
                                hho.this.b(Boolean.valueOf(((cch) obj2) == cch.STREAMING));
                                return ffcu.a;
                            }
                        }));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R3);
            }
            hfmVar.Z();
            kcg.b(ffjiVar, c, (ffji) R3, b, 48, 0);
            d(!((Boolean) hhoVar.a()).booleanValue(), b, 0);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dppi
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ixm ixmVar2 = ixm.this;
                    int i7 = i;
                    dpqe.l(ixmVar2, hviVar, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void m(final Duration duration, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        hvi c;
        hfd b = hfdVar.b(1303914597);
        if ((i & 6) == 0) {
            i2 = (true != b.F(duration) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 19) == 18 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            hviVar2 = hvi.e;
            hvi e = ebs.e(hviVar2, 32.0f);
            long j = dptv.a;
            hvi a = dee.a(e, dptv.a, eqm.a(50));
            dxj dxjVar = dxu.h;
            int i3 = huo.a;
            ipn a2 = dyo.a(dxjVar, hum.k, b, 54);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a);
            int i4 = ist.a;
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
            final String b3 = jii.b(R.string.camera_recording_time_content_description, new Object[]{Long.valueOf(duration.getSeconds())}, b);
            dtca dtcaVar = new dtca(duration, dptv.b, gft.d(b).h);
            hvi j2 = eba.j(hvi.e, 17.0f, 0.0f, 17.0f, 0.0f, 10);
            b.v(794210068);
            boolean D = b.D(b3);
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new ffji() { // from class: dppd
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        jkvVar.getClass();
                        jkr.k(jkvVar, b3);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            c = jjs.c(j2, false, (ffji) R);
            dtce.a(dtcaVar, c, b, 0, 0);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dppe
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    Duration duration2 = Duration.this;
                    int i5 = i;
                    dpqe.m(duration2, hviVar2, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void n(ffix ffixVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-436779437);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i4 & 19) == 18 && b.I()) {
            b.s();
            ffixVar2 = ffixVar;
        } else {
            hve hveVar = hvi.e;
            ffixVar2 = ffixVar;
            gem.b(ffixVar2, hveVar, false, null, null, dptu.c, b, (i4 & 14) | 1572864 | (i4 & 112), 60);
            hviVar = hveVar;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dppj
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffix ffixVar3 = ffix.this;
                    int i5 = i;
                    dpqe.n(ffixVar3, hviVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void o(final float f, final ffix ffixVar, final boolean z, final int i, hvi hviVar, hfd hfdVar, final int i2) {
        int i3;
        ffix ffixVar2;
        final hvi hviVar2;
        int i4 = i2 & 6;
        hfd b = hfdVar.b(2057627628);
        if (i4 == 0) {
            i3 = (true != b.A(f) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            ffixVar2 = ffixVar;
            i3 |= true != b.F(ffixVar2) ? 16 : 32;
        } else {
            ffixVar2 = ffixVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b.E(z) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != b.B(i) ? 1024 : 2048;
        }
        int i5 = i3 | 24576;
        if ((i5 & 9363) == 9362 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            hve hveVar = hvi.e;
            List g = i != 1 ? i != 2 ? ffdx.g(Integer.valueOf(R.drawable.gs_flash_auto_vd_theme_24), Integer.valueOf(R.string.camera_flash_mode_auto_button_content_description)) : ffdx.g(Integer.valueOf(R.drawable.gs_flash_off_vd_theme_24), Integer.valueOf(R.string.camera_flash_mode_off_button_content_description)) : ffdx.g(Integer.valueOf(R.drawable.gs_flash_on_vd_theme_24), Integer.valueOf(R.string.camera_flash_mode_on_button_content_description));
            gem.b(ffixVar2, hveVar, !z, null, null, hpx.d(-1435284338, new dppz(((Number) g.get(0)).intValue(), f, ((Number) g.get(1)).intValue()), b), b, ((i5 >> 3) & 14) | 1572864 | ((i5 >> 9) & 112), 56);
            hviVar2 = hveVar;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dppa
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    float f2 = f;
                    ffix ffixVar3 = ffixVar;
                    boolean z2 = z;
                    int i6 = i;
                    dpqe.o(f2, ffixVar3, z2, i6, hviVar2, (hfd) obj, hip.a(i2 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final float p(hkx hkxVar) {
        return ((Number) hkxVar.a()).floatValue();
    }

    private static final dbu q() {
        return cxu.c(350, 0, new cyh(0.3f, 0.0f, 0.8f, 0.15f), 2);
    }

    private static final hvi r(hvi hviVar, hzi hziVar, ffix ffixVar, hfd hfdVar) {
        hvi a;
        hfdVar.v(-234403439);
        hfdVar.v(54491851);
        boolean D = hfdVar.D(ffixVar);
        hfm hfmVar = (hfm) hfdVar;
        Object R = hfmVar.R();
        if (D || R == hfc.a) {
            R = new dpqc(ffixVar);
            hfmVar.ad(R);
        }
        hfmVar.Z();
        a = dfz.a(hzk.a(ija.a(hviVar, (ffji) R), hziVar), true, null);
        hfmVar.Z();
        return a;
    }
}
