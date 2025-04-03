package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvbx extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ dvby c;
    final /* synthetic */ ListenableFuture d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvbx(dvby dvbyVar, ListenableFuture listenableFuture, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dvbyVar;
        this.d = listenableFuture;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvbx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r5 == r0) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r5)
            goto L38
        Ld:
            java.lang.Object r1 = r4.a
            defpackage.ffci.b(r5)
            goto L29
        L13:
            defpackage.ffci.b(r5)
            dvby r5 = r4.c
            com.google.common.util.concurrent.ListenableFuture r1 = r4.d
            dvbw r5 = r5.a
            r4.a = r5
            r4.b = r2
            java.lang.Object r1 = defpackage.fgfz.c(r1, r4)
            if (r1 == r0) goto L3d
            r3 = r1
            r1 = r5
            r5 = r3
        L29:
            java.util.List r5 = (java.util.List) r5
            r2 = 0
            r4.a = r2
            r2 = 2
            r4.b = r2
            java.lang.Object r5 = r1.a(r5, r4)
            if (r5 != r0) goto L38
            goto L3d
        L38:
            emxc r5 = defpackage.emxc.i(r5)
            return r5
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvbx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dvbx(this.c, this.d, ffguVar);
    }
}
