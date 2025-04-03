package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajqf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ajql b;
    final /* synthetic */ MessageIdType c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajqf(ffgu ffguVar, ajql ajqlVar, MessageIdType messageIdType) {
        super(2, ffguVar);
        this.b = ajqlVar;
        this.c = messageIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajqf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0051  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.a
            if (r1 == 0) goto Le
            java.lang.Object r0 = r7.d
            ajqm r0 = (defpackage.ajqm) r0
            defpackage.ffci.b(r8)
            goto L3c
        Le:
            defpackage.ffci.b(r8)
            java.lang.Object r8 = r7.d
            ffsk r8 = (defpackage.ffsk) r8
            ajql r8 = r7.b
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r1 = r7.c
            ajqp r8 = r8.c
            cnq r8 = r8.b()
            ajqq r8 = defpackage.ajql.b(r8, r1)
            ajqm r8 = (defpackage.ajqm) r8
            if (r8 == 0) goto L2b
            java.lang.Long r1 = r8.a
            if (r1 != 0) goto L40
        L2b:
            ajql r1 = r7.b
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r2 = r7.c
            r7.d = r8
            r3 = 1
            r7.a = r3
            java.lang.Object r1 = r1.a(r2, r7)
            if (r1 == r0) goto L62
            r0 = r8
            r8 = r1
        L3c:
            r1 = r8
            java.lang.Long r1 = (java.lang.Long) r1
            r8 = r0
        L40:
            r6 = r1
            ajql r0 = r7.b
            epts r1 = defpackage.epts.REPLY_DRAFT
            eptu r2 = defpackage.eptu.UNKNOWN_COMPOSE_SCREEN_MODE
            eptk r3 = defpackage.eptk.DISMISSAL
            java.lang.Integer r4 = new java.lang.Integer
            r5 = 0
            r4.<init>(r5)
            if (r8 == 0) goto L58
            emyg r8 = r8.b
            j$.time.Duration r8 = r8.d()
            goto L59
        L58:
            r8 = 0
        L59:
            r5 = r8
            aled r0 = r0.d
            r0.c(r1, r2, r3, r4, r5, r6)
            ffcu r8 = defpackage.ffcu.a
            return r8
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajqf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajqf ajqfVar = new ajqf(ffguVar, this.b, this.c);
        ajqfVar.d = obj;
        return ajqfVar;
    }
}
