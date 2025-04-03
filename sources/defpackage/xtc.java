package defpackage;

import com.google.android.apps.messaging.navigation.targets.EditedMedia;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xtc {
    private final aigz a;
    private final enru b;
    private final xgp c;

    public xtc(aigz aigzVar, xgp xgpVar) {
        aigzVar.getClass();
        this.a = aigzVar;
        this.c = xgpVar;
        this.b = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DirectSendViewer");
    }

    private final xhm b(doyc doycVar, EditedMedia editedMedia) {
        if (editedMedia == null || ffkj.e(editedMedia.b.toString(), doycVar.f())) {
            return new xhk(this.c.a(), doycVar);
        }
        drlx a = drlo.a(editedMedia.a);
        if (a == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        xgp xgpVar = this.c;
        return new xhl(xgpVar.a(), a, editedMedia.b, null, doycVar.fm());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.doyc r11, java.lang.String r12, boolean r13, boolean r14, defpackage.ffgu r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.xtb
            if (r0 == 0) goto L13
            r0 = r15
            xtb r0 = (defpackage.xtb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            xtb r0 = new xtb
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r11 = r0.a
            xtc r12 = r0.e
            defpackage.ffci.b(r15)
            goto L65
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            defpackage.ffci.b(r15)
            aikl r4 = new aikl
            java.lang.String r15 = r11.f()
            android.net.Uri r5 = android.net.Uri.parse(r15)
            r5.getClass()
            drlx r15 = r11.b()
            java.lang.String r6 = r15.a()
            if (r3 == r13) goto L50
            r13 = 2
            r7 = r13
            goto L51
        L50:
            r7 = r3
        L51:
            r8 = r12
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            aigz r12 = r10.a
            r0.e = r10
            r0.a = r11
            r0.d = r3
            java.lang.Object r15 = r12.f(r4, r0)
            if (r15 == r1) goto Lc5
            r12 = r10
        L65:
            com.google.android.apps.messaging.navigation.targets.DirectSendResult r15 = (com.google.android.apps.messaging.navigation.targets.DirectSendResult) r15
            if (r15 != 0) goto L89
            enru r11 = r12.b
            ensk r11 = r11.h()
            java.lang.String r12 = "openDirectSendViewer"
            r13 = 56
            java.lang.String r14 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DirectSendViewer"
            java.lang.String r15 = "DirectSendViewer.kt"
            ensk r11 = r11.h(r14, r12, r13, r15)
            enrr r11 = (defpackage.enrr) r11
            java.lang.String r12 = "Null Direct Send Viewer result."
            r11.q(r12)
            xsy r11 = new xsy
            r12 = 0
            r11.<init>(r12)
            return r11
        L89:
            boolean r13 = r15 instanceof com.google.android.apps.messaging.navigation.targets.DirectSendResult.Send
            if (r13 == 0) goto L9d
            xsz r13 = new xsz
            com.google.android.apps.messaging.navigation.targets.DirectSendResult$Send r15 = (com.google.android.apps.messaging.navigation.targets.DirectSendResult.Send) r15
            com.google.android.apps.messaging.navigation.targets.EditedMedia r14 = r15.a
            xhm r11 = r12.b(r11, r14)
            java.lang.String r12 = r15.b
            r13.<init>(r11, r12)
            return r13
        L9d:
            boolean r13 = r15 instanceof com.google.android.apps.messaging.navigation.targets.DirectSendResult.Add
            if (r13 == 0) goto Lb1
            xsx r13 = new xsx
            com.google.android.apps.messaging.navigation.targets.DirectSendResult$Add r15 = (com.google.android.apps.messaging.navigation.targets.DirectSendResult.Add) r15
            com.google.android.apps.messaging.navigation.targets.EditedMedia r14 = r15.a
            xhm r11 = r12.b(r11, r14)
            java.lang.String r12 = r15.b
            r13.<init>(r11, r12)
            return r13
        Lb1:
            boolean r11 = r15 instanceof com.google.android.apps.messaging.navigation.targets.DirectSendResult.Discard
            if (r11 == 0) goto Lbf
            xsy r11 = new xsy
            com.google.android.apps.messaging.navigation.targets.DirectSendResult$Discard r15 = (com.google.android.apps.messaging.navigation.targets.DirectSendResult.Discard) r15
            java.lang.String r12 = r15.a
            r11.<init>(r12)
            return r11
        Lbf:
            ffcd r11 = new ffcd
            r11.<init>()
            throw r11
        Lc5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xtc.a(doyc, java.lang.String, boolean, boolean, ffgu):java.lang.Object");
    }
}
