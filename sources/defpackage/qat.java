package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qat extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ppr b;
    final /* synthetic */ pyj c;
    final /* synthetic */ ppc d;
    final /* synthetic */ Context e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qat(ppr pprVar, pyj pyjVar, ppc ppcVar, Context context, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = pprVar;
        this.c = pyjVar;
        this.d = ppcVar;
        this.e = context;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qat) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        if (r6 != r0) goto L8;
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
            defpackage.ffci.b(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L20
            return r6
        Ld:
            ppr r6 = r5.b
            com.google.common.util.concurrent.ListenableFuture r6 = r6.a()
            r6.getClass()
            ppr r1 = r5.b
            r5.a = r2
            java.lang.Object r6 = defpackage.puc.a(r6, r1, r5)
            if (r6 == r0) goto L7e
        L20:
            ppb r6 = (defpackage.ppb) r6
            if (r6 == 0) goto L61
            pyj r1 = r5.c
            java.lang.String r2 = defpackage.qau.a
            ppt r3 = defpackage.ppt.c()
            java.lang.String r1 = r1.e
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "Updating notification for "
            java.lang.String r1 = r4.concat(r1)
            r3.a(r2, r1)
            ppc r1 = r5.d
            android.content.Context r2 = r5.e
            ppr r3 = r5.b
            java.util.UUID r3 = r3.g()
            qav r4 = new qav
            qaw r1 = (defpackage.qaw) r1
            r4.<init>()
            qbc r6 = r1.c
            qak r6 = r6.a
            java.lang.String r1 = "setForegroundAsync"
            com.google.common.util.concurrent.ListenableFuture r6 = defpackage.ppl.a(r6, r1, r4)
            r1 = 2
            r5.a = r1
            java.lang.Object r6 = defpackage.kfj.a(r6, r5)
            if (r6 != r0) goto L60
            goto L7e
        L60:
            return r6
        L61:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Worker was marked important ("
            r6.<init>(r0)
            pyj r0 = r5.c
            java.lang.String r0 = r0.e
            r6.append(r0)
            java.lang.String r0 = ") but did not provide ForegroundInfo"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qat.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new qat(this.b, this.c, this.d, this.e, ffguVar);
    }
}
