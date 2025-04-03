package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmjg implements bdnu {
    private final auol a;
    private final ffbr b;
    private bdhg c;

    public cmjg(auol auolVar, ffbr ffbrVar) {
        auolVar.getClass();
        ffbrVar.getClass();
        this.a = auolVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    @Override // defpackage.bdnu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r6) {
        /*
            r5 = this;
            r6.getClass()
            auol r0 = r5.a
            boolean r0 = r0.a()
            if (r0 != 0) goto Lc
            return
        Lc:
            java.lang.String r0 = "DeleteOnRcsMessageReceivedListener#beforeMessageInserted"
            ekzz r0 = defpackage.eleg.f(r0)
            fayv r1 = r6.aa()     // Catch: java.lang.Throwable -> L5f
            r2 = 0
            if (r1 == 0) goto L4b
            clbg r3 = defpackage.clbg.GSMA_RCS_NAMESPACE     // Catch: java.lang.Throwable -> L5f
            java.lang.String r4 = "Reference-Type"
            j$.util.Optional r3 = defpackage.clbh.a(r1, r3, r4)     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r3 = defpackage.fflm.b(r3)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L5f
            java.lang.String r4 = "Delete"
            boolean r4 = defpackage.ffkj.e(r4, r3)     // Catch: java.lang.Throwable -> L5f
            if (r4 != 0) goto L38
            java.lang.String r4 = "Recall"
            boolean r3 = defpackage.ffkj.e(r4, r3)     // Catch: java.lang.Throwable -> L5f
            if (r3 != 0) goto L38
            goto L4b
        L38:
            clbg r3 = defpackage.clbg.GSMA_RCS_NAMESPACE     // Catch: java.lang.Throwable -> L5f
            java.lang.String r4 = "Reference-ID"
            j$.util.Optional r1 = defpackage.clbh.a(r1, r3, r4)     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r1 = defpackage.fflm.b(r1)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L5f
            bdhg r1 = defpackage.bdhg.a(r1)     // Catch: java.lang.Throwable -> L5f
            goto L4c
        L4b:
            r1 = r2
        L4c:
            r5.c = r1     // Catch: java.lang.Throwable -> L5f
            if (r1 != 0) goto L54
            defpackage.ffig.a(r0, r2)
            return
        L54:
            r1 = 1
            r6.bx(r1)     // Catch: java.lang.Throwable -> L5f
            r6.bz(r1)     // Catch: java.lang.Throwable -> L5f
            defpackage.ffig.a(r0, r2)
            return
        L5f:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L61
        L61:
            r1 = move-exception
            defpackage.ffig.a(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmjg.e(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData):void");
    }

    @Override // defpackage.bdnu
    public final void k(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        ekzz f = eleg.f("DeleteOnRcsMessageReceivedListener#onInsertedInTransaction");
        try {
            cmje cmjeVar = (cmje) this.b.b();
            bdhg bdhgVar = this.c;
            if (bdhgVar == null) {
                ffig.a(f, null);
                return;
            }
            String aA = messageCoreData.aA();
            if (aA == null) {
                ffig.a(f, null);
            } else {
                cmjeVar.a(bdhgVar, aA);
                ffig.a(f, null);
            }
        } finally {
        }
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }
}
