package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cubo {
    public final ffbr a;
    public final cucf b;
    private final ffbr c;

    public cubo(ffbr ffbrVar, ffbr ffbrVar2, cucf cucfVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        cucfVar.getClass();
        this.c = ffbrVar;
        this.a = ffbrVar2;
        this.b = cucfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r11, java.util.List r12) {
        /*
            r10 = this;
            r11.getClass()
            r12.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r11.b()
            if (r1 != 0) goto Led
            boolean r1 = r12.isEmpty()
            if (r1 != 0) goto Led
            ffbr r1 = r10.a
            java.lang.Object r1 = r1.b()
            culp r1 = (defpackage.culp) r1
            cuva r2 = defpackage.cuuz.a(r11)
            boolean r1 = r1.j(r11, r2)
            if (r1 != 0) goto Led
            java.util.Iterator r12 = r12.iterator()
        L2d:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto Led
            java.lang.Object r1 = r12.next()
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r1 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r1
            boolean r2 = r1.ab()
            if (r2 == 0) goto L2d
            cukx r2 = defpackage.cukx.a
            int r2 = r1.n()
            cukx r2 = defpackage.cukw.a(r2)
            boolean r2 = r2.b()
            if (r2 == 0) goto L2d
            ffbr r2 = r10.c
            java.lang.Object r2 = r2.b()
            bdmq r2 = (defpackage.bdmq) r2
            java.lang.String r3 = r1.S()
            java.lang.String r4 = "MessageDatabaseOperations#getLatestMessageByConversationAndSender"
            ekzz r4 = defpackage.eleg.f(r4)
            emyl r5 = defpackage.bdmq.b     // Catch: java.lang.Throwable -> Le3
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> Le3
            cfup r5 = (defpackage.cfup) r5     // Catch: java.lang.Throwable -> Le3
            java.lang.Object r5 = r5.e()     // Catch: java.lang.Throwable -> Le3
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> Le3
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> Le3
            r6 = 0
            if (r5 == 0) goto L7e
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r2 = r2.h(r11, r3, r6)     // Catch: java.lang.Throwable -> Le3
        L7a:
            r4.close()
            goto Ld2
        L7e:
            java.lang.String r5 = "MessageDatabaseOperations#getLatestMessagesByConversationAndSender"
            ekzz r5 = defpackage.eleg.f(r5)     // Catch: java.lang.Throwable -> Le3
            emyl r7 = defpackage.bdmq.b     // Catch: java.lang.Throwable -> Ld9
            java.lang.Object r7 = r7.get()     // Catch: java.lang.Throwable -> Ld9
            cfup r7 = (defpackage.cfup) r7     // Catch: java.lang.Throwable -> Ld9
            java.lang.Object r7 = r7.e()     // Catch: java.lang.Throwable -> Ld9
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> Ld9
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> Ld9
            r8 = 1
            if (r7 == 0) goto La1
            engw r2 = r2.W(r11, r3, r6)     // Catch: java.lang.Throwable -> Ld9
        L9d:
            r5.close()     // Catch: java.lang.Throwable -> Le3
            goto Lbf
        La1:
            java.lang.String[] r7 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.a     // Catch: java.lang.Throwable -> Ld9
            buxz r7 = new buxz     // Catch: java.lang.Throwable -> Ld9
            r7.<init>()     // Catch: java.lang.Throwable -> Ld9
            r7.m(r11)     // Catch: java.lang.Throwable -> Ld9
            r7.X(r3)     // Catch: java.lang.Throwable -> Ld9
            r3 = 100
            r9 = 117(0x75, float:1.64E-43)
            r7.ak(r3, r9)     // Catch: java.lang.Throwable -> Ld9
            buxs r3 = new buxs     // Catch: java.lang.Throwable -> Ld9
            r3.<init>(r7)     // Catch: java.lang.Throwable -> Ld9
            engw r2 = r2.H(r3, r8)     // Catch: java.lang.Throwable -> Ld9
            goto L9d
        Lbf:
            if (r2 == 0) goto Lce
            int r3 = r2.size()     // Catch: java.lang.Throwable -> Le3
            if (r3 != r8) goto Lce
            java.lang.Object r2 = r2.get(r6)     // Catch: java.lang.Throwable -> Le3
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r2 = (com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData) r2     // Catch: java.lang.Throwable -> Le3
            goto L7a
        Lce:
            r4.close()
            r2 = 0
        Ld2:
            if (r2 == 0) goto L2d
            r0.add(r1)
            goto L2d
        Ld9:
            r11 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> Lde
            goto Le2
        Lde:
            r12 = move-exception
            r11.addSuppressed(r12)     // Catch: java.lang.Throwable -> Le3
        Le2:
            throw r11     // Catch: java.lang.Throwable -> Le3
        Le3:
            r11 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> Le8
            goto Lec
        Le8:
            r12 = move-exception
            r11.addSuppressed(r12)
        Lec:
            throw r11
        Led:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cubo.a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, java.util.List):java.util.List");
    }
}
