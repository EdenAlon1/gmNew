package defpackage;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elkq {
    public final eldq e;
    public final float f;
    public ekzx j;
    public ekzx k;
    private final SparseArray l;
    private final long[] m;
    private final boolean[] n;
    public final Map a = new HashMap();
    public final Set b = new HashSet();
    public final Map c = new HashMap();
    public final fgoc d = (fgoc) fgom.a.createBuilder();
    public long g = 0;
    public long h = Long.MAX_VALUE;
    public long i = Long.MIN_VALUE;
    private long o = 1;
    private long p = 2;

    public elkq(eldq eldqVar, SparseArray sparseArray, float f) {
        this.e = eldqVar;
        this.l = sparseArray;
        this.f = f;
        this.n = new boolean[eldqVar.e.size()];
        this.m = new long[eldqVar.e.size()];
    }

    private final long c(long j, eyev eyevVar, String str) {
        long j2 = this.o;
        this.o = 1 + j2;
        fgov fgovVar = (fgov) fgow.a.createBuilder();
        fgovVar.copyOnWrite();
        fgow fgowVar = (fgow) fgovVar.instance;
        fgowVar.b |= 2;
        fgowVar.d = j;
        fgovVar.copyOnWrite();
        fgow fgowVar2 = (fgow) fgovVar.instance;
        fgowVar2.b |= 1;
        fgowVar2.c = str;
        n(j2, eyevVar, (fgow) fgovVar.build());
        fgre m = m(j2);
        m.copyOnWrite();
        fgrf fgrfVar = (fgrf) m.instance;
        fgrf fgrfVar2 = fgrf.a;
        fgrfVar.b |= 16;
        fgrfVar.g = true;
        return j2;
    }

    private final long d(int i) {
        long[] jArr = this.m;
        long j = jArr[i];
        if (j != 0) {
            return j;
        }
        long j2 = this.o;
        this.o = 1 + j2;
        jArr[i] = j2;
        return j2;
    }

    private final long e(ekzx ekzxVar) {
        return d(ekzxVar.d);
    }

    private static long f(ekzx ekzxVar) {
        return ((ekzxVar.f + ekzxVar.h) * 1000000) + ekzxVar.g + ekzxVar.i;
    }

    private static long g(ekzx ekzxVar) {
        return (ekzxVar.f * 1000000) + ekzxVar.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        if (r4 <= r7) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.elkp h(defpackage.ekzx r12) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elkq.h(ekzx):elkp");
    }

    private static eyev i(ekzx ekzxVar) {
        return eyki.e(f(ekzxVar));
    }

    private static eyev j(ekzx ekzxVar) {
        return k(ekzxVar, 0L);
    }

    private static eyev k(ekzx ekzxVar, long j) {
        return eyki.e(g(ekzxVar) + j);
    }

    private final fgow l(ekzx ekzxVar, long j) {
        fgov fgovVar = (fgov) fgow.a.createBuilder();
        String str = ekzxVar.c;
        fgovVar.copyOnWrite();
        fgow fgowVar = (fgow) fgovVar.instance;
        str.getClass();
        fgowVar.b |= 1;
        fgowVar.c = str;
        fgovVar.copyOnWrite();
        fgow fgowVar2 = (fgow) fgovVar.instance;
        fgowVar2.b |= 2;
        fgowVar2.d = j;
        enip enipVar = (enip) ((elae) this.l.get(ekzxVar.d, elad.a)).g(elce.a);
        if (enipVar != null) {
            fgovVar.copyOnWrite();
            fgow fgowVar3 = (fgow) fgovVar.instance;
            eygl eyglVar = fgowVar3.e;
            if (!eyglVar.c()) {
                fgowVar3.e = eyfy.mutableCopy(eyglVar);
            }
            eydl.addAll(enipVar, fgowVar3.e);
        }
        return (fgow) fgovVar.build();
    }

    private final fgre m(long j) {
        Map map = this.a;
        Long valueOf = Long.valueOf(j);
        fgre fgreVar = (fgre) map.get(valueOf);
        if (fgreVar != null) {
            return fgreVar;
        }
        fgre fgreVar2 = (fgre) fgrf.a.createBuilder();
        fgreVar2.copyOnWrite();
        fgrf fgrfVar = (fgrf) fgreVar2.instance;
        fgrfVar.b |= 1;
        fgrfVar.c = j;
        this.a.put(valueOf, fgreVar2);
        return fgreVar2;
    }

    private final void n(long j, eyev eyevVar, fgow fgowVar) {
        fgon fgonVar = (fgon) fgox.a.createBuilder();
        fgonVar.copyOnWrite();
        fgox fgoxVar = (fgox) fgonVar.instance;
        fgoxVar.b |= 1;
        fgoxVar.e = j;
        fgonVar.copyOnWrite();
        fgox fgoxVar2 = (fgox) fgonVar.instance;
        eyevVar.getClass();
        fgoxVar2.f = eyevVar;
        fgoxVar2.b |= 2;
        fgoo fgooVar = (fgoo) fgop.a.createBuilder();
        fgooVar.copyOnWrite();
        fgop fgopVar = (fgop) fgooVar.instance;
        fgowVar.getClass();
        fgopVar.c = fgowVar;
        fgopVar.b |= 1;
        fgonVar.copyOnWrite();
        fgox fgoxVar3 = (fgox) fgonVar.instance;
        fgop fgopVar2 = (fgop) fgooVar.build();
        fgopVar2.getClass();
        fgoxVar3.d = fgopVar2;
        fgoxVar3.c = 5;
        this.d.a(fgonVar);
    }

    private final void o(ekzx ekzxVar, long j, long j2, long j3, String str, long j4) {
        long e = e(ekzxVar);
        eyev k = k(ekzxVar, j4);
        fgoq fgoqVar = (fgoq) fgos.a.createBuilder();
        fgow l = l(ekzxVar, j);
        fgoqVar.copyOnWrite();
        fgos fgosVar = (fgos) fgoqVar.instance;
        l.getClass();
        fgosVar.c = l;
        fgosVar.b |= 1;
        if (j2 != 0) {
            fgoqVar.copyOnWrite();
            fgos fgosVar2 = (fgos) fgoqVar.instance;
            fgosVar2.b |= 2;
            fgosVar2.d = j2;
        }
        if (j3 != 0 && str != null) {
            fgoqVar.copyOnWrite();
            fgos fgosVar3 = (fgos) fgoqVar.instance;
            fgosVar3.b |= 8;
            fgosVar3.e = str;
            fgoqVar.copyOnWrite();
            fgos fgosVar4 = (fgos) fgoqVar.instance;
            fgosVar4.b |= 32;
            fgosVar4.g = 1L;
            fgoqVar.copyOnWrite();
            fgos fgosVar5 = (fgos) fgoqVar.instance;
            fgosVar5.f = 3;
            fgosVar5.b |= 16;
        }
        fgoc fgocVar = this.d;
        fgon fgonVar = (fgon) fgox.a.createBuilder();
        fgonVar.copyOnWrite();
        fgox fgoxVar = (fgox) fgonVar.instance;
        fgoxVar.b |= 1;
        fgoxVar.e = e;
        fgonVar.copyOnWrite();
        fgox fgoxVar2 = (fgox) fgonVar.instance;
        k.getClass();
        fgoxVar2.f = k;
        fgoxVar2.b |= 2;
        fgonVar.copyOnWrite();
        fgox fgoxVar3 = (fgox) fgonVar.instance;
        fgos fgosVar6 = (fgos) fgoqVar.build();
        fgosVar6.getClass();
        fgoxVar3.d = fgosVar6;
        fgoxVar3.c = 3;
        fgocVar.a(fgonVar);
        if ((ekzxVar.b & 32) != 0) {
            if (ekzxVar.h > 0 || ekzxVar.i > 0) {
                k = i(ekzxVar);
            }
            fgot fgotVar = (fgot) fgou.a.createBuilder();
            if ((ekzxVar.b & 128) != 0) {
                eyev d = eyki.d(ekzxVar.j);
                fgotVar.copyOnWrite();
                fgou fgouVar = (fgou) fgotVar.instance;
                d.getClass();
                fgouVar.c = d;
                fgouVar.b |= 1;
            }
            fgoc fgocVar2 = this.d;
            fgon fgonVar2 = (fgon) fgox.a.createBuilder();
            fgonVar2.copyOnWrite();
            fgox fgoxVar4 = (fgox) fgonVar2.instance;
            fgoxVar4.b |= 1;
            fgoxVar4.e = e;
            fgonVar2.copyOnWrite();
            fgox fgoxVar5 = (fgox) fgonVar2.instance;
            k.getClass();
            fgoxVar5.f = k;
            fgoxVar5.b |= 2;
            fgonVar2.copyOnWrite();
            fgox fgoxVar6 = (fgox) fgonVar2.instance;
            fgou fgouVar2 = (fgou) fgotVar.build();
            fgouVar2.getClass();
            fgoxVar6.d = fgouVar2;
            fgoxVar6.c = 4;
            fgocVar2.a(fgonVar2);
        }
    }

    public final emxc a(ekzx ekzxVar) {
        elaa j = elae.j(elkl.a, (elae) this.l.get(ekzxVar.d, elad.a));
        return j.b() ? ((elkk) j.a()).a() : emux.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.ekzx r20) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elkq.b(ekzx):void");
    }
}
