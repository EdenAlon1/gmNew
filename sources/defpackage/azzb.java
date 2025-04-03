package defpackage;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azzb implements Executor {
    public final int a;
    private final Executor e;
    public final Object b = new Object();
    public int d = 0;
    public final Deque c = new ConcurrentLinkedDeque();

    public azzb(Executor executor, int i) {
        this.e = executor;
        this.a = i;
    }

    public final void a() {
        emxf.l(!Thread.holdsLock(this.b));
        axnw.h(elfo.f(new Runnable() { // from class: azza
            /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
            
                defpackage.emxf.l(!java.lang.Thread.holdsLock(r0.b));
                r4.run();
                r4 = (java.lang.Runnable) r0.c.pollFirst();
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x0077, code lost:
            
                if (r4 != null) goto L122;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x0079, code lost:
            
                r3 = r0.b;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
            
                monitor-enter(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x007e, code lost:
            
                if (r0.d <= 0) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x0080, code lost:
            
                r4 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x0083, code lost:
            
                defpackage.emxf.l(r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x008a, code lost:
            
                if (r0.d > r0.a) goto L50;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x008c, code lost:
            
                r4 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x008f, code lost:
            
                defpackage.emxf.l(r4);
                r4 = r0.d - 1;
                r0.d = r4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0098, code lost:
            
                if (r4 < 0) goto L54;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x009a, code lost:
            
                r4 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x009d, code lost:
            
                defpackage.emxf.l(r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x00a4, code lost:
            
                if (r0.d >= r0.a) goto L58;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x00a6, code lost:
            
                r1 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x00a7, code lost:
            
                defpackage.emxf.l(r1);
                r1 = r0.c.isEmpty();
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x00b0, code lost:
            
                monitor-exit(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x00b1, code lost:
            
                if (r1 != false) goto L124;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x00b3, code lost:
            
                r0.a();
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x00b6, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x009c, code lost:
            
                r4 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:0x008e, code lost:
            
                r4 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
            
                r4 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:0x00ba, code lost:
            
                r3 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:71:0x00bb, code lost:
            
                r5 = true;
             */
            /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 270
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.azza.run():void");
            }
        }, this.e));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i;
        int i2;
        this.c.addLast(runnable);
        synchronized (this.b) {
            boolean z = true;
            emxf.l(this.d >= 0);
            if (this.d > this.a) {
                z = false;
            }
            emxf.l(z);
            i = this.d;
            i2 = this.a;
        }
        if (i < i2) {
            a();
        }
    }
}
