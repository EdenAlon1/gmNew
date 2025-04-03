package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zfc implements ffxy {
    final /* synthetic */ ffxy a;
    final /* synthetic */ zfi b;
    final /* synthetic */ fgcm c;

    public zfc(ffxy ffxyVar, zfi zfiVar, fgcm fgcmVar) {
        this.a = ffxyVar;
        this.b = zfiVar;
        this.c = fgcmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.ffxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fQ(java.lang.Object r17, defpackage.ffgu r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof defpackage.zfb
            if (r2 == 0) goto L17
            r2 = r1
            zfb r2 = (defpackage.zfb) r2
            int r3 = r2.b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.b = r3
            goto L1c
        L17:
            zfb r2 = new zfb
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            ffhh r3 = defpackage.ffhh.a
            int r4 = r2.b
            r5 = 1
            if (r4 == 0) goto L34
            if (r4 != r5) goto L2c
            defpackage.ffci.b(r1)
            goto Lba
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            defpackage.ffci.b(r1)
            ffxy r1 = r0.a
            r4 = r17
            java.lang.Number r4 = (java.lang.Number) r4
            int r7 = r4.intValue()
            zfi r4 = r0.b
            fgcm r6 = r0.c
            long r8 = defpackage.ibw.d
            r10 = 1041865114(0x3e19999a, float:0.15)
            long r8 = defpackage.ibw.h(r8, r10)
            long r10 = defpackage.ibw.d
            long r12 = defpackage.ibw.a
            if (r7 < 0) goto Lbd
            r15 = 99
            if (r7 > r15) goto L70
            android.content.Context r4 = r4.a
            android.content.res.Resources r4 = r4.getResources()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r7)
            r17 = 0
            java.lang.Object[] r14 = new java.lang.Object[r5]
            r14[r17] = r15
            r15 = 2131951695(0x7f13004f, float:1.9539812E38)
            java.lang.String r4 = r4.getQuantityString(r15, r7, r14)
            goto L87
        L70:
            r17 = 0
            android.content.Context r4 = r4.a
            android.content.res.Resources r4 = r4.getResources()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            java.lang.Object[] r15 = new java.lang.Object[r5]
            r15[r17] = r14
            r14 = 2132087091(0x7f151133, float:1.9814427E38)
            java.lang.String r4 = r4.getString(r14, r15)
        L87:
            r4.getClass()
            dmha r14 = new dmha
            ibw r15 = new ibw
            r15.<init>(r12)
            ibw r12 = new ibw
            r12.<init>(r10)
            r13 = r12
            ibw r12 = new ibw
            r12.<init>(r8)
            r8 = r13
            ibw r13 = new ibw
            r13.<init>(r10)
            r9 = r14
            zew r14 = new zew
            r14.<init>()
            dmzz r10 = defpackage.dmzz.cf
            r11 = r8
            r6 = r9
            r8 = r15
            r9 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r2.b = r5
            java.lang.Object r1 = r1.fQ(r6, r2)
            if (r1 != r3) goto Lba
            return r3
        Lba:
            ffcu r1 = defpackage.ffcu.a
            return r1
        Lbd:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Cannot have negative reply count."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zfc.fQ(java.lang.Object, ffgu):java.lang.Object");
    }
}
