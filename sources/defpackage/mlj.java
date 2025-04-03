package defpackage;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mlj implements mls {
    private static final Random d = new Random();
    public mlr c;
    private String g;
    public final lrt a = new lrt();
    public final lrs b = new lrs();
    private final HashMap e = new HashMap();
    private lru f = lru.a;
    private long h = -1;

    public static String b() {
        byte[] bArr = new byte[12];
        d.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.mli i(int r14, defpackage.mtl r15) {
        /*
            r13 = this;
            java.util.HashMap r0 = r13.e
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 0
        L10:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L83
            java.lang.Object r4 = r0.next()
            mli r4 = (defpackage.mli) r4
            long r5 = r4.c
            r7 = -1
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L38
            int r5 = r4.b
            if (r14 != r5) goto L38
            if (r15 == 0) goto L38
            mlj r5 = r4.g
            long r5 = r5.a()
            long r9 = r15.d
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 < 0) goto L38
            r4.c = r9
        L38:
            if (r15 != 0) goto L3f
            int r5 = r4.b
            if (r14 != r5) goto L10
            goto L67
        L3f:
            mtl r5 = r4.d
            if (r5 != 0) goto L52
            boolean r5 = r15.b()
            if (r5 != 0) goto L10
            long r5 = r15.d
            long r9 = r4.c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 == 0) goto L67
            goto L10
        L52:
            long r9 = r15.d
            long r11 = r5.d
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 != 0) goto L10
            int r6 = r15.b
            int r9 = r5.b
            if (r6 != r9) goto L10
            int r6 = r15.c
            int r5 = r5.c
            if (r6 == r5) goto L67
            goto L10
        L67:
            long r5 = r4.c
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L80
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 >= 0) goto L72
            goto L80
        L72:
            if (r7 != 0) goto L10
            int r5 = defpackage.lvf.a
            mtl r5 = r3.d
            if (r5 == 0) goto L10
            mtl r5 = r4.d
            if (r5 == 0) goto L10
            r3 = r4
            goto L10
        L80:
            r3 = r4
            r1 = r5
            goto L10
        L83:
            if (r3 != 0) goto L94
            java.lang.String r0 = b()
            mli r1 = new mli
            r1.<init>(r13, r0, r14, r15)
            java.util.HashMap r14 = r13.e
            r14.put(r0, r1)
            return r1
        L94:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mlj.i(int, mtl):mli");
    }

    private final void j(mli mliVar) {
        long j = mliVar.c;
        if (j != -1) {
            this.h = j;
        }
        this.g = null;
    }

    private final void k(mis misVar) {
        mtl mtlVar;
        if (misVar.b.q()) {
            String str = this.g;
            if (str != null) {
                mli mliVar = (mli) this.e.get(str);
                lti.f(mliVar);
                j(mliVar);
                return;
            }
            return;
        }
        mli mliVar2 = (mli) this.e.get(this.g);
        this.g = i(misVar.c, misVar.d).a;
        f(misVar);
        mtl mtlVar2 = misVar.d;
        if (mtlVar2 == null || !mtlVar2.b()) {
            return;
        }
        if (mliVar2 != null) {
            if (mliVar2.c == mtlVar2.d && (mtlVar = mliVar2.d) != null) {
                if (mtlVar.b == mtlVar2.b && mtlVar.c == mtlVar2.c) {
                    return;
                }
            }
        }
        i(misVar.c, new mtl(mtlVar2.a, mtlVar2.d));
    }

    public final long a() {
        mli mliVar = (mli) this.e.get(this.g);
        if (mliVar != null) {
            long j = mliVar.c;
            if (j != -1) {
                return j;
            }
        }
        return this.h + 1;
    }

    @Override // defpackage.mls
    public final synchronized String c() {
        return this.g;
    }

    @Override // defpackage.mls
    public final synchronized String d(lru lruVar, mtl mtlVar) {
        return i(lruVar.o(mtlVar.a, this.b).c, mtlVar).a;
    }

    @Override // defpackage.mls
    public final synchronized void e(mis misVar) {
        mlr mlrVar;
        String str = this.g;
        if (str != null) {
            mli mliVar = (mli) this.e.get(str);
            lti.f(mliVar);
            j(mliVar);
        }
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            mli mliVar2 = (mli) it.next();
            it.remove();
            if (mliVar2.e && (mlrVar = this.c) != null) {
                mlrVar.l(misVar, mliVar2.a);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (r0.b == r9.c) goto L16;
     */
    @Override // defpackage.mls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void f(defpackage.mis r9) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mlj.f(mis):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if (r2 != false) goto L15;
     */
    @Override // defpackage.mls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void g(defpackage.mis r5, int r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            mlr r0 = r4.c     // Catch: java.lang.Throwable -> L4a
            defpackage.lti.f(r0)     // Catch: java.lang.Throwable -> L4a
            java.util.HashMap r0 = r4.e     // Catch: java.lang.Throwable -> L4a
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4a
        L10:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L45
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L4a
            mli r1 = (defpackage.mli) r1     // Catch: java.lang.Throwable -> L4a
            boolean r2 = r1.a(r5)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L10
            r0.remove()     // Catch: java.lang.Throwable -> L4a
            boolean r2 = r1.e     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L10
            java.lang.String r2 = r1.a     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = r4.g     // Catch: java.lang.Throwable -> L4a
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L4a
            if (r6 != 0) goto L38
            if (r2 == 0) goto L3d
            boolean r2 = r1.f     // Catch: java.lang.Throwable -> L4a
            goto L3a
        L38:
            if (r2 == 0) goto L3d
        L3a:
            r4.j(r1)     // Catch: java.lang.Throwable -> L4a
        L3d:
            mlr r2 = r4.c     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = r1.a     // Catch: java.lang.Throwable -> L4a
            r2.l(r5, r1)     // Catch: java.lang.Throwable -> L4a
            goto L10
        L45:
            r4.k(r5)     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r4)
            return
        L4a:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mlj.g(mis, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if (r4 >= r3.c()) goto L10;
     */
    @Override // defpackage.mls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void h(defpackage.mis r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            mlr r0 = r7.c     // Catch: java.lang.Throwable -> L9b
            defpackage.lti.f(r0)     // Catch: java.lang.Throwable -> L9b
            lru r0 = r7.f     // Catch: java.lang.Throwable -> L9b
            lru r1 = r8.b     // Catch: java.lang.Throwable -> L9b
            r7.f = r1     // Catch: java.lang.Throwable -> L9b
            java.util.HashMap r1 = r7.e     // Catch: java.lang.Throwable -> L9b
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L9b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L9b
        L16:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L9b
            if (r2 == 0) goto L96
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L9b
            mli r2 = (defpackage.mli) r2     // Catch: java.lang.Throwable -> L9b
            lru r3 = r7.f     // Catch: java.lang.Throwable -> L9b
            int r4 = r2.b     // Catch: java.lang.Throwable -> L9b
            int r5 = r0.c()     // Catch: java.lang.Throwable -> L9b
            r6 = -1
            if (r4 < r5) goto L35
            int r5 = r3.c()     // Catch: java.lang.Throwable -> L9b
            if (r4 < r5) goto L62
        L33:
            r4 = r6
            goto L62
        L35:
            mlj r5 = r2.g     // Catch: java.lang.Throwable -> L9b
            lrt r5 = r5.a     // Catch: java.lang.Throwable -> L9b
            r0.p(r4, r5)     // Catch: java.lang.Throwable -> L9b
            mlj r4 = r2.g     // Catch: java.lang.Throwable -> L9b
            lrt r4 = r4.a     // Catch: java.lang.Throwable -> L9b
            int r4 = r4.n     // Catch: java.lang.Throwable -> L9b
        L42:
            mlj r5 = r2.g     // Catch: java.lang.Throwable -> L9b
            lrt r5 = r5.a     // Catch: java.lang.Throwable -> L9b
            int r5 = r5.o     // Catch: java.lang.Throwable -> L9b
            if (r4 > r5) goto L33
            java.lang.Object r5 = r0.f(r4)     // Catch: java.lang.Throwable -> L9b
            int r5 = r3.a(r5)     // Catch: java.lang.Throwable -> L9b
            if (r5 == r6) goto L5f
            mlj r4 = r2.g     // Catch: java.lang.Throwable -> L9b
            lrs r4 = r4.b     // Catch: java.lang.Throwable -> L9b
            lrs r4 = r3.n(r5, r4)     // Catch: java.lang.Throwable -> L9b
            int r4 = r4.c     // Catch: java.lang.Throwable -> L9b
            goto L62
        L5f:
            int r4 = r4 + 1
            goto L42
        L62:
            r2.b = r4     // Catch: java.lang.Throwable -> L9b
            if (r4 != r6) goto L67
            goto L7a
        L67:
            mtl r4 = r2.d     // Catch: java.lang.Throwable -> L9b
            if (r4 != 0) goto L6c
            goto L74
        L6c:
            java.lang.Object r4 = r4.a     // Catch: java.lang.Throwable -> L9b
            int r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L9b
            if (r3 == r6) goto L7a
        L74:
            boolean r3 = r2.a(r8)     // Catch: java.lang.Throwable -> L9b
            if (r3 == 0) goto L16
        L7a:
            r1.remove()     // Catch: java.lang.Throwable -> L9b
            boolean r3 = r2.e     // Catch: java.lang.Throwable -> L9b
            if (r3 == 0) goto L16
            java.lang.String r3 = r2.a     // Catch: java.lang.Throwable -> L9b
            java.lang.String r4 = r7.g     // Catch: java.lang.Throwable -> L9b
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L9b
            if (r3 == 0) goto L8e
            r7.j(r2)     // Catch: java.lang.Throwable -> L9b
        L8e:
            mlr r3 = r7.c     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = r2.a     // Catch: java.lang.Throwable -> L9b
            r3.l(r8, r2)     // Catch: java.lang.Throwable -> L9b
            goto L16
        L96:
            r7.k(r8)     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r7)
            return
        L9b:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9b
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mlj.h(mis):void");
    }
}
