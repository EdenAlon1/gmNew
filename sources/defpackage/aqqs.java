package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqqs extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ aqqu d;
    final /* synthetic */ enip e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqqs(aqqu aqquVar, enip enipVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = aqquVar;
        this.e = enipVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqqs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r8 != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r8 != r0) goto L11;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.c
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1b
            if (r1 == r3) goto L15
            java.lang.Object r0 = r7.b
            java.lang.Object r1 = r7.a
            defpackage.ffci.b(r8)
            goto L68
        L15:
            java.lang.Object r1 = r7.a
            defpackage.ffci.b(r8)
            goto L45
        L1b:
            java.lang.Object r1 = r7.a
            defpackage.ffci.b(r8)
            goto L37
        L21:
            defpackage.ffci.b(r8)
            aqqk r1 = new aqqk
            r1.<init>()
            aqqu r8 = r7.d
            enip r5 = r7.e
            r7.a = r1
            r7.c = r4
            java.lang.Object r8 = r8.h(r5, r7)
            if (r8 == r0) goto L96
        L37:
            aqqu r5 = r7.d
            java.util.List r8 = (java.util.List) r8
            r7.a = r1
            r7.c = r3
            java.lang.Object r8 = r5.e(r8, r7)
            if (r8 == r0) goto L96
        L45:
            java.util.Collection r8 = (java.util.Collection) r8
            engw r8 = defpackage.engq.a(r8)
            int r3 = r8.size()
            r5 = r1
            aqqk r5 = (defpackage.aqqk) r5
            int r6 = r5.f
            int r6 = r6 + r3
            r5.f = r6
            aqqu r3 = r7.d
            r7.a = r1
            r7.b = r8
            r5 = 3
            r7.c = r5
            java.lang.Object r3 = defpackage.aqqu.n(r3, r2, r8, r7, r4)
            if (r3 != r0) goto L67
            goto L96
        L67:
            r0 = r8
        L68:
            enru r8 = defpackage.aqqu.a
            ensk r8 = r8.h()
            ensn r3 = defpackage.ente.a
            java.lang.String r4 = "BugleRecipientSync"
            r8.Y(r3, r4)
            java.lang.String r3 = "invokeSuspend"
            r4 = 122(0x7a, float:1.71E-43)
            java.lang.String r5 = "com/google/android/apps/messaging/shared/api/messaging/recipient/sync/RecipientContactDataServiceImpl$syncRecipientsWithDeletedContacts$1"
            java.lang.String r6 = "RecipientContactDataServiceImpl.kt"
            ensk r8 = r8.h(r5, r3, r4, r6)
            enrr r8 = (defpackage.enrr) r8
            engw r0 = (defpackage.engw) r0
            java.lang.String r3 = "Cleared contact data for %d recipients linked to deleted contacts"
            int r0 = r0.size()
            r8.r(r3, r0)
            aqqu r8 = r7.d
            aqqk r1 = (defpackage.aqqk) r1
            r8.m(r1)
            return r2
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqqs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqqs(this.d, this.e, ffguVar);
    }
}
