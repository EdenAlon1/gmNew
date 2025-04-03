package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qow {
    public static final boolean a = qox.b;
    private final List b = new ArrayList();
    private boolean c = false;

    public final synchronized void a(String str, long j) {
        if (this.c) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.b.add(new qov(str, j, SystemClock.elapsedRealtime()));
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    public final synchronized void b(java.lang.String r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 1
            r10.c = r0     // Catch: java.lang.Throwable -> L7f
            java.util.List r1 = r10.b     // Catch: java.lang.Throwable -> L7f
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L7f
            r2 = 0
            r4 = 0
            if (r1 != 0) goto L11
            r7 = r2
            goto L2c
        L11:
            java.util.List r1 = r10.b     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L7f
            qov r1 = (defpackage.qov) r1     // Catch: java.lang.Throwable -> L7f
            long r5 = r1.c     // Catch: java.lang.Throwable -> L7f
            java.util.List r1 = r10.b     // Catch: java.lang.Throwable -> L7f
            int r7 = r1.size()     // Catch: java.lang.Throwable -> L7f
            int r7 = r7 + (-1)
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Throwable -> L7f
            qov r1 = (defpackage.qov) r1     // Catch: java.lang.Throwable -> L7f
            long r7 = r1.c     // Catch: java.lang.Throwable -> L7f
            long r7 = r7 - r5
        L2c:
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 > 0) goto L31
            goto L7d
        L31:
            java.util.List r1 = r10.b     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L7f
            qov r1 = (defpackage.qov) r1     // Catch: java.lang.Throwable -> L7f
            long r1 = r1.c     // Catch: java.lang.Throwable -> L7f
            java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L7f
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L7f
            r6[r4] = r3     // Catch: java.lang.Throwable -> L7f
            r6[r0] = r11     // Catch: java.lang.Throwable -> L7f
            java.lang.String r11 = "(%-4d ms) %s"
            defpackage.qox.a(r11, r6)     // Catch: java.lang.Throwable -> L7f
            java.util.List r11 = r10.b     // Catch: java.lang.Throwable -> L7f
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L7f
        L51:
            boolean r3 = r11.hasNext()     // Catch: java.lang.Throwable -> L7f
            if (r3 == 0) goto L7d
            java.lang.Object r3 = r11.next()     // Catch: java.lang.Throwable -> L7f
            qov r3 = (defpackage.qov) r3     // Catch: java.lang.Throwable -> L7f
            long r6 = r3.c     // Catch: java.lang.Throwable -> L7f
            long r1 = r6 - r1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L7f
            long r8 = r3.b     // Catch: java.lang.Throwable -> L7f
            java.lang.Long r2 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r3 = r3.a     // Catch: java.lang.Throwable -> L7f
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L7f
            r8[r4] = r1     // Catch: java.lang.Throwable -> L7f
            r8[r0] = r2     // Catch: java.lang.Throwable -> L7f
            r8[r5] = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "(+%-4d) [%2d] %s"
            defpackage.qox.a(r1, r8)     // Catch: java.lang.Throwable -> L7f
            r1 = r6
            goto L51
        L7d:
            monitor-exit(r10)
            return
        L7f:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L7f
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qow.b(java.lang.String):void");
    }

    protected final void finalize() {
        if (this.c) {
            return;
        }
        b("Request on the loose");
        qox.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
