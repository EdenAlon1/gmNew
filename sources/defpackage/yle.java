package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yle extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xhu b;
    final /* synthetic */ xgc c;
    final /* synthetic */ yln d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yle(ffgu ffguVar, xhu xhuVar, xgc xgcVar, yln ylnVar) {
        super(2, ffguVar);
        this.b = xhuVar;
        this.c = xgcVar;
        this.d = ylnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yle) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0058, code lost:
    
        if (r13 != r0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ad  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            r12 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r12.a
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 == r2) goto L11
            defpackage.ffci.b(r13)
            return r13
        L11:
            java.lang.Object r1 = r12.e
            fjay r1 = (defpackage.fjay) r1
            defpackage.ffci.b(r13)
            r9 = r1
            goto La2
        L1b:
            defpackage.ffci.b(r13)
            goto L5a
        L1f:
            defpackage.ffci.b(r13)
            java.lang.Object r13 = r12.e
            ffsk r13 = (defpackage.ffsk) r13
            enru r13 = defpackage.yln.a
            ensk r13 = r13.f()
            ensn r1 = defpackage.ente.a
            java.lang.String r5 = "BugleComposeRow2"
            r13.Y(r1, r5)
            java.lang.String r1 = "invokeSuspend"
            r5 = 65
            java.lang.String r6 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/handler/DraftSendButtonClickHandler$onSendClickWithoutProcessing$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r7 = "DraftSendButtonClickHandler.kt"
            ensk r13 = r13.h(r6, r1, r5, r7)
            enrr r13 = (defpackage.enrr) r13
            xhu r1 = r12.b
            xgc r5 = r12.c
            yln r6 = r12.d
            xij r6 = r6.g
            java.lang.String r7 = "Starting DraftSendButtonClickHandler.onSendClickWithoutProcessing with %s, %s, %s"
            r13.J(r7, r1, r5, r6)
            yln r13 = r12.d
            xhu r1 = r12.b
            r12.a = r3
            java.lang.Object r13 = r13.h(r1, r12)
            if (r13 == r0) goto Lc9
        L5a:
            xhu r1 = r12.b
            fjay r13 = (defpackage.fjay) r13
            java.util.List r1 = r1.b
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L67
            goto L92
        L67:
            java.util.Iterator r1 = r1.iterator()
        L6b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L92
            java.lang.Object r3 = r1.next()
            xhp r3 = (defpackage.xhp) r3
            boolean r5 = r3 instanceof defpackage.xho
            if (r5 == 0) goto L7e
            xho r3 = (defpackage.xho) r3
            goto L7f
        L7e:
            r3 = r4
        L7f:
            if (r3 == 0) goto L84
            doxs r3 = r3.a
            goto L85
        L84:
            r3 = r4
        L85:
            boolean r3 = r3 instanceof com.google.android.apps.messaging.conversation2.bottomcontent.composerow.draft.attachment.RichLocation
            if (r3 != 0) goto L8a
            goto L6b
        L8a:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "onSendClickWithoutProcessing on draft does not support RichLocation"
            r13.<init>(r0)
            throw r13
        L92:
            yln r1 = r12.d
            r12.e = r13
            r12.a = r2
            ylz r1 = r1.c
            java.lang.Object r1 = r1.a(r12)
            if (r1 == r0) goto Lc9
            r9 = r13
            r13 = r1
        La2:
            r7 = r13
            xit r7 = (defpackage.xit) r7
            if (r7 != 0) goto Lad
            r13 = 0
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            return r13
        Lad:
            yln r5 = r12.d
            xhu r6 = r12.b
            xgc r8 = r12.c
            yma r13 = r5.f
            xij r1 = r5.g
            xii r10 = r13.a(r1)
            r12.e = r4
            r13 = 3
            r12.a = r13
            r11 = r12
            java.lang.Object r13 = r5.d(r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto Lc8
            goto Lc9
        Lc8:
            return r13
        Lc9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yle.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yle yleVar = new yle(ffguVar, this.b, this.c, this.d);
        yleVar.e = obj;
        return yleVar;
    }
}
