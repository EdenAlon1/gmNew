package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class hvq {
    public static final Object a(AtomicReference atomicReference) {
        hvn hvnVar = (hvn) atomicReference.get();
        if (hvnVar != null) {
            return hvnVar.b;
        }
        return null;
    }

    public static final Object b(AtomicReference atomicReference, ffji ffjiVar, ffjm ffjmVar, ffgu ffguVar) {
        return ffsl.a(new hvp(ffjiVar, atomicReference, ffjmVar, null), ffguVar);
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
