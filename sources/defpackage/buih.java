package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buih extends dtyx {
    public buih(String[] strArr) {
        super("message_send_receive_attempt", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final buif b() {
        l();
        return new buif(this.a.a());
    }

    public final void c(buie... buieVarArr) {
        C((String) DesugarArrays.stream(buieVarArr).map(new Function() { // from class: buig
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((buie) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void d(Function function) {
        Object apply;
        String[] strArr = buik.a;
        apply = function.apply(new buij());
        k(new buii((buij) apply));
    }
}
