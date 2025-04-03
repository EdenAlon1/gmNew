package defpackage;

import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;

/* compiled from: PG */
@ffbs
/* loaded from: classes2.dex */
public final class ybd implements ycs {
    private static final enru b = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ApiIncomingDraftParser");
    public final llv a;
    private final xsw c;
    private final xgp d;

    public ybd(llv llvVar, xsw xswVar, xgp xgpVar) {
        llvVar.getClass();
        this.a = llvVar;
        this.c = xswVar;
        this.d = xgpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffix r10, defpackage.ffgu r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.ybb
            if (r0 == 0) goto L13
            r0 = r11
            ybb r0 = (defpackage.ybb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ybb r0 = new ybb
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            java.lang.String r5 = "parse"
            java.lang.String r6 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ApiIncomingDraftParser"
            java.lang.String r7 = "ApiIncomingDraftParser.kt"
            java.lang.String r8 = "BugleComposeRow2"
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            ybd r10 = r0.d
            defpackage.ffci.b(r11)     // Catch: defpackage.aygt -> L32
            goto L83
        L32:
            r10 = move-exception
            goto L8e
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            defpackage.ffci.b(r11)
            java.lang.Object r10 = r10.invoke()
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft r10 = (com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft) r10
            if (r10 != 0) goto L60
            enru r10 = defpackage.ybd.b
            ensk r10 = r10.e()
            ensn r11 = defpackage.ente.a
            r10.Y(r11, r8)
            r11 = 39
            ensk r10 = r10.h(r6, r5, r11, r7)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r11 = "ApiIncomingDraftParser found no incoming draft"
            r10.q(r11)
            return r3
        L60:
            enru r11 = defpackage.ybd.b
            ensk r11 = r11.e()
            ensn r2 = defpackage.ente.a
            r11.Y(r2, r8)
            r2 = 43
            ensk r11 = r11.h(r6, r5, r2, r7)
            enrr r11 = (defpackage.enrr) r11
            java.lang.String r2 = "Parsing incoming %s"
            r11.t(r2, r10)
            r0.d = r9     // Catch: defpackage.aygt -> L32
            r0.c = r4     // Catch: defpackage.aygt -> L32
            java.lang.Object r11 = r9.d(r10, r0)     // Catch: defpackage.aygt -> L32
            if (r11 == r1) goto L8d
            r10 = r9
        L83:
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft r11 = (com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft) r11     // Catch: defpackage.aygt -> L32
            xgp r10 = r10.d     // Catch: defpackage.aygt -> L32
            r0 = 2
            xhu r10 = defpackage.yct.a(r11, r0, r10)     // Catch: defpackage.aygt -> L32
            return r10
        L8d:
            return r1
        L8e:
            enru r11 = defpackage.ybd.b
            ensk r11 = r11.j()
            ensn r0 = defpackage.ente.a
            r11.Y(r0, r8)
            enrr r11 = (defpackage.enrr) r11
            ensk r10 = r11.g(r10)
            r11 = 49
            ensk r10 = r10.h(r6, r5, r11, r7)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r11 = "Incoming draft was filtered out"
            r10.q(r11)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ybd.a(ffix, ffgu):java.lang.Object");
    }

    @Override // defpackage.ycs
    public final Object b(ffgu ffguVar) {
        ensk e = b.e();
        e.Y(ente.a, "BugleComposeRow2");
        ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ApiIncomingDraftParser", "peek", 32, "ApiIncomingDraftParser.kt")).q("Starting ApiIncomingDraftParser.peek");
        return a(new ffix() { // from class: yba
            @Override // defpackage.ffix
            public final Object invoke() {
                return aygy.a(ybd.this.a);
            }
        }, ffguVar);
    }

    @Override // defpackage.ycs
    public final Object c(ffgu ffguVar) {
        ensk e = b.e();
        e.Y(ente.a, "BugleComposeRow2");
        ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ApiIncomingDraftParser", "remove", 27, "ApiIncomingDraftParser.kt")).q("Starting ApiIncomingDraftParser.remove");
        return a(new ffix() { // from class: yaz
            @Override // defpackage.ffix
            public final Object invoke() {
                return (IncomingDraft) ybd.this.a.c("incoming_draft");
            }
        }, ffguVar);
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
    public final java.lang.Object d(com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft r13, defpackage.ffgu r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.ybc
            if (r0 == 0) goto L13
            r0 = r14
            ybc r0 = (defpackage.ybc) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ybc r0 = new ybc
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
            ybd r7 = r0.g
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
            xsw r6 = r7.c
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
            enru r14 = defpackage.ybd.b
            ensk r14 = r14.i()
            ensn r2 = defpackage.ente.a
            java.lang.String r8 = "BugleComposeRow2"
            r14.Y(r2, r8)
            java.lang.String r2 = "sanitizeAttachments"
            r8 = 61
            java.lang.String r9 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ApiIncomingDraftParser"
            java.lang.String r10 = "ApiIncomingDraftParser.kt"
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ybd.d(com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft, ffgu):java.lang.Object");
    }
}
