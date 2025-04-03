package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apdo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ apdp b;
    final /* synthetic */ MessageId c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apdo(ffgu ffguVar, apdp apdpVar, MessageId messageId) {
        super(2, ffguVar);
        this.b = apdpVar;
        this.c = messageId;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apdo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if (r9 != r0) goto L10;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.a
            r2 = 1
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r9)
            return r9
        Ld:
            defpackage.ffci.b(r9)
            goto L26
        L11:
            defpackage.ffci.b(r9)
            java.lang.Object r9 = r8.d
            ffsk r9 = (defpackage.ffsk) r9
            apdp r9 = r8.b
            com.google.android.apps.messaging.shared.api.messaging.MessageId r1 = r8.c
            r8.a = r2
            apdt r9 = r9.b
            java.lang.Object r9 = r9.a(r1, r8)
            if (r9 == r0) goto L59
        L26:
            apdp r1 = r8.b
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable$BindData r9 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable.BindData) r9
            aree r2 = new aree
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r3 = r9.u()
            r3.getClass()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r4 = r9.v()
            r4.getClass()
            java.lang.String r5 = r9.J()
            r5.getClass()
            android.net.Uri r6 = r9.t()
            r6.getClass()
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7)
            r9 = 2
            r8.a = r9
            ared r9 = r1.c
            java.lang.Object r9 = r9.b(r2, r8)
            if (r9 != r0) goto L58
            goto L59
        L58:
            return r9
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apdo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        apdo apdoVar = new apdo(ffguVar, this.b, this.c);
        apdoVar.d = obj;
        return apdoVar;
    }
}
