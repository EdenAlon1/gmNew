package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hvp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffji b;
    final /* synthetic */ AtomicReference c;
    final /* synthetic */ ffjm d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hvp(ffji ffjiVar, AtomicReference atomicReference, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffjiVar;
        this.c = atomicReference;
        this.d = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hvp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        if (defpackage.ffui.a(r6.a, r5) != r0) goto L27;
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
            if (r1 == 0) goto L1b
            if (r1 == r2) goto L13
            java.lang.Object r0 = r5.e
            hvn r0 = (defpackage.hvn) r0
            defpackage.ffci.b(r6)     // Catch: java.lang.Throwable -> L11
            goto L5b
        L11:
            r6 = move-exception
            goto L64
        L13:
            java.lang.Object r1 = r5.e
            hvn r1 = (defpackage.hvn) r1
            defpackage.ffci.b(r6)
            goto L4b
        L1b:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.e
            ffsk r6 = (defpackage.ffsk) r6
            hvn r1 = new hvn
            ffhd r3 = r6.hT()
            ffud r3 = defpackage.ffui.c(r3)
            ffji r4 = r5.b
            java.lang.Object r6 = r4.invoke(r6)
            r1.<init>(r3, r6)
            java.util.concurrent.atomic.AtomicReference r6 = r5.c
            java.lang.Object r6 = r6.getAndSet(r1)
            hvn r6 = (defpackage.hvn) r6
            if (r6 == 0) goto L4b
            r5.e = r1
            r5.a = r2
            ffud r6 = r6.a
            java.lang.Object r6 = defpackage.ffui.a(r6, r5)
            if (r6 == r0) goto L61
        L4b:
            ffjm r6 = r5.d     // Catch: java.lang.Throwable -> L62
            java.lang.Object r2 = r1.b     // Catch: java.lang.Throwable -> L62
            r5.e = r1     // Catch: java.lang.Throwable -> L62
            r3 = 2
            r5.a = r3     // Catch: java.lang.Throwable -> L62
            java.lang.Object r6 = r6.a(r2, r5)     // Catch: java.lang.Throwable -> L62
            if (r6 == r0) goto L61
            r0 = r1
        L5b:
            java.util.concurrent.atomic.AtomicReference r1 = r5.c
            defpackage.hvo.a(r1, r0)
            return r6
        L61:
            return r0
        L62:
            r6 = move-exception
            r0 = r1
        L64:
            java.util.concurrent.atomic.AtomicReference r1 = r5.c
            defpackage.hvo.a(r1, r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        hvp hvpVar = new hvp(this.b, this.c, this.d, ffguVar);
        hvpVar.e = obj;
        return hvpVar;
    }
}
