package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fbbj extends fbbl {
    private final Throwable a;

    public fbbj(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.fbbl
    public final Object a() {
        throw new ExecutionException(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fbbj) {
            return this.a.equals(((fbbj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Produced[failed with " + this.a.getClass().getCanonicalName() + "]";
    }
}
