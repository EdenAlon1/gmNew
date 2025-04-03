package defpackage;

import android.content.Context;
import android.provider.Settings;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adqr {
    public static final void a(ffix ffixVar, ffix ffixVar2, final fgdj fgdjVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hvi a;
        hvi a2;
        final ffix ffixVar3;
        final ffix ffixVar4;
        int i3 = i & 6;
        hfd b = hfdVar.b(492615927);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(fgdjVar) ? 128 : 256;
        }
        int i4 = i2;
        if ((i4 & 147) == 146 && b.I()) {
            b.s();
            ffixVar3 = ffixVar;
            ffixVar4 = ffixVar2;
        } else {
            dxj dxjVar = dxu.e;
            d = ebs.d(hvi.e, 1.0f);
            int i5 = huo.a;
            ipn a3 = ebm.a(dxjVar, hum.m, b, 6);
            int a4 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, d);
            int i6 = ist.a;
            ffix ffixVar5 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar5);
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
            ebr ebrVar = ebr.a;
            a = ebrVar.a(hvi.e, 1.0f, true);
            dwfj.a(ffixVar, a, false, null, null, null, null, null, adpt.b, b, (i4 & 14) | 805306368, 508);
            ebv.a(ebs.o(hvi.e, 8.0f), b);
            a2 = ebrVar.a(hvi.e, 1.0f, true);
            ffixVar3 = ffixVar;
            ffixVar4 = ffixVar2;
            dwfj.a(ffixVar4, a2, ((Boolean) hkf.a(fgdjVar, b).a()).booleanValue(), null, null, null, null, null, adpt.c, b, ((i4 >> 3) & 14) | 805306368, 504);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: adqj
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffix ffixVar6 = ffix.this;
                    ffix ffixVar7 = ffixVar4;
                    int i7 = i;
                    adqr.a(ffixVar6, ffixVar7, fgdjVar, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dmzz dmzzVar, final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(121449895);
        if (i3 == 0) {
            i2 = i | (true != b.D(dmzzVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hvi i4 = eba.i(hvi.e, 0.0f, 16.0f, 1);
            int i5 = huo.a;
            ipn a = ebm.a(dxu.a, hum.n, b, 48);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, i4);
            int i6 = ist.a;
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
            dwho.a(dnaa.a(dmzzVar, b), null, ebs.k(hvi.e, 24.0f), 0L, b, 432, 8);
            ebv.a(ebs.o(hvi.e, 16.0f), b);
            hfdVar2 = b;
            dwjt.b(str, null, gft.a(b).s, 0L, null, null, 0L, new jyj(5), 0L, 0, false, 0, 0, null, gft.d(b).j, hfdVar2, (i2 >> 3) & 14, 0, 65018);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: adqo
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmzz dmzzVar2 = dmzz.this;
                    int i7 = i;
                    adqr.b(dmzzVar2, str, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final adqf adqfVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        long f;
        hfm hfmVar;
        hvi d2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(2070927560);
        if (i3 == 0) {
            i2 = (true != b.D(adqfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            d = ebs.d(hvi.e, 1.0f);
            f = iby.f(ibw.d(r5), ibw.c(r5), ibw.b(r5), 0.1f, ibw.f(gft.a(b).q));
            hvi d3 = eba.d(dee.a(dek.b(d, des.a(1.0f, f), eqm.a(10)), gft.a(b).J, eqm.a(10)), 20.0f);
            int i4 = huo.a;
            ipn a = dyo.a(dxu.c, hum.k, b, 48);
            int a2 = hey.a(b);
            hfm hfmVar2 = (hfm) b;
            hqb ai = hfmVar2.ai();
            hvi b2 = huz.b(b, d3);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar2.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            ebv.a(ebs.e(hvi.e, Settings.System.getFloat(((Context) b.e(AndroidCompositionLocals_androidKt.b)).getContentResolver(), "font_scale", 1.0f) * 12.0f), b);
            b.v(-1312840280);
            String str = adqfVar.b;
            if (str != null) {
                hfmVar = hfmVar2;
                dwjt.b(str, null, gft.a(b).q, 0L, null, null, 0L, new jyj(5), 0L, 0, false, 0, 0, null, gft.d(b).m, b, 0, 0, 65018);
                b = b;
            } else {
                hfmVar = hfmVar2;
            }
            hfmVar.Z();
            d2 = ebs.d(hvi.e, 1.0f);
            ipn a3 = ebm.a(dxu.e, hum.n, b, 54);
            int a4 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, d2);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a3, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf2 = Integer.valueOf(a4);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b3, iss.c);
            dnxw.j(new dnyo(new dnwp(adqp.a, null, 5), null, 0, null, 0.0f, null, 62), ebs.e(hvi.e, 40.0f), b, 48);
            dnrv.c(new dnsh("1", null, null, null, null, null, 1879048190), ebs.o(hvi.e, 200.0f), false, null, null, adpt.a, b, 197046, 24);
            b.n();
            ebv.a(ebs.e(hvi.e, 20.0f), b);
            hfdVar2 = b;
            dwjt.b(jii.a(R.string.account_sign_out_profile_description, b), null, gft.a(b).s, 0L, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, gft.d(b).l, hfdVar2, 0, 0, 65018);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: adqk
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    adqr.c(adqf.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final adqf adqfVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(732404236);
        if (i3 == 0) {
            i2 = (true != b.D(adqfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            ebv.a(ebs.e(hvi.e, 28.0f), b);
            d = ebs.d(hvi.e, 1.0f);
            hvi y = ebs.y(d);
            int i4 = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, y);
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
            dyi dyiVar = dyi.a;
            c(adqfVar, b, i2 & 14);
            e(dyiVar, b, 6);
            b.n();
            ebv.a(ebs.e(hvi.e, 16.0f), b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: adqg
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    adqr.d(adqf.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final dyh dyhVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1808089406);
        if (i3 == 0) {
            i2 = (true != b.D(dyhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hve hveVar = hvi.e;
            int i4 = huo.a;
            a = dee.a(eau.b(dyhVar.a(hveVar, hum.a), -12.0f, -24.0f), gft.a(b).J, idb.a);
            hvi f = eba.f(a, 12.0f, 12.0f, 20.0f, 20.0f);
            ipn a2 = ebm.a(dxu.a, hum.n, b, 48);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, f);
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
            dwho.a(dnaa.a(dmzz.bo, b), null, ebs.k(hvi.e, 24.0f), 0L, b, 432, 8);
            ebv.a(ebs.o(hvi.e, 16.0f), b);
            hfdVar2 = b;
            dwjt.b("Profiles", null, gft.a(b).s, 0L, null, null, 0L, new jyj(5), 0L, 0, false, 0, 0, null, gft.d(b).j, hfdVar2, 6, 0, 65018);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: adqh
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    adqr.e(dyh.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final fgdj fgdjVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        int i3 = i & 6;
        hfd b = hfdVar.b(1125620956);
        if (i3 == 0) {
            i2 = (true != b.F(fgdjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            adqf adqfVar = (adqf) hkf.a(fgdjVar, b).a();
            if (adqfVar == null) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: adqm
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int i4 = i;
                            adqr.f(fgdj.this, (hfd) obj, hip.a(i4 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            c = ebs.c(hvi.e, 1.0f);
            gpa.c(ecm.b(c, ecv.f(b)), null, 0L, 0L, 0.0f, 0.0f, null, hpx.d(1799200375, new adqq(adqfVar), b), b, 126);
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: adqn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    adqr.f(fgdj.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(final dys dysVar, final adqf adqfVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(1629923403);
        if (i3 == 0) {
            i2 = (true != b.D(dysVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(adqfVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            String a = jii.a(R.string.account_sign_out_description, b);
            jpo jpoVar = gft.d(b).h;
            long j = gft.a(b).s;
            hve hveVar = hvi.e;
            int i4 = huo.a;
            dwjt.b(a, dys.a(hveVar, hum.k), j, 0L, null, null, 0L, new jyj(5), 0L, 0, false, 0, 0, null, jpoVar, b, 0, 0, 65016);
            ebv.a(ebs.e(hvi.e, 12.0f), b);
            d = ebs.d(hvi.e, 1.0f);
            hvi e = eba.e(dee.a(d, gft.a(b).J, eqm.a(10)), 32.0f, 16.0f);
            ipn a2 = dyo.a(dxu.c, hum.j, b, 48);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, e);
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
            b(dmzz.cg, jii.a(R.string.account_sign_out_description_magic_compose, b), b, 6);
            b(dmzz.aF, jii.a(R.string.account_sign_out_description_device_pairing, b), b, 6);
            b.v(-1775598866);
            if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue()) {
                b(dmzz.bn, jii.a(R.string.account_sign_out_description_gemini, b), b, 6);
            }
            hfmVar.Z();
            d(adqfVar, b, (i2 >> 3) & 14);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: adql
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dys dysVar2 = dys.this;
                    int i6 = i;
                    adqr.g(dysVar2, adqfVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void h(final dys dysVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(812056124);
        if (i3 == 0) {
            i2 = (true != b.D(dysVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            igq a = dnaa.a(dmzz.cN, b);
            hvi k = ebs.k(hvi.e, 30.0f);
            int i4 = huo.a;
            dwho.a(a, null, dys.a(k, hum.k), gft.a(b).s, b, 48, 0);
            ebv.a(ebs.e(hvi.e, 20.0f), b);
            hfdVar2 = b;
            dwjt.b(jii.a(R.string.account_sign_out_title, b), dys.a(hvi.e, hum.k), gft.a(b).q, 0L, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, gft.d(b).d, hfdVar2, 0, 0, 65016);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: adqi
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    adqr.h(dys.this, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
