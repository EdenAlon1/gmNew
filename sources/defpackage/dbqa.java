package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbqa {
    public static final String a(Duration duration) {
        if (duration.toHours() > 0) {
            String format = String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(duration.toHours()), Integer.valueOf(duration.toMinutesPart()), Integer.valueOf(duration.toSecondsPart())}, 3));
            format.getClass();
            return format;
        }
        String format2 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(duration.toMinutesPart()), Integer.valueOf(duration.toSecondsPart())}, 2));
        format2.getClass();
        return format2;
    }

    public static final void b(final String str, final int i, hfd hfdVar, final int i2) {
        int i3;
        hfd hfdVar2;
        int i4 = i2 & 6;
        hfd b = hfdVar.b(750770564);
        if (i4 == 0) {
            i3 = i2 | (true != b.D(str) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b.B(i) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            int i5 = huo.a;
            hun hunVar = hum.k;
            hve hveVar = hvi.e;
            ipn a = dyo.a(dxu.c, hunVar, b, 48);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hveVar);
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
            dwjt.b(String.valueOf(i), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).g, b, 0, 0, 65534);
            hfdVar2 = b;
            dwjt.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(hfdVar2).n, hfdVar2, i3 & 14, 0, 65534);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbpv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i7 = i2;
                    dbqa.b(str2, i, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.hfd r24, int r25) {
        /*
            r0 = -609718747(0xffffffffdba86e25, float:-9.4817803E16)
            r1 = r24
            hfd r20 = r1.b(r0)
            if (r25 != 0) goto L18
            boolean r0 = r20.I()
            r1 = 0
            if (r0 != 0) goto L14
            r0 = r1
            goto L1a
        L14:
            r20.s()
            goto L4b
        L18:
            r0 = r25
        L1a:
            gvs r1 = defpackage.gft.d(r20)
            jpo r1 = r1.i
            hve r2 = defpackage.hvi.e
            r3 = 1094713344(0x41400000, float:12.0)
            r4 = 0
            hvi r2 = defpackage.eba.e(r2, r3, r4)
            r22 = 0
            r23 = 65532(0xfffc, float:9.183E-41)
            r19 = r1
            java.lang.String r1 = "➔"
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 54
            defpackage.dwjt.b(r1, r2, r3, r5, r7, r8, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r0
        L4b:
            hio r0 = r20.L()
            if (r0 == 0) goto L58
            dbps r2 = new dbps
            r2.<init>()
            r0.d = r2
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbqa.c(hfd, int):void");
    }

    public static final void d(final String str, final Object obj, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1517136412);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(obj) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            jlj jljVar = new jlj((byte[]) null);
            jljVar.f(String.valueOf(str).concat(": "));
            int a = jljVar.a(new jou(0L, 0L, jsy.h, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
            try {
                jljVar.f(obj.toString());
                jljVar.h(a);
                hfdVar2 = b;
                dwjt.a(jljVar.b(), jfw.a(hvi.e, a.a(str, "Value for '", "'")), gft.a(b).s, 0L, 0L, null, 0L, 2, false, 1, null, null, gft.d(b).j, hfdVar2, 0, 3120, 55288);
            } catch (Throwable th) {
                jljVar.h(a);
                throw th;
            }
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbpw
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    String str2 = str;
                    int i4 = i;
                    dbqa.d(str2, obj, (hfd) obj2, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final Instant instant, final dbqe dbqeVar, hfd hfdVar, final int i) {
        int i2;
        long j;
        instant.getClass();
        dbqeVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-1524900924);
        if (i3 == 0) {
            i2 = (true != b.F(instant) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? b.D(dbqeVar) : b.F(dbqeVar)) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else if (dbqeVar instanceof dbqd) {
            b.v(775703489);
            dbqd dbqdVar = (dbqd) dbqeVar;
            Duration between = Duration.between(dbqdVar.b, instant);
            Instant instant2 = dbqdVar.c;
            Duration between2 = instant2 != null ? Duration.between(instant, instant2) : null;
            ArrayList arrayList = new ArrayList();
            if (between2 != null && !between2.isNegative()) {
                arrayList.add(new ffcf("Min Start Time", a(between2)));
            }
            String str = dbqdVar.a;
            long j2 = dwgz.a;
            long j3 = dwgz.g;
            between.getClass();
            f(str, arrayList, j3, between, hpx.d(44915627, new dbpx(dbqeVar), b), b, 24576, 0);
            ((hfm) b).Z();
        } else if (dbqeVar instanceof dbqc) {
            b.v(777281234);
            dbqc dbqcVar = (dbqc) dbqeVar;
            Duration between3 = Duration.between(dbqcVar.b, instant);
            String str2 = dbqcVar.a;
            ffel ffelVar = ffel.a;
            long j4 = dwgz.a;
            long j5 = dwgz.a;
            between3.getClass();
            f(str2, ffelVar, j5, between3, hpx.d(-1020083244, new dbpy(dbqeVar), b), b, 24624, 0);
            ((hfm) b).Z();
        } else {
            if (!(dbqeVar instanceof dbqb)) {
                b.v(-113525878);
                ((hfm) b).Z();
                throw new ffcd();
            }
            b.v(777792610);
            dbqb dbqbVar = (dbqb) dbqeVar;
            Instant instant3 = dbqbVar.b;
            Instant instant4 = dbqbVar.c;
            String str3 = dbqbVar.a;
            Duration between4 = Duration.between(instant3, instant4);
            ffcf[] ffcfVarArr = new ffcf[2];
            ffcfVarArr[0] = new ffcf("Completed Work Items", Integer.valueOf(dbqbVar.d));
            int i4 = dbqbVar.e - 1;
            ffcfVarArr[1] = new ffcf("Outcome", i4 != 0 ? i4 != 1 ? i4 != 2 ? "Abandoned" : "Interrupted" : "Scheduled Future Work" : "All Work Complete");
            List g = ffdx.g(ffcfVarArr);
            int i5 = dbqbVar.e - 1;
            if (i5 == 0) {
                long j6 = dwgz.a;
                j = dwgz.d;
            } else if (i5 == 1) {
                long j7 = dwgz.a;
                j = dwgz.e;
            } else if (i5 != 2) {
                long j8 = dwgz.a;
                j = dwgz.c;
            } else {
                long j9 = dwgz.a;
                j = dwgz.f;
            }
            between4.getClass();
            f(str3, g, j, between4, null, b, 0, 16);
            ((hfm) b).Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbpt
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    Instant instant5 = Instant.this;
                    int i6 = i;
                    dbqa.e(instant5, dbqeVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final java.lang.String r22, final java.util.List r23, final long r24, final j$.time.Duration r26, defpackage.ffjm r27, defpackage.hfd r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbqa.f(java.lang.String, java.util.List, long, j$.time.Duration, ffjm, hfd, int, int):void");
    }
}
