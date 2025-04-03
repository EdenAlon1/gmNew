package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class unk implements uno {
    private final Activity a;
    private final ffix b;

    public unk(Activity activity, ffix ffixVar) {
        this.a = activity;
        this.b = ffixVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        if (((java.lang.Boolean) r9).booleanValue() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        if (r9 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ca, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        if (r9 != r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.uno
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ade r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.unj
            if (r0 == 0) goto L13
            r0 = r9
            unj r0 = (defpackage.unj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            unj r0 = new unj
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            defpackage.ffci.b(r9)
            goto Lc3
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            defpackage.ffci.b(r9)
            goto L93
        L38:
            defpackage.ffci.b(r9)
            int r9 = r8.a
            r2 = -1
            if (r9 != r2) goto Lcb
            android.content.Intent r8 = r8.b
            cfup r9 = defpackage.cful.o
            java.lang.Object r9 = r9.e()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L9c
            ufn r8 = defpackage.ufo.o(r8)
            if (r8 != 0) goto L6f
            android.app.Activity r8 = r7.a
            android.view.Window r8 = r8.getWindow()
            android.view.View r8 = r8.getDecorView()
            android.view.View r8 = r8.getRootView()
            r9 = 2132085199(0x7f1509cf, float:1.981059E38)
            com.google.android.material.snackbar.Snackbar r8 = com.google.android.material.snackbar.Snackbar.q(r8, r9, r5)
            r8.i()
            goto Lcb
        L6f:
            ffix r9 = r7.b
            java.lang.Object r9 = r9.invoke()
            dqls r9 = (defpackage.dqls) r9
            dqlx r9 = r9.b
            android.util.Size r2 = new android.util.Size
            r3 = 800(0x320, float:1.121E-42)
            r6 = 400(0x190, float:5.6E-43)
            r2.<init>(r3, r6)
            r3 = r8
            uet r3 = (defpackage.uet) r3
            r3.b = r2
            ufo r8 = r8.a()
            r0.c = r4
            java.lang.Object r9 = r9.a(r8, r0)
            if (r9 == r1) goto Lca
        L93:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            if (r8 == 0) goto Lcb
            goto Lcc
        L9c:
            if (r8 == 0) goto Lcb
            java.lang.String r9 = "location_message_part"
            android.os.Parcelable r9 = r8.getParcelableExtra(r9)
            com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r9 = (com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData) r9
            if (r9 == 0) goto Lcb
            ffix r2 = r7.b
            java.lang.Object r2 = r2.invoke()
            dqls r2 = (defpackage.dqls) r2
            dqlx r2 = r2.b
            com.google.android.apps.messaging.ui.mediapicker.c2o.location.LocationContentItem r4 = new com.google.android.apps.messaging.ui.mediapicker.c2o.location.LocationContentItem
            android.net.Uri r8 = r8.getData()
            r4.<init>(r8, r9)
            r0.c = r3
            java.lang.Object r9 = r2.a(r4, r0)
            if (r9 == r1) goto Lca
        Lc3:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r4 = r9.booleanValue()
            goto Lcc
        Lca:
            return r1
        Lcb:
            r4 = r5
        Lcc:
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.unk.c(ade, ffgu):java.lang.Object");
    }
}
