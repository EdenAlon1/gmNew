package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yag implements xzv {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/processor/DraftAttachmentPostProcessorImpl");
    public final cbit b;
    public final drlk c;
    public final alxt d;
    public final aufi e;
    private final ffsk f;
    private final ffsk g;
    private final ffhd h;
    private final fgcq i;
    private final Conversation j;
    private final asnv k;
    private final xyg l;
    private final atcv m;
    private final atws n;
    private final atwr o;

    public yag(ffsk ffskVar, ffsk ffskVar2, ffhd ffhdVar, cbit cbitVar, fgcq fgcqVar, Conversation conversation, drlk drlkVar, asnv asnvVar, alxt alxtVar, xyg xygVar, atcv atcvVar, aufi aufiVar, atws atwsVar, atwr atwrVar) {
        ffskVar.getClass();
        ffskVar2.getClass();
        ffhdVar.getClass();
        cbitVar.getClass();
        fgcqVar.getClass();
        conversation.getClass();
        asnvVar.getClass();
        atwsVar.getClass();
        this.f = ffskVar;
        this.g = ffskVar2;
        this.h = ffhdVar;
        this.b = cbitVar;
        this.i = fgcqVar;
        this.j = conversation;
        this.c = drlkVar;
        this.k = asnvVar;
        this.d = alxtVar;
        this.l = xygVar;
        this.m = atcvVar;
        this.e = aufiVar;
        this.n = atwsVar;
        this.o = atwrVar;
    }

    @Override // defpackage.xzv
    public final xho a(xho xhoVar) {
        awap awapVar;
        xhoVar.getClass();
        if (!this.k.a() || (awapVar = xhoVar.b.b) == null) {
            axol.k(this.f, null, new xzx(xhoVar, this, null), 3);
            return xhoVar;
        }
        axol.k(this.g, null, new xzw(awapVar, this, null), 3);
        return this.m.a() ? xho.b(xhoVar, xhn.a(xhoVar.b, awao.c(), null, null, 61)) : xhoVar;
    }

    @Override // defpackage.xzv
    public final Object b(xho xhoVar, boolean z, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.h), new yaa(null, this, xhoVar, z), ffguVar);
    }

    @Override // defpackage.xzv
    public final Object c(xho xhoVar) {
        axol.k(this.f, null, new yab(xhoVar, this, null), 3);
        return ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.xzy
            if (r0 == 0) goto L13
            r0 = r5
            xzy r0 = (defpackage.xzy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xzy r0 = new xzy
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            aufi r5 = r4.e
            boolean r5 = r5.a()
            if (r5 != 0) goto L3b
            goto L58
        L3b:
            fgcq r5 = r4.i
            r0.c = r3
            java.lang.Object r5 = defpackage.fgbj.a(r5, r0)
            if (r5 == r1) goto L5b
        L45:
            boolean r0 = r5 instanceof defpackage.xlv
            if (r0 == 0) goto L4c
            xlv r5 = (defpackage.xlv) r5
            goto L4d
        L4c:
            r5 = 0
        L4d:
            if (r5 == 0) goto L58
            boolean r5 = r5.p()
            if (r5 != r3) goto L58
            java.lang.String r5 = "video/hevc"
            return r5
        L58:
            java.lang.String r5 = "video/avc"
            return r5
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yag.d(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.xzz
            if (r0 == 0) goto L13
            r0 = r5
            xzz r0 = (defpackage.xzz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xzz r0 = new xzz
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            fgcq r5 = r4.i
            r0.c = r3
            java.lang.Object r5 = defpackage.fgbj.a(r5, r0)
            if (r5 == r1) goto L54
        L3c:
            boolean r0 = r5 instanceof defpackage.xlv
            if (r0 == 0) goto L43
            xlv r5 = (defpackage.xlv) r5
            goto L44
        L43:
            r5 = 0
        L44:
            if (r5 == 0) goto L4b
            long r0 = r5.e()
            goto L4e
        L4b:
            r0 = 104857600(0x6400000, double:5.1806538E-316)
        L4e:
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r0)
            return r5
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yag.e(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.xho r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.yac
            if (r0 == 0) goto L13
            r0 = r7
            yac r0 = (defpackage.yac) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yac r0 = new yac
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            xho r6 = r0.e
            yag r2 = r0.d
            defpackage.ffci.b(r7)
            goto L53
        L3a:
            defpackage.ffci.b(r7)
            asnv r7 = r5.k
            boolean r7 = r7.a()
            if (r7 == 0) goto L82
            r0.d = r5
            r0.e = r6
            r0.c = r4
            java.lang.Object r7 = r5.i(r0)
            if (r7 != r1) goto L52
            goto L80
        L52:
            r2 = r5
        L53:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L82
            r7 = 0
            r0.d = r7
            r0.e = r7
            r0.c = r3
            doxs r6 = r6.a
            boolean r7 = r6 instanceof defpackage.drni
            if (r7 == 0) goto L69
            goto L7a
        L69:
            boolean r6 = r6 instanceof defpackage.drnl
            if (r6 == 0) goto L74
            atws r6 = r2.n
            boolean r4 = r6.a()
            goto L7a
        L74:
            atwr r6 = r2.o
            boolean r4 = r6.a()
        L7a:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            if (r6 != r1) goto L81
        L80:
            return r1
        L81:
            return r6
        L82:
            r6 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yag.f(xho, ffgu):java.lang.Object");
    }

    public final Object g(xho xhoVar, ffgu ffguVar) {
        if (xhq.d(xhoVar)) {
            return j(ffguVar);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.xho r20, boolean r21, defpackage.ffgu r22) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yag.h(xho, boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.yae
            if (r0 == 0) goto L13
            r0 = r5
            yae r0 = (defpackage.yae) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yae r0 = new yae
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            fgcq r5 = r4.i
            r0.c = r3
            java.lang.Object r5 = defpackage.fgbj.a(r5, r0)
            if (r5 == r1) goto L54
        L3c:
            boolean r0 = r5 instanceof defpackage.xlv
            if (r0 == 0) goto L43
            xlv r5 = (defpackage.xlv) r5
            goto L44
        L43:
            r5 = 0
        L44:
            r0 = 0
            if (r5 == 0) goto L4e
            boolean r5 = r5.k()
            if (r5 != r3) goto L4e
            goto L4f
        L4e:
            r3 = r0
        L4f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yag.i(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.yaf
            if (r0 == 0) goto L13
            r0 = r5
            yaf r0 = (defpackage.yaf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yaf r0 = new yaf
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            fgcq r5 = r4.i
            r0.c = r3
            java.lang.Object r5 = defpackage.fgbj.a(r5, r0)
            if (r5 == r1) goto L54
        L3c:
            boolean r0 = r5 instanceof defpackage.xlv
            if (r0 == 0) goto L43
            xlv r5 = (defpackage.xlv) r5
            goto L44
        L43:
            r5 = 0
        L44:
            r0 = 0
            if (r5 == 0) goto L4e
            boolean r5 = r5.l()
            if (r5 != r3) goto L4e
            goto L4f
        L4e:
            r3 = r0
        L4f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yag.j(ffgu):java.lang.Object");
    }
}
