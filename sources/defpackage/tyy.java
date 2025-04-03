package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tyy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ tzc b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyy(ffgu ffguVar, tzc tzcVar) {
        super(2, ffguVar);
        this.b = tzcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tyy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0029, code lost:
    
        if (r1.a(null, r5) != r0) goto L21;
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
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            if (r1 == r2) goto Le
            defpackage.ffci.b(r6)
            return r6
        Le:
            java.lang.Object r1 = r5.c
            fgjb r1 = (defpackage.fgjb) r1
            defpackage.ffci.b(r6)
            goto L2b
        L16:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.c
            ffsk r6 = (defpackage.ffsk) r6
            tzc r6 = r5.b
            fgjb r1 = r6.f
            r5.c = r1
            r5.a = r2
            java.lang.Object r6 = r1.a(r3, r5)
            if (r6 == r0) goto L5a
        L2b:
            tzc r6 = r5.b     // Catch: java.lang.Throwable -> L55
            ejlc r2 = r6.g     // Catch: java.lang.Throwable -> L55
            if (r2 != 0) goto L41
            ejlc r2 = new ejlc     // Catch: java.lang.Throwable -> L55
            tyt r4 = new tyt     // Catch: java.lang.Throwable -> L55
            r4.<init>()     // Catch: java.lang.Throwable -> L55
            erpp r6 = defpackage.erpp.a     // Catch: java.lang.Throwable -> L55
            r2.<init>(r4, r6)     // Catch: java.lang.Throwable -> L55
            tzc r6 = r5.b     // Catch: java.lang.Throwable -> L55
            r6.g = r2     // Catch: java.lang.Throwable -> L55
        L41:
            r1.b(r3)
            com.google.common.util.concurrent.ListenableFuture r6 = r2.c()
            r5.c = r3
            r1 = 2
            r5.a = r1
            java.lang.Object r6 = defpackage.fgfz.c(r6, r5)
            if (r6 != r0) goto L54
            goto L5a
        L54:
            return r6
        L55:
            r6 = move-exception
            r1.b(r3)
            throw r6
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        tyy tyyVar = new tyy(ffguVar, this.b);
        tyyVar.c = obj;
        return tyyVar;
    }
}
