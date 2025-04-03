package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drdj extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ drdl c;
    final /* synthetic */ Uri d;
    final /* synthetic */ int e;
    final /* synthetic */ drcy f;
    final /* synthetic */ dprk g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drdj(drdl drdlVar, Uri uri, int i, drcy drcyVar, dprk dprkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = drdlVar;
        this.d = uri;
        this.e = i;
        this.f = drcyVar;
        this.g = dprkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drdj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        if (r10 != r0) goto L11;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Lf
            java.lang.Object r0 = r9.a
            defpackage.ffci.b(r10)
            goto L53
        Lf:
            defpackage.ffci.b(r10)
            goto L2a
        L13:
            defpackage.ffci.b(r10)
            drdl r10 = r9.c
            drdh r1 = r10.f
            boolean r1 = r1 instanceof defpackage.drdg
            if (r1 == 0) goto L79
            dqhs r10 = r10.e
            android.net.Uri r1 = r9.d
            r9.b = r2
            java.lang.Object r10 = r10.e(r1, r9)
            if (r10 == r0) goto L78
        L2a:
            drdl r1 = r9.c
            int r5 = r9.e
            drcy r7 = r9.f
            r6 = r10
            java.io.OutputStream r6 = (java.io.OutputStream) r6
            r9.a = r6
            r10 = 2
            r9.b = r10
            drdd r4 = r1.d
            ffsk r10 = r4.b
            ffhd r10 = r10.hT()
            drdc r3 = new drdc
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r10 = defpackage.ffra.a(r10, r3, r9)
            ffhh r1 = defpackage.ffhh.a
            if (r10 == r1) goto L50
            ffcu r10 = defpackage.ffcu.a
        L50:
            if (r10 == r0) goto L78
            r0 = r6
        L53:
            drdl r10 = r9.c
            dprk r1 = r9.g
            ffsm r3 = defpackage.ffsm.b
            drdi r4 = new drdi
            r5 = 0
            r4.<init>(r10, r1, r5)
            ffsk r10 = r10.b
            ffud r10 = defpackage.ffqy.d(r10, r5, r3, r4, r2)
            drdl r1 = r9.c
            android.net.Uri r2 = r9.d
            drdf r3 = new drdf
            java.io.OutputStream r0 = (java.io.OutputStream) r0
            r3.<init>(r2, r10, r0)
            r1.f = r3
            r10.z()
            ffcu r10 = defpackage.ffcu.a
            return r10
        L78:
            return r0
        L79:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot start recording when already recording."
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drdj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drdj(this.c, this.d, this.e, this.f, this.g, ffguVar);
    }
}
