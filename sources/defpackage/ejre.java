package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final /* synthetic */ class ejre extends ffkh implements ffji {
    public ejre(Object obj) {
        super(1, obj, ejrh.class, "asErrorPropagatingCallable", "asErrorPropagatingCallable(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Callable;", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Callable callable = (Callable) obj;
        callable.getClass();
        ejrh ejrhVar = (ejrh) this.g;
        int i = ejrh.b;
        return ejrhVar.a(callable);
    }
}
