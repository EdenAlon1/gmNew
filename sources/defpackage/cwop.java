package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwop implements ffxy {
    final /* synthetic */ cwor a;
    final /* synthetic */ ffsk b;

    public cwop(cwor cworVar, ffsk ffskVar) {
        this.a = cworVar;
        this.b = ffskVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ffxy
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(defpackage.cwot r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cwoo
            if (r0 == 0) goto L13
            r0 = r7
            cwoo r0 = (defpackage.cwoo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cwoo r0 = new cwoo
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            cwot r6 = r0.e
            cwop r0 = r0.d
            defpackage.ffci.b(r7)
            goto L49
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.ffci.b(r7)
            cwor r7 = r5.a
            lki r2 = defpackage.lki.ON_RESUME
            r0.d = r5
            r0.e = r6
            r0.c = r3
            lkk r7 = r7.c
            java.lang.Object r7 = defpackage.dsks.b(r7, r2, r0)
            if (r7 == r1) goto L7b
            r0 = r5
        L49:
            enru r7 = defpackage.cwor.a
            ensk r7 = r7.f()
            java.lang.String r1 = "emit"
            r2 = 40
            java.lang.String r3 = "com/google/android/apps/messaging/toast/ToastsControllerImpl$initialize$1$1"
            java.lang.String r4 = "ToastsControllerImpl.kt"
            ensk r7 = r7.h(r3, r1, r2, r4)
            enrr r7 = (defpackage.enrr) r7
            java.lang.String r1 = "Collected toast: %s"
            r7.t(r1, r6)
            ffsk r7 = r0.b
            boolean r7 = defpackage.ffsl.g(r7)
            if (r7 == 0) goto L78
            cwor r7 = r0.a
            android.content.Context r7 = r7.b
            java.lang.String r6 = r6.a
            r0 = 0
            android.widget.Toast r6 = android.widget.Toast.makeText(r7, r6, r0)
            r6.show()
        L78:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwop.fQ(cwot, ffgu):java.lang.Object");
    }
}
