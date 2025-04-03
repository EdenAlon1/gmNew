package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amnh implements Function {
    final /* synthetic */ azcr a;

    public amnh(azcr azcrVar) {
        this.a = azcrVar;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        bsol bsolVar = (bsol) obj;
        int intValue = bsom.g().intValue();
        if (intValue < 60360) {
            dtub.w("destination_token", intValue);
        }
        bsolVar.aq(new dtrt("conversations.destination_token", 1, azcs.b(this.a)));
        return bsolVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
