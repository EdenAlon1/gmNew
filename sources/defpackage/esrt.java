package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
class esrt implements Function {
    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        fcib fcibVar = (fcib) obj;
        int ordinal = fcibVar.ordinal();
        if (ordinal == 0) {
            return esqq.a;
        }
        if (ordinal == 1) {
            return esqq.b;
        }
        if (ordinal == 2) {
            return esqq.c;
        }
        if (ordinal == 3) {
            return esqq.d;
        }
        if (ordinal == 4) {
            return esqq.a;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(fcibVar))));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
