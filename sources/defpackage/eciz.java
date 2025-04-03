package defpackage;

import j$.util.Comparator;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eciz {
    public final emyl a;

    public eciz(final fazb fazbVar) {
        this.a = emys.a(new emyl() { // from class: eciy
            @Override // defpackage.emyl
            public final Object get() {
                return engw.E(Comparator.CC.comparing(new Function() { // from class: eciw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Integer.valueOf(((ecto) obj).a().a);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, Comparator.CC.reverseOrder()), (Iterable) fazb.this.b());
            }
        });
    }
}
