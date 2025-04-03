package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cunl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cunq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cunl(cunq cunqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cunqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cunl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (r4 == defpackage.fbrr.PROTOCOL_UNSPECIFIED) goto L21;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.a
            defpackage.ffci.b(r8)
            if (r1 == 0) goto La
            goto L1f
        La:
            cunq r8 = r7.b
            effy r8 = r8.b
            com.google.common.util.concurrent.ListenableFuture r8 = r8.a()
            r8.getClass()
            r1 = 1
            r7.a = r1
            java.lang.Object r8 = defpackage.fgfz.c(r8, r7)
            if (r8 != r0) goto L1f
            return r0
        L1f:
            r8.getClass()
            fbru r8 = (defpackage.fbru) r8
            int r0 = defpackage.engw.d
            engr r0 = new engr
            r0.<init>()
            engr r1 = new engr
            r1.<init>()
            eygr r2 = r8.c
            java.util.Iterator r2 = r2.iterator()
        L36:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L81
            java.lang.Object r3 = r2.next()
            fbrs r3 = (defpackage.fbrs) r3
            int r4 = r3.c
            fbrr r5 = defpackage.fbrr.b(r4)
            if (r5 != 0) goto L4c
            fbrr r5 = defpackage.fbrr.UNRECOGNIZED
        L4c:
            fbrr r6 = defpackage.fbrr.RCS
            if (r5 == r6) goto L5c
            fbrr r4 = defpackage.fbrr.b(r4)
            if (r4 != 0) goto L58
            fbrr r4 = defpackage.fbrr.UNRECOGNIZED
        L58:
            fbrr r5 = defpackage.fbrr.PROTOCOL_UNSPECIFIED
            if (r4 != r5) goto L61
        L5c:
            java.lang.String r4 = r3.b
            r0.h(r4)
        L61:
            int r4 = r3.c
            fbrr r5 = defpackage.fbrr.b(r4)
            if (r5 != 0) goto L6b
            fbrr r5 = defpackage.fbrr.UNRECOGNIZED
        L6b:
            fbrr r6 = defpackage.fbrr.XMS
            if (r5 == r6) goto L7b
            fbrr r4 = defpackage.fbrr.b(r4)
            if (r4 != 0) goto L77
            fbrr r4 = defpackage.fbrr.UNRECOGNIZED
        L77:
            fbrr r5 = defpackage.fbrr.PROTOCOL_UNSPECIFIED
            if (r4 != r5) goto L36
        L7b:
            java.lang.String r3 = r3.b
            r1.h(r3)
            goto L36
        L81:
            cunb r2 = new cunb
            java.lang.String r8 = r8.b
            r8.getClass()
            engw r0 = r0.g()
            r0.getClass()
            engw r1 = r1.g()
            r1.getClass()
            r2.<init>(r8, r0, r1)
            enru r8 = defpackage.cunq.a
            ensk r8 = r8.h()
            ensn r0 = defpackage.ente.a
            java.lang.String r1 = "BugleSpam"
            r8.Y(r0, r1)
            java.lang.String r0 = "invokeSuspend"
            r1 = 83
            java.lang.String r3 = "com/google/android/apps/messaging/shared/util/spam/fuzzymatching/TemplatesStore$current$2$1"
            java.lang.String r4 = "TemplatesStore.kt"
            ensk r8 = r8.h(r3, r0, r1, r4)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r0 = r2.a
            java.lang.String r1 = "cache miss! load and set cached templates at version %s"
            r8.t(r1, r0)
            cunq r8 = r7.b
            cunc r0 = defpackage.cunc.a
        Lbf:
            java.util.concurrent.atomic.AtomicReference r1 = r8.c
            boolean r3 = r1.compareAndSet(r0, r2)
            if (r3 == 0) goto Lc8
            goto Lce
        Lc8:
            java.lang.Object r1 = r1.get()
            if (r1 == r0) goto Lbf
        Lce:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cunl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cunl(this.b, ffguVar);
    }
}
