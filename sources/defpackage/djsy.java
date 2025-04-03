package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djsy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ djsz b;
    Object c;
    Object d;
    int e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djsy(ffgu ffguVar, djsz djszVar) {
        super(2, ffguVar);
        this.b = djszVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djsy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007d A[LOOP:0: B:9:0x007b->B:10:0x007d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f A[LOOP:1: B:18:0x008d->B:19:0x008f, LOOP_END] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            int r0 = r7.e
            java.lang.Object r1 = r7.d
            java.lang.Object r4 = r7.c
            java.lang.Object r5 = r7.f
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = (java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock) r5
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L16
            goto L6c
        L16:
            r8 = move-exception
            goto L8d
        L19:
            defpackage.ffci.b(r8)
            java.lang.Object r8 = r7.f
            ffsk r8 = (defpackage.ffsk) r8
            djsz r8 = r7.b
            java.util.concurrent.locks.ReentrantReadWriteLock r8 = r8.e
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r8.readLock()
            int r1 = r8.getWriteHoldCount()
            if (r1 != 0) goto L33
            int r1 = r8.getReadHoldCount()
            goto L34
        L33:
            r1 = r2
        L34:
            r4 = r2
        L35:
            if (r4 >= r1) goto L3d
            r5.unlock()
            int r4 = r4 + 1
            goto L35
        L3d:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r8.writeLock()
            r4.lock()
            djsz r8 = r7.b     // Catch: java.lang.Throwable -> L8b
            java.util.concurrent.atomic.AtomicBoolean r8 = r8.f     // Catch: java.lang.Throwable -> L8b
            boolean r8 = r8.get()     // Catch: java.lang.Throwable -> L8b
            if (r8 != 0) goto L7b
            djsz r8 = r7.b     // Catch: java.lang.Throwable -> L8b
            java.util.List r6 = r8.g     // Catch: java.lang.Throwable -> L8b
            ffbr r8 = r8.c     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r8 = r8.b()     // Catch: java.lang.Throwable -> L8b
            djsa r8 = (defpackage.djsa) r8     // Catch: java.lang.Throwable -> L8b
            r7.f = r5     // Catch: java.lang.Throwable -> L8b
            r7.c = r4     // Catch: java.lang.Throwable -> L8b
            r7.d = r6     // Catch: java.lang.Throwable -> L8b
            r7.e = r1     // Catch: java.lang.Throwable -> L8b
            r7.a = r3     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r8 = r8.a(r7)     // Catch: java.lang.Throwable -> L8b
            if (r8 == r0) goto L7a
            r0 = r1
            r1 = r6
        L6c:
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> L16
            r1.addAll(r8)     // Catch: java.lang.Throwable -> L16
            djsz r8 = r7.b     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.atomic.AtomicBoolean r8 = r8.f     // Catch: java.lang.Throwable -> L16
            r8.set(r3)     // Catch: java.lang.Throwable -> L16
            r1 = r0
            goto L7b
        L7a:
            return r0
        L7b:
            if (r2 >= r1) goto L83
            r5.lock()
            int r2 = r2 + 1
            goto L7b
        L83:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = (java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock) r4
            r4.unlock()
            ffcu r8 = defpackage.ffcu.a
            return r8
        L8b:
            r8 = move-exception
            r0 = r1
        L8d:
            if (r2 >= r0) goto L95
            r5.lock()
            int r2 = r2 + 1
            goto L8d
        L95:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = (java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock) r4
            r4.unlock()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djsy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        djsy djsyVar = new djsy(ffguVar, this.b);
        djsyVar.f = obj;
        return djsyVar;
    }
}
