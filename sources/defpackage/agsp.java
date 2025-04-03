package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agsp extends dtyx {
    public agsp(String[] strArr) {
        super("message_labels LEFT JOIN messages ON (messages._id=message_labels.message_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final agsn b() {
        l();
        return new agsn(this.a.a());
    }

    public final void c(agsm... agsmVarArr) {
        C((String) DesugarArrays.stream(agsmVarArr).map(new Function() { // from class: agso
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((agsm) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(agss.c);
        agsj[] agsjVarArr = {(agsj) apply};
        int intValue = agss.c().intValue();
        if (((Integer) agss.b.getOrDefault(agsjVarArr[0].toString(), -1)).intValue() > intValue) {
            dtub.w("columnReference.toString()", intValue);
        }
        m(agsjVarArr);
    }

    public final void e(Function function) {
        Object apply;
        String[] strArr = agss.a;
        apply = function.apply(new agsr());
        k(new agsq((agsr) apply));
    }
}
