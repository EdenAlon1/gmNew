package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlhv implements dlhj, dlcr {
    private final dkyw a;
    private final dlhw b;
    private final dlhf c;
    private final dlcq d;
    private final ConcurrentHashMap e;

    public dlhv(dkyw dkywVar, dlhw dlhwVar, dlhf dlhfVar, dlcq dlcqVar) {
        dkywVar.getClass();
        this.a = dkywVar;
        this.b = dlhwVar;
        this.c = dlhfVar;
        this.d = dlcqVar;
        this.e = new ConcurrentHashMap();
    }

    @Override // defpackage.dkyy
    public final Object a(ffgu ffguVar) {
        return new dkyx(this.a.b());
    }

    @Override // defpackage.dlhj
    public final Object b(dlgb dlgbVar, dlfy dlfyVar, ffgu ffguVar) {
        Object obj = this.e.get(dlgbVar);
        if (obj != null) {
            return ffsl.a(new dlhx((dlhy) obj, dlfyVar, null), ffguVar);
        }
        throw new IllegalStateException("loadProtections must be called before classify");
    }

    @Override // defpackage.dlhj
    public final Object c(dlgb dlgbVar, ffgu ffguVar) {
        dlhy dlhyVar = (dlhy) this.e.remove(dlgbVar);
        if (dlhyVar != null) {
            dlhyVar.close();
        }
        return ffcu.a;
    }

    @Override // defpackage.dlhj
    public final Object d(dlgb dlgbVar, ffgu ffguVar) {
        return Boolean.valueOf(this.e.get(dlgbVar) != null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.dlhj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.dlgb r11, defpackage.dlhe r12, defpackage.ffgu r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.dlhu
            if (r0 == 0) goto L13
            r0 = r13
            dlhu r0 = (defpackage.dlhu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dlhu r0 = new dlhu
            r0.<init>(r10, r13)
        L18:
            r8 = r0
            java.lang.Object r13 = r8.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.c
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            dlgb r11 = r8.e
            dlhv r12 = r8.d
            defpackage.ffci.b(r13)
            goto L6d
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            defpackage.ffci.b(r13)
            dlhf r13 = r10.c
            r8.d = r10
            r8.e = r11
            r8.c = r2
            boolean r1 = r12 instanceof defpackage.dlhi
            if (r1 == 0) goto L5b
            dlhi r12 = (defpackage.dlhi) r12
            java.util.List r4 = r12.a
            java.util.List r5 = r12.b
            eyee r6 = r12.c
            java.util.List r12 = r12.d
            r1 = r13
            dlgz r1 = (defpackage.dlgz) r1
            r7 = 0
            r9 = 32
            r3 = 0
            r2 = r11
            java.lang.Object r11 = defpackage.dlgz.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L59:
            r13 = r11
            goto L69
        L5b:
            r2 = r11
            boolean r11 = r12 instanceof defpackage.dlhd
            if (r11 == 0) goto L94
            dlhd r12 = (defpackage.dlhd) r12
            dlgz r13 = (defpackage.dlgz) r13
            java.lang.Object r11 = r13.a(r2, r12, r8)
            goto L59
        L69:
            if (r13 == r0) goto L93
            r12 = r10
            r11 = r2
        L6d:
            dlhg r13 = (defpackage.dlhg) r13
            j$.util.concurrent.ConcurrentHashMap r0 = r12.e
            java.lang.Object r0 = r0.get(r11)
            dlhy r0 = (defpackage.dlhy) r0
            if (r0 == 0) goto L7c
            r0.close()
        L7c:
            j$.util.concurrent.ConcurrentHashMap r0 = r12.e
            dlhw r12 = r12.b
            r11.getClass()
            r13.getClass()
            dlhy r12 = new dlhy
            ffqg r1 = defpackage.ffqg.a
            r12.<init>(r1, r13)
            r0.put(r11, r12)
            ffcu r11 = defpackage.ffcu.a
            return r11
        L93:
            return r0
        L94:
            ffcd r11 = new ffcd
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlhv.e(dlgb, dlhe, ffgu):java.lang.Object");
    }

    @Override // defpackage.dlcr
    public final Object i(dlhd dlhdVar, ffgu ffguVar) {
        return this.d.i(dlhdVar, ffguVar);
    }
}
