package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btd implements AutoCloseable {
    public final AtomicBoolean a;
    public final long b;
    public final brg c;
    private final btb d;
    private final bht e;

    public btd(btb btbVar, long j, brg brgVar, boolean z) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.a = atomicBoolean;
        bht a = bht.a();
        this.e = a;
        this.d = btbVar;
        this.b = j;
        this.c = brgVar;
        if (z) {
            atomicBoolean.set(true);
        } else {
            a.c("stop");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a(int r11, java.lang.Throwable r12) {
        /*
            r10 = this;
            java.lang.String r0 = "stop() called on a recording that is no longer active: "
            bht r1 = r10.e
            r1.b()
            java.util.concurrent.atomic.AtomicBoolean r1 = r10.a
            r2 = 1
            boolean r1 = r1.getAndSet(r2)
            if (r1 == 0) goto L12
            goto La7
        L12:
            btb r3 = r10.d
            java.lang.Object r1 = r3.i
            monitor-enter(r1)
            bsv r2 = r3.o     // Catch: java.lang.Throwable -> La8
            boolean r2 = defpackage.btb.A(r10, r2)     // Catch: java.lang.Throwable -> La8
            if (r2 != 0) goto L3c
            bsv r2 = r3.n     // Catch: java.lang.Throwable -> La8
            boolean r2 = defpackage.btb.A(r10, r2)     // Catch: java.lang.Throwable -> La8
            if (r2 != 0) goto L3c
            java.lang.String r11 = "Recorder"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La8
            r12.<init>(r0)     // Catch: java.lang.Throwable -> La8
            brg r0 = r10.c     // Catch: java.lang.Throwable -> La8
            r12.append(r0)     // Catch: java.lang.Throwable -> La8
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> La8
            defpackage.avw.a(r11, r12)     // Catch: java.lang.Throwable -> La8
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La8
            return
        L3c:
            bta r0 = r3.l     // Catch: java.lang.Throwable -> La8
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> La8
            r9 = 0
            switch(r0) {
                case 0: goto L85;
                case 1: goto L71;
                case 2: goto L71;
                case 3: goto L85;
                case 4: goto L53;
                case 5: goto L53;
                case 6: goto L49;
                case 7: goto L49;
                default: goto L46;
            }     // Catch: java.lang.Throwable -> La8
        L46:
            r7 = r11
            r8 = r12
            goto L8d
        L49:
            bsv r0 = r3.n     // Catch: java.lang.Throwable -> La8
            boolean r0 = defpackage.btb.A(r10, r0)     // Catch: java.lang.Throwable -> La8
            defpackage.ksw.c(r0)     // Catch: java.lang.Throwable -> La8
            goto L46
        L53:
            bta r0 = defpackage.bta.STOPPING     // Catch: java.lang.Throwable -> La8
            r3.p(r0)     // Catch: java.lang.Throwable -> La8
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> La8
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> La8
            long r5 = r0.toMicros(r4)     // Catch: java.lang.Throwable -> La8
            bsv r4 = r3.n     // Catch: java.lang.Throwable -> La8
            java.util.concurrent.Executor r0 = r3.h     // Catch: java.lang.Throwable -> La8
            brq r2 = new brq     // Catch: java.lang.Throwable -> La8
            r7 = r11
            r8 = r12
            r2.<init>()     // Catch: java.lang.Throwable -> La8
            r0.execute(r2)     // Catch: java.lang.Throwable -> La8
            goto L8d
        L71:
            r7 = r11
            r8 = r12
            bsv r11 = r3.o     // Catch: java.lang.Throwable -> La8
            boolean r11 = defpackage.btb.A(r10, r11)     // Catch: java.lang.Throwable -> La8
            defpackage.ksw.c(r11)     // Catch: java.lang.Throwable -> La8
            bsv r11 = r3.o     // Catch: java.lang.Throwable -> La8
            r3.o = r9     // Catch: java.lang.Throwable -> La8
            r3.m()     // Catch: java.lang.Throwable -> La8
            r9 = r11
            goto L8d
        L85:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La8
            java.lang.String r12 = "Calling stop() while idling or initializing is invalid."
            r11.<init>(r12)     // Catch: java.lang.Throwable -> La8
            throw r11     // Catch: java.lang.Throwable -> La8
        L8d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La8
            if (r9 == 0) goto La7
            r11 = 10
            if (r7 != r11) goto L9b
            java.lang.String r11 = "Recorder"
            java.lang.String r12 = "Recording was stopped due to recording being garbage collected before any valid data has been produced."
            defpackage.avw.c(r11, r12)
        L9b:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r12 = "Recording was stopped before any data could be produced."
            r11.<init>(r12, r8)
            r12 = 8
            r3.j(r9, r12, r11)
        La7:
            return
        La8:
            r0 = move-exception
            r11 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La8
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btd.a(int, java.lang.Throwable):void");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a(0, null);
    }

    protected final void finalize() {
        try {
            this.e.d();
            a(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }
}
