package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpl implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ zqj b;
    final /* synthetic */ ffsk c;
    final /* synthetic */ ffxx d;

    public zpl(ffxy ffxyVar, zqj zqjVar, ffsk ffskVar, ffxx ffxxVar) {
        this.a = ffxyVar;
        this.b = zqjVar;
        this.c = ffskVar;
        this.d = ffxxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v0, types: [doun] */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r12, defpackage.ffgu r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.zpk
            if (r0 == 0) goto L13
            r0 = r13
            zpk r0 = (defpackage.zpk) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            zpk r0 = new zpk
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.ffci.b(r13)
            goto Le8
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L30:
            defpackage.ffci.b(r13)
            ffxy r13 = r11.a
            engw r12 = (defpackage.engw) r12
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.ffdx.n(r12, r4)
            r2.<init>(r4)
            java.util.Iterator r4 = r12.iterator()
        L46:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L68
            java.lang.Object r5 = r4.next()
            alxc r5 = (defpackage.alxc) r5
            zqj r6 = r11.b
            ffbr r6 = r6.c
            java.lang.Object r6 = r6.b()
            crpw r6 = (defpackage.crpw) r6
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5 = r5.a()
            dnwn r5 = r6.c(r5)
            r2.add(r5)
            goto L46
        L68:
            boolean r4 = r2.isEmpty()
            r5 = 0
            if (r4 != 0) goto Ldf
            zqj r4 = r11.b
            doun r6 = new doun
            boolean r7 = r12.isEmpty()
            if (r7 == 0) goto L7a
            goto Ld0
        L7a:
            java.lang.Object r5 = defpackage.ffdx.K(r12)
            alxc r5 = (defpackage.alxc) r5
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5 = r5.a()
            r7 = 0
            java.lang.String r5 = r5.x(r7)
            boolean r8 = defpackage.aswb.a()
            if (r8 == 0) goto L94
            java.lang.String r5 = defpackage.cuxh.a(r5)
            goto L9a
        L94:
            cuxh r8 = r4.d
            java.lang.String r5 = r8.c(r5)
        L9a:
            int r8 = r12.size()
            if (r8 != r3) goto Lb2
            android.content.Context r4 = r4.b
            android.content.res.Resources r4 = r4.getResources()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r7] = r5
            r5 = 2132088133(0x7f151545, float:1.981654E38)
            java.lang.String r5 = r4.getString(r5, r8)
            goto Ld0
        Lb2:
            int r8 = r12.size()
            int r8 = r8 + (-1)
            android.content.Context r4 = r4.b
            android.content.res.Resources r4 = r4.getResources()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r7] = r5
            r10[r3] = r9
            r5 = 2131951710(0x7f13005e, float:1.9539842E38)
            java.lang.String r5 = r4.getQuantityString(r5, r8, r10)
        Ld0:
            zqj r4 = r11.b
            ffsk r7 = r11.c
            ffxx r8 = r11.d
            zqi r9 = new zqi
            r9.<init>(r4, r7, r12, r8)
            r6.<init>(r2, r5, r9)
            r5 = r6
        Ldf:
            r0.b = r3
            java.lang.Object r12 = r13.fQ(r5, r0)
            if (r12 != r1) goto Le8
            return r1
        Le8:
            ffcu r12 = defpackage.ffcu.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpl.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
