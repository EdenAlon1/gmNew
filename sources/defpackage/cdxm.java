package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdxm implements cdwr {
    public final cqiy a;
    public final ffbr b;
    public final ffbr c;
    private final cqoh d;
    private final cbwj e;

    public cdxm(cqoh cqohVar, cbwj cbwjVar, cqiy cqiyVar, ffbr ffbrVar, ffbr ffbrVar2) {
        cqohVar.getClass();
        cbwjVar.getClass();
        cqiyVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.d = cqohVar;
        this.e = cbwjVar;
        this.a = cqiyVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    @Override // defpackage.cdws
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        return ((cejk) obj).d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cdxi r5, defpackage.cejk r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cdxl
            if (r0 == 0) goto L13
            r0 = r7
            cdxl r0 = (defpackage.cdxl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdxl r0 = new cdxl
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            cejk r6 = r0.e
            cdxm r5 = r0.d
            defpackage.ffci.b(r7)
            goto L4c
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r7)
            crtz r5 = r5.eU()
            elfl r5 = r5.h()
            r0.d = r4
            r0.e = r6
            r0.c = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            r5 = r4
        L4c:
            r6.getClass()
            int r7 = r6.h
            boolean r0 = r6.g
            int r6 = r6.d
            cejk r1 = defpackage.cejk.b
            eyfq r1 = r1.createBuilder()
            cejj r1 = (defpackage.cejj) r1
            r1.getClass()
            defpackage.ceia.c(r6, r1)
            cejo r6 = defpackage.cejo.BACKUP_KEY
            defpackage.ceia.i(r6, r1)
            defpackage.ceia.e(r0, r1)
            defpackage.ceia.d(r7, r1)
            cqoh r6 = r5.d
            j$.time.Instant r6 = r6.f()
            long r6 = r6.toEpochMilli()
            eyja r6 = defpackage.eykm.d(r6)
            defpackage.ceia.h(r6, r1)
            cqoh r6 = r5.d
            j$.time.Instant r6 = r6.f()
            long r6 = r6.toEpochMilli()
            eyja r6 = defpackage.eykm.d(r6)
            defpackage.ceia.g(r6, r1)
            defpackage.ceia.b(r1)
            cejo r6 = defpackage.cejo.ENCRYPTION_KEYS
            defpackage.ceia.k(r6, r1)
            defpackage.ceia.b(r1)
            cejo r6 = defpackage.cejo.PARTICIPANTS
            defpackage.ceia.k(r6, r1)
            defpackage.ceia.b(r1)
            cejo r6 = defpackage.cejo.CONVERSATIONS
            defpackage.ceia.k(r6, r1)
            defpackage.ceia.b(r1)
            cejo r6 = defpackage.cejo.MESSAGES
            defpackage.ceia.k(r6, r1)
            cejk r6 = defpackage.ceia.a(r1)
            cbwj r7 = r5.e
            dtuu r7 = r7.a
            cdxk r0 = new cdxk
            r0.<init>()
            java.lang.String r5 = "CmsDisableMultiDeviceProcessor#enqueueRestoreWorkUsingPwq"
            java.lang.Object r5 = r7.c(r5, r0)
            r5.getClass()
            ceyr r5 = (defpackage.ceyr) r5
            engw r5 = defpackage.engw.r(r5)
            ceyt r5 = defpackage.ceyt.j(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdxm.b(cdxi, cejk, ffgu):java.lang.Object");
    }

    @Override // defpackage.cdwr
    public final /* bridge */ /* synthetic */ Object d(Object obj, ceuw ceuwVar, Object obj2, ffgu ffguVar) {
        return b((cdxi) obj, (cejk) obj2, ffguVar);
    }
}
