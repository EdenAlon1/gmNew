package defpackage;

import com.google.android.rcs.client.messaging.data.GroupEvent;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eilf implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final clot apply(GroupEvent groupEvent) {
        clos closVar = (clos) clot.a.createBuilder();
        b(groupEvent, closVar);
        return (clot) closVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(GroupEvent groupEvent, clos closVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
