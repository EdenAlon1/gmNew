package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ral {
    private static final Queue a;
    private int b;
    private int c;
    private Object d;

    static {
        char[] cArr = rkh.a;
        a = new ArrayDeque(0);
    }

    private ral() {
    }

    static ral a(Object obj, int i, int i2) {
        ral ralVar;
        Queue queue = a;
        synchronized (queue) {
            ralVar = (ral) queue.poll();
        }
        if (ralVar == null) {
            ralVar = new ral();
        }
        ralVar.d = obj;
        ralVar.c = i;
        ralVar.b = i2;
        return ralVar;
    }

    public final void b() {
        Queue queue = a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ral) {
            ral ralVar = (ral) obj;
            if (this.c == ralVar.c && this.b == ralVar.b && this.d.equals(ralVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.d.hashCode();
    }
}
