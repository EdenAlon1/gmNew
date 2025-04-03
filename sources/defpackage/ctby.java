package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctby implements ctbj, ctbr {
    public final AtomicReference a;
    private final ctbl b;

    public ctby(ctbk ctbkVar, Object obj) {
        this.b = ctbkVar.a(this);
        this.a = new AtomicReference(obj);
    }

    public static final void h(Object obj) {
        if (obj == null) {
            throw new IllegalStateException("Cannot set TrackedAtomicReference to null. Consider TrackedAtomicReference<Optional<T>> instead.");
        }
    }

    public final ctbx a(String str, ctbf ctbfVar) {
        return this.b.a(ctbfVar, "TrackedAtomicReference Subscribe", str, "TrackedAtomicReference Unsubscribe");
    }

    public final Object d() {
        return this.a.get();
    }

    public final void e() {
        ekzz f = eleg.f("Update TrackedAtomicReference");
        try {
            this.b.b(this.a.get(), f);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f(Object obj) {
        h(obj);
        this.a.set(obj);
        e();
    }

    public final void g(Object obj, Object obj2) {
        AtomicReference atomicReference;
        h(obj2);
        do {
            atomicReference = this.a;
            if (atomicReference.compareAndSet(obj, obj2)) {
                e();
                return;
            }
        } while (atomicReference.get() == obj);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.ctbj
    public final /* synthetic */ void fN() {
    }

    @Override // defpackage.ctbj
    public final /* synthetic */ void fO() {
    }
}
