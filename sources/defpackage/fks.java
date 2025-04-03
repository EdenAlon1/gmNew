package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fks {
    public static final void a(ffjm ffjmVar, ffix ffixVar, hvi hviVar, idh idhVar, long j, long j2, fjh fjhVar, hfd hfdVar, int i) {
        int i2;
        ffix ffixVar2;
        hvi hviVar2;
        idh idhVar2;
        long j3;
        long j4;
        fjh fjhVar2;
        hvi hviVar3;
        fjh fjhVar3;
        idh idhVar3;
        long j5;
        long j6;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1555720195);
        if (i3 == 0) {
            i2 = i | (true != b.F(ffjmVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            ffixVar2 = ffixVar;
            i2 |= true != b.F(ffixVar2) ? 16 : 32;
        } else {
            ffixVar2 = ffixVar;
        }
        int i4 = i2 | 28032;
        if ((i & 196608) == 0) {
            i4 = i2 | 93568;
        }
        if ((i & 1572864) == 0) {
            i4 |= 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        }
        if (b.J((38347923 & i4) != 38347922, i4 & 1)) {
            int i5 = (-268369921) & i4;
            b.t();
            if ((i & 1) == 0 || b.G()) {
                hviVar3 = hvi.e;
                eqd eqdVar = fla.b(b).a;
                eqe a = eqg.a(50);
                eql eqlVar = new eql(a, a, a, a);
                long j7 = fla.a(b).j();
                long a2 = fip.a(j7, b);
                boolean A = b.A(6.0f) | b.A(12.0f) | b.A(8.0f) | b.A(8.0f);
                hfm hfmVar = (hfm) b;
                Object R = hfmVar.R();
                if (A || R == hfc.a) {
                    R = new fjh();
                    hfmVar.ad(R);
                }
                fjhVar3 = (fjh) R;
                idhVar3 = eqlVar;
                j5 = j7;
                j6 = a2;
            } else {
                b.s();
                hviVar3 = hviVar;
                idhVar3 = idhVar;
                j5 = j;
                j6 = j2;
                fjhVar3 = fjhVar;
            }
            b.l();
            hvi hviVar4 = hviVar3;
            b(ffixVar2, ebs.w(hviVar4, 48.0f, 48.0f, 0.0f, 0.0f, 12), idhVar3, j5, j6, fjhVar3, hpx.d(1418981691, new fkl(ffjmVar), b), b, 12582912 | ((i5 >> 3) & 14) | ((i5 >> 6) & 896));
            idhVar2 = idhVar3;
            j3 = j5;
            j4 = j6;
            fjhVar2 = fjhVar3;
            hviVar2 = hviVar4;
        } else {
            b.s();
            hviVar2 = hviVar;
            idhVar2 = idhVar;
            j3 = j;
            j4 = j2;
            fjhVar2 = fjhVar;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new fkm(ffjmVar, ffixVar, hviVar2, idhVar2, j3, j4, fjhVar2, i);
        }
    }

    public static final void b(ffix ffixVar, hvi hviVar, idh idhVar, long j, long j2, fjh fjhVar, ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        idh idhVar2;
        long j3;
        hvi c;
        int i3 = i & 6;
        hfd b = hfdVar.b(1028985328);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            idhVar2 = idhVar;
            i2 |= true != b.D(idhVar2) ? 1024 : 2048;
        } else {
            idhVar2 = idhVar;
        }
        if ((i & 24576) == 0) {
            j3 = j;
            i2 |= true != b.C(j3) ? 8192 : 16384;
        } else {
            j3 = j;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.C(j2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b.D(fjhVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b.F(ffjmVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if (b.J((4793491 & i2) != 4793490, i2 & 1)) {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            b.v(-1991740377);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new dwn();
                hfmVar.ad(R);
            }
            dwn dwnVar = (dwn) R;
            hfmVar.Z();
            c = jjs.c(hviVar, false, fkn.a);
            int i4 = i2 >> 15;
            b.v(-478475335);
            boolean D = b.D(dwnVar);
            Object R2 = hfmVar.R();
            if (D || R2 == hfc.a) {
                R2 = new fkk();
                hfmVar.ad(R2);
            }
            fkk fkkVar = (fkk) R2;
            boolean F = b.F(fkkVar) | ((((i4 & 112) ^ 48) > 32 && b.D(fjhVar)) || (i4 & 48) == 32);
            Object R3 = hfmVar.R();
            if (F || R3 == hfc.a) {
                R3 = new fjd(fkkVar, fjhVar, null);
                hfmVar.ad(R3);
            }
            hgs.g(fjhVar, (ffjm) R3, b);
            boolean D2 = b.D(dwnVar) | b.F(fkkVar);
            Object R4 = hfmVar.R();
            if (D2 || R4 == hfc.a) {
                R4 = new fjg(dwnVar, fkkVar, null);
                hfmVar.ad(R4);
            }
            hgs.g(dwnVar, (ffjm) R4, b);
            cxv cxvVar = fkkVar.e.b;
            hfmVar.Z();
            idh idhVar3 = idhVar2;
            long j4 = j3;
            C0001for.d(ffixVar, c, false, idhVar3, j4, j2, ((jzq) cxvVar.a()).a, dwnVar, hpx.d(1972871863, new fkq(j2, ffjmVar), b), b, (i2 & 14) | 805306368 | (i2 & 7168) | (57344 & i2) | (i2 & 458752));
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new fkr(ffixVar, hviVar, idhVar, j, j2, fjhVar, ffjmVar, i);
        }
    }
}
