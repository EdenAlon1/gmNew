package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmwn extends dtyx {
    public bmwn(String[] strArr) {
        super("messages LEFT JOIN message_reactions AS b ON (b.message_id=messages._id)", strArr, null, "%TIMESTAMP_COLUMN_VAL% %ORDER_DIRECTION%, messages._id %ORDER_DIRECTION%", "messages.conversation_id=%CONVERSATION_ID% AND %EXCLUDE_DRAFTS% AND messages.message_status <> 16", "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bmwl b() {
        l();
        return new bmwl(this.a.a());
    }

    public final void c(bmwk... bmwkVarArr) {
        C((String) DesugarArrays.stream(bmwkVarArr).map(new Function() { // from class: bmwm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bmwk) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void d(Function function) {
        Object apply;
        String[] strArr = bmwq.a;
        apply = function.apply(new bmwp());
        k(new bmwo((bmwp) apply));
    }
}
