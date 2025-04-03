package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnbv implements bdnu {
    private final ffbr a;
    private cmtj b;

    public cnbv(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    private final void a(MessageCoreData messageCoreData) {
        this.b = ((cmtk) this.a.b()).a(messageCoreData);
    }

    @Override // defpackage.bdnu
    public final void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        if (ctjd.b()) {
            a(messageCoreData);
            cmtj cmtjVar = this.b;
            if (cmtjVar != null) {
                cmtjVar.a();
            }
            this.b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        if (r5 == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.bdnu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r9) {
        /*
            r8 = this;
            r9.getClass()
            boolean r0 = defpackage.ctjd.b()
            if (r0 == 0) goto Lcf
            r8.a(r9)
            cmtj r0 = r8.b
            if (r0 == 0) goto Lcf
            boolean r1 = r9.cF()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L2c
            r1 = r0
            cmug r1 = (defpackage.cmug) r1
            ffbz r1 = r1.e
            java.lang.Object r1 = r1.a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L2a
            goto L2c
        L2a:
            r1 = r2
            goto L2d
        L2c:
            r1 = r3
        L2d:
            r9.bx(r1)
            boolean r1 = r9.cN()
            r4 = 0
            if (r1 != 0) goto L93
            r1 = r0
            cmug r1 = (defpackage.cmug) r1
            cmrm r5 = r1.d()
            cmrm r6 = defpackage.cmrm.REACTION_ACTION_UNSPECIFIED
            if (r5 == r6) goto L94
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r5 = r1.b()
            boolean r5 = r5.c()
            if (r5 == 0) goto L4d
            goto L94
        L4d:
            buxo r5 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.d()
            java.lang.String r6 = "EmotifyReactionsRcsReceiverImpl#shouldNotify"
            r5.z(r6)
            buun[] r6 = new defpackage.buun[r3]
            buum r7 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.c
            buun r7 = r7.k
            r6[r2] = r7
            r5.c(r6)
            cmts r6 = new cmts
            r6.<init>()
            r5.h(r6)
            buxm r1 = r5.b()
            dtsu r1 = r1.o()
            r5 = r1
            buuo r5 = (defpackage.buuo) r5     // Catch: java.lang.Throwable -> L8c
            boolean r6 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L8c
            if (r6 == 0) goto L88
            int r5 = r5.i()     // Catch: java.lang.Throwable -> L8c
            boolean r5 = defpackage.bdjs.y(r5)     // Catch: java.lang.Throwable -> L8c
            defpackage.ffig.a(r1, r4)
            if (r5 != 0) goto L94
            goto L93
        L88:
            defpackage.ffig.a(r1, r4)
            goto L93
        L8c:
            r9 = move-exception
            throw r9     // Catch: java.lang.Throwable -> L8e
        L8e:
            r0 = move-exception
            defpackage.ffig.a(r1, r9)
            throw r0
        L93:
            r2 = r3
        L94:
            r9.bz(r2)
            cmug r0 = (defpackage.cmug) r0
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r9 = r0.c
            java.util.List r9 = r9.ab()
            java.lang.String r1 = r0.e()
            if (r1 != 0) goto La6
            r9 = r4
        La6:
            if (r9 == 0) goto Lcf
            java.util.Iterator r9 = r9.iterator()
        Lac:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto Lc4
            java.lang.Object r1 = r9.next()
            r2 = r1
            com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r2 = (com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData) r2
            java.lang.String r2 = r2.V()
            boolean r2 = defpackage.le.n(r2)
            if (r2 == 0) goto Lac
            r4 = r1
        Lc4:
            com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r4 = (com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData) r4
            if (r4 == 0) goto Lcf
            java.lang.String r9 = r0.e()
            r4.am(r9)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnbv.e(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData):void");
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void k(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }
}
