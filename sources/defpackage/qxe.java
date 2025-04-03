package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class qxe {
    private final Queue a;

    public qxe() {
        char[] cArr = rkh.a;
        this.a = new ArrayDeque(20);
    }

    public abstract qxq a();

    final qxq b() {
        qxq qxqVar = (qxq) this.a.poll();
        return qxqVar == null ? a() : qxqVar;
    }

    public final void c(qxq qxqVar) {
        if (this.a.size() < 20) {
            this.a.offer(qxqVar);
        }
    }
}
