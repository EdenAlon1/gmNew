package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akaq extends ffhv implements ffji {
    int a;
    final /* synthetic */ akbo b;
    final /* synthetic */ UUID c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akaq(akbo akboVar, UUID uuid, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = akboVar;
        this.c = uuid;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ce, code lost:
    
        if (r8.s(r1, r2, r7) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d4, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:
    
        if (r1.m(r8, r2, r7) != r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b6, code lost:
    
        if (r1.a(r8, r3, r7) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        if (r8 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        if (r8 != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0040, code lost:
    
        if (r8 != r0) goto L16;
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
            int r1 = r7.a
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2b
            if (r1 == r6) goto L27
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L1a
            if (r1 == r2) goto L1a
            defpackage.ffci.b(r8)
            goto Ld1
        L1a:
            defpackage.ffci.b(r8)
            goto Lb9
        L1f:
            defpackage.ffci.b(r8)
            goto L87
        L23:
            defpackage.ffci.b(r8)
            goto L7b
        L27:
            defpackage.ffci.b(r8)
            goto L42
        L2b:
            defpackage.ffci.b(r8)
            akbo r8 = r7.b
            ffbr r8 = r8.b
            java.lang.Object r8 = r8.b()
            ajyr r8 = (defpackage.ajyr) r8
            java.util.UUID r1 = r7.c
            r7.a = r6
            java.lang.Object r8 = r8.o(r1, r7)
            if (r8 == r0) goto Ld4
        L42:
            r8.getClass()
            ajwc r8 = (defpackage.ajwc) r8
            akci r8 = r8.c
            akci r1 = defpackage.akci.CREATED
            if (r8 != r1) goto L7b
            akbo r8 = r7.b
            java.util.UUID r1 = r7.c
            r7.a = r5
            java.lang.String[] r5 = defpackage.bqea.a
            bqdr r5 = new bqdr
            r5.<init>()
            java.lang.String r6 = "clearBackupIdMap"
            r5.f(r6)
            r5.e()
            r5.d()
            ffbr r8 = r8.b
            java.lang.Object r8 = r8.b()
            ajyr r8 = (defpackage.ajyr) r8
            akci r5 = defpackage.akci.DATABASE_RESTORING
            java.lang.Object r8 = r8.s(r1, r5, r7)
            ffhh r1 = defpackage.ffhh.a
            if (r8 == r1) goto L79
            ffcu r8 = defpackage.ffcu.a
        L79:
            if (r8 == r0) goto Ld4
        L7b:
            akbo r8 = r7.b
            java.util.UUID r1 = r7.c
            r7.a = r4
            java.lang.Object r8 = r8.j(r1, r7)
            if (r8 == r0) goto Ld4
        L87:
            akbo r1 = r7.b
            java.io.File r8 = (java.io.File) r8
            ajwe r4 = r1.k
            akbq r4 = (defpackage.akbq) r4
            bckh r4 = r4.a
            boolean r4 = r4.c
            if (r4 == 0) goto La0
            java.util.UUID r2 = r7.c
            r7.a = r3
            java.lang.Object r8 = r1.m(r8, r2, r7)
            if (r8 == r0) goto Ld4
            goto Lb9
        La0:
            ffbr r1 = r1.e
            java.lang.Object r1 = r1.b()
            bbhx r1 = (defpackage.bbhx) r1
            akbo r3 = r7.b
            ajwe r3 = r3.k
            akbq r3 = (defpackage.akbq) r3
            bckh r3 = r3.a
            r7.a = r2
            java.lang.Object r8 = r1.a(r8, r3, r7)
            if (r8 != r0) goto Lb9
            goto Ld4
        Lb9:
            akbo r8 = r7.b
            ffbr r8 = r8.b
            java.lang.Object r8 = r8.b()
            ajyr r8 = (defpackage.ajyr) r8
            java.util.UUID r1 = r7.c
            akci r2 = defpackage.akci.DATABASE_RESTORE_COMPLETE
            r3 = 6
            r7.a = r3
            java.lang.Object r8 = r8.s(r1, r2, r7)
            if (r8 != r0) goto Ld1
            goto Ld4
        Ld1:
            ffcu r8 = defpackage.ffcu.a
            return r8
        Ld4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akaq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new akaq(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
