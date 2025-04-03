package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erpm extends erpn {
    final /* synthetic */ erpo a;
    private final Callable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erpm(erpo erpoVar, Callable callable, Executor executor) {
        super(erpoVar, executor);
        this.a = erpoVar;
        this.c = callable;
    }

    @Override // defpackage.errh
    public final Object a() {
        return this.c.call();
    }

    @Override // defpackage.errh
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.erpn
    public final void c(Object obj) {
        this.a.set(obj);
    }
}
