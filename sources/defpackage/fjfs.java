package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fjfs {
    public final babf a;
    public final eixo b;
    public final ejvp c;
    public final ffsk d;
    public final ffbr e;
    public final eisx f;
    private final Optional g;
    private final ffbz h = ffca.a(new ffix() { // from class: fjfo
        @Override // defpackage.ffix
        public final Object invoke() {
            ttl ttlVar = (ttl) fflm.b((Optional) ((fbbb) fjfs.this.e).a);
            return Boolean.valueOf(ttlVar != null ? ttlVar.a() : false);
        }
    });

    public fjfs(babf babfVar, eixo eixoVar, ejvp ejvpVar, ffsk ffskVar, Optional optional, ffbr ffbrVar, eisx eisxVar) {
        this.a = babfVar;
        this.b = eixoVar;
        this.c = ejvpVar;
        this.d = ffskVar;
        this.g = optional;
        this.e = ffbrVar;
        this.f = eisxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00af, code lost:
    
        if (((java.lang.Boolean) r8).booleanValue() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (r8 != r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.eisx r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.fjfr
            if (r0 == 0) goto L13
            r0 = r8
            fjfr r0 = (defpackage.fjfr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fjfr r0 = new fjfr
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r3) goto L2c
            defpackage.ffci.b(r8)
            goto La9
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            fjfs r7 = r0.d
            defpackage.ffci.b(r8)
            goto L51
        L3a:
            defpackage.ffci.b(r8)
            if (r7 == 0) goto Lb3
            eixo r8 = r6.b
            com.google.common.util.concurrent.ListenableFuture r7 = r8.c(r7)
            r0.d = r6
            r0.c = r5
            java.lang.Object r8 = defpackage.fgfz.c(r7, r0)
            if (r8 != r1) goto L50
            goto Lb2
        L50:
            r7 = r6
        L51:
            eixn r8 = (defpackage.eixn) r8
            eixz r8 = r8.b()
            java.lang.String r8 = r8.k
            java.lang.String r2 = "pseudonymous"
            boolean r8 = defpackage.ffkj.e(r8, r2)
            if (r8 == 0) goto L62
            goto Lb3
        L62:
            boolean r8 = defpackage.csgj.a()
            if (r8 != 0) goto L69
            goto Lb4
        L69:
            emyl r8 = defpackage.cshy.a
            java.lang.Object r8 = r8.get()
            cfup r8 = (defpackage.cfup) r8
            java.lang.Object r8 = r8.e()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L7e
            goto Lb4
        L7e:
            j$.util.Optional r8 = r7.g
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L87
            goto Lb4
        L87:
            ffbz r8 = r7.h
            java.lang.Object r8 = r8.a()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L96
            goto Lb4
        L96:
            j$.util.Optional r7 = r7.g
            java.lang.Object r7 = r7.get()
            cshy r7 = (defpackage.cshy) r7
            r8 = 0
            r0.d = r8
            r0.c = r3
            java.lang.Object r8 = r7.a()
            if (r8 == r1) goto Lb2
        La9:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 != 0) goto Lb4
            goto Lb3
        Lb2:
            return r1
        Lb3:
            r4 = r5
        Lb4:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjfs.a(eisx, ffgu):java.lang.Object");
    }
}
