package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qwh {
    final rih a;
    final Executor b;

    public qwh(rih rihVar, Executor executor) {
        this.a = rihVar;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qwh) {
            return this.a.equals(((qwh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
