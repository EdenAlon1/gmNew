package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbla extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ fgjb f;
    final /* synthetic */ cblf g;
    final /* synthetic */ MessageId h;
    final /* synthetic */ cqpu i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbla(fgjb fgjbVar, cblf cblfVar, MessageId messageId, cqpu cqpuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.f = fgjbVar;
        this.g = cblfVar;
        this.h = messageId;
        this.i = cqpuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbla) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        if (defpackage.ffsw.c(r4, r6) != r0) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0056 A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #0 {all -> 0x006b, blocks: (B:6:0x0045, B:8:0x0056), top: B:5:0x0045 }] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1a
            if (r1 == r2) goto L16
            java.lang.Object r0 = r6.d
            java.lang.Object r1 = r6.c
            java.lang.Object r2 = r6.b
            java.lang.Object r4 = r6.a
            defpackage.ffci.b(r7)
            goto L45
        L16:
            defpackage.ffci.b(r7)
            goto L2b
        L1a:
            defpackage.ffci.b(r7)
            j$.time.Duration r7 = defpackage.cblf.a
            long r4 = r7.toMillis()
            r6.e = r2
            java.lang.Object r7 = defpackage.ffsw.c(r4, r6)
            if (r7 == r0) goto L70
        L2b:
            fgjb r4 = r6.f
            cblf r2 = r6.g
            com.google.android.apps.messaging.shared.api.messaging.MessageId r1 = r6.h
            cqpu r7 = r6.i
            r6.a = r4
            r6.b = r2
            r6.c = r1
            r6.d = r7
            r5 = 2
            r6.e = r5
            java.lang.Object r5 = r4.a(r3, r6)
            if (r5 == r0) goto L70
            r0 = r7
        L45:
            j$.time.Duration r7 = defpackage.cblf.a     // Catch: java.lang.Throwable -> L6b
            r7 = r2
            cblf r7 = (defpackage.cblf) r7     // Catch: java.lang.Throwable -> L6b
            j$.util.concurrent.ConcurrentHashMap r7 = r7.c     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r7 = r7.get(r1)     // Catch: java.lang.Throwable -> L6b
            boolean r7 = defpackage.ffkj.e(r7, r0)     // Catch: java.lang.Throwable -> L6b
            if (r7 == 0) goto L65
            r7 = r2
            cblf r7 = (defpackage.cblf) r7     // Catch: java.lang.Throwable -> L6b
            j$.util.concurrent.ConcurrentHashMap r7 = r7.c     // Catch: java.lang.Throwable -> L6b
            r7.remove(r1)     // Catch: java.lang.Throwable -> L6b
            cblf r2 = (defpackage.cblf) r2     // Catch: java.lang.Throwable -> L6b
            j$.util.concurrent.ConcurrentHashMap r7 = r2.d     // Catch: java.lang.Throwable -> L6b
            r7.remove(r1)     // Catch: java.lang.Throwable -> L6b
        L65:
            r4.b(r3)
            ffcu r7 = defpackage.ffcu.a
            return r7
        L6b:
            r7 = move-exception
            r4.b(r3)
            throw r7
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbla.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cbla(this.f, this.g, this.h, this.i, ffguVar);
    }
}
