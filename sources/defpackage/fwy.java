package defpackage;

import androidx.compose.foundation.selection.TriStateToggleableElement;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwy {
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bd, code lost:
    
        if (r14 == 2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e8, code lost:
    
        throw new defpackage.ffcd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e0, code lost:
    
        if (r15 == 2) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d2  */
    /* JADX WARN: Type inference failed for: r16v2, types: [cyq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v3, types: [cyq, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r26, defpackage.jlc r27, defpackage.hvi r28, defpackage.fwq r29, defpackage.ifv r30, defpackage.ifv r31, defpackage.hfd r32, int r33) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fwy.a(boolean, jlc, hvi, fwq, ifv, ifv, hfd, int):void");
    }

    public static final void b(boolean z, ffji ffjiVar, hvi hviVar, boolean z2, fwq fwqVar, dwn dwnVar, hfd hfdVar, int i) {
        int i2;
        ffix ffixVar;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1406741137);
        if (i3 == 0) {
            i2 = (true != b.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjiVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.E(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.D(fwqVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.D(dwnVar) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            float floor = (float) Math.floor(((jzn) b.e(jdr.e)).em(2.0f));
            jlc a = jld.a(z);
            if (ffjiVar != null) {
                b.v(-1904516929);
                boolean z3 = (i2 & 112) == 32;
                boolean z4 = (i2 & 14) == 4;
                hfm hfmVar = (hfm) b;
                Object R = hfmVar.R();
                if ((z4 | z3) || R == hfc.a) {
                    R = new fwr(ffjiVar, z);
                    hfmVar.ad(R);
                }
                ffixVar = (ffix) R;
                hfmVar.Z();
            } else {
                b.v(-1904451240);
                ((hfm) b).Z();
                ffixVar = null;
            }
            hfdVar2 = b;
            c(a, ffixVar, new ifv(floor, 0.0f, 2, 0, 26), new ifv(floor, 0.0f, 0, 0, 30), hviVar, z2, fwqVar, dwnVar, hfdVar2, (i2 << 6) & 33546240);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new fws(z, ffjiVar, hviVar, z2, fwqVar, dwnVar, i);
        }
    }

    public static final void c(jlc jlcVar, ffix ffixVar, ifv ifvVar, ifv ifvVar2, hvi hviVar, boolean z, fwq fwqVar, dwn dwnVar, hfd hfdVar, int i) {
        jlc jlcVar2;
        int i2;
        boolean z2;
        hvi hviVar2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-406243761);
        if (i3 == 0) {
            jlcVar2 = jlcVar;
            i2 = (true != b.D(jlcVar2) ? 2 : 4) | i;
        } else {
            jlcVar2 = jlcVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ifvVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ifvVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.D(hviVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            z2 = z;
            i2 |= true != b.E(z2) ? 65536 : 131072;
        } else {
            z2 = z;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b.D(fwqVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b.D(dwnVar) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        int i4 = i2;
        if ((4793491 & i4) == 4793490 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            if (ffixVar != null) {
                hve hveVar = hvi.e;
                float f = hdr.a;
                dhf a = gkw.a(false, hdr.a / 2.0f, 0L, 4);
                jjj jjjVar = new jjj(1);
                hviVar2 = a instanceof dhf ? new TriStateToggleableElement(jlcVar2, dwnVar, a, z2, jjjVar, ffixVar) : a == null ? new TriStateToggleableElement(jlcVar, dwnVar, null, z, jjjVar, ffixVar) : dwnVar != null ? dhc.a(hvi.e, dwnVar, a).a(new TriStateToggleableElement(jlcVar, dwnVar, null, z, jjjVar, ffixVar)) : huz.g(hvi.e, new epx(a, jlcVar, z, jjjVar, ffixVar));
            } else {
                hviVar2 = hvi.e;
            }
            int i5 = i4 << 6;
            hfdVar2 = b;
            a(z, jlcVar, eba.d(hviVar.a(ffixVar != null ? gex.a(hvi.e) : hvi.e).a(hviVar2), 2.0f), fwqVar, ifvVar, ifvVar2, hfdVar2, ((i4 >> 15) & 14) | ((i4 << 3) & 112) | ((i4 >> 9) & 7168) | (57344 & i5) | (458752 & i5));
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new fwx(jlcVar, ffixVar, ifvVar, ifvVar2, hviVar, z, fwqVar, dwnVar, i);
        }
    }
}
