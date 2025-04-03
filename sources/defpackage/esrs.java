package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
class esrs implements Function {
    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        fcia fciaVar = (fcia) obj;
        int ordinal = fciaVar.ordinal();
        if (ordinal == 0) {
            return esqp.a;
        }
        if (ordinal == 1) {
            return esqp.b;
        }
        if (ordinal == 2) {
            return esqp.c;
        }
        if (ordinal == 3) {
            return esqp.a;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(fciaVar))));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
