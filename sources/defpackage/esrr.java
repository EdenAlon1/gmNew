package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
class esrr implements Function {
    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        fchz fchzVar = (fchz) obj;
        int ordinal = fchzVar.ordinal();
        if (ordinal == 0) {
            return esqo.a;
        }
        if (ordinal == 1) {
            return esqo.b;
        }
        if (ordinal == 2) {
            return esqo.c;
        }
        if (ordinal == 3) {
            return esqo.a;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(fchzVar))));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
