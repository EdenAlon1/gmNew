package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class cvct implements Function {
    public final /* synthetic */ cvcg a;

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        final cvbt cvbtVar = (cvbt) obj;
        cvcg.a.p("Decrypting VSMS key pair...");
        cvcg cvcgVar = this.a;
        return cvcgVar.c().h(new emwl() { // from class: cvcb
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                return cvcg.e(cvbt.this, (etql) obj2);
            }
        }, cvcgVar.c).f(Exception.class, new cvbx(cvcgVar), cvcgVar.d);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
