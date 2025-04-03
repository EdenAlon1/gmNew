package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class alcb extends alhh {
    public alcb(ffbr ffbrVar, alcs alcsVar, Executor executor) {
        super(ffbrVar, alcsVar, executor);
    }

    public static eppp i(int i, eppr epprVar, int i2, int i3) {
        return j(i, epprVar, i2, i3, null);
    }

    public static eppp j(int i, eppr epprVar, int i2, int i3, eqaw eqawVar) {
        eppo eppoVar = (eppo) eppp.a.createBuilder();
        eppoVar.copyOnWrite();
        eppp epppVar = (eppp) eppoVar.instance;
        epppVar.c = i - 1;
        epppVar.b |= 1;
        eppoVar.copyOnWrite();
        eppp epppVar2 = (eppp) eppoVar.instance;
        epprVar.getClass();
        epppVar2.d = epprVar;
        epppVar2.b |= 2;
        if (i2 >= 0) {
            eppoVar.copyOnWrite();
            eppp epppVar3 = (eppp) eppoVar.instance;
            epppVar3.b |= 4;
            epppVar3.e = i2;
        }
        if (i3 >= 0) {
            eppoVar.copyOnWrite();
            eppp epppVar4 = (eppp) eppoVar.instance;
            epppVar4.b |= 8;
            epppVar4.f = i3;
        }
        if (eqawVar != null) {
            eppoVar.copyOnWrite();
            eppp epppVar5 = (eppp) eppoVar.instance;
            epppVar5.g = eqawVar;
            epppVar5.b |= 16;
        }
        return (eppp) eppoVar.build();
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: albw
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eoji eojiVar = (eoji) obj;
                eppp epppVar = (eppp) obj2;
                eojiVar.copyOnWrite();
                eojj eojjVar = (eojj) eojiVar.instance;
                eojj eojjVar2 = eojj.a;
                epppVar.getClass();
                eojjVar.c = epppVar;
                eojjVar.b = 2;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final void b(final eppr epprVar, final int i) {
        o(new Supplier() { // from class: albx
            @Override // java.util.function.Supplier
            public final Object get() {
                return alcb.i(4, eppr.this, i, -1);
            }
        });
    }

    public final void c(final eppr epprVar, final int i, final int i2) {
        o(new Supplier() { // from class: albz
            @Override // java.util.function.Supplier
            public final Object get() {
                return alcb.i(2, eppr.this, i, i2);
            }
        });
    }

    public final void d(final eppr epprVar, final int i) {
        o(new Supplier() { // from class: alby
            @Override // java.util.function.Supplier
            public final Object get() {
                return alcb.i(3, eppr.this, -1, i);
            }
        });
    }

    public final void e(eptv eptvVar, int i) {
        eppq eppqVar = (eppq) eppr.a.createBuilder();
        eppqVar.copyOnWrite();
        eppr epprVar = (eppr) eppqVar.instance;
        eptvVar.getClass();
        epprVar.d = eptvVar;
        epprVar.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        epqg epqgVar = epqg.a;
        eppqVar.copyOnWrite();
        eppr epprVar2 = (eppr) eppqVar.instance;
        epqgVar.getClass();
        epprVar2.f = epqgVar;
        epprVar2.e = BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
        c((eppr) eppqVar.build(), -1, i);
    }

    public final void f(final eppr epprVar, final int i) {
        o(new Supplier() { // from class: albv
            @Override // java.util.function.Supplier
            public final Object get() {
                return alcb.i(5, eppr.this, i, -1);
            }
        });
    }

    public final void g(eppr epprVar, int i) {
        c(epprVar, i, -1);
    }

    public final void h(eppr epprVar) {
        d(epprVar, -1);
    }

    public final elfl k(final int i, final eppr epprVar, final int i2, final eqaw eqawVar) {
        return l(new Supplier() { // from class: alca
            @Override // java.util.function.Supplier
            public final Object get() {
                return alcb.j(i, epprVar, -1, i2, eqawVar);
            }
        });
    }
}
