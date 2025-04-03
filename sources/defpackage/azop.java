package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class azop {
    public abstract azon a();

    public abstract azsu b();

    public abstract enip c();

    public abstract Optional d();

    public abstract Optional e();

    @Deprecated
    public abstract Optional f();

    public abstract Optional g();

    public abstract String h();

    public abstract boolean i();

    final enip j() {
        return (enip) Collection.EL.stream(c()).map(new Function() { // from class: azom
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((azte) obj).a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.b);
    }
}
