package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ouq extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ our c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ouq(our ourVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ourVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ouq) c((otx) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        if (r1.b(r2, r3, r14) == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0026, code lost:
    
        if (r15 != r0) goto L9;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) {
        /*
            r14 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r14.a
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 == r2) goto Le
            defpackage.ffci.b(r15)
            goto L9d
        Le:
            java.lang.Object r1 = r14.b
            otx r1 = (defpackage.otx) r1
            defpackage.ffci.b(r15)
            goto L28
        L16:
            defpackage.ffci.b(r15)
            java.lang.Object r15 = r14.b
            r1 = r15
            otx r1 = (defpackage.otx) r1
            r14.b = r1
            r14.a = r2
            java.lang.Object r15 = r1.c()
            if (r15 == r0) goto La0
        L28:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L9d
            our r15 = r14.c
            osl r15 = r15.c
            java.util.concurrent.locks.ReentrantLock r3 = r15.a
            r3.lock()
            boolean r4 = r15.d     // Catch: java.lang.Throwable -> L98
            r5 = 0
            r6 = 0
            if (r4 != 0) goto L44
            r3.unlock()
            r7 = r5
            goto L75
        L44:
            r15.d = r6     // Catch: java.lang.Throwable -> L98
            long[] r4 = r15.b     // Catch: java.lang.Throwable -> L98
            int r4 = r4.length     // Catch: java.lang.Throwable -> L98
            osk[] r7 = new defpackage.osk[r4]     // Catch: java.lang.Throwable -> L98
            r8 = r6
        L4c:
            if (r8 >= r4) goto L72
            long[] r9 = r15.b     // Catch: java.lang.Throwable -> L98
            r10 = r9[r8]     // Catch: java.lang.Throwable -> L98
            r12 = 0
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 <= 0) goto L5a
            r9 = r2
            goto L5b
        L5a:
            r9 = r6
        L5b:
            boolean[] r10 = r15.c     // Catch: java.lang.Throwable -> L98
            boolean r11 = r10[r8]     // Catch: java.lang.Throwable -> L98
            if (r9 == r11) goto L6b
            r10[r8] = r9     // Catch: java.lang.Throwable -> L98
            if (r9 == 0) goto L68
            osk r9 = defpackage.osk.b     // Catch: java.lang.Throwable -> L98
            goto L6d
        L68:
            osk r9 = defpackage.osk.c     // Catch: java.lang.Throwable -> L98
            goto L6d
        L6b:
            osk r9 = defpackage.osk.a     // Catch: java.lang.Throwable -> L98
        L6d:
            r7[r8] = r9     // Catch: java.lang.Throwable -> L98
            int r8 = r8 + 1
            goto L4c
        L72:
            r3.unlock()
        L75:
            if (r7 == 0) goto L9d
        L77:
            int r15 = r7.length
            if (r6 >= r15) goto L9d
            r15 = r7[r6]
            osk r2 = defpackage.osk.a
            if (r15 == r2) goto L95
            our r15 = r14.c
            otw r2 = defpackage.otw.b
            oup r3 = new oup
            r3.<init>(r7, r15, r1, r5)
            r14.b = r5
            r15 = 2
            r14.a = r15
            java.lang.Object r15 = r1.b(r2, r3, r14)
            if (r15 != r0) goto L9d
            goto La0
        L95:
            int r6 = r6 + 1
            goto L77
        L98:
            r15 = move-exception
            r3.unlock()
            throw r15
        L9d:
            ffcu r15 = defpackage.ffcu.a
            return r15
        La0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ouq ouqVar = new ouq(this.c, ffguVar);
        ouqVar.b = obj;
        return ouqVar;
    }
}
