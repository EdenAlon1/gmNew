package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aihd implements ffxy {
    final /* synthetic */ aihf a;
    final /* synthetic */ ffsk b;

    public aihd(aihf aihfVar, ffsk ffskVar) {
        this.a = aihfVar;
        this.b = ffskVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (r10.c(r9, r0) == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ffxy
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(defpackage.aihr r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.aihc
            if (r0 == 0) goto L13
            r0 = r10
            aihc r0 = (defpackage.aihc) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aihc r0 = new aihc
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r10)
            goto L81
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            java.lang.Object r9 = r0.a
            aihd r2 = r0.e
            defpackage.ffci.b(r10)
            goto L50
        L3a:
            defpackage.ffci.b(r10)
            aihf r10 = r8.a
            lki r2 = defpackage.lki.ON_RESUME
            r0.e = r8
            r0.a = r9
            r0.d = r4
            lkk r10 = r10.c
            java.lang.Object r10 = defpackage.dsks.b(r10, r2, r0)
            if (r10 == r1) goto L84
            r2 = r8
        L50:
            enru r10 = defpackage.aihf.a
            ensk r10 = r10.f()
            java.lang.String r4 = "emit"
            r5 = 43
            java.lang.String r6 = "com/google/android/apps/messaging/navigation/NavigationRouterControllerImpl$initialize$1$1"
            java.lang.String r7 = "NavigationRouterControllerImpl.kt"
            ensk r10 = r10.h(r6, r4, r5, r7)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r4 = "Collected navigation state: %s"
            r10.t(r4, r9)
            ffsk r10 = r2.b
            boolean r10 = defpackage.ffsl.g(r10)
            if (r10 == 0) goto L81
            aihf r10 = r2.a
            r2 = 0
            r0.e = r2
            r0.a = r2
            r0.d = r3
            java.lang.Object r9 = r10.c(r9, r0)
            if (r9 != r1) goto L81
            goto L84
        L81:
            ffcu r9 = defpackage.ffcu.a
            return r9
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aihd.fQ(aihr, ffgu):java.lang.Object");
    }
}
