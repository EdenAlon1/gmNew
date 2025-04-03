package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceen extends ffhv implements ffjm {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ crwz c;
    final /* synthetic */ ceeq d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceen(boolean z, crwz crwzVar, ceeq ceeqVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = z;
        this.c = crwzVar;
        this.d = ceeqVar;
        this.e = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ceen) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r10 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r10 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0047, code lost:
    
        return (com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005e, code lost:
    
        return (com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType) r10;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.a
            r2 = 1
            defpackage.ffci.b(r10)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L45
            goto L5c
        Ld:
            boolean r10 = r9.b
            if (r10 == 0) goto L28
            crwz r10 = r9.c
            bseh r10 = r10.a()
            bsel r10 = r10.F()
            cpxu r1 = new cpxu
            r1.<init>()
            r10.as(r1)
            bseh r10 = r10.a()
            goto L2e
        L28:
            crwz r10 = r9.c
            bseh r10 = r10.a()
        L2e:
            r4 = r10
            int r10 = r4.k()
            r1 = 2
            if (r10 != r1) goto L48
            ceeq r10 = r9.d
            r4.getClass()
            crwz r1 = r9.c
            r9.a = r2
            java.lang.Object r10 = r10.g(r4, r1, r2, r9)
            if (r10 == r0) goto L5b
        L45:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r10 = (com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType) r10
            return r10
        L48:
            ceeq r3 = r9.d
            r4.getClass()
            crwz r5 = r9.c
            java.lang.String r6 = r9.e
            r9.a = r1
            r7 = 1
            r8 = r9
            java.lang.Object r10 = r3.f(r4, r5, r6, r7, r8)
            if (r10 != r0) goto L5c
        L5b:
            return r0
        L5c:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r10 = (com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceen.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ceen(this.b, this.c, this.d, this.e, ffguVar);
    }
}
