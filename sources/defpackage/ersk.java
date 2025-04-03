package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ersk extends errh {
    final /* synthetic */ ersl a;
    private final Callable b;

    public ersk(ersl erslVar, Callable callable) {
        this.a = erslVar;
        callable.getClass();
        this.b = callable;
    }

    @Override // defpackage.errh
    public final Object a() {
        return this.b.call();
    }

    @Override // defpackage.errh
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.errh
    public final void d(Throwable th) {
        this.a.setException(th);
    }

    @Override // defpackage.errh
    public final void e(Object obj) {
        this.a.set(obj);
    }

    @Override // defpackage.errh
    public final boolean g() {
        return this.a.isDone();
    }
}
