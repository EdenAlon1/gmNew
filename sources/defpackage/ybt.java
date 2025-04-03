package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ybt implements ycv {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ComposeRowStateParser");
    public final llv b;
    public final ffhd c;
    public final ffbr d;
    private final xsw e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final xgp i;

    public ybt(llv llvVar, xsw xswVar, xgp xgpVar, ffhd ffhdVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        llvVar.getClass();
        ffhdVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.b = llvVar;
        this.e = xswVar;
        this.i = xgpVar;
        this.c = ffhdVar;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.d = ffbrVar4;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|7|(1:(2:10|11)(2:30|31))(2:32|(2:34|35)(7:36|37|(2:39|(1:41)(1:42))|29|15|(2:17|(1:19)(1:26))(1:27)|(2:24|25)(1:22)))|12|(6:14|15|(0)(0)|(0)|24|25)|29|15|(0)(0)|(0)|24|25))|45|6|7|(0)(0)|12|(0)|29|15|(0)(0)|(0)|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0034, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
    
        r0 = defpackage.ybt.a.j();
        r0.Y(defpackage.ente.a, "BugleComposeRow2");
        ((defpackage.enrr) ((defpackage.enrr) r0).g(r11).h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ComposeRowStateParser", "parse", 180, "ComposeRowStateParser.kt")).q("Incoming draft was filtered out");
        r10 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0091 A[Catch: aygt -> 0x0034, TRY_LEAVE, TryCatch #0 {aygt -> 0x0034, blocks: (B:11:0x0030, B:12:0x008d, B:14:0x0091, B:37:0x007a, B:39:0x0080), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r10v11, types: [com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState] */
    /* JADX WARN: Type inference failed for: r11v11, types: [enrr] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffix r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ybt.a(ffix, ffgu):java.lang.Object");
    }

    @Override // defpackage.ycv
    public final Object b(ffgu ffguVar) {
        enru enruVar = a;
        ensk e = enruVar.e();
        e.Y(ente.a, "BugleComposeRow2");
        ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ComposeRowStateParser", "peek", 70, "ComposeRowStateParser.kt")).q("Starting ComposeRowStateParser.peek");
        if (!((atdq) this.f.b()).a()) {
            return a(new ffix() { // from class: ybh
                @Override // defpackage.ffix
                public final Object invoke() {
                    return aygl.b(ybt.this.b);
                }
            }, ffguVar);
        }
        ensk h = enruVar.h();
        h.Y(ente.a, "BugleComposeRow2");
        ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ComposeRowStateParser", "peek", 72, "ComposeRowStateParser.kt")).q("ComposeRowStateParser#peek: reading last accepted draft timestamp");
        return d(new ybm(this, null), ffguVar);
    }

    @Override // defpackage.ycv
    public final Object c(ffgu ffguVar) {
        enru enruVar = a;
        ensk e = enruVar.e();
        e.Y(ente.a, "BugleComposeRow2");
        ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ComposeRowStateParser", "pop", 54, "ComposeRowStateParser.kt")).q("Starting ComposeRowStateParser.pop");
        if (!((atdq) this.f.b()).a()) {
            return a(new ffix() { // from class: ybi
                @Override // defpackage.ffix
                public final Object invoke() {
                    return aygl.d(ybt.this.b);
                }
            }, ffguVar);
        }
        ensk h = enruVar.h();
        h.Y(ente.a, "BugleComposeRow2");
        ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ComposeRowStateParser", "pop", 56, "ComposeRowStateParser.kt")).q("ComposeRowStateParser#pop: reading last accepted draft timestamp");
        return d(new ybo(this, null), ffguVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v3, types: [ffjm] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffjm r23, defpackage.ffgu r24) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ybt.d(ffjm, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0072 -> B:10:0x0076). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft r13, defpackage.ffgu r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.ybq
            if (r0 == 0) goto L13
            r0 = r14
            ybq r0 = (defpackage.ybq) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ybq r0 = new ybq
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.d
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft$Attachment r13 = r0.i
            java.lang.Object r2 = r0.c
            java.lang.Object r4 = r0.b
            java.lang.Object r5 = r0.a
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft r6 = r0.h
            ybt r7 = r0.g
            defpackage.ffci.b(r14)
            goto L76
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            defpackage.ffci.b(r14)
            java.util.List r14 = r13.b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r14 = r14.iterator()
            r7 = r12
            r4 = r14
            r5 = r2
        L4c:
            boolean r14 = r4.hasNext()
            if (r14 == 0) goto La4
            java.lang.Object r2 = r4.next()
            r14 = r2
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft$Attachment r14 = (com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft.Attachment) r14
            xsw r6 = r7.e
            android.net.Uri r8 = r14.b
            r0.g = r7
            r0.h = r13
            r0.a = r5
            r0.b = r4
            r0.c = r2
            r0.i = r14
            r0.f = r3
            java.lang.Object r6 = r6.b(r8, r0)
            if (r6 != r1) goto L72
            return r1
        L72:
            r11 = r6
            r6 = r13
            r13 = r14
            r14 = r11
        L76:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L9f
            enru r14 = defpackage.ybt.a
            ensk r14 = r14.i()
            ensn r2 = defpackage.ente.a
            java.lang.String r8 = "BugleComposeRow2"
            r14.Y(r2, r8)
            java.lang.String r2 = "sanitizeAttachments"
            r8 = 195(0xc3, float:2.73E-43)
            java.lang.String r9 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ComposeRowStateParser"
            java.lang.String r10 = "ComposeRowStateParser.kt"
            ensk r14 = r14.h(r9, r2, r8, r10)
            enrr r14 = (defpackage.enrr) r14
            java.lang.String r2 = "Attachment from IncomingDraft blocked by security filter: silently removing %s"
            r14.t(r2, r13)
            goto La2
        L9f:
            r5.add(r2)
        La2:
            r13 = r6
            goto L4c
        La4:
            r14 = 251(0xfb, float:3.52E-43)
            r0 = 0
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft r13 = com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft.a(r13, r5, r0, r0, r14)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ybt.e(com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft, ffgu):java.lang.Object");
    }
}
