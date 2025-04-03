package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elpj implements elpf {
    final /* synthetic */ kfb a;
    final /* synthetic */ Function b;

    public elpj(kfb kfbVar, Function function) {
        this.a = kfbVar;
        this.b = function;
    }

    @Override // defpackage.elpf
    public final void a(Throwable th) {
        this.a.c(th);
    }

    @Override // defpackage.elpf
    public final void b(Object obj) {
        Object apply;
        try {
            kfb kfbVar = this.a;
            apply = this.b.apply(obj);
            kfbVar.b(apply);
        } catch (Throwable th) {
            if (th instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            this.a.c(th);
        }
    }
}
