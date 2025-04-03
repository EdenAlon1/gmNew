package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cljq implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final awxk apply(clqm clqmVar) {
        awxh awxhVar = (awxh) awxk.b.createBuilder();
        h(clqmVar, awxhVar);
        f(clqmVar, awxhVar);
        k(awxhVar);
        e(clqmVar, awxhVar);
        c(clqmVar, awxhVar);
        d(clqmVar, awxhVar);
        b(clqmVar, awxhVar);
        i(clqmVar, awxhVar);
        l(awxhVar);
        if ((clqmVar.b & 1) != 0) {
            j(clqmVar, awxhVar);
        }
        g(clqmVar, awxhVar);
        return (awxk) awxhVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(clqm clqmVar, awxh awxhVar);

    public abstract void c(clqm clqmVar, awxh awxhVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(clqm clqmVar, awxh awxhVar);

    public abstract void e(clqm clqmVar, awxh awxhVar);

    public abstract void f(clqm clqmVar, awxh awxhVar);

    public abstract void g(clqm clqmVar, awxh awxhVar);

    public abstract void h(clqm clqmVar, awxh awxhVar);

    public abstract void i(clqm clqmVar, awxh awxhVar);

    public abstract void j(clqm clqmVar, awxh awxhVar);

    public abstract void k(awxh awxhVar);

    public abstract void l(awxh awxhVar);
}
