package defpackage;

import j$.time.MonthDay;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class airq implements Function {
    final /* synthetic */ MonthDay a;

    public airq(MonthDay monthDay) {
        this.a = monthDay;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        brbr brbrVar = (brbr) obj;
        brbrVar.c(axcl.CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY);
        brbrVar.e(this.a.toString());
        return brbrVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
