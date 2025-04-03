package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cejy implements cega {
    private static final cskc b = cskc.g("BugleCms", "CmsRestoreBackupKeyDelegate");
    public final axdf a;
    private final cscn c;
    private final ffhd d;

    public cejy(cscn cscnVar, axdf axdfVar, ffhd ffhdVar) {
        cscnVar.getClass();
        axdfVar.getClass();
        ffhdVar.getClass();
        this.c = cscnVar;
        this.a = axdfVar;
        this.d = ffhdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (defpackage.ffra.a(r10, r2, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.cega
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Exception r8, defpackage.cefr r9, defpackage.ffgu r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.cejx
            if (r0 == 0) goto L13
            r0 = r10
            cejx r0 = (defpackage.cejx) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cejx r0 = new cejx
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.ffci.b(r10)
            return r10
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            cefr r9 = r0.e
            java.lang.Object r8 = r0.a
            defpackage.ffci.b(r10)
            goto L6f
        L3e:
            defpackage.ffci.b(r10)
            return r10
        L42:
            defpackage.ffci.b(r10)
            boolean r10 = r8 instanceof defpackage.csgw
            if (r10 == 0) goto L57
            csgw r8 = (defpackage.csgw) r8
            int r9 = r9.b
            r0.d = r5
            java.lang.Object r8 = r7.d(r8, r9, r0)
            if (r8 != r1) goto L56
            goto L7f
        L56:
            return r8
        L57:
            ffhd r10 = r7.d
            ffhd r10 = defpackage.ekxi.a(r10)
            cejw r2 = new cejw
            r2.<init>(r6, r7, r9, r8)
            r0.a = r8
            r0.e = r9
            r0.d = r4
            java.lang.Object r10 = defpackage.ffra.a(r10, r2, r0)
            if (r10 != r1) goto L6f
            goto L7f
        L6f:
            cefz r10 = defpackage.cefz.a
            r0.a = r6
            r0.e = r6
            r0.d = r3
            java.lang.Exception r8 = (java.lang.Exception) r8
            java.lang.Object r8 = r10.a(r8, r9, r0)
            if (r8 != r1) goto L80
        L7f:
            return r1
        L80:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cejy.a(java.lang.Exception, cefr, ffgu):java.lang.Object");
    }

    @Override // defpackage.cega
    public final Object b(boolean z, cefr cefrVar, ffgu ffguVar) {
        return ffcu.a;
    }

    @Override // defpackage.cega
    public final Object c(csdq csdqVar) {
        int size = csdqVar.a.size();
        if (size == 0) {
            b.p("No BACKUP_KEY in CMS. This is a fresh backup or Backup Key may not been backed up successfully.");
            return ffcu.a;
        }
        if (size == 1) {
            return ffcu.a;
        }
        if (!((Boolean) ((cfup) csgj.Z.get()).e()).booleanValue()) {
            b.n("Attempted to restore more than 1 BACKUP_KEY");
        }
        return ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.csgw r7, int r8, defpackage.ffgu r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.cejv
            if (r0 == 0) goto L13
            r0 = r9
            cejv r0 = (defpackage.cejv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cejv r0 = new cejv
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            int r8 = r0.a
            csgw r7 = r0.f
            cejy r2 = r0.e
            defpackage.ffci.b(r9)
            goto L56
        L3c:
            defpackage.ffci.b(r9)
            cscn r9 = r6.c
            int r2 = r7.a
            elfl r9 = r9.a(r2)
            r0.e = r6
            r0.f = r7
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = defpackage.fgfz.c(r9, r0)
            if (r9 == r1) goto L7b
            r2 = r6
        L56:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L61
            csgx r7 = defpackage.csgx.NO_RETRY
            return r7
        L61:
            ffhd r9 = r2.d
            ffhd r9 = defpackage.ekxi.a(r9)
            ceju r4 = new ceju
            r5 = 0
            r4.<init>(r5, r2, r8, r7)
            r0.e = r5
            r0.f = r5
            r0.d = r3
            java.lang.Object r7 = defpackage.ffra.a(r9, r4, r0)
            if (r7 != r1) goto L7a
            goto L7b
        L7a:
            return r7
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cejy.d(csgw, int, ffgu):java.lang.Object");
    }
}
