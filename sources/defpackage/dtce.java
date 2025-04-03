package defpackage;

import android.text.format.DateUtils;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtce {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.dtca r17, defpackage.hvi r18, defpackage.hfd r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtce.a(dtca, hvi, hfd, int, int):void");
    }

    public static final void b(final float f, final long j, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(-874970497);
        if (i3 == 0) {
            i2 = (true != b.A(f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.C(j) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            a = dee.a(hxo.a(ebs.k(hvi.e, f), eqm.a), j, idb.a);
            dyc.b(jfw.a(a, "timer_dot"), b, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dtcc
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    float f2 = f;
                    int i4 = i;
                    dtce.b(f2, j, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final float c(hfd hfdVar) {
        hfdVar.v(893917588);
        float f = ((jzq) czk.c(czk.b(hfdVar), new jzq(6.0f), new jzq(12.0f), dcp.c, cxu.d(cxu.c(1000, 0, cyp.c, 2), 0, 0L, 6), hfdVar, 33160).a()).a;
        hfdVar.o();
        return f;
    }

    public static final void d(Duration duration, final jpo jpoVar, hvi hviVar, final long j, hfd hfdVar, final int i) {
        final Duration duration2;
        int i2;
        long j2;
        hvi hviVar2;
        hfd hfdVar2;
        final hvi hviVar3;
        hfd b = hfdVar.b(1483279988);
        if ((i & 6) == 0) {
            duration2 = duration;
            i2 = (true != b.F(duration2) ? 2 : 4) | i;
        } else {
            duration2 = duration;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(jpoVar) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            j2 = j;
            i3 |= true != b.C(j2) ? 1024 : 2048;
        } else {
            j2 = j;
        }
        if ((i3 & 1171) == 1170 && b.I()) {
            b.s();
            hviVar3 = hviVar;
            hfdVar2 = b;
        } else {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                hviVar2 = hvi.e;
            } else {
                b.s();
                hviVar2 = hviVar;
            }
            b.l();
            String formatElapsedTime = DateUtils.formatElapsedTime(duration2.getSeconds());
            formatElapsedTime.getClass();
            hvi hviVar4 = hviVar2;
            hfdVar2 = b;
            grl.b(formatElapsedTime, hviVar4, j2, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, jpo.y(jpoVar, 0L, 0L, null, null, null, "tnum", 0L, null, 0, 0, 0L, null, null, 0, 16777151), hfdVar2, (i3 >> 3) & 1008, 0, 65528);
            hviVar3 = hviVar4;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dtcb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    Duration duration3 = Duration.this;
                    jpo jpoVar2 = jpoVar;
                    hvi hviVar5 = hviVar3;
                    dtce.d(duration3, jpoVar2, hviVar5, j, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
