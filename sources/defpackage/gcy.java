package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcy {
    public static final ebe a = eba.h(0.0f, 0.0f, 12.0f, 12.0f, 3);
    public static final float b;

    static {
        eba.h(24.0f, 16.0f, 12.0f, 0.0f, 8);
        eba.h(24.0f, 0.0f, 12.0f, 12.0f, 2);
        b = 16.0f;
    }

    public static final void a(hvi hviVar, ffjm ffjmVar, ffjm ffjmVar2, ffjm ffjmVar3, fzr fzrVar, jpo jpoVar, float f, ffjm ffjmVar4, hfd hfdVar, int i) {
        hvi hviVar2;
        int i2;
        ffjm ffjmVar5;
        ffjm ffjmVar6;
        ffjm ffjmVar7;
        jpo jpoVar2;
        hvi c;
        hvi a2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(1507356255);
        if (i3 == 0) {
            hviVar2 = hviVar;
            i2 = (true != b2.D(hviVar2) ? 2 : 4) | i;
        } else {
            hviVar2 = hviVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            ffjmVar5 = ffjmVar;
            i2 |= true != b2.F(ffjmVar5) ? 16 : 32;
        } else {
            ffjmVar5 = ffjmVar;
        }
        if ((i & 384) == 0) {
            ffjmVar6 = ffjmVar2;
            i2 |= true != b2.F(ffjmVar6) ? 128 : 256;
        } else {
            ffjmVar6 = ffjmVar2;
        }
        if ((i & 3072) == 0) {
            ffjmVar7 = ffjmVar3;
            i2 |= true != b2.F(ffjmVar7) ? 1024 : 2048;
        } else {
            ffjmVar7 = ffjmVar3;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.D(fzrVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            jpoVar2 = jpoVar;
            i2 |= true != b2.D(jpoVar2) ? 65536 : 131072;
        } else {
            jpoVar2 = jpoVar;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b2.A(120.0f) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b2.F(ffjmVar4) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        int i4 = i2;
        if ((i4 & 4793491) == 4793490 && b2.I()) {
            b2.s();
            hfdVar2 = b2;
        } else {
            c = jjs.c(ebs.w(hviVar2, 360.0f, 0.0f, 0.0f, 0.0f, 14), false, gaf.a);
            a2 = dee.a(c, fzrVar.a, idb.a);
            dxq dxqVar = dxu.c;
            int i5 = huo.a;
            ipn a3 = dyo.a(dxqVar, hum.j, b2, 0);
            int a4 = hey.a(b2);
            hfm hfmVar = (hfm) b2;
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, a2);
            int i6 = ist.a;
            ffix ffixVar = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar);
            } else {
                b2.z();
            }
            hlc.b(b2, a3, iss.e);
            hlc.b(b2, ai, iss.d);
            ffjm ffjmVar8 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar8);
            }
            hlc.b(b2, b3, iss.c);
            c(hvi.e, ffjmVar, fzrVar.b, fzrVar.c, 120.0f, hpx.d(-229007058, new gah(ffjmVar6, ffjmVar7, ffjmVar5, fzrVar, jpoVar2), b2), b2, (i4 & 112) | 196614 | ((i4 >> 6) & 57344));
            hfdVar2 = b2;
            ffjmVar4.a(hfdVar2, Integer.valueOf((i4 >> 21) & 14));
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new gai(hviVar, ffjmVar, ffjmVar2, ffjmVar3, fzrVar, jpoVar, 120.0f, ffjmVar4, i);
        }
    }

    public static final void b(hho hhoVar, boolean z) {
        hhoVar.b(Boolean.valueOf(z));
    }

    public static final void c(hvi hviVar, ffjm ffjmVar, long j, long j2, float f, ffjm ffjmVar2, hfd hfdVar, int i) {
        hvi hviVar2;
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-996037719);
        if (i3 == 0) {
            hviVar2 = hviVar;
            i2 = (true != b2.D(hviVar2) ? 2 : 4) | i;
        } else {
            hviVar2 = hviVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.F(ffjmVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.C(j) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.C(j2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.A(120.0f) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b2.F(ffjmVar2) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && b2.I()) {
            b2.s();
        } else {
            hvi q = ffjmVar != null ? ebs.q(hvi.e, 0.0f, 120.0f, 1) : hvi.e;
            d = ebs.d(hviVar2, 1.0f);
            hvi a2 = d.a(q);
            dxj dxjVar = dxu.g;
            int i4 = huo.a;
            ipn a3 = dyo.a(dxjVar, hum.j, b2, 6);
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
            ffjm ffjmVar3 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar3);
            }
            hlc.b(b2, b3, iss.c);
            if (ffjmVar != null) {
                b2.v(1251910527);
                hca.a(j, gvu.a(hdu.e, b2), hpx.d(1936268514, new gbb(ffjmVar), b2), b2, ((i2 >> 6) & 14) | 384);
                hfmVar.Z();
            } else {
                b2.v(1252179607);
                hfmVar.Z();
            }
            hfz.a(fzc.a.c(new ibw(j2)), ffjmVar2, b2, ((i2 >> 12) & 112) | 8);
            b2.n();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gbc(hviVar, ffjmVar, j, j2, 120.0f, ffjmVar2, i);
        }
    }

    public static final void d(hvi hviVar, int i, ffji ffjiVar, fzr fzrVar, hfd hfdVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        hfd b2 = hfdVar.b(-1461252485);
        if (i4 == 0) {
            i3 = (true != b2.D(hviVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b2.B(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b2.F(ffjiVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != b2.D(fzrVar) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && b2.I()) {
            b2.s();
        } else {
            hfz.a(fzc.a.c(new ibw(fzrVar.c)), hpx.d(-1734512197, new gbj(i, ffjiVar, hviVar), b2), b2, 56);
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gbk(hviVar, i, ffjiVar, fzrVar, i2);
        }
    }

    public static final void e(hvi hviVar, boolean z, boolean z2, boolean z3, String str, ffix ffixVar, ffix ffixVar2, ffix ffixVar3, fzr fzrVar, hfd hfdVar, int i) {
        hvi hviVar2;
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-773929258);
        if (i3 == 0) {
            hviVar2 = hviVar;
            i2 = (true != b2.D(hviVar2) ? 2 : 4) | i;
        } else {
            hviVar2 = hviVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.E(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.E(z3) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.D(str) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b2.F(ffixVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b2.F(ffixVar2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b2.F(ffixVar3) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != b2.D(fzrVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((38347923 & i2) == 38347922 && b2.I()) {
            b2.s();
        } else {
            d = ebs.d(hviVar2, 1.0f);
            hvi g = ebs.g(d, 56.0f);
            dxi dxiVar = z3 ? dxu.a : dxu.g;
            int i4 = huo.a;
            ipn a2 = ebm.a(dxiVar, hum.n, b2, 48);
            int a3 = hey.a(b2);
            hfm hfmVar = (hfm) b2;
            int i5 = i2;
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, g);
            int i6 = ist.a;
            ffix ffixVar4 = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar4);
            } else {
                b2.z();
            }
            hlc.b(b2, a2, iss.e);
            hlc.b(b2, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar);
            }
            hlc.b(b2, b3, iss.c);
            j(ffixVar3, z3, null, hpx.d(619076006, new gbw(str, fzrVar), b2), b2, ((i5 >> 21) & 14) | 3072 | ((i5 >> 6) & 112));
            if (z3) {
                b2.v(-847923847);
                hfmVar.Z();
            } else {
                b2.v(-848726282);
                hfz.a(fzc.a.c(new ibw(fzrVar.f)), hpx.d(-128317193, new gbx(ffixVar2, z2, ffixVar, z), b2), b2, 56);
                hfmVar.Z();
            }
            b2.n();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gby(hviVar2, z, z2, z3, str, ffixVar, ffixVar2, ffixVar3, fzrVar, i);
        }
    }

    public static final void f(fzr fzrVar, ham hamVar, hfd hfdVar, int i) {
        hvi d;
        hfd hfdVar2;
        int i2 = i & 6;
        hfd b2 = hfdVar.b(-1849465391);
        int i3 = i2 == 0 ? (true != b2.D(fzrVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != b2.F(hamVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b2.I()) {
            b2.s();
            hfdVar2 = b2;
        } else {
            int a2 = hamVar.a();
            List k = hamVar.k();
            ArrayList arrayList = new ArrayList();
            int i4 = a2 - 1;
            int size = k.size();
            for (int i5 = i4; i5 < size; i5++) {
                arrayList.add(k.get(i5));
            }
            boolean z = false;
            for (int i6 = 0; i6 < i4; i6++) {
                arrayList.add(k.get(i6));
            }
            jpo a3 = gvu.a(hdu.f, b2);
            d = ebs.d(ebs.q(hvi.e, 0.0f, 48.0f, 1), 1.0f);
            dxj dxjVar = dxu.f;
            int i7 = huo.a;
            ipn a4 = ebm.a(dxjVar, hum.n, b2, 54);
            int a5 = hey.a(b2);
            hfm hfmVar = (hfm) b2;
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, d);
            int i8 = ist.a;
            ffix ffixVar = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar);
            } else {
                b2.z();
            }
            hlc.b(b2, a4, iss.e);
            hlc.b(b2, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a5))) {
                Integer valueOf = Integer.valueOf(a5);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar);
            }
            hlc.b(b2, b3, iss.c);
            b2.v(396446975);
            int size2 = arrayList.size();
            int i9 = 0;
            while (i9 < size2) {
                ffcf ffcfVar = (ffcf) arrayList.get(i9);
                hve hveVar = hvi.e;
                boolean D = b2.D(ffcfVar);
                Object R = hfmVar.R();
                if (D || R == hfc.a) {
                    R = new gci(ffcfVar);
                    hfmVar.ad(R);
                }
                hvi m = ebs.m(ebs.w(jjs.b(hveVar, (ffji) R), 40.0f, 40.0f, 0.0f, 0.0f, 12), ((jzq) b2.e(gex.a)).a, ((jzq) b2.e(gex.a)).a);
                ipn a6 = dyc.a(hum.e, z);
                int a7 = hey.a(b2);
                hqb ai2 = hfmVar.ai();
                hvi b4 = huz.b(b2, m);
                ffix ffixVar2 = iss.a;
                b2.x();
                if (hfmVar.z) {
                    b2.j(ffixVar2);
                } else {
                    b2.z();
                }
                hlc.b(b2, a6, iss.e);
                hlc.b(b2, ai2, iss.d);
                ffjm ffjmVar2 = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a7))) {
                    Integer valueOf2 = Integer.valueOf(a7);
                    hfmVar.ad(valueOf2);
                    b2.h(valueOf2, ffjmVar2);
                }
                hlc.b(b2, b4, iss.c);
                hfd hfdVar3 = b2;
                grl.b((String) ffcfVar.b, ebs.z(hvi.e, null, 3), fzrVar.d, 0L, null, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, a3, hfdVar3, 48, 0, 65016);
                hfdVar3.n();
                i9++;
                arrayList = arrayList;
                b2 = hfdVar3;
                z = z;
                hfmVar = hfmVar;
            }
            hfdVar2 = b2;
            hfmVar.Z();
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new gcj(fzrVar, hamVar, i);
        }
    }

    public static final void g(String str, hvi hviVar, boolean z, boolean z2, ffix ffixVar, boolean z3, String str2, fzr fzrVar, hfd hfdVar, int i) {
        String str3;
        int i2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-1153850597);
        if (i3 == 0) {
            str3 = str;
            i2 = (true != b2.D(str3) ? 2 : 4) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.E(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.F(ffixVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b2.E(z3) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b2.D(str2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b2.D(fzrVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((4793491 & i2) == 4793490 && b2.I()) {
            b2.s();
        } else {
            boolean z4 = (i2 & 7168) == 2048;
            boolean z5 = (i2 & 896) == 256;
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if ((z4 | z5) || R == hfc.a) {
                R = (!z2 || z) ? null : des.a(1.0f, fzrVar.u);
                hfmVar.ad(R);
            }
            int i4 = 3670016 & i2;
            der derVar = (der) R;
            Object R2 = hfmVar.R();
            if (i4 == 1048576 || R2 == hfc.a) {
                R2 = new gck(str2);
                hfmVar.ad(R2);
            }
            gpa.d(z, ffixVar, jjs.c(hviVar, true, (ffji) R2), z3, glx.c(5, b2), ((ibw) cwo.b(z ? z3 ? fzrVar.l : fzrVar.m : ibw.g, gjb.a(4, b2), b2, 0, 12).a()).i, 0.0f, derVar, null, hpx.d(-564400443, new gcm(str3, fzrVar, z2, z, z3), b2), b2, 1472);
            b2 = b2;
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gcn(str, hviVar, z, z2, ffixVar, z3, str2, fzrVar, i);
        }
    }

    public static final boolean h(hho hhoVar) {
        return ((Boolean) hhoVar.a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(gcz gczVar, hvi hviVar, gae gaeVar, fzr fzrVar, ffjm ffjmVar, ffjm ffjmVar2, boolean z, boolean z2, hfd hfdVar, int i) {
        int i2;
        boolean z3;
        hpn hpnVar;
        boolean z4;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(718289521);
        if (i3 == 0) {
            i2 = (true != b2.D(gczVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? b2.D(gaeVar) : b2.F(gaeVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.D(fzrVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.F(ffjmVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b2.F(ffjmVar2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b2.E(z) ? 524288 : 1048576;
        }
        int i4 = i2 | 12582912;
        if ((4793491 & i4) == 4793490 && b2.I()) {
            b2.s();
            z4 = z2;
        } else {
            b2.t();
            if ((i & 1) == 0 || b2.G()) {
                z3 = true;
            } else {
                b2.s();
                z3 = z2;
            }
            b2.l();
            fuh fuhVar = (fuh) gczVar;
            boolean D = b2.D(fuhVar.b);
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = fuhVar.c;
                hfmVar.ad(R);
            }
            ham hamVar = (ham) R;
            if (z) {
                b2.v(-666877896);
                hpnVar = hpx.d(-1963206653, new gak(gczVar, fzrVar), b2);
                hfmVar.Z();
            } else {
                b2.v(-666491233);
                hfmVar.Z();
                hpnVar = null;
            }
            hpn hpnVar2 = hpnVar;
            jpo a2 = gvu.a(hdu.d, b2);
            z4 = z3;
            hpn d = hpx.d(885670018, new gan(gczVar, hamVar, gaeVar, fzrVar, z3), b2);
            int i5 = i4 >> 9;
            a(hviVar, ffjmVar, ffjmVar2, hpnVar2, fzrVar, a2, 120.0f, d, b2, ((i4 >> 3) & 14) | 14155776 | (i5 & 112) | (i5 & 896) | (57344 & (i4 << 3)));
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gao(gczVar, hviVar, gaeVar, fzrVar, ffjmVar, ffjmVar2, z, z4, i);
        }
    }

    public static final void j(ffix ffixVar, boolean z, hvi hviVar, ffjm ffjmVar, hfd hfdVar, int i) {
        ffix ffixVar2;
        int i2;
        hvi hviVar2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(409654418);
        if (i3 == 0) {
            ffixVar2 = ffixVar;
            i2 = (true != b2.F(ffixVar2) ? 2 : 4) | i;
        } else {
            ffixVar2 = ffixVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.E(z) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= true != b2.F(ffjmVar) ? 1024 : 2048;
        }
        if ((i4 & 1171) == 1170 && b2.I()) {
            b2.s();
            hviVar2 = hviVar;
        } else {
            hve hveVar = hvi.e;
            eql eqlVar = eqm.a;
            ebe ebeVar = fvp.a;
            fwa.c(ffixVar2, hveVar, false, eqlVar, fvp.e(0L, ((ibw) b2.e(fzc.a)).i, b2, 13), null, hpx.d(1899012021, new gct(ffjmVar, z), b2), b2, (i4 & 14) | 807075840 | ((i4 >> 3) & 112), 388);
            b2 = b2;
            hviVar2 = hveVar;
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gcu(ffixVar, z, hviVar2, ffjmVar, i);
        }
    }

    public static final void k(hvi hviVar, long j, ffji ffjiVar, dmug dmugVar, ham hamVar, ffmj ffmjVar, fzr fzrVar, hfd hfdVar, int i) {
        hvi hviVar2;
        int i2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-1286899812);
        if (i3 == 0) {
            hviVar2 = hviVar;
            i2 = (true != b2.D(hviVar2) ? 2 : 4) | i;
        } else {
            hviVar2 = hviVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.C(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.F(ffjiVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.D(dmugVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.F(hamVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b2.F(ffmjVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b2.D(fzrVar) ? 524288 : 1048576;
        }
        if ((i2 & 599187) == 599186 && b2.I()) {
            b2.s();
        } else {
            grl.a(gvu.a(hdu.i, b2), hpx.d(1301915789, new gcr(hamVar, j, ffmjVar, hviVar2, fzrVar, ffjiVar, dmugVar), b2), b2, 48);
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gcs(hviVar, j, ffjiVar, dmugVar, hamVar, ffmjVar, fzrVar, i);
        }
    }

    public static final void l(Long l, long j, ffji ffjiVar, ffji ffjiVar2, ham hamVar, ffmj ffmjVar, gae gaeVar, dmug dmugVar, fzr fzrVar, hfd hfdVar, int i) {
        int i2;
        hfd b2 = hfdVar.b(-434467002);
        if ((i & 6) == 0) {
            i2 = (true != b2.D(l) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.C(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.F(ffjiVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.F(ffjiVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.F(hamVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b2.F(ffmjVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != ((2097152 & i) == 0 ? b2.D(gaeVar) : b2.F(gaeVar)) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b2.D(dmugVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != b2.D(fzrVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        int i3 = i2;
        if ((38347923 & i3) == 38347922 && b2.I()) {
            b2.s();
        } else {
            haq e = hamVar.e(j);
            int f = ffmk.f((((e.a - ffmjVar.a) * 12) + e.b) - 1, 0);
            eey a2 = efb.a(f, b2, 2);
            Integer valueOf = Integer.valueOf(f);
            boolean D = b2.D(a2) | b2.B(f);
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new gap(a2, f, null);
                hfmVar.ad(R);
            }
            hgs.g(valueOf, (ffjm) R, b2);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                hgd hgdVar = new hgd(hgs.a(ffhe.a, b2));
                hfmVar.ad(hgdVar);
                R2 = hgdVar;
            }
            ffsk ffskVar = ((hgd) R2).a;
            hho hhoVar = (hho) hqr.c(new Object[0], null, gba.a, b2, 3072, 6);
            hve hveVar = hvi.e;
            dxq dxqVar = dxu.c;
            int i4 = huo.a;
            ipn a3 = dyo.a(dxqVar, hum.j, b2, 0);
            int a4 = hey.a(b2);
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, hveVar);
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
                Integer valueOf2 = Integer.valueOf(a4);
                hfmVar.ad(valueOf2);
                b2.h(valueOf2, ffjmVar);
            }
            hlc.b(b2, b3, iss.c);
            hvi i6 = eba.i(hvi.e, 12.0f, 0.0f, 2);
            boolean h = a2.h();
            boolean g = a2.g();
            boolean h2 = h(hhoVar);
            Long valueOf3 = Long.valueOf(j);
            Locale locale = hamVar.a;
            Map map = gaeVar.b;
            String str = gaeVar.a;
            valueOf3.getClass();
            String a5 = hap.a(j, str, locale, map);
            if (a5 == null) {
                a5 = "-";
            }
            String str2 = a5;
            boolean F = b2.F(ffskVar) | b2.D(a2);
            Object R3 = hfmVar.R();
            if (F || R3 == hfc.a) {
                R3 = new gar(ffskVar, a2);
                hfmVar.ad(R3);
            }
            ffix ffixVar2 = (ffix) R3;
            boolean F2 = b2.F(ffskVar) | b2.D(a2);
            Object R4 = hfmVar.R();
            if (F2 || R4 == hfc.a) {
                R4 = new gat(ffskVar, a2);
                hfmVar.ad(R4);
            }
            ffix ffixVar3 = (ffix) R4;
            boolean D2 = b2.D(hhoVar);
            Object R5 = hfmVar.R();
            if (D2 || R5 == hfc.a) {
                R5 = new gau(hhoVar);
                hfmVar.ad(R5);
            }
            int i7 = 234881024 & i3;
            e(i6, h, g, h2, str2, ffixVar2, ffixVar3, (ffix) R5, fzrVar, b2, i7 | 6);
            hve hveVar2 = hvi.e;
            ipn a6 = dyc.a(hum.a, false);
            int a7 = hey.a(b2);
            hqb ai2 = hfmVar.ai();
            hvi b4 = huz.b(b2, hveVar2);
            ffix ffixVar4 = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar4);
            } else {
                b2.z();
            }
            hlc.b(b2, a6, iss.e);
            hlc.b(b2, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a7))) {
                Integer valueOf4 = Integer.valueOf(a7);
                hfmVar.ad(valueOf4);
                b2.h(valueOf4, ffjmVar2);
            }
            hlc.b(b2, b4, iss.c);
            hvi i8 = eba.i(hvi.e, 12.0f, 0.0f, 2);
            ipn a8 = dyo.a(dxu.c, hum.j, b2, 0);
            int a9 = hey.a(b2);
            hqb ai3 = hfmVar.ai();
            hvi b5 = huz.b(b2, i8);
            ffix ffixVar5 = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar5);
            } else {
                b2.z();
            }
            hlc.b(b2, a8, iss.e);
            hlc.b(b2, ai3, iss.d);
            ffjm ffjmVar3 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a9))) {
                Integer valueOf5 = Integer.valueOf(a9);
                hfmVar.ad(valueOf5);
                b2.h(valueOf5, ffjmVar3);
            }
            hlc.b(b2, b5, iss.c);
            f(fzrVar, hamVar, b2, ((i3 >> 24) & 14) | ((i3 >> 9) & 112));
            int i9 = 458752 & i3;
            int i10 = 3670016 & i3;
            m(a2, l, ffjiVar, ffjiVar2, hamVar, ffmjVar, gaeVar, dmugVar, fzrVar, b2, ((i3 << 3) & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | i9 | i10 | (i3 & 29360128) | i7);
            b2.n();
            cyq a10 = gjb.a(4, b2);
            cyq a11 = gjb.a(5, b2);
            cyq a12 = gjb.a(4, b2);
            cru.b(h(hhoVar), hxo.b(hvi.e), ctt.k(a12, null, 14).a(ctt.b(a10, 0.6f)), ctt.q(a12, null, 14).a(ctt.m(a11, 2)), null, hpx.d(1193716082, new gay(j, hhoVar, ffskVar, a2, ffmjVar, e, dmugVar, hamVar, fzrVar), b2), b2, 196656, 16);
            b2 = b2;
            b2.n();
            b2.n();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gaz(l, j, ffjiVar, ffjiVar2, hamVar, ffmjVar, gaeVar, dmugVar, fzrVar, i);
        }
    }

    public static final void m(eey eeyVar, Long l, ffji ffjiVar, ffji ffjiVar2, ham hamVar, ffmj ffmjVar, gae gaeVar, dmug dmugVar, fzr fzrVar, hfd hfdVar, int i) {
        int i2;
        Long l2;
        dmug dmugVar2;
        fzr fzrVar2;
        Object gbrVar;
        eey eeyVar2 = eeyVar;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-1994757941);
        if (i3 == 0) {
            i2 = (true != b2.D(eeyVar2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            l2 = l;
            i2 |= true != b2.D(l2) ? 16 : 32;
        } else {
            l2 = l;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.F(ffjiVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.F(ffjiVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.F(hamVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b2.F(ffmjVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != ((2097152 & i) == 0 ? b2.D(gaeVar) : b2.F(gaeVar)) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            dmugVar2 = dmugVar;
            i2 |= true != b2.D(dmugVar2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            dmugVar2 = dmugVar;
        }
        if ((100663296 & i) == 0) {
            fzrVar2 = fzrVar;
            i2 |= true != b2.D(fzrVar2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            fzrVar2 = fzrVar;
        }
        if ((38347923 & i2) == 38347922 && b2.I()) {
            b2.s();
        } else {
            hal c = hamVar.c();
            boolean D = b2.D(ffmjVar);
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = hamVar.g(ffmjVar.a, 1);
                hfmVar.ad(R);
            }
            int i4 = i2;
            grl.a(gvu.a(hdu.a, b2), hpx.d(1504086906, new gbq(eeyVar2, ffmjVar, hamVar, (haq) R, ffjiVar, c, l2, gaeVar, dmugVar2, fzrVar2), b2), b2, 48);
            boolean F = ((i4 & 14) == 4) | ((i4 & 7168) == 2048) | b2.F(hamVar) | b2.F(ffmjVar);
            Object R2 = hfmVar.R();
            if (F || R2 == hfc.a) {
                eeyVar2 = eeyVar;
                gbrVar = new gbr(eeyVar2, ffjiVar2, hamVar, ffmjVar, null);
                hfmVar.ad(gbrVar);
            } else {
                gbrVar = R2;
                eeyVar2 = eeyVar;
            }
            hgs.g(eeyVar2, (ffjm) gbrVar, b2);
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gbs(eeyVar2, l, ffjiVar, ffjiVar2, hamVar, ffmjVar, gaeVar, dmugVar, fzrVar, i);
        }
    }

    public static final void n(Long l, long j, int i, ffji ffjiVar, ffji ffjiVar2, ham hamVar, ffmj ffmjVar, gae gaeVar, dmug dmugVar, fzr fzrVar, boolean z, hfd hfdVar, int i2, int i3) {
        int i4;
        ffji ffjiVar3;
        ffji ffjiVar4;
        ham hamVar2;
        ffmj ffmjVar2;
        dmug dmugVar2;
        int i5;
        hvi c;
        hfd hfdVar2;
        int i6 = i2 & 6;
        hfd b2 = hfdVar.b(1388431119);
        if (i6 == 0) {
            i4 = (true != b2.D(l) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != b2.C(j) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != b2.B(i) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            ffjiVar3 = ffjiVar;
            i4 |= true != b2.F(ffjiVar3) ? 1024 : 2048;
        } else {
            ffjiVar3 = ffjiVar;
        }
        if ((i2 & 24576) == 0) {
            ffjiVar4 = ffjiVar2;
            i4 |= true != b2.F(ffjiVar4) ? 8192 : 16384;
        } else {
            ffjiVar4 = ffjiVar2;
        }
        if ((196608 & i2) == 0) {
            hamVar2 = hamVar;
            i4 |= true != b2.F(hamVar2) ? 65536 : 131072;
        } else {
            hamVar2 = hamVar;
        }
        if ((1572864 & i2) == 0) {
            ffmjVar2 = ffmjVar;
            i4 |= true != b2.F(ffmjVar2) ? 524288 : 1048576;
        } else {
            ffmjVar2 = ffmjVar;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != ((16777216 & i2) == 0 ? b2.D(gaeVar) : b2.F(gaeVar)) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i2) == 0) {
            dmugVar2 = dmugVar;
            i4 |= true != b2.D(dmugVar2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            dmugVar2 = dmugVar;
        }
        if ((805306368 & i2) == 0) {
            i4 |= true != b2.D(fzrVar) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        int i7 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (true != b2.E(z) ? 2 : 4);
        } else {
            i5 = i3;
        }
        int i8 = i5;
        if ((i7 & 306783379) == 306783378 && (i8 & 3) == 2 && b2.I()) {
            b2.s();
            hfdVar2 = b2;
        } else {
            int i9 = -((jzn) b2.e(jdr.e)).eo(48.0f);
            cyq a2 = gjb.a(4, b2);
            cyq a3 = gjb.a(5, b2);
            cyq a4 = gjb.a(1, b2);
            cyq a5 = gjb.a(1, b2);
            gdj gdjVar = new gdj(i);
            c = jjs.c(hvi.e, false, gbz.a);
            boolean F = b2.F(a4) | b2.F(a2) | b2.F(a3) | b2.B(i9) | b2.F(a5);
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new gcf(a4, a2, a3, i9, a5);
                hfmVar.ad(R);
            }
            ffji ffjiVar5 = ffjiVar4;
            hfdVar2 = b2;
            cqn.a(gdjVar, c, (ffji) R, null, "DatePickerDisplayModeAnimation", null, hpx.d(-810638609, new gcg(l, j, ffjiVar3, ffjiVar5, hamVar2, ffmjVar2, gaeVar, dmugVar2, fzrVar, z), b2), hfdVar2, ((i7 >> 6) & 14) | 1597440, 40);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new gch(l, j, i, ffjiVar, ffjiVar2, hamVar, ffmjVar, gaeVar, dmugVar, fzrVar, z, i2, i3);
        }
    }

    public static final void o(haq haqVar, ffji ffjiVar, long j, Long l, gae gaeVar, dmug dmugVar, fzr fzrVar, Locale locale, hfd hfdVar, int i) {
        int i2;
        hfd hfdVar2;
        hvi d;
        int i3;
        int i4;
        hfd hfdVar3;
        hfm hfmVar;
        ffji ffjiVar2 = ffjiVar;
        Long l2 = l;
        gae gaeVar2 = gaeVar;
        int i5 = i & 6;
        hfd b2 = hfdVar.b(-333300603);
        if (i5 == 0) {
            i2 = (true != b2.D(haqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.F(ffjiVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.C(j) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.D(l2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.D(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b2.D(null) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != ((2097152 & i) == 0 ? b2.D(gaeVar2) : b2.F(gaeVar2)) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b2.D(dmugVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != b2.D(fzrVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i2 |= true != b2.F(locale) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((306783379 & i2) == 306783378 && b2.I()) {
            b2.s();
            hfdVar2 = b2;
        } else {
            b2.v(638416709);
            hfm hfmVar2 = (hfm) b2;
            hfmVar2.Z();
            hvi a2 = ebs.g(hvi.e, 288.0f).a(hvi.e);
            dxj dxjVar = dxu.f;
            int i6 = huo.a;
            int i7 = i2;
            ipn a3 = dyo.a(dxjVar, hum.j, b2, 6);
            int a4 = hey.a(b2);
            hqb ai = hfmVar2.ai();
            hvi b3 = huz.b(b2, a2);
            int i8 = ist.a;
            ffix ffixVar = iss.a;
            b2.x();
            if (hfmVar2.z) {
                b2.j(ffixVar);
            } else {
                b2.z();
            }
            hlc.b(b2, a3, iss.e);
            hlc.b(b2, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                hfmVar2.ad(valueOf);
                b2.h(valueOf, ffjmVar);
            }
            hlc.b(b2, b3, iss.c);
            b2.v(-647193498);
            int i9 = 0;
            int i10 = 0;
            int i11 = 6;
            while (i9 < i11) {
                d = ebs.d(hvi.e, 1.0f);
                ipn a5 = ebm.a(dxu.f, hum.n, b2, 54);
                int a6 = hey.a(b2);
                hqb ai2 = hfmVar2.ai();
                hvi b4 = huz.b(b2, d);
                int i12 = i9;
                ffix ffixVar2 = iss.a;
                b2.x();
                int i13 = i10;
                if (hfmVar2.z) {
                    b2.j(ffixVar2);
                } else {
                    b2.z();
                }
                hlc.b(b2, a5, iss.e);
                hlc.b(b2, ai2, iss.d);
                ffjm ffjmVar2 = iss.f;
                if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a6))) {
                    Integer valueOf2 = Integer.valueOf(a6);
                    hfmVar2.ad(valueOf2);
                    b2.h(valueOf2, ffjmVar2);
                }
                hlc.b(b2, b4, iss.c);
                b2.v(-88128133);
                int i14 = i13;
                int i15 = 0;
                while (i15 < 7) {
                    int i16 = haqVar.d;
                    if (i14 < i16 || i14 >= i16 + haqVar.c) {
                        i3 = i15;
                        i4 = i14;
                        hfdVar3 = b2;
                        hfmVar = hfmVar2;
                        hfdVar3.v(1563169240);
                        ebv.a(ebs.m(ebs.w(hvi.e, 40.0f, 40.0f, 0.0f, 0.0f, 12), ((jzq) hfdVar3.e(gex.a)).a, ((jzq) hfdVar3.e(gex.a)).a), hfdVar3);
                        hfmVar.Z();
                    } else {
                        b2.v(1564256379);
                        int i17 = i14 - haqVar.d;
                        i4 = i14;
                        hfm hfmVar3 = hfmVar2;
                        long j2 = haqVar.e + (i17 * 86400000);
                        boolean z = j2 == j;
                        boolean z2 = l2 != null && j2 == l2.longValue();
                        b2.v(1565232290);
                        hfmVar3.Z();
                        StringBuilder sb = new StringBuilder();
                        i3 = i15;
                        b2.v(1404179494);
                        hfmVar3.Z();
                        if (z) {
                            b2.v(1404202744);
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(hcb.b(R.string.m3c_date_picker_today_description, b2));
                            hfmVar3.Z();
                        } else {
                            b2.v(1404369958);
                            hfmVar3.Z();
                        }
                        String sb2 = sb.length() == 0 ? null : sb.toString();
                        String a7 = gaeVar2.a(Long.valueOf(j2), locale, true);
                        if (a7 == null) {
                            a7 = "";
                        }
                        String a8 = fwc.a(i17 + 1, 0, 7);
                        hve hveVar = hvi.e;
                        boolean C = ((i7 & 112) == 32) | b2.C(j2);
                        Object R = hfmVar3.R();
                        if (C || R == hfc.a) {
                            R = new gbt(ffjiVar2, j2);
                            hfmVar3.ad(R);
                        }
                        ffix ffixVar3 = (ffix) R;
                        boolean C2 = ((i7 & 29360128) == 8388608) | b2.C(j2);
                        Object R2 = hfmVar3.R();
                        if (C2 || R2 == hfc.a) {
                            R2 = Boolean.valueOf(dmugVar.b(haqVar.a) && dmugVar.a(j2));
                            hfmVar3.ad(R2);
                        }
                        boolean booleanValue = ((Boolean) R2).booleanValue();
                        if (sb2 != null) {
                            a7 = a.w(a7, sb2, ", ");
                        }
                        hfmVar = hfmVar3;
                        hfd hfdVar4 = b2;
                        p(a8, hveVar, z2, ffixVar3, z2, booleanValue, z, a7, fzrVar, hfdVar4, ((i7 << 3) & 1879048192) | 48);
                        hfdVar3 = hfdVar4;
                        hfmVar.Z();
                    }
                    ffjiVar2 = ffjiVar;
                    gaeVar2 = gaeVar;
                    hfmVar2 = hfmVar;
                    i15 = i3 + 1;
                    b2 = hfdVar3;
                    i14 = i4 + 1;
                    l2 = l;
                }
                hfmVar2.Z();
                b2.n();
                ffjiVar2 = ffjiVar;
                gaeVar2 = gaeVar;
                i9 = i12 + 1;
                i11 = 6;
                i10 = i14;
                l2 = l;
            }
            hfdVar2 = b2;
            hfmVar2.Z();
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new gbu(haqVar, ffjiVar, j, l, gaeVar, dmugVar, fzrVar, locale, i);
        }
    }

    public static final void p(String str, hvi hviVar, boolean z, ffix ffixVar, boolean z2, boolean z3, boolean z4, String str2, fzr fzrVar, hfd hfdVar, int i) {
        String str3;
        int i2;
        hkx a2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-945355136);
        if (i3 == 0) {
            str3 = str;
            i2 = (true != b2.D(str3) ? 2 : 4) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.F(ffixVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.E(z2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b2.E(z3) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b2.E(z4) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b2.E(false) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != b2.D(str2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : 67108864;
        }
        if ((805306368 & i) == 0) {
            i2 |= true != b2.D(fzrVar) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((306783379 & i2) == 306783378 && b2.I()) {
            b2.s();
        } else {
            int i4 = 234881024 & i2;
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (i4 == 67108864 || R == hfc.a) {
                R = new gbd(str2);
                hfmVar.ad(R);
            }
            hvi c = jjs.c(hviVar, true, (ffji) R);
            idh c2 = glx.c(5, b2);
            long j = z ? z3 ? fzrVar.r : fzrVar.s : ibw.g;
            if (z2) {
                b2.v(-211141728);
                a2 = cwo.b(j, gjb.a(4, b2), b2, 0, 12);
                hfmVar.Z();
            } else {
                b2.v(-210916017);
                a2 = hku.a(new ibw(j), b2);
                hfmVar.Z();
            }
            long j2 = ((ibw) a2.a()).i;
            der derVar = null;
            if (z4 && !z) {
                derVar = des.a(1.0f, fzrVar.u);
            }
            gpa.d(z, ffixVar, c, z3, c2, j2, 0.0f, derVar, null, hpx.d(1126347158, new gbf(str3, fzrVar, z4, z, z3), b2), b2, 1472);
            b2 = b2;
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gbg(str, hviVar, z, ffixVar, z2, z3, z4, str2, fzrVar, i);
        }
    }
}
