package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvq extends cpdo {
    private final adgk a;
    private final errl b;

    public abvq(adgk adgkVar, errl errlVar) {
        this.a = adgkVar;
        this.b = errlVar;
    }

    @Override // defpackage.cqor
    public final ekzz a() {
        return eleg.f("CustodianBackgroundStartupTask");
    }

    @Override // defpackage.cpdo
    public final elfl b() {
        elfl a = this.a.a();
        a.k(axnw.c(new Consumer() { // from class: abvp
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Optional) obj).ifPresent(new Consumer() { // from class: abvo
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        Collection.EL.stream(((abqs) obj2).a).forEach(new Consumer() { // from class: abqr
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj3) {
                                ((abqv) obj3).a();
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), this.b);
        return a;
    }

    @Override // defpackage.cpeh
    public final boolean c() {
        return true;
    }
}
