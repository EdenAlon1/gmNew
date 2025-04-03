package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ayvj {
    final /* synthetic */ Collection a;
    final /* synthetic */ ayvm b;

    public ayvj(ayvm ayvmVar, Collection collection) {
        this.a = collection;
        this.b = ayvmVar;
    }

    public final String toString() {
        Stream stream = Collection.EL.stream(this.a);
        final ayvm ayvmVar = this.b;
        Stream map = stream.map(new Function() { // from class: ayvi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ayvm.this.d((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        return ((engw) map.collect(endq.a)).toString();
    }
}
