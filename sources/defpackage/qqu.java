package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qqu implements Callable {
    final /* synthetic */ qqz a;

    public qqu(qqz qqzVar) {
        this.a = qqzVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        synchronized (this.a) {
            qqz qqzVar = this.a;
            if (qqzVar.f == null) {
                return null;
            }
            qqzVar.h();
            if (this.a.i()) {
                this.a.f();
                this.a.h = 0;
            }
            return null;
        }
    }
}
