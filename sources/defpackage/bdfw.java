package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdfw {
    private static final cskc a = cskc.g("BugleDataModel", "ConversationRecipientDatabaseOperations");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public bdfw(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[SYNTHETIC] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "ConversationRecipientDatabaseOperationsImpl#getRecipientsForConversationLegacy"
            ekzz r0 = defpackage.eleg.f(r0)
            defpackage.csix.h()     // Catch: java.lang.Throwable -> Lb5
            ffbr r1 = r7.e     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> Lb5
            bczy r1 = (defpackage.bczy) r1     // Catch: java.lang.Throwable -> Lb5
            java.util.List r1 = r1.L(r8)     // Catch: java.lang.Throwable -> Lb5
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb5
            r3 = r1
            enou r3 = (defpackage.enou) r3     // Catch: java.lang.Throwable -> Lb5
            int r3 = r3.c     // Catch: java.lang.Throwable -> Lb5
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lb5
            r3 = r1
            engw r3 = (defpackage.engw) r3     // Catch: java.lang.Throwable -> Lb5
            enqv r3 = r3.iterator()     // Catch: java.lang.Throwable -> Lb5
        L26:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Lb5
            if (r4 == 0) goto L6e
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Lb5
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r4 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r4     // Catch: java.lang.Throwable -> Lb5
            if (r9 == 0) goto L40
            boolean r5 = defpackage.bdqu.q(r4)     // Catch: java.lang.Throwable -> Lb5
            if (r5 == 0) goto L3b
            goto L40
        L3b:
            java.lang.String r5 = r4.U()     // Catch: java.lang.Throwable -> Lb5
            goto L4e
        L40:
            java.lang.String r5 = r4.W()     // Catch: java.lang.Throwable -> Lb5
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lb5
            if (r6 == 0) goto L4e
            java.lang.String r5 = r4.U()     // Catch: java.lang.Throwable -> Lb5
        L4e:
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Lb5
            if (r6 == 0) goto L6a
            cskc r5 = defpackage.bdfw.a     // Catch: java.lang.Throwable -> Lb5
            csjb r5 = r5.e()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r6 = "Found participant with empty destination."
            r5.I(r6)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r4 = r4.S()     // Catch: java.lang.Throwable -> Lb5
            r5.f(r4)     // Catch: java.lang.Throwable -> Lb5
            r5.r()     // Catch: java.lang.Throwable -> Lb5
            goto L26
        L6a:
            r2.add(r5)     // Catch: java.lang.Throwable -> Lb5
            goto L26
        L6e:
            int r9 = r2.size()     // Catch: java.lang.Throwable -> Lb5
            r3 = r1
            enou r3 = (defpackage.enou) r3     // Catch: java.lang.Throwable -> Lb5
            int r3 = r3.c     // Catch: java.lang.Throwable -> Lb5
            if (r9 >= r3) goto Lb1
            ffbr r9 = r7.b     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r9 = r9.b()     // Catch: java.lang.Throwable -> Lb5
            akzt r9 = (defpackage.akzt) r9     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r3 = "Bugle.Datamodel.Operations.EmptyRecipient.Found"
            r9.c(r3)     // Catch: java.lang.Throwable -> Lb5
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb5
            ffbr r3 = r7.c     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> Lb5
            cbee r3 = (defpackage.cbee) r3     // Catch: java.lang.Throwable -> Lb5
            defpackage.efbd.b()     // Catch: java.lang.Throwable -> Lb5
            r4 = r1
            enou r4 = (defpackage.enou) r4     // Catch: java.lang.Throwable -> Lb5
            int r4 = r4.c     // Catch: java.lang.Throwable -> Lb5
            int r5 = r2.size()     // Catch: java.lang.Throwable -> Lb5
            j$.util.Optional r8 = r3.b(r8, r4, r5)     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r8 = r8.orElse(r2)     // Catch: java.lang.Throwable -> Lb5
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> Lb5
            engw r2 = r3.a(r8)     // Catch: java.lang.Throwable -> Lb5
            r3.c(r1, r2)     // Catch: java.lang.Throwable -> Lb5
            r9.<init>(r8)     // Catch: java.lang.Throwable -> Lb5
            r2 = r9
        Lb1:
            r0.close()
            return r2
        Lb5:
            r8 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Lba
            goto Lbe
        Lba:
            r9 = move-exception
            r8.addSuppressed(r9)
        Lbe:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdfw.a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.List] */
    public final engw b(ConversationIdType conversationIdType) {
        engw n;
        ekzz f = eleg.f("ConversationRecipientDatabaseOperationsImpl#getRecipientsForConversation");
        try {
            csix.h();
            List L = ((bczy) this.e.b()).L(conversationIdType);
            int i = engw.d;
            engr engrVar = new engr();
            enqv it = ((engw) L).iterator();
            while (it.hasNext()) {
                aoku q = ((aolr) this.d.b()).q((ParticipantsTable.BindData) it.next());
                if (!dktk.d(q.n())) {
                    engrVar.h(q);
                }
            }
            if (((enou) engrVar.g()).c < ((enou) L).c) {
                ((akzt) this.b.b()).c("Bugle.Datamodel.Operations.EmptyRecipient.Found");
                engr engrVar2 = new engr();
                cbee cbeeVar = (cbee) this.c.b();
                engw g = engrVar.g();
                efbd.b();
                Optional b = cbeeVar.b(conversationIdType, ((enou) L).c, ((enou) g).c);
                if (b.isPresent()) {
                    n = cbeeVar.a(b.get());
                    cbeeVar.c(L, n);
                } else {
                    n = engw.n(g);
                }
                engrVar2.j(n);
                engrVar = engrVar2;
            }
            engw g2 = engrVar.g();
            f.close();
            return g2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
