package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bjo implements Runnable {
    final /* synthetic */ bjp a;

    public bjo(bjp bjpVar) {
        this.a = bjpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r0.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        defpackage.avw.d("SequentialExecutor", defpackage.a.n(r0, "Exception while executing runnable "), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        if (r1 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0038, code lost:
    
        r0 = java.lang.Thread.currentThread();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0018, code lost:
    
        r0.interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            r2 = 1
            bjp r3 = r10.a     // Catch: java.lang.Throwable -> L49
            java.util.Deque r3 = r3.a     // Catch: java.lang.Throwable -> L49
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L25
            bjp r0 = r10.a     // Catch: java.lang.Throwable -> L58
            int r4 = r0.c     // Catch: java.lang.Throwable -> L58
            r5 = 4
            if (r4 != r5) goto L1c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L3d
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L65
        L18:
            r0.interrupt()     // Catch: java.lang.Error -> L65
            goto L3d
        L1c:
            long r6 = r0.b     // Catch: java.lang.Throwable -> L58
            r8 = 1
            long r6 = r6 + r8
            r0.b = r6     // Catch: java.lang.Throwable -> L58
            r0.c = r5     // Catch: java.lang.Throwable -> L58
        L25:
            bjp r0 = r10.a     // Catch: java.lang.Throwable -> L58
            java.util.Deque r0 = r0.a     // Catch: java.lang.Throwable -> L58
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L58
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto L3e
            bjp r0 = r10.a     // Catch: java.lang.Throwable -> L58
            r0.c = r2     // Catch: java.lang.Throwable -> L58
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L3d
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L65
            goto L18
        L3d:
            return
        L3e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L58
            boolean r3 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L49
            r1 = r1 | r3
            r0.run()     // Catch: java.lang.Throwable -> L49 java.lang.RuntimeException -> L4b
        L47:
            r0 = r2
            goto L2
        L49:
            r0 = move-exception
            goto L5b
        L4b:
            r3 = move-exception
            java.lang.String r4 = "SequentialExecutor"
            java.lang.String r5 = "Exception while executing runnable "
            java.lang.String r0 = defpackage.a.n(r0, r5)     // Catch: java.lang.Throwable -> L49
            defpackage.avw.d(r4, r0, r3)     // Catch: java.lang.Throwable -> L49
            goto L47
        L58:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L49
        L5b:
            if (r1 == 0) goto L64
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L65
            r1.interrupt()     // Catch: java.lang.Error -> L65
        L64:
            throw r0     // Catch: java.lang.Error -> L65
        L65:
            r0 = move-exception
            bjp r1 = r10.a
            java.util.Deque r1 = r1.a
            monitor-enter(r1)
            bjp r3 = r10.a     // Catch: java.lang.Throwable -> L71
            r3.c = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L71
            throw r0
        L71:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L71
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjo.run():void");
    }
}
