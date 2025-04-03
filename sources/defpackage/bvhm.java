package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvhm extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bvhg(this);
    }

    public final void b(long j) {
        aq(new dtwe("p2p_suggestions.generated_timestamp", 9, Long.valueOf(j)));
    }

    public final void c(String str) {
        aq(new dtrt("p2p_suggestions._id", 1, str));
    }

    public final void d(Iterable iterable) {
        aq(new dtrw("p2p_suggestions._id", 3, at(iterable), false));
    }

    public final void e(fbri fbriVar) {
        aq(new dtwe("p2p_suggestions.smart_suggestion_type", 1, Integer.valueOf(fbriVar == null ? 0 : fbriVar.a())));
    }

    public final void f(Iterable iterable) {
        aq(new dtrw("p2p_suggestions.smart_suggestion_type", 3, at((Iterable) enqc.a(iterable).map(new Function() { // from class: bvhh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((fbri) obj).a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new bvhj()))), true));
    }

    public final void g(MessageIdType messageIdType) {
        aq(new dtrt("p2p_suggestions.target_message_id", 1, Long.valueOf(bdhb.a(messageIdType))));
    }

    public final void h(dtzj dtzjVar) {
        aq(new dtru("p2p_suggestions.target_message_id", 3, dtzjVar));
    }

    public final void i(MessageIdType... messageIdTypeArr) {
        aq(new dtrw("p2p_suggestions.target_message_id", 3, at((Iterable) DesugarArrays.stream(messageIdTypeArr).map(new Function() { // from class: bvhi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return String.valueOf(bdhb.a((MessageIdType) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new bvhj()))), true));
    }
}
