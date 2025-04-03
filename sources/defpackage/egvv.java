package defpackage;

import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egvv {
    public static final Intent a(Uri uri) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", uri);
        intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
        intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
        return intent;
    }

    public static final void b(final int i, final ffix ffixVar, final String str, final int i2, hfd hfdVar, final int i3) {
        int i4;
        int i5 = i3 & 6;
        hfd b = hfdVar.b(-946780165);
        if (i5 == 0) {
            i4 = (true != b.B(i) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != b.D(str) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != b.B(i2) ? 1024 : 2048;
        }
        if ((i4 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            egth.a(i2, hpx.d(-2005719963, new egvc(ffixVar, str, i), b), b, ((i4 >> 9) & 14) | 48);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: egum
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    ffix ffixVar2 = ffixVar;
                    String str2 = str;
                    egvv.b(i6, ffixVar2, str2, i2, (hfd) obj, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(hho hhoVar, boolean z) {
        hhoVar.b(Boolean.valueOf(z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x013e, code lost:
    
        if (r2 == defpackage.hfc.a) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.ffix r23, final defpackage.ffix r24, final defpackage.ffji r25, final defpackage.ffji r26, final boolean r27, final defpackage.egse r28, final defpackage.ffji r29, final android.net.Uri r30, final defpackage.ffix r31, final boolean r32, defpackage.hfd r33, final int r34) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egvv.d(ffix, ffix, ffji, ffji, boolean, egse, ffji, android.net.Uri, ffix, boolean, hfd, int):void");
    }

    public static final void e(final ffjm ffjmVar, final int i, final long j, final String str, final ffix ffixVar, final int i2, hfd hfdVar, final int i3) {
        ffjm ffjmVar2;
        int i4;
        int i5 = i3 & 6;
        hfd b = hfdVar.b(-1975709296);
        if (i5 == 0) {
            ffjmVar2 = ffjmVar;
            i4 = (true != b.F(ffjmVar2) ? 2 : 4) | i3;
        } else {
            ffjmVar2 = ffjmVar;
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != b.B(i) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != b.C(j) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != b.D(str) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != b.F(ffixVar) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i4 |= true != b.B(i2) ? 65536 : 131072;
        }
        if ((74899 & i4) == 74898 && b.I()) {
            b.s();
        } else {
            b.t();
            if ((i3 & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            egth.a(i2, hpx.d(-485389574, new eguy(ffixVar, str, ffjmVar2, i, j), b), b, ((i4 >> 15) & 14) | 48);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: egus
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffjm ffjmVar3 = ffjm.this;
                    int i6 = i;
                    long j2 = j;
                    String str2 = str;
                    ffix ffixVar2 = ffixVar;
                    egvv.e(ffjmVar3, i6, j2, str2, ffixVar2, i2, (hfd) obj, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void i(final igq igqVar, final int i, long j, final String str, final ffix ffixVar, final int i2, hfd hfdVar, final int i3) {
        int i4;
        long j2;
        hfd hfdVar2;
        final long j3;
        hfd b = hfdVar.b(42328400);
        if ((i3 & 6) == 0) {
            i4 = (true != b.F(igqVar) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != b.B(i) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != b.D(str) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != b.F(ffixVar) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i4 |= true != b.B(i2) ? 65536 : 131072;
        }
        if ((74899 & i4) == 74898 && b.I()) {
            b.s();
            j3 = j;
            hfdVar2 = b;
        } else {
            b.t();
            if ((i3 & 1) == 0 || b.G()) {
                j2 = gft.a(b).q;
            } else {
                b.s();
                j2 = j;
            }
            b.l();
            hfdVar2 = b;
            e(hpx.d(-463891204, new eguv(igqVar, j2), b), i, j2, str, ffixVar, i2, hfdVar2, (i4 & 112) | 6 | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
            j3 = j2;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: egut
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    igq igqVar2 = igq.this;
                    int i5 = i;
                    long j4 = j3;
                    String str2 = str;
                    ffix ffixVar2 = ffixVar;
                    egvv.i(igqVar2, i5, j4, str2, ffixVar2, i2, (hfd) obj, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void j(final igz igzVar, final int i, long j, final String str, final ffix ffixVar, final int i2, hfd hfdVar, final int i3) {
        int i4;
        long j2;
        hfd hfdVar2;
        final long j3;
        hfd b = hfdVar.b(1991706941);
        if ((i3 & 6) == 0) {
            i4 = (true != b.D(igzVar) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != b.B(i) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != b.D(str) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != b.F(ffixVar) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i4 |= true != b.B(i2) ? 65536 : 131072;
        }
        if ((74899 & i4) == 74898 && b.I()) {
            b.s();
            j3 = j;
            hfdVar2 = b;
        } else {
            b.t();
            if ((i3 & 1) == 0 || b.G()) {
                j2 = gft.a(b).q;
            } else {
                b.s();
                j2 = j;
            }
            b.l();
            hfdVar2 = b;
            e(hpx.d(452003561, new eguu(igzVar, j2), b), i, j2, str, ffixVar, i2, hfdVar2, (i4 & 112) | 6 | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
            j3 = j2;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: egun
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    igz igzVar2 = igz.this;
                    int i5 = i;
                    long j4 = j3;
                    String str2 = str;
                    ffix ffixVar2 = ffixVar;
                    egvv.j(igzVar2, i5, j4, str2, ffixVar2, i2, (hfd) obj, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
