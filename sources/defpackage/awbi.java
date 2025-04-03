package defpackage;

import j$.time.Duration;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awbi implements awat {
    private final awai a;
    private final Queue b;
    private final boolean c;
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final fgjb f = new fgjf();
    private final awcr g = awcr.k;

    public awbi(awai awaiVar, Queue queue, boolean z) {
        this.a = awaiVar;
        this.b = queue;
        this.c = z;
    }

    private final void c(awat awatVar, int i, Duration duration) {
        if (this.c) {
            awai awaiVar = this.a;
            awaiVar.e.i.add(new awcq(awatVar.a(), i, duration));
        }
    }

    private final void d(int i) {
        if (this.c) {
            this.a.e.l = i;
        }
    }

    @Override // defpackage.awat
    public final awcr a() {
        return this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:12:0x002f, B:14:0x0068, B:16:0x006e), top: B:11:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.awat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.awbf
            if (r0 == 0) goto L13
            r0 = r7
            awbf r0 = (defpackage.awbf) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            awbf r0 = new awbf
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r2 = r0.b
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r0.a
            fgjb r5 = (defpackage.fgjb) r5
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L33
            goto L68
        L33:
            r7 = move-exception
            goto L8a
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3d:
            java.lang.Object r2 = r0.b
            fgjb r2 = (defpackage.fgjb) r2
            java.lang.Object r5 = r0.a
            awbi r5 = (defpackage.awbi) r5
            defpackage.ffci.b(r7)
            r7 = r2
            goto L61
        L4a:
            defpackage.ffci.b(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.e
            r7.set(r5)
            fgjb r7 = r6.f
            r0.a = r6
            r0.b = r7
            r0.e = r5
            java.lang.Object r2 = r7.a(r4, r0)
            if (r2 == r1) goto L8e
            r5 = r6
        L61:
            java.util.Queue r2 = r5.b     // Catch: java.lang.Throwable -> L87
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L87
            r5 = r7
        L68:
            boolean r7 = r2.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L81
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L33
            awat r7 = (defpackage.awat) r7     // Catch: java.lang.Throwable -> L33
            r0.a = r5     // Catch: java.lang.Throwable -> L33
            r0.b = r2     // Catch: java.lang.Throwable -> L33
            r0.e = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r7 = r7.b(r0)     // Catch: java.lang.Throwable -> L33
            if (r7 != r1) goto L68
            goto L8e
        L81:
            r5.b(r4)
            ffcu r7 = defpackage.ffcu.a
            return r7
        L87:
            r0 = move-exception
            r5 = r7
            r7 = r0
        L8a:
            r5.b(r4)
            throw r7
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awbi.b(ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.awat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.awbg
            if (r0 == 0) goto L13
            r0 = r5
            awbg r0 = (defpackage.awbg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            awbg r0 = new awbg
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r2 = r0.a
            defpackage.ffci.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ffci.b(r5)
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.d
            r5.set(r3)
            java.util.Queue r5 = r4.b
            java.util.Iterator r2 = r5.iterator()
        L3f:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L56
            java.lang.Object r5 = r2.next()
            awat r5 = (defpackage.awat) r5
            r0.a = r2
            r0.d = r3
            java.lang.Object r5 = r5.e(r0)
            if (r5 != r1) goto L3f
            return r1
        L56:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awbi.e(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d8, code lost:
    
        if (r11.a(null, r0) != r1) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00d8 -> B:11:0x0035). Please report as a decompilation issue!!! */
    @Override // defpackage.awat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.awai r11, defpackage.awbj r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awbi.f(awai, awbj, ffgu):java.lang.Object");
    }

    @Override // defpackage.awat
    public final boolean h() {
        return this.e.get();
    }

    @Override // defpackage.awat
    public final boolean i() {
        return this.d.get();
    }
}
