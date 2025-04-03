package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aagf extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ apra c;
    final /* synthetic */ aagl d;
    final /* synthetic */ ffsk e;
    final /* synthetic */ aafr f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aagf(ffgu ffguVar, apra apraVar, aagl aaglVar, ffsk ffskVar, aafr aafrVar) {
        super(3, ffguVar);
        this.c = apraVar;
        this.d = aaglVar;
        this.e = ffskVar;
        this.f = aafrVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        aagf aagfVar = new aagf((ffgu) obj3, this.c, this.d, this.e, this.f);
        aagfVar.g = (ffxy) obj;
        aagfVar.b = obj2;
        return aagfVar.b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075 A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v2, types: [ffxy, java.lang.Object] */
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
            goto L76
        La:
            java.lang.Object r8 = r7.g
            java.lang.Object r1 = r7.b
            aqux r1 = (defpackage.aqux) r1
            r2 = 1
            if (r1 == 0) goto L67
            boolean r1 = r1.s()
            if (r1 != r2) goto L67
            apra r1 = r7.c
            boolean r3 = r1.f()
            if (r3 == 0) goto L2c
            aagl r3 = r7.d
            ffsk r4 = r7.e
            aafr r5 = r7.f
            axrc r1 = r3.a(r1, r4, r5)
            goto L6d
        L2c:
            enru r1 = defpackage.aagl.a
            ensk r1 = r1.h()
            java.lang.String r3 = "invokeSuspend"
            r4 = 189(0xbd, float:2.65E-43)
            java.lang.String r5 = "com/google/android/apps/messaging/conversation2/messagelist/message/bubble/progress/ProgressBarOverlayUiAdapter$createWithOverlayForSatellite$$inlined$flatMapLatest$1"
            java.lang.String r6 = "ProgressBarOverlayUiAdapter.kt"
            ensk r1 = r1.h(r5, r3, r4, r6)
            enrr r1 = (defpackage.enrr) r1
            aafr r3 = r7.f
            alxr r3 = r3.a
            java.lang.String r4 = "Not transferring for messageId=%s"
            com.google.android.apps.messaging.shared.api.messaging.MessageId r3 = r3.b()
            r1.t(r4, r3)
            aafr r1 = r7.f
            alxr r1 = r1.a
            boolean r1 = defpackage.zsr.q(r1)
            if (r1 == 0) goto L67
            aagl r1 = r7.d
            aafr r3 = r7.f
            axqd r4 = new axqd
            aagg r5 = new aagg
            r5.<init>(r1, r3)
            r4.<init>(r5)
            r1 = r4
            goto L6d
        L67:
            ffyg r1 = new ffyg
            r3 = 0
            r1.<init>(r3)
        L6d:
            r7.a = r2
            java.lang.Object r8 = defpackage.ffyk.c(r8, r1, r7)
            if (r8 != r0) goto L76
            return r0
        L76:
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aagf.b(java.lang.Object):java.lang.Object");
    }
}
