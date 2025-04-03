package defpackage;

import android.content.Context;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uja implements dqlt, ugy {
    public final alcb a;
    public engw b;
    private final Context c;
    private final ffbr d;
    private eptv e;
    private epqn f;

    public uja(Context context, alcb alcbVar, ffbr ffbrVar) {
        int i = engw.d;
        this.b = enou.a;
        this.c = context;
        this.a = alcbVar;
        this.d = ffbrVar;
    }

    private final void f(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            ((cfyt) this.d.b()).b(th);
        }
    }

    private final void g(final int i, final dqrp dqrpVar) {
        f(new Runnable() { // from class: uix
            @Override // java.lang.Runnable
            public final void run() {
                Integer num;
                uja ujaVar = uja.this;
                dqrp dqrpVar2 = dqrpVar;
                dqro dqroVar = dqrpVar2.d;
                eppr b = ujaVar.b(dqrpVar2);
                int i2 = -1;
                if (dqroVar != dqrk.a && (num = dqrpVar2.c) != null) {
                    i2 = num.intValue();
                }
                ujaVar.a.k(i, b, i2, null).k(axnw.b(), erpp.a);
            }
        });
    }

    @Override // defpackage.ugy
    public final engw a() {
        Supplier supplier = new Supplier() { // from class: uiz
            @Override // java.util.function.Supplier
            public final Object get() {
                final uja ujaVar = uja.this;
                Stream map = Collection.EL.stream(ujaVar.b).map(new Function() { // from class: uiy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return uja.this.b((dqrp) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = engw.d;
                engw engwVar = (engw) map.collect(endq.a);
                ujaVar.b = enou.a;
                return engwVar;
            }
        };
        int i = engw.d;
        Object obj = enou.a;
        try {
            obj = supplier.get();
        } catch (Throwable th) {
            ((cfyt) this.d.b()).b(th);
        }
        return (engw) obj;
    }

    public final eppr b(dqrp dqrpVar) {
        eppq eppqVar = (eppq) eppr.a.createBuilder();
        eppx eppxVar = (eppx) epqg.a.createBuilder();
        dqro dqroVar = dqrpVar.d;
        if (dqroVar == dqrm.a) {
            epqd epqdVar = epqd.a;
            eppxVar.copyOnWrite();
            epqg epqgVar = (epqg) eppxVar.instance;
            epqdVar.getClass();
            epqgVar.d = epqdVar;
            epqgVar.c = 103;
        } else if (dqroVar == dqrk.a) {
            eppz eppzVar = eppz.a;
            eppxVar.copyOnWrite();
            epqg epqgVar2 = (epqg) eppxVar.instance;
            eppzVar.getClass();
            epqgVar2.d = eppzVar;
            epqgVar2.c = 102;
        } else if (dqroVar == dqrl.a) {
            epqb epqbVar = epqb.a;
            eppxVar.copyOnWrite();
            epqg epqgVar3 = (epqg) eppxVar.instance;
            epqbVar.getClass();
            epqgVar3.d = epqbVar;
            epqgVar3.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        } else if (dqroVar instanceof dqrn) {
            epqf epqfVar = epqf.a;
            eppxVar.copyOnWrite();
            epqg epqgVar4 = (epqg) eppxVar.instance;
            epqfVar.getClass();
            epqgVar4.d = epqfVar;
            epqgVar4.c = 104;
        }
        if (dqrpVar.d != dqrl.a) {
            boolean z = dqrpVar.e;
            eppxVar.copyOnWrite();
            epqg epqgVar5 = (epqg) eppxVar.instance;
            epqgVar5.b |= 1;
            epqgVar5.e = z;
        }
        epqg epqgVar6 = (epqg) eppxVar.build();
        eppqVar.copyOnWrite();
        eppr epprVar = (eppr) eppqVar.instance;
        epqgVar6.getClass();
        epprVar.f = epqgVar6;
        epprVar.e = BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
        if (dqrpVar.d != dqrl.a) {
            if (this.e == null) {
                eptq eptqVar = (eptq) eptv.a.createBuilder();
                epts eptsVar = epts.EMOJI;
                eptqVar.copyOnWrite();
                eptv eptvVar = (eptv) eptqVar.instance;
                eptvVar.c = eptsVar.v;
                eptvVar.b |= 1;
                eptu eptuVar = eptu.EXPANDED;
                eptqVar.copyOnWrite();
                eptv eptvVar2 = (eptv) eptqVar.instance;
                eptvVar2.d = eptuVar.e;
                eptvVar2.b |= 2;
                this.e = (eptv) eptqVar.build();
            }
            eptv eptvVar3 = this.e;
            eppqVar.copyOnWrite();
            eppr epprVar2 = (eppr) eppqVar.instance;
            eptvVar3.getClass();
            epprVar2.d = eptvVar3;
            epprVar2.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        } else {
            if (this.f == null) {
                int a = algx.a(this.c);
                epql epqlVar = (epql) epqn.a.createBuilder();
                int i = a != 3 ? 1 : 2;
                epqlVar.copyOnWrite();
                epqn epqnVar = (epqn) epqlVar.instance;
                epqnVar.c = i - 1;
                epqnVar.b |= 1;
                this.f = (epqn) epqlVar.build();
            }
            epqn epqnVar2 = this.f;
            eppqVar.copyOnWrite();
            eppr epprVar3 = (eppr) eppqVar.instance;
            epqnVar2.getClass();
            epprVar3.d = epqnVar2;
            epprVar3.c = 102;
        }
        return (eppr) eppqVar.build();
    }

    @Override // defpackage.dqlt
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        g(2, (dqrp) obj);
    }

    @Override // defpackage.dqlt
    public final void d(final List list) {
        f(new Runnable() { // from class: uiw
            @Override // java.lang.Runnable
            public final void run() {
                engw n;
                List list2 = list;
                if (list2.isEmpty()) {
                    int i = engw.d;
                    n = enou.a;
                } else {
                    n = engw.n(list2);
                }
                uja.this.b = n;
            }
        });
    }

    @Override // defpackage.dqlt
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        g(4, (dqrp) obj);
    }
}
