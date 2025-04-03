package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gor {
    public static final void a(ffjm ffjmVar, ffjm ffjmVar2, ffjm ffjmVar3, jpo jpoVar, long j, long j2, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-903235475);
        if (i3 == 0) {
            i2 = (true != b.F(ffjmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjmVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjmVar3) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(jpoVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.C(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.C(j2) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && b.I()) {
            b.s();
        } else {
            hvi j3 = eba.j(hvi.e, 16.0f, 0.0f, ffjmVar3 == null ? 8.0f : 0.0f, 0.0f, 10);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new gof();
                hfmVar.ad(R);
            }
            ipn ipnVar = (ipn) R;
            int a = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, j3);
            int i4 = ist.a;
            int i5 = i2;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, ipnVar, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar4 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a))) {
                Integer valueOf = Integer.valueOf(a);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar4);
            }
            hlc.b(b, b2, iss.c);
            hvi i6 = eba.i(ioe.a(hvi.e, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT), 0.0f, 6.0f, 1);
            int i7 = huo.a;
            ipn a2 = dyc.a(hum.a, false);
            int a3 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, i6);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar5 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                Integer valueOf2 = Integer.valueOf(a3);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar5);
            }
            hlc.b(b, b3, iss.c);
            ffjmVar.a(b, Integer.valueOf(i5 & 14));
            b.n();
            if (ffjmVar2 != null) {
                b.v(2016616928);
                hvi a4 = ioe.a(hvi.e, GroupManagementRequest.ACTION_TAG);
                ipn a5 = dyc.a(hum.a, false);
                int a6 = hey.a(b);
                hqb ai3 = hfmVar.ai();
                hvi b4 = huz.b(b, a4);
                ffix ffixVar3 = iss.a;
                b.x();
                if (hfmVar.z) {
                    b.j(ffixVar3);
                } else {
                    b.z();
                }
                hlc.b(b, a5, iss.e);
                hlc.b(b, ai3, iss.d);
                ffjm ffjmVar6 = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a6))) {
                    Integer valueOf3 = Integer.valueOf(a6);
                    hfmVar.ad(valueOf3);
                    b.h(valueOf3, ffjmVar6);
                }
                hlc.b(b, b4, iss.c);
                hfz.b(new hil[]{fzc.a.c(new ibw(j)), grl.a.c(jpoVar)}, ffjmVar2, b, (i5 & 112) | 8);
                b.n();
                hfmVar.Z();
            } else {
                b.v(2016931175);
                hfmVar.Z();
            }
            if (ffjmVar3 != null) {
                b.v(2016979504);
                hvi a7 = ioe.a(hvi.e, "dismissAction");
                ipn a8 = dyc.a(hum.a, false);
                int a9 = hey.a(b);
                hqb ai4 = hfmVar.ai();
                hvi b5 = huz.b(b, a7);
                ffix ffixVar4 = iss.a;
                b.x();
                if (hfmVar.z) {
                    b.j(ffixVar4);
                } else {
                    b.z();
                }
                hlc.b(b, a8, iss.e);
                hlc.b(b, ai4, iss.d);
                ffjm ffjmVar7 = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a9))) {
                    Integer valueOf4 = Integer.valueOf(a9);
                    hfmVar.ad(valueOf4);
                    b.h(valueOf4, ffjmVar7);
                }
                hlc.b(b, b5, iss.c);
                hfz.a(fzc.a.c(new ibw(j2)), ffjmVar3, b, ((i5 >> 3) & 112) | 8);
                b.n();
                hfmVar.Z();
            } else {
                b.v(2017247623);
                hfmVar.Z();
            }
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new gog(ffjmVar, ffjmVar2, ffjmVar3, jpoVar, j, j2, i);
        }
    }

    public static final void b(hvi hviVar, ffjm ffjmVar, ffjm ffjmVar2, idh idhVar, long j, long j2, long j3, long j4, ffjm ffjmVar3, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1235788955);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjmVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjmVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.E(false) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.D(idhVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.C(j) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b.C(j2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b.C(j3) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != b.C(j4) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i2 |= true != b.F(ffjmVar3) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 306783379) == 306783378 && b.I()) {
            b.s();
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            gpa.c(hviVar, idhVar, j, j2, 0.0f, 6.0f, null, hpx.d(-1829663446, new goi(ffjmVar, ffjmVar3, ffjmVar2, j3, j4), b), b, 80);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new goj(hviVar, ffjmVar, ffjmVar2, idhVar, j, j2, j3, j4, ffjmVar3, i);
        }
    }

    public static final void c(goa goaVar, hvi hviVar, idh idhVar, long j, long j2, long j3, long j4, long j5, hfd hfdVar, int i) {
        int i2;
        hvi hviVar2;
        long h;
        long j6;
        long j7;
        long h2;
        long h3;
        idh idhVar2;
        hpn hpnVar;
        hfd hfdVar2;
        hvi hviVar3;
        long j8;
        idh idhVar3;
        long j9;
        long j10;
        long j11;
        long j12;
        int i3 = i & 6;
        hfd b = hfdVar.b(274621471);
        if (i3 == 0) {
            i2 = (true != b.D(goaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 432;
        if ((i & 3072) == 0) {
            i4 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        }
        if ((38347923 & i4) == 38347922 && b.I()) {
            b.s();
            idhVar3 = idhVar;
            j9 = j;
            j10 = j2;
            j8 = j3;
            j11 = j4;
            j12 = j5;
            hfdVar2 = b;
            hviVar3 = hviVar;
        } else {
            int i5 = (-268434433) & i4;
            b.t();
            if ((i & 1) == 0 || b.G()) {
                hviVar2 = hvi.e;
                idh c = glx.c(3, b);
                long h4 = fyc.h(6, b);
                long h5 = fyc.h(4, b);
                h = fyc.h(5, b);
                j6 = h4;
                j7 = h5;
                h2 = fyc.h(5, b);
                h3 = fyc.h(4, b);
                idhVar2 = c;
            } else {
                b.s();
                hviVar2 = hviVar;
                idhVar2 = idhVar;
                j6 = j;
                j7 = j2;
                h = j3;
                h2 = j4;
                h3 = j5;
            }
            b.l();
            String str = goaVar.b.b;
            hpn hpnVar2 = null;
            if (str != null) {
                b.v(1157017515);
                hpn d = hpx.d(-1378313599, new goo(h, goaVar, str), b);
                ((hfm) b).Z();
                hpnVar = d;
            } else {
                b.v(1157315518);
                ((hfm) b).Z();
                hpnVar = null;
            }
            if (goaVar.b.c) {
                b.v(1157467852);
                hpnVar2 = hpx.d(-1812633777, new goq(goaVar), b);
                ((hfm) b).Z();
            } else {
                b.v(1157857150);
                ((hfm) b).Z();
            }
            hfdVar2 = b;
            b(eba.d(hviVar2, 12.0f), hpnVar, hpnVar2, idhVar2, j6, j7, h2, h3, hpx.d(-1266389126, new gok(goaVar), b), hfdVar2, ((i5 << 3) & 7168) | 805306368);
            hviVar3 = hviVar2;
            j8 = h;
            idhVar3 = idhVar2;
            j9 = j6;
            j10 = j7;
            j11 = h2;
            j12 = h3;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new gol(goaVar, hviVar3, idhVar3, j9, j10, j8, j11, j12, i);
        }
    }
}
