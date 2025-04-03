package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deri extends fewa {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deri(fdxk fdxkVar, fdxj fdxjVar) {
        super(fdxkVar, fdxjVar);
        fdxjVar.getClass();
    }

    @Override // defpackage.ffak
    public final /* bridge */ /* synthetic */ ffak a(fdxk fdxkVar, fdxj fdxjVar) {
        return new deri(fdxkVar, fdxjVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.deqg r8, defpackage.febo r9, defpackage.ffgu r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.derh
            if (r0 == 0) goto L13
            r0 = r10
            derh r0 = (defpackage.derh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            derh r0 = new derh
            r0.<init>(r7, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            defpackage.ffci.b(r10)
            goto L83
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            defpackage.ffci.b(r10)
            fdxk r1 = r7.a
            febs r10 = defpackage.derg.a
            if (r10 != 0) goto L75
            java.lang.Class<derg> r3 = defpackage.derg.class
            monitor-enter(r3)
            febs r10 = defpackage.derg.a     // Catch: java.lang.Throwable -> L71
            if (r10 != 0) goto L6f
            febp r10 = defpackage.febs.a()     // Catch: java.lang.Throwable -> L71
            febr r4 = defpackage.febr.UNARY     // Catch: java.lang.Throwable -> L71
            r10.c = r4     // Catch: java.lang.Throwable -> L71
            java.lang.String r4 = "stargate.QuestionnaireService"
            java.lang.String r5 = "GetQuestionnaire"
            java.lang.String r4 = defpackage.febs.c(r4, r5)     // Catch: java.lang.Throwable -> L71
            r10.d = r4     // Catch: java.lang.Throwable -> L71
            r10.b()     // Catch: java.lang.Throwable -> L71
            deqg r4 = defpackage.deqg.a     // Catch: java.lang.Throwable -> L71
            eyfc r5 = defpackage.ffag.a     // Catch: java.lang.Throwable -> L71
            ffae r5 = new ffae     // Catch: java.lang.Throwable -> L71
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L71
            r10.a = r5     // Catch: java.lang.Throwable -> L71
            deqi r4 = defpackage.deqi.a     // Catch: java.lang.Throwable -> L71
            ffae r5 = new ffae     // Catch: java.lang.Throwable -> L71
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L71
            r10.b = r5     // Catch: java.lang.Throwable -> L71
            febs r10 = r10.a()     // Catch: java.lang.Throwable -> L71
            defpackage.derg.a = r10     // Catch: java.lang.Throwable -> L71
        L6f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            goto L75
        L71:
            r0 = move-exception
            r8 = r0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            throw r8
        L75:
            fdxj r4 = r7.b
            r6.c = r2
            r3 = r8
            r5 = r9
            r2 = r10
            java.lang.Object r10 = defpackage.fewj.b(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L83
            return r0
        L83:
            r10.getClass()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deri.b(deqg, febo, ffgu):java.lang.Object");
    }
}
