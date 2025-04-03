package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiow implements aigt {
    public final Optional a;
    private final ffsk b;
    private final dgym c;
    private final dqli d;
    private final ctud e;

    public aiow(Optional optional, ffsk ffskVar, dgym dgymVar, dqli dqliVar, ctud ctudVar) {
        optional.getClass();
        ffskVar.getClass();
        dgymVar.getClass();
        ctudVar.getClass();
        this.a = optional;
        this.b = ffskVar;
        this.c = dgymVar;
        this.d = dqliVar;
        this.e = ctudVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.aiot
            if (r0 == 0) goto L13
            r0 = r6
            aiot r0 = (defpackage.aiot) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aiot r0 = new aiot
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L50
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.ffci.b(r6)
            dgym r6 = r5.c
            r2 = 100
            dhre r6 = r6.c(r2)
            aior r2 = new aior
            r2.<init>()
            aios r4 = new aios
            r4.<init>()
            r6.a(r4)
            r0.c = r3
            java.lang.Object r6 = defpackage.fgju.a(r6, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            android.location.Location r6 = (android.location.Location) r6
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiow.b(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        if (r7.invoke(r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.aigt
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.aioq r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.aiou
            if (r0 == 0) goto L13
            r0 = r8
            aiou r0 = (defpackage.aiou) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aiou r0 = new aiou
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r8)
            goto L8e
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            aioq r7 = r0.e
            aiow r2 = r0.d
            defpackage.ffci.b(r8)
            goto L5f
        L3a:
            defpackage.ffci.b(r8)
            j$.util.Optional r8 = r6.a
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L8e
            boolean r8 = r7.a
            if (r8 == 0) goto L66
            dqli r8 = r6.d
            dqlf r2 = defpackage.dqlf.b
            java.util.List r2 = defpackage.ffdx.b(r2)
            r0.d = r6
            r0.e = r7
            r0.c = r4
            java.lang.Object r8 = r8.b(r2, r0)
            if (r8 != r1) goto L5e
            goto L8d
        L5e:
            r2 = r6
        L5f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            goto L6d
        L66:
            ctud r8 = r6.e
            boolean r8 = r8.j()
            r2 = r6
        L6d:
            if (r8 == 0) goto L8e
            ffsk r8 = r2.b
            aiov r4 = new aiov
            r5 = 0
            r4.<init>(r2, r5)
            r2 = 3
            defpackage.axol.k(r8, r5, r4, r2)
            boolean r8 = r7.a
            if (r8 == 0) goto L8e
            ffji r7 = r7.b
            r0.d = r5
            r0.e = r5
            r0.c = r3
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L8e
        L8d:
            return r1
        L8e:
            ffcu r7 = defpackage.ffcu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiow.a(aioq, ffgu):java.lang.Object");
    }
}
