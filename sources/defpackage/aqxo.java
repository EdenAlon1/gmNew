package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqxo implements Function {
    final /* synthetic */ azsu a;

    public aqxo(azsu azsuVar) {
        this.a = azsuVar;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        bxvd bxvdVar = (bxvd) obj;
        bxvdVar.aq(new dtrt("self_profiles.my_identity_token", 1, azsv.b(this.a)));
        return bxvdVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
