package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ohu extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ oia d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohu(oia oiaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = oiaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ohu) c((okz) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00a8  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.c
            r2 = 2
            r3 = 1
            r4 = 3
            r5 = 0
            if (r1 == 0) goto L39
            if (r1 == r3) goto L24
            if (r1 == r2) goto L1b
            java.lang.Object r0 = r7.b
            java.lang.Object r1 = r7.a
            java.lang.Object r2 = r7.e
            okz r2 = (defpackage.okz) r2
            defpackage.ffci.b(r8)
            goto L95
        L1b:
            java.lang.Object r1 = r7.e
            okz r1 = (defpackage.okz) r1
            defpackage.ffci.b(r8)
            r2 = r1
            goto L80
        L24:
            java.lang.Object r0 = r7.b
            oib r0 = (defpackage.oib) r0
            java.lang.Object r1 = r7.a
            okt r1 = (defpackage.okt) r1
            java.lang.Object r1 = r7.e
            okz r1 = (defpackage.okz) r1
            defpackage.ffci.b(r8)
            oie r8 = r0.b     // Catch: java.lang.Throwable -> L38
            r8.e(r5)     // Catch: java.lang.Throwable -> L38
        L38:
            throw r5
        L39:
            defpackage.ffci.b(r8)
            java.lang.Object r8 = r7.e
            okz r8 = (defpackage.okz) r8
            oia r1 = r7.d
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.g
            r6 = 0
            boolean r1 = r1.compareAndSet(r6, r3)
            if (r1 == 0) goto Lb6
            oia r1 = r7.d
            oho r3 = new oho
            r3.<init>(r1, r8, r5)
            defpackage.ffqy.d(r8, r5, r5, r3, r4)
            r1 = 6
            ffwm r1 = defpackage.ffwp.a(r6, r6, r1)
            oia r3 = r7.d
            ohq r6 = new ohq
            r6.<init>(r3, r1, r5)
            defpackage.ffqy.d(r8, r5, r5, r6, r4)
            oia r3 = r7.d
            oht r6 = new oht
            r6.<init>(r1, r3, r5)
            defpackage.ffqy.d(r8, r5, r5, r6, r4)
            oia r1 = r7.d
            r7.e = r8
            r7.a = r5
            r7.b = r5
            r7.c = r2
            java.lang.Object r1 = r1.c(r7)
            if (r1 != r0) goto L7f
            goto Lb5
        L7f:
            r2 = r8
        L80:
            oia r8 = r7.d
            r7.e = r2
            oib r1 = r8.i
            r7.a = r1
            fgjb r8 = r1.a
            r7.b = r8
            r7.c = r4
            java.lang.Object r3 = r8.a(r5, r7)
            if (r3 == r0) goto Lb5
            r0 = r8
        L95:
            oib r1 = (defpackage.oib) r1     // Catch: java.lang.Throwable -> Lb0
            oie r8 = r1.b     // Catch: java.lang.Throwable -> Lb0
            ogh r8 = r8.j     // Catch: java.lang.Throwable -> Lb0
            ofz r1 = defpackage.ofz.a     // Catch: java.lang.Throwable -> Lb0
            ofx r8 = r8.a(r1)     // Catch: java.lang.Throwable -> Lb0
            r0.b(r5)
            boolean r8 = r8 instanceof defpackage.ofu
            if (r8 != 0) goto Lad
            oia r8 = r7.d
            r8.h(r2)
        Lad:
            ffcu r8 = defpackage.ffcu.a
            return r8
        Lb0:
            r8 = move-exception
            r0.b(r5)
            throw r8
        Lb5:
            return r0
        Lb6:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ohu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ohu ohuVar = new ohu(this.d, ffguVar);
        ohuVar.e = obj;
        return ohuVar;
    }
}
