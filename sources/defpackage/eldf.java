package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eldf implements Callable {
    final /* synthetic */ elat a;
    final /* synthetic */ Callable b;

    public eldf(elat elatVar, Callable callable) {
        this.a = elatVar;
        this.b = callable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        elat i = ekyf.i(ekyf.b(), this.a);
        try {
            return this.b.call();
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
