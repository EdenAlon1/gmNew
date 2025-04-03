package defpackage;

import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class expg implements exob {
    public static expg e(Optional optional, Optional optional2, List list, long j) {
        return new exot(optional.map(new Function() { // from class: expf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DesugarCollections.unmodifiableList((List) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }), optional2, DesugarCollections.unmodifiableList(list), j);
    }

    public abstract long a();

    public abstract Optional b();

    public abstract Optional c();

    public abstract List d();
}
