package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cycq extends ffhv implements ffjn {
    boolean a;
    int b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ cycu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cycq(cycu cycuVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.e = cycuVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cycq cycqVar = new cycq(this.e, (ffgu) obj3);
        cycqVar.c = (engw) obj;
        cycqVar.d = (alxj) obj2;
        return cycqVar.b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0036, code lost:
    
        if (r10 != r0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Type inference failed for: r1v1, types: [alxj, java.lang.Object] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 == r2) goto L16
            boolean r0 = r9.a
            java.lang.Object r1 = r9.c
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r1
            defpackage.ffci.b(r10)
            goto L60
        L16:
            java.lang.Object r1 = r9.c
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r1
            defpackage.ffci.b(r10)
            goto L49
        L1e:
            defpackage.ffci.b(r10)
            goto L38
        L22:
            defpackage.ffci.b(r10)
            java.lang.Object r10 = r9.c
            engw r10 = (defpackage.engw) r10
            java.lang.Object r1 = r9.d
            cycu r4 = r9.e
            r5 = 0
            r9.c = r5
            r9.b = r3
            java.lang.Object r10 = r4.b(r10, r1, r9)
            if (r10 == r0) goto Lb4
        L38:
            cycu r1 = r9.e
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r10 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r10
            r9.c = r10
            r9.b = r2
            java.lang.Object r1 = r1.d(r9)
            if (r1 == r0) goto Lb4
            r8 = r1
            r1 = r10
            r10 = r8
        L49:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            cycu r2 = r9.e
            r9.c = r1
            r9.a = r10
            r4 = 3
            r9.b = r4
            java.lang.Object r2 = r2.c(r9)
            if (r2 == r0) goto Lb4
            r0 = r10
            r10 = r2
        L60:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r2 = r10.booleanValue()
            enru r4 = defpackage.cycu.a
            ensk r4 = r4.h()
            ensn r5 = defpackage.ente.a
            java.lang.String r6 = "BugleBanners"
            r4.Y(r5, r6)
            enrr r4 = (defpackage.enrr) r4
            r5 = r0 ^ 1
            ensn r6 = defpackage.cybx.h
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.Y(r6, r5)
            ensn r5 = defpackage.cybx.i
            r4.Y(r5, r10)
            java.lang.String r10 = "invokeSuspend"
            r5 = 74
            java.lang.String r6 = "com/google/android/apps/messaging/ui/conversation/banners2o/addcontact/dataservice2/AddContactBanner2DataServiceImpl$getAddContactBanner2LoadedDataFlow$1$1"
            java.lang.String r7 = "AddContactBanner2DataServiceImpl.kt"
            ensk r10 = r4.h(r6, r10, r5, r7)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r4 = "Add contact banner is dismissed and first incoming"
            r10.q(r4)
            r10 = 0
            if (r1 == 0) goto La1
            if (r0 == 0) goto La1
            if (r2 == 0) goto La1
            r0 = r3
            goto La2
        La1:
            r0 = r10
        La2:
            cycx r2 = new cycx
            if (r0 == 0) goto Laf
            cycu r4 = r9.e
            boolean r4 = r4.e(r1)
            if (r4 == 0) goto Laf
            goto Lb0
        Laf:
            r3 = r10
        Lb0:
            r2.<init>(r1, r0, r3)
            return r2
        Lb4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cycq.b(java.lang.Object):java.lang.Object");
    }
}
