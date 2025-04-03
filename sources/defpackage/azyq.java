package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azyq {
    public final Deque b = new ArrayDeque();
    public final Object c = new Object();
    public final Lock d = new ReentrantLock(true);
    public final emyl a = emys.a(new emyl() { // from class: azyo
        @Override // defpackage.emyl
        public final Object get() {
            return false;
        }
    });

    final void a(azys azysVar) {
        if (!((Boolean) this.a.get()).booleanValue()) {
            emxf.l(azysVar == null);
            return;
        }
        azysVar.getClass();
        synchronized (this.c) {
            emxf.l(this.b.remove(azysVar));
        }
    }
}
