package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class umm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ umw c;
    final /* synthetic */ Uri d;
    final /* synthetic */ ffgu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public umm(int i, umw umwVar, Uri uri, ffgu ffguVar, ffgu ffguVar2) {
        super(2, ffguVar2);
        this.b = i;
        this.c = umwVar;
        this.d = uri;
        this.e = ffguVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((umm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r5.b(r1, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r5.a(r1, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        return r0;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.a
            r2 = 1
            defpackage.ffci.b(r5)
            if (r1 == 0) goto Lb
            goto L38
        Lb:
            int r5 = r4.b
            if (r5 == 0) goto L2b
            if (r5 != r2) goto L1f
            umw r5 = r4.c
            android.net.Uri r1 = r4.d
            r3 = 2
            r4.a = r3
            java.lang.Object r5 = r5.a(r1, r4)
            if (r5 != r0) goto L38
            goto L37
        L1f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Invalid button #"
            java.lang.String r5 = defpackage.a.h(r5, r1)
            r0.<init>(r5)
            throw r0
        L2b:
            umw r5 = r4.c
            android.net.Uri r1 = r4.d
            r4.a = r2
            java.lang.Object r5 = r5.b(r1, r4)
            if (r5 != r0) goto L38
        L37:
            return r0
        L38:
            ffgu r5 = r4.e
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r2)
            r5.w(r0)
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.umm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new umm(this.b, this.c, this.d, this.e, ffguVar);
    }
}
