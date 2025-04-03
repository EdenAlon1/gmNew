package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adpx extends ffhv implements ffjm {
    Object a;
    int b;
    int c;
    final /* synthetic */ adqe d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adpx(adqe adqeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = adqeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adpx) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        if (r11.fQ(r4, r12) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r13 != r0) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            r12 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r12.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto Le
            defpackage.ffci.b(r13)
            goto L6e
        Le:
            int r1 = r12.b
            java.lang.Object r4 = r12.a
            java.lang.Object r5 = r12.e
            ffxy r5 = (defpackage.ffxy) r5
            defpackage.ffci.b(r13)
        L19:
            r6 = r4
            r11 = r5
            goto L40
        L1c:
            defpackage.ffci.b(r13)
            java.lang.Object r13 = r12.e
            r5 = r13
            ffxy r5 = (defpackage.ffxy) r5
            adqe r13 = r12.d
            com.google.android.apps.messaging.gaia.signoutaccount.SignOutAccountArguments r1 = r13.c
            eisx r1 = r1.a
            if (r1 == 0) goto L2e
            r1 = r3
            goto L2f
        L2e:
            r1 = r2
        L2f:
            r12.e = r5
            fgcm r4 = r13.l
            r12.a = r4
            r12.b = r1
            r12.c = r3
            java.lang.Object r13 = r13.a(r12)
            if (r13 == r0) goto L71
            goto L19
        L40:
            if (r3 == r1) goto L44
            r5 = r2
            goto L45
        L44:
            r5 = r3
        L45:
            adqe r1 = r12.d
            r7 = r13
            java.lang.String r7 = (java.lang.String) r7
            adpv r8 = new adpv
            r8.<init>()
            adqe r13 = r12.d
            adpw r9 = new adpw
            r9.<init>(r13)
            adqf r4 = new adqf
            ablq r13 = r13.m
            fgcq r10 = r13.a
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r13 = 0
            r12.e = r13
            r12.a = r13
            r13 = 2
            r12.c = r13
            java.lang.Object r13 = r11.fQ(r4, r12)
            if (r13 != r0) goto L6e
            goto L71
        L6e:
            ffcu r13 = defpackage.ffcu.a
            return r13
        L71:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adpx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        adpx adpxVar = new adpx(this.d, ffguVar);
        adpxVar.e = obj;
        return adpxVar;
    }
}
