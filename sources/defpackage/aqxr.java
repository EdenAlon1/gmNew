package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqxr implements Function {
    final /* synthetic */ azsu a;

    public aqxr(azsu azsuVar) {
        this.a = azsuVar;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        String[] strArr = bxve.a;
        bxts bxtsVar = new bxts();
        bxtsVar.e(this.a);
        return new aqwp(bxtsVar.a(), true);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
