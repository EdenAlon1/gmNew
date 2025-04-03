package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqci {
    public final cqoh a;
    public final avlp b;
    public final ffbr c;
    public final ffsk d;
    private final ckds e;
    private final ffbr f;
    private final ffbr g;

    public aqci(cqoh cqohVar, ckds ckdsVar, avlp avlpVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffsk ffskVar) {
        cqohVar.getClass();
        ckdsVar.getClass();
        avlpVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffskVar.getClass();
        this.a = cqohVar;
        this.e = ckdsVar;
        this.b = avlpVar;
        this.f = ffbrVar;
        this.c = ffbrVar2;
        this.g = ffbrVar3;
        this.d = ffskVar;
    }

    public final aoku a(amfx amfxVar, aqux aquxVar) {
        String G = amfxVar.G();
        if (G != null) {
            return ((aolr) this.g.b()).u(G, aquxVar.b());
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0086, code lost:
    
        if (((defpackage.avlk) r8).g() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ab, code lost:
    
        if (r5.E() != defpackage.eoxn.SEND_MODE_XMS_LATCH) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00af, code lost:
    
        return defpackage.eooe.CONVERSATION_LATCHED_TO_XMS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b2, code lost:
    
        return defpackage.eooe.OTHER_REASON;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        if (((defpackage.avlk) r6.get()).g() == false) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.amfx r5, defpackage.aqux r6, boolean r7, defpackage.ffgu r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.aqch
            if (r0 == 0) goto L13
            r0 = r8
            aqch r0 = (defpackage.aqch) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aqch r0 = new aqch
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.ffci.b(r8)
            goto L7d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r8)
            alxi r8 = r5.b()
            alxi r2 = defpackage.alxi.GROUP
            if (r8 != r2) goto L3f
            eooe r5 = defpackage.eooe.GROUP_CONVERSATION
            return r5
        L3f:
            eoxn r8 = r5.E()
            eoxn r2 = defpackage.eoxn.SEND_MODE_XMS
            if (r8 != r2) goto L4a
            eooe r5 = defpackage.eooe.CONVERSATION_SET_TO_XMS_ONLY
            return r5
        L4a:
            if (r7 != 0) goto L4f
            eooe r5 = defpackage.eooe.SENDER_NOT_AVAILABLE_RCS_AVAILABILITIES_ISSUES
            return r5
        L4f:
            aoku r6 = r4.a(r5, r6)
            if (r6 == 0) goto Lb3
            ffbr r7 = r4.c
            java.lang.Object r7 = r7.b()
            asgo r7 = (defpackage.asgo) r7
            boolean r7 = r7.a()
            if (r7 == 0) goto L89
            ffbr r7 = r4.f
            java.lang.Object r7 = r7.b()
            azaw r7 = (defpackage.azaw) r7
            elfl r6 = r7.e(r6)
            r6.getClass()
            r0.a = r5
            r0.d = r3
            java.lang.Object r8 = defpackage.fgfz.c(r6, r0)
            if (r8 != r1) goto L7d
            return r1
        L7d:
            r8.getClass()
            avlk r8 = (defpackage.avlk) r8
            boolean r6 = r8.g()
            if (r6 == 0) goto Lb3
            goto La5
        L89:
            ckds r7 = r4.e
            j$.util.Optional r6 = r7.m(r6)
            r6.getClass()
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto Lb3
            java.lang.Object r6 = r6.get()
            avlk r6 = (defpackage.avlk) r6
            boolean r6 = r6.g()
            if (r6 != 0) goto La5
            goto Lb3
        La5:
            eoxn r5 = r5.E()
            eoxn r6 = defpackage.eoxn.SEND_MODE_XMS_LATCH
            if (r5 != r6) goto Lb0
            eooe r5 = defpackage.eooe.CONVERSATION_LATCHED_TO_XMS
            return r5
        Lb0:
            eooe r5 = defpackage.eooe.OTHER_REASON
            return r5
        Lb3:
            eooe r5 = defpackage.eooe.RECEIVER_NOT_AVAILABLE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqci.b(amfx, aqux, boolean, ffgu):java.lang.Object");
    }
}
