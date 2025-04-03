package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ersa implements Runnable {
    Runnable a;
    final /* synthetic */ ersb b;

    public ersa(ersb ersbVar) {
        this.b = ersbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        r11.a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        r11.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        defpackage.ersb.a.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.SequentialExecutor$QueueWorker", "workOnQueue", "Exception while executing runnable " + java.lang.String.valueOf(r11.a), (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        r11.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0038, code lost:
    
        if (r1 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        r0 = java.lang.Thread.currentThread();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            r2 = 1
            ersb r3 = r11.b     // Catch: java.lang.Throwable -> L50
            java.util.Deque r3 = r3.b     // Catch: java.lang.Throwable -> L50
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L25
            ersb r0 = r11.b     // Catch: java.lang.Throwable -> L82
            int r4 = r0.d     // Catch: java.lang.Throwable -> L82
            r5 = 4
            if (r4 != r5) goto L1c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L82
            if (r1 == 0) goto L3f
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L8f
        L18:
            r0.interrupt()     // Catch: java.lang.Error -> L8f
            goto L3f
        L1c:
            long r6 = r0.c     // Catch: java.lang.Throwable -> L82
            r8 = 1
            long r6 = r6 + r8
            r0.c = r6     // Catch: java.lang.Throwable -> L82
            r0.d = r5     // Catch: java.lang.Throwable -> L82
        L25:
            ersb r0 = r11.b     // Catch: java.lang.Throwable -> L82
            java.util.Deque r0 = r0.b     // Catch: java.lang.Throwable -> L82
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L82
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L82
            r11.a = r0     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto L40
            ersb r0 = r11.b     // Catch: java.lang.Throwable -> L82
            r0.d = r2     // Catch: java.lang.Throwable -> L82
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L82
            if (r1 == 0) goto L3f
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L8f
            goto L18
        L3f:
            return
        L40:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L82
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L50
            r1 = r1 | r0
            r3 = 0
            java.lang.Runnable r0 = r11.a     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            r0.run()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            r11.a = r3     // Catch: java.lang.Throwable -> L50
        L4e:
            r0 = r2
            goto L2
        L50:
            r0 = move-exception
            goto L85
        L52:
            r0 = move-exception
            goto L7f
        L54:
            r0 = move-exception
            r9 = r0
            erri r0 = defpackage.ersb.a     // Catch: java.lang.Throwable -> L52
            java.util.logging.Logger r4 = r0.a()     // Catch: java.lang.Throwable -> L52
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = "com.google.common.util.concurrent.SequentialExecutor$QueueWorker"
            java.lang.String r7 = "workOnQueue"
            java.lang.Runnable r0 = r11.a     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r8.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r10 = "Exception while executing runnable "
            r8.append(r10)     // Catch: java.lang.Throwable -> L52
            r8.append(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L52
            r4.logp(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L52
            r11.a = r3     // Catch: java.lang.Throwable -> L50
            goto L4e
        L7f:
            r11.a = r3     // Catch: java.lang.Throwable -> L50
            throw r0     // Catch: java.lang.Throwable -> L50
        L82:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L82
            throw r0     // Catch: java.lang.Throwable -> L50
        L85:
            if (r1 == 0) goto L8e
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L8f
            r1.interrupt()     // Catch: java.lang.Error -> L8f
        L8e:
            throw r0     // Catch: java.lang.Error -> L8f
        L8f:
            r0 = move-exception
            ersb r1 = r11.b
            java.util.Deque r1 = r1.b
            monitor-enter(r1)
            ersb r3 = r11.b     // Catch: java.lang.Throwable -> L9b
            r3.d = r2     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9b
            throw r0
        L9b:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ersa.run():void");
    }

    public final String toString() {
        Runnable runnable = this.a;
        if (runnable != null) {
            return a.b(runnable, "SequentialExecutorWorker{running=", "}");
        }
        int i = this.b.d;
        return a.a(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE", "SequentialExecutorWorker{state=", "}");
    }
}
