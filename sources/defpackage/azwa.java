package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azwa {
    public final avtc a;

    public azwa(avtc avtcVar) {
        this.a = avtcVar;
    }

    public final elfl a(aoku aokuVar) {
        aokuVar.getClass();
        Optional e = aokuVar.e();
        final ffji ffjiVar = new ffji() { // from class: azvy
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return azwa.this.a.c((awui) obj);
            }
        };
        Object orElse = e.map(new Function() { // from class: azvz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(elfo.e(avtb.NOT_RCS));
        orElse.getClass();
        return (elfl) orElse;
    }
}
