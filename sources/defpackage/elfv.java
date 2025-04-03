package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class elfv {
    private final AtomicReference a;

    public elfv(Object obj) {
        this.a = new AtomicReference(obj);
    }

    public abstract Object a(Object obj, Object obj2);

    final Object b() {
        return this.a.get();
    }

    final void c(Object obj) {
        if (obj != null) {
            while (true) {
                Object b = b();
                AtomicReference atomicReference = this.a;
                Object a = b != null ? a(b, obj) : obj;
                while (!atomicReference.compareAndSet(b, a)) {
                    if (atomicReference.get() != b) {
                        break;
                    }
                }
                return;
            }
        }
    }
}
