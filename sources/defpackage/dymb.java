package defpackage;

import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dymb extends TimerTask {
    final /* synthetic */ dzpt a;
    final /* synthetic */ dzpg b;
    final /* synthetic */ dyme c;

    public dymb(dyme dymeVar, dzpt dzptVar, dzpg dzpgVar) {
        this.a = dzptVar;
        this.b = dzpgVar;
        this.c = dymeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        if (r4 < ((java.lang.Long) ((java.util.Map) r1.z.get(r2)).get(r3)).longValue()) goto L12;
     */
    @Override // java.util.TimerTask, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            dyme r0 = r9.c
            java.lang.Object r0 = r0.y
            monitor-enter(r0)
            dyme r1 = r9.c     // Catch: java.lang.Throwable -> L65
            dzpt r2 = r9.a     // Catch: java.lang.Throwable -> L65
            dzpg r3 = r9.b     // Catch: java.lang.Throwable -> L65
            defpackage.dyhj.a()     // Catch: java.lang.Throwable -> L65
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L65
            java.util.Map r6 = r1.z     // Catch: java.lang.Throwable -> L65
            boolean r6 = r6.containsKey(r2)     // Catch: java.lang.Throwable -> L65
            if (r6 == 0) goto L3f
            java.util.Map r6 = r1.z     // Catch: java.lang.Throwable -> L65
            java.lang.Object r6 = r6.get(r2)     // Catch: java.lang.Throwable -> L65
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Throwable -> L65
            boolean r6 = r6.containsKey(r3)     // Catch: java.lang.Throwable -> L65
            if (r6 != 0) goto L29
            goto L3f
        L29:
            java.util.Map r1 = r1.z     // Catch: java.lang.Throwable -> L65
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L65
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L65
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L65
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L65
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L65
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 < 0) goto L63
        L3f:
            dyme r1 = r9.c     // Catch: java.lang.Throwable -> L65
            dyiu r1 = r1.g     // Catch: java.lang.Throwable -> L65
            dzpt r2 = r9.a     // Catch: java.lang.Throwable -> L65
            dzpg r3 = r9.b     // Catch: java.lang.Throwable -> L65
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L65
            defpackage.dyhj.a()     // Catch: java.lang.Throwable -> L65
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L65
            long r7 = defpackage.dyme.a     // Catch: java.lang.Throwable -> L65
            long r5 = r5 - r7
            long r4 = r4.toMicros(r5)     // Catch: java.lang.Throwable -> L65
            r1.d(r2, r3, r4)     // Catch: java.lang.Throwable -> L65
            dyme r1 = r9.c     // Catch: java.lang.Throwable -> L65
            dzpt r2 = r9.a     // Catch: java.lang.Throwable -> L65
            dzpg r3 = r9.b     // Catch: java.lang.Throwable -> L65
            r1.g(r2, r3)     // Catch: java.lang.Throwable -> L65
        L63:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
            return
        L65:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dymb.run():void");
    }
}
