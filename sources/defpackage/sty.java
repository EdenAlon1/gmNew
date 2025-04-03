package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sty implements Function {
    final /* synthetic */ buxm a;
    final /* synthetic */ Instant b;

    public sty(buxm buxmVar, Instant instant) {
        this.a = buxmVar;
        this.b = instant;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        bvhm bvhmVar = (bvhm) obj;
        engw g = this.a.g();
        engr engrVar = new engr();
        enqv it = g.iterator();
        while (it.hasNext()) {
            engrVar.h(String.valueOf(bdhb.a((MessageIdType) it.next())));
        }
        bvhmVar.aq(new dtrw("p2p_suggestions.target_message_id", 3, bvhm.at(engrVar.g()), true));
        bvhmVar.aq(new dtwe("p2p_suggestions.generated_timestamp", 7, Long.valueOf(this.b.toEpochMilli())));
        return bvhmVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
