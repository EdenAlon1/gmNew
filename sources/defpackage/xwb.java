package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xwb {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentViewer");
    public final aigz b;
    public final drlk c;
    private final xgp d;

    public xwb(aigz aigzVar, drlk drlkVar, xgp xgpVar) {
        aigzVar.getClass();
        this.b = aigzVar;
        this.c = drlkVar;
        this.d = xgpVar;
    }

    public final xvz a(ainw ainwVar) {
        drlx a2;
        ((enrr) a.f().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentViewer", "processMediaViewerResult", 105, "DraftAttachmentViewer.kt")).t("Draft MediaViewer result: %s", ainwVar);
        if (ainwVar == null || (a2 = drlo.a(ainwVar.a)) == null) {
            return null;
        }
        return new xvz(new xhl(this.d.a(), a2, ainwVar.b, null, doxq.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r18, int r19, defpackage.ffgu r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof defpackage.xwa
            if (r2 == 0) goto L17
            r2 = r1
            xwa r2 = (defpackage.xwa) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.c = r3
            goto L1c
        L17:
            xwa r2 = new xwa
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            ffhh r3 = defpackage.ffhh.a
            int r4 = r2.c
            r5 = 1
            if (r4 == 0) goto L36
            if (r4 != r5) goto L2e
            xwb r2 = r2.d
            defpackage.ffci.b(r1)
            goto La8
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            defpackage.ffci.b(r1)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r1 = r18.iterator()
        L42:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r1.next()
            xhp r4 = (defpackage.xhp) r4
            drlk r6 = r0.c
            com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem r4 = defpackage.xwc.a(r4, r6)
            if (r4 == 0) goto L42
            r11.add(r4)
            goto L42
        L5a:
            java.lang.Object r1 = r18.get(r19)
            xhp r1 = (defpackage.xhp) r1
            drlk r4 = r0.c
            com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem r1 = defpackage.xwc.a(r1, r4)
            if (r1 == 0) goto Lb7
            int r1 = r11.indexOf(r1)
            if (r1 < 0) goto Laf
            enru r4 = defpackage.xwb.a
            ensk r4 = r4.f()
            java.lang.String r6 = "openMediaViewer"
            r7 = 90
            java.lang.String r8 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentViewer"
            java.lang.String r9 = "DraftAttachmentViewer.kt"
            ensk r4 = r4.h(r8, r6, r7, r9)
            enrr r4 = (defpackage.enrr) r4
            java.lang.String r6 = "Navigating to MediaViewer with %s starting at index %d"
            r4.B(r6, r11, r1)
            aigz r4 = r0.b
            ailj r6 = new ailj
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r1)
            r15 = 0
            r16 = 1984(0x7c0, float:2.78E-42)
            r7 = 6
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r15, r16)
            r2.d = r0
            r2.c = r5
            java.lang.Object r1 = r4.f(r6, r2)
            if (r1 != r3) goto La7
            return r3
        La7:
            r2 = r0
        La8:
            ainw r1 = (defpackage.ainw) r1
            xvz r1 = r2.a(r1)
            return r1
        Laf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Check failed."
            r1.<init>(r2)
            throw r1
        Lb7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Required value was null."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xwb.b(java.util.List, int, ffgu):java.lang.Object");
    }
}
