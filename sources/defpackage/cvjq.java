package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvjq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvki b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvjq(ffgu ffguVar, cvki cvkiVar) {
        super(2, ffguVar);
        this.b = cvkiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvjq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002a, code lost:
    
        if (r6 != r0) goto L13;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.a
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L19
            if (r1 == r4) goto L15
            if (r1 == r2) goto L11
            defpackage.ffci.b(r6)
            return r3
        L11:
            defpackage.ffci.b(r6)     // Catch: defpackage.eizq -> L4f
            goto L4c
        L15:
            defpackage.ffci.b(r6)
            goto L2c
        L19:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.c
            ffsk r6 = (defpackage.ffsk) r6
            cvki r6 = r5.b
            r5.a = r4
            comc r6 = r6.a
            java.lang.Object r6 = r6.c(r5)
            if (r6 == r0) goto L5b
        L2c:
            cvjn r6 = (defpackage.cvjn) r6
            int r1 = r6.b
            r1 = r1 & r4
            if (r1 == 0) goto L5a
            cvki r1 = r5.b     // Catch: defpackage.eizq -> L4f
            ffbr r1 = r1.c     // Catch: defpackage.eizq -> L4f
            java.lang.Object r1 = r1.b()     // Catch: defpackage.eizq -> L4f
            ejet r1 = (defpackage.ejet) r1     // Catch: defpackage.eizq -> L4f
            int r6 = r6.c     // Catch: defpackage.eizq -> L4f
            com.google.common.util.concurrent.ListenableFuture r6 = r1.a(r6)     // Catch: defpackage.eizq -> L4f
            r5.a = r2     // Catch: defpackage.eizq -> L4f
            java.lang.Object r6 = defpackage.fgfz.c(r6, r5)     // Catch: defpackage.eizq -> L4f
            if (r6 != r0) goto L4c
            goto L5b
        L4c:
            eisx r6 = (defpackage.eisx) r6     // Catch: defpackage.eizq -> L4f
            return r6
        L4f:
            cvki r6 = r5.b
            r1 = 3
            r5.a = r1
            java.lang.Object r6 = r6.m(r5)
            if (r6 == r0) goto L5b
        L5a:
            return r3
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvjq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cvjq cvjqVar = new cvjq(ffguVar, this.b);
        cvjqVar.c = obj;
        return cvjqVar;
    }
}
