package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnca implements bdnu {
    private cncs a;
    private final cnct b;

    public cnca(cnct cnctVar) {
        this.b = cnctVar;
    }

    private final cncs a(MessageCoreData messageCoreData) {
        if (this.a == null) {
            cnct cnctVar = this.b;
            String ar = messageCoreData.ar();
            fayv aa = messageCoreData.aa();
            ConversationIdType z = messageCoreData.z();
            cnbg cnbgVar = (cnbg) cnctVar.a.b();
            cnbgVar.getClass();
            cncr cncrVar = (cncr) cnctVar.b.b();
            cncrVar.getClass();
            cmql cmqlVar = (cmql) cnctVar.c.b();
            cmqlVar.getClass();
            cmqm cmqmVar = (cmqm) cnctVar.d.b();
            cmqmVar.getClass();
            auqo auqoVar = (auqo) cnctVar.k.b();
            auqoVar.getClass();
            auqp auqpVar = (auqp) cnctVar.l.b();
            auqpVar.getClass();
            auqs auqsVar = (auqs) cnctVar.m.b();
            auqsVar.getClass();
            z.getClass();
            this.a = new cncz(cnbgVar, cncrVar, cmqlVar, cmqmVar, cnctVar.e, cnctVar.f, cnctVar.g, cnctVar.h, cnctVar.i, cnctVar.j, auqoVar, auqpVar, auqsVar, ar, aa, z);
        }
        cncs cncsVar = this.a;
        if (cncsVar != null) {
            return cncsVar;
        }
        ffkj.c("reactionsRcsReceiver");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x022f  */
    @Override // defpackage.bdnu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r17) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnca.d(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (r4 == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9 A[ORIG_RETURN, RETURN] */
    @Override // defpackage.bdnu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r8) {
        /*
            r7 = this;
            r8.getClass()
            cncs r0 = r7.a(r8)
            boolean r1 = r8.cF()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L18
            boolean r1 = r0.b()
            if (r1 == 0) goto L16
            goto L18
        L16:
            r1 = r2
            goto L19
        L18:
            r1 = r3
        L19:
            r8.bx(r1)
            boolean r1 = r8.cN()
            if (r1 != 0) goto L8d
            r1 = r0
            cncz r1 = (defpackage.cncz) r1
            boolean r4 = r1.b()
            if (r4 != 0) goto L2c
            goto L8e
        L2c:
            auqp r4 = r1.g
            boolean r4 = r4.a()
            if (r4 == 0) goto L3b
            boolean r4 = r1.i()
            if (r4 != 0) goto L3b
            goto L8d
        L3b:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r4 = r1.c()
            boolean r4 = r4.c()
            if (r4 != 0) goto L8d
            buxo r4 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.d()
            java.lang.String r5 = "shouldNotify"
            r4.z(r5)
            buun[] r5 = new defpackage.buun[r3]
            buum r6 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.c
            buun r6 = r6.k
            r5[r2] = r6
            r4.c(r5)
            cncu r5 = new cncu
            r5.<init>()
            r4.h(r5)
            buxm r1 = r4.b()
            dtsu r1 = r1.o()
            buuo r1 = (defpackage.buuo) r1
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L83
            if (r4 == 0) goto L7f
            int r4 = r1.i()     // Catch: java.lang.Throwable -> L83
            boolean r4 = defpackage.bdjs.y(r4)     // Catch: java.lang.Throwable -> L83
            r1.close()
            if (r4 != 0) goto L8e
            goto L8d
        L7f:
            r1.close()
            goto L8d
        L83:
            r8 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L88
            goto L8c
        L88:
            r0 = move-exception
            r8.addSuppressed(r0)
        L8c:
            throw r8
        L8d:
            r2 = r3
        L8e:
            r8.bz(r2)
            java.lang.String r1 = r0.a()
            if (r1 == 0) goto Lb9
            java.util.List r8 = r8.ab()
            java.util.Iterator r8 = r8.iterator()
        L9f:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Lb9
            java.lang.Object r1 = r8.next()
            com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r1 = (com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData) r1
            boolean r2 = r1.bA()
            if (r2 == 0) goto L9f
            java.lang.String r2 = r0.a()
            r1.aK(r2)
            goto L9f
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnca.e(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData):void");
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void k(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }
}
