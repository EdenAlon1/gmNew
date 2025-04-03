package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpy {
    public static final float a;
    public static final float b = 16.0f;
    public static final long c;

    static {
        float f = heb.a;
        a = heb.a;
        c = kal.c(20);
    }

    /* JADX WARN: Type inference failed for: r11v8, types: [cyq, java.lang.Object] */
    public static final void a(long j, long j2, boolean z, ffjm ffjmVar, hfd hfdVar, int i) {
        long j3;
        int i2;
        boolean z2;
        hfd hfdVar2;
        long j4;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(735731848);
        if (i3 == 0) {
            j3 = j;
            i2 = (true != b2.C(j3) ? 2 : 4) | i;
        } else {
            j3 = j;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.C(j2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= true != b2.E(z2) ? 128 : 256;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.F(ffjmVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b2.I()) {
            b2.s();
        } else {
            int i4 = i2 >> 6;
            dbe d = dbs.d(Boolean.valueOf(z2), null, b2, i4 & 14, 2);
            gpx gpxVar = gpx.a;
            boolean booleanValue = ((Boolean) d.f()).booleanValue();
            b2.v(-1997025499);
            long j5 = true != booleanValue ? j2 : j3;
            hfm hfmVar = (hfm) b2;
            hfmVar.Z();
            idy f = ibw.f(j5);
            boolean D = b2.D(f);
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = csh.a.invoke(f);
                hfmVar.ad(R);
            }
            dbv dbvVar = (dbv) R;
            boolean booleanValue2 = ((Boolean) d.e()).booleanValue();
            b2.v(-1997025499);
            if (true != booleanValue2) {
                hfdVar2 = b2;
                j4 = j2;
            } else {
                hfdVar2 = b2;
                j4 = j3;
            }
            hfmVar.Z();
            ibw ibwVar = new ibw(j4);
            boolean booleanValue3 = ((Boolean) d.f()).booleanValue();
            b2 = hfdVar2;
            b2.v(-1997025499);
            long j6 = true != booleanValue3 ? j2 : j3;
            hfmVar.Z();
            hfz.a(fzc.a.c(new ibw(((ibw) dbs.f(d, ibwVar, new ibw(j6), gpxVar.a(d.d(), b2, 0), dbvVar, b2, 0).a()).i)), ffjmVar, b2, (i4 & 112) | 8);
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gpw(j3, j2, z2, ffjmVar, i);
        }
    }

    public static final void b(boolean z, ffix ffixVar, hvi hviVar, boolean z2, long j, long j2, ffjn ffjnVar, hfd hfdVar, int i) {
        boolean z3;
        int i2;
        ffix ffixVar2;
        long j3;
        ffjn ffjnVar2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-202735880);
        if (i3 == 0) {
            z3 = z;
            i2 = (true != b2.E(z3) ? 2 : 4) | i;
        } else {
            z3 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            ffixVar2 = ffixVar;
            i2 |= true != b2.F(ffixVar2) ? 16 : 32;
        } else {
            ffixVar2 = ffixVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.D(hviVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.E(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.C(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            j3 = j2;
            i2 |= true != b2.C(j3) ? 65536 : 131072;
        } else {
            j3 = j2;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b2.D(null) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            ffjnVar2 = ffjnVar;
            i2 |= true != b2.F(ffjnVar2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            ffjnVar2 = ffjnVar;
        }
        if ((4793491 & i2) == 4793490 && b2.I()) {
            b2.s();
            hfdVar2 = b2;
        } else {
            b2.t();
            if ((i & 1) != 0 && !b2.G()) {
                b2.s();
            }
            b2.l();
            int i4 = i2 >> 12;
            long j4 = j3;
            hfdVar2 = b2;
            a(j, j4, z, hpx.d(-551896140, new gpq(hviVar, z3, gkw.a(true, 0.0f, j, 2), z2, ffixVar2, ffjnVar2), b2), hfdVar2, ((i2 << 6) & 896) | (i4 & 112) | (i4 & 14) | 3072);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new gpr(z, ffixVar, hviVar, z2, j, j2, ffjnVar, i);
        }
    }

    public static final void c(boolean z, ffix ffixVar, hvi hviVar, boolean z2, ffjm ffjmVar, long j, long j2, hfd hfdVar, int i) {
        boolean z3;
        int i2;
        ffjm ffjmVar2;
        hpn d;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-350627181);
        if (i3 == 0) {
            z3 = z;
            i2 = (true != b2.E(z3) ? 2 : 4) | i;
        } else {
            z3 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.F(ffixVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.D(hviVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.E(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.F(ffjmVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b2.F(null) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b2.C(j) ? 524288 : 1048576;
        }
        if ((i & 12582912) == 0) {
            i2 |= true != b2.C(j2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != b2.D(null) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((38347923 & i2) == 38347922 && b2.I()) {
            b2.s();
            ffjmVar2 = ffjmVar;
            hfdVar2 = b2;
        } else {
            b2.t();
            if ((i & 1) != 0 && !b2.G()) {
                b2.s();
            }
            b2.l();
            if (ffjmVar == null) {
                b2.v(-1827925264);
                ((hfm) b2).Z();
                d = null;
                ffjmVar2 = ffjmVar;
            } else {
                b2.v(-1827925263);
                ffjmVar2 = ffjmVar;
                d = hpx.d(708874428, new gps(ffjmVar2), b2);
                ((hfm) b2).Z();
            }
            hvi a2 = iop.a(hviVar, fuf.a);
            hpn d2 = hpx.d(1540996038, new gpo(d), b2);
            int i4 = (i2 & 14) | 12582912;
            int i5 = i2 & 112;
            int i6 = i2 & 7168;
            int i7 = i2 >> 6;
            hfdVar2 = b2;
            b(z3, ffixVar, a2, z2, j, j2, d2, hfdVar2, i4 | i5 | i6 | (57344 & i7) | (458752 & i7) | (i7 & 3670016));
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new gpp(z, ffixVar, hviVar, z2, ffjmVar2, j, j2, i);
        }
    }

    public static final /* synthetic */ void d(ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(514131524);
        if (i3 == 0) {
            i2 = (true != b2.F(ffjmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.F(null) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b2.I()) {
            b2.s();
        } else {
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            boolean z2 = (i2 & 112) == 32;
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if ((z | z2) || R == hfc.a) {
                R = new gpu(ffjmVar);
                hfmVar.ad(R);
            }
            ipn ipnVar = (ipn) R;
            hve hveVar = hvi.e;
            int a2 = hey.a(b2);
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
            hlc.b(b2, ipnVar, iss.e);
            hlc.b(b2, ai, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar2);
            }
            hlc.b(b2, b3, iss.c);
            if (ffjmVar != null) {
                b2.v(1248747093);
                hvi i6 = eba.i(ioe.a(hvi.e, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT), b, 0.0f, 2);
                int i7 = huo.a;
                ipn a3 = dyc.a(hum.a, false);
                int a4 = hey.a(b2);
                hqb ai2 = hfmVar.ai();
                hvi b4 = huz.b(b2, i6);
                ffix ffixVar2 = iss.a;
                b2.x();
                if (hfmVar.z) {
                    b2.j(ffixVar2);
                } else {
                    b2.z();
                }
                hlc.b(b2, a3, iss.e);
                hlc.b(b2, ai2, iss.d);
                ffjm ffjmVar3 = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                    Integer valueOf2 = Integer.valueOf(a4);
                    hfmVar.ad(valueOf2);
                    b2.h(valueOf2, ffjmVar3);
                }
                hlc.b(b2, b4, iss.c);
                ffjmVar.a(b2, Integer.valueOf(i4));
                b2.n();
                hfmVar.Z();
            } else {
                b2.v(1248851842);
                hfmVar.Z();
            }
            b2.v(1248943106);
            hfmVar.Z();
            b2.n();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new gpv(ffjmVar, i);
        }
    }
}
