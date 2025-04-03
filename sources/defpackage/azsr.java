package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azsr implements Function {
    final /* synthetic */ aztp a;
    final /* synthetic */ cosz b;

    public azsr(aztp aztpVar, cosz coszVar) {
        this.a = aztpVar;
        this.b = coszVar;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        azoh azohVar = (azoh) obj;
        azohVar.c(this.a.e());
        azohVar.b(this.b.c);
        int intValue = azoi.c().intValue();
        if (intValue < 60320) {
            dtub.w("is_verified", intValue);
        }
        azohVar.aq(new dtwe("my_identities.is_verified", 1, 0));
        return azohVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
