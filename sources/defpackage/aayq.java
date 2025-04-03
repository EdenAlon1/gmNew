package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aayq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ abac b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ abgh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aayq(abac abacVar, String str, String str2, abgh abghVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = abacVar;
        this.c = str;
        this.d = str2;
        this.e = abghVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aayq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006a, code lost:
    
        if (r3.i(r4, r5, r6, r7, r9) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        if (r10 != r0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r1 != 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0052, code lost:
    
        if (r3.i(r4, r5, null, r7, r9) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0070, code lost:
    
        return r0;
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto Le
            defpackage.ffci.b(r10)
            if (r1 == r3) goto L28
            goto L6d
        Le:
            defpackage.ffci.b(r10)
            abac r10 = r9.b
            com.google.android.apps.messaging.shared.api.messaging.Conversation r10 = r10.h
            aqge r10 = r10.h()
            elfl r10 = r10.b()
            r10.getClass()
            r9.a = r3
            java.lang.Object r10 = defpackage.fgfz.c(r10, r9)
            if (r10 == r0) goto L70
        L28:
            alxj r10 = (defpackage.alxj) r10
            aqux r4 = r10.f()
            abac r10 = r9.b
            ffbr r10 = r10.G
            java.lang.Object r10 = r10.b()
            atdn r10 = (defpackage.atdn) r10
            boolean r10 = r10.a()
            if (r10 == 0) goto L55
            abac r3 = r9.b
            java.lang.String r5 = r9.c
            java.lang.String r10 = r9.d
            abgh r1 = r9.e
            com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState r7 = defpackage.abac.o(r10, r1)
            r9.a = r2
            r6 = 0
            r8 = r9
            java.lang.Object r10 = r3.i(r4, r5, r6, r7, r8)
            if (r10 != r0) goto L6d
            goto L70
        L55:
            r8 = r9
            abac r3 = r8.b
            java.lang.String r5 = r8.c
            java.lang.String r6 = r8.d
            r10 = 0
            abgh r1 = r8.e
            com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState r7 = defpackage.abac.o(r10, r1)
            r10 = 3
            r8.a = r10
            java.lang.Object r10 = r3.i(r4, r5, r6, r7, r8)
            if (r10 != r0) goto L6d
            goto L70
        L6d:
            ffcu r10 = defpackage.ffcu.a
            return r10
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aayq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aayq(this.b, this.c, this.d, this.e, ffguVar);
    }
}
