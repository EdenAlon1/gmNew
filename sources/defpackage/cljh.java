package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cljh implements Function {
    public abstract void a(awtv awtvVar, clnh clnhVar);

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(awtv awtvVar, clnh clnhVar);

    public abstract void c(awtv awtvVar, clnh clnhVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final clni apply(awtv awtvVar) {
        clnh clnhVar = (clnh) clni.a.createBuilder();
        b(awtvVar, clnhVar);
        a(awtvVar, clnhVar);
        c(awtvVar, clnhVar);
        return (clni) clnhVar.build();
    }
}
