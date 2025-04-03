package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahgc extends dtyx {
    public ahgc(String[] strArr) {
        super("conversations LEFT JOIN conversation_pin ON (conversation_pin.conversation_id=conversations._id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ahga b() {
        l();
        return new ahga(this.a.a());
    }

    public final void c(ahfz... ahfzVarArr) {
        C((String) DesugarArrays.stream(ahfzVarArr).map(new Function() { // from class: ahgb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ahfz) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void d(ahgh ahghVar) {
        k(new ahgd(ahghVar));
    }

    public final void e(Function function) {
        Object apply;
        String[] strArr = ahgi.a;
        apply = function.apply(new ahgh());
        k(new ahgd((ahgh) apply));
    }
}
