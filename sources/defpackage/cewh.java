package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cewh extends ffhv implements ffjm {
    final /* synthetic */ cewk a;
    final /* synthetic */ poj b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cewh(ffgu ffguVar, cewk cewkVar, poj pojVar) {
        super(2, ffguVar);
        this.a = cewkVar;
        this.b = pojVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cewh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r9.e != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (r0.getIntExtra("plugged", 0) <= 0) goto L10;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            defpackage.ffci.b(r9)
            java.lang.Object r9 = r8.c
            ffsk r9 = (defpackage.ffsk) r9
            poj r9 = r8.b
            boolean r0 = r9.e
            r1 = 1
            if (r0 != 0) goto L13
            boolean r0 = r9.c
            if (r0 != 0) goto L13
            goto L75
        L13:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            java.lang.String r3 = "evaluateBatteryConstraints"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueConstraintEvaluator"
            java.lang.String r5 = "WorkQueueConstraintEvaluator.kt"
            r6 = 0
            if (r0 >= r2) goto L35
            enru r9 = defpackage.cewk.a
            ensk r9 = r9.j()
            r0 = 55
            ensk r9 = r9.h(r4, r3, r0, r5)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r0 = "Android version is too low to check battery constraints"
            r9.q(r0)
        L33:
            r1 = r6
            goto L75
        L35:
            cewk r0 = r8.a
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r7 = "android.intent.action.BATTERY_CHANGED"
            r2.<init>(r7)
            android.content.Context r0 = r0.c
            r7 = 0
            android.content.Intent r0 = defpackage.koa.g(r0, r7, r2)
            if (r0 != 0) goto L5b
            enru r9 = defpackage.cewk.a
            ensk r9 = r9.j()
            r0 = 67
            ensk r9 = r9.h(r4, r3, r0, r5)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r0 = "Android returned null for ACTION_BATTERY_CHANGED sticky intent"
            r9.q(r0)
            goto L33
        L5b:
            java.lang.String r2 = "battery_low"
            boolean r2 = r0.getBooleanExtra(r2, r6)
            if (r2 == 0) goto L68
            boolean r2 = r9.e
            if (r2 == 0) goto L68
            goto L33
        L68:
            boolean r9 = r9.c
            if (r9 != 0) goto L6d
            goto L75
        L6d:
            java.lang.String r9 = "plugged"
            int r9 = r0.getIntExtra(r9, r6)
            if (r9 <= 0) goto L33
        L75:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cewh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cewh cewhVar = new cewh(ffguVar, this.a, this.b);
        cewhVar.c = obj;
        return cewhVar;
    }
}
