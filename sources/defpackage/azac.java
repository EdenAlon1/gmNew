package defpackage;

import android.util.LruCache;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azac implements cskg {
    private final ayzz a;
    private final LruCache b;

    public azac(ayzz ayzzVar) {
        this.a = ayzzVar;
        this.b = new LruCache(ayzzVar.a);
    }

    public final Object a(Object obj) {
        obj.getClass();
        return this.b.get(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5, defpackage.ffjm r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.azaa
            if (r0 == 0) goto L13
            r0 = r7
            azaa r0 = (defpackage.azaa) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            azaa r0 = new azaa
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            azac r5 = r0.e
            java.lang.Object r6 = r0.a
            defpackage.ffci.b(r7)
            goto L4b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r4.a(r5)
            if (r7 != 0) goto L62
            r0.a = r5
            r0.e = r4
            r0.d = r3
            java.lang.Object r7 = r6.a(r5, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            r6 = r5
            r5 = r4
        L4b:
            android.util.LruCache r0 = r5.b
            monitor-enter(r0)
            android.util.LruCache r1 = r5.b     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L58
            monitor-exit(r0)
            return r1
        L58:
            android.util.LruCache r5 = r5.b     // Catch: java.lang.Throwable -> L5f
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r0)
            return r7
        L5f:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L62:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azac.b(java.lang.Object, ffjm, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.Set r10, defpackage.ffjm r11, defpackage.ffgu r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.azab
            if (r0 == 0) goto L13
            r0 = r12
            azab r0 = (defpackage.azab) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            azab r0 = new azab
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r10 = r0.b
            java.lang.Object r11 = r0.a
            azac r0 = r0.f
            defpackage.ffci.b(r12)
            r8 = r12
            r12 = r10
            r10 = r11
            r11 = r8
            goto L89
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            defpackage.ffci.b(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r2 = r10.iterator()
        L46:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L63
            java.lang.Object r5 = r2.next()
            java.lang.Object r6 = r9.a(r5)
            if (r6 == 0) goto L5c
            ffcf r7 = new ffcf
            r7.<init>(r5, r6)
            goto L5d
        L5c:
            r7 = r3
        L5d:
            if (r7 == 0) goto L46
            r12.add(r7)
            goto L46
        L63:
            java.util.Map r12 = defpackage.ffew.k(r12)
            int r2 = r12.size()
            int r5 = r10.size()
            if (r2 != r5) goto L72
            return r12
        L72:
            java.util.Set r2 = r12.keySet()
            java.util.Set r2 = defpackage.ffdx.ap(r10, r2)
            r0.f = r9
            r0.a = r10
            r0.b = r12
            r0.e = r4
            java.lang.Object r11 = r11.a(r2, r0)
            if (r11 == r1) goto Ldd
            r0 = r9
        L89:
            java.util.Map r11 = (java.util.Map) r11
            android.util.LruCache r1 = r0.b
            monitor-enter(r1)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Lda
            r4 = 10
            int r4 = defpackage.ffdx.n(r10, r4)     // Catch: java.lang.Throwable -> Lda
            int r4 = defpackage.ffew.a(r4)     // Catch: java.lang.Throwable -> Lda
            r5 = 16
            int r4 = defpackage.ffmk.f(r4, r5)     // Catch: java.lang.Throwable -> Lda
            r2.<init>(r4)     // Catch: java.lang.Throwable -> Lda
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> Lda
        La7:
            boolean r4 = r10.hasNext()     // Catch: java.lang.Throwable -> Lda
            if (r4 == 0) goto Ld8
            java.lang.Object r4 = r10.next()     // Catch: java.lang.Throwable -> Lda
            java.lang.Object r5 = r0.a(r4)     // Catch: java.lang.Throwable -> Lda
            if (r5 != 0) goto Lca
            java.lang.Object r5 = r11.get(r4)     // Catch: java.lang.Throwable -> Lda
            if (r5 == 0) goto Lc3
            android.util.LruCache r6 = r0.b     // Catch: java.lang.Throwable -> Lda
            r6.put(r4, r5)     // Catch: java.lang.Throwable -> Lda
            goto Lc4
        Lc3:
            r5 = r3
        Lc4:
            if (r5 != 0) goto Lca
            java.lang.Object r5 = r12.get(r4)     // Catch: java.lang.Throwable -> Lda
        Lca:
            if (r5 == 0) goto Ld0
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> Lda
            goto La7
        Ld0:
            java.lang.String r10 = "delegate function did not return values for all keys."
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lda
            r11.<init>(r10)     // Catch: java.lang.Throwable -> Lda
            throw r11     // Catch: java.lang.Throwable -> Lda
        Ld8:
            monitor-exit(r1)
            return r2
        Lda:
            r10 = move-exception
            monitor-exit(r1)
            throw r10
        Ldd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azac.c(java.util.Set, ffjm, ffgu):java.lang.Object");
    }

    public final Object d(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return this.b.put(obj, obj2);
    }

    public final void e() {
        this.b.evictAll();
    }

    public final void f(Map map) {
        map.getClass();
        synchronized (this.b) {
            ffga ffgaVar = new ffga();
            for (Map.Entry entry : map.entrySet()) {
                Object d = d(entry.getKey(), entry.getValue());
                if (d != null) {
                    ffgaVar.put(entry.getKey(), d);
                }
            }
            ffew.b(ffgaVar);
        }
    }

    public final void g(Object obj) {
        obj.getClass();
        this.b.remove(obj);
    }

    @Override // defpackage.cskg
    public final void l(int i) {
        if (i >= 40) {
            e();
        }
    }
}
