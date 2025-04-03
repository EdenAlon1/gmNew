package defpackage;

import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cepn extends ceut {
    public final cskc a = cskc.g("BugleDataModel", "ClearSessionIdsHandler");
    public final dtuu b;
    public final cbgf c;
    private final errl d;

    public cepn(cbgf cbgfVar, dtuu dtuuVar, errl errlVar) {
        this.c = cbgfVar;
        this.b = dtuuVar;
        this.d = errlVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("ClearSessionIdsHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cetw.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        return elfo.g(new Callable() { // from class: cepj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final cepn cepnVar = cepn.this;
                cepnVar.b.d("ClearSessionIdsAction.executeAction", new Runnable() { // from class: cepm
                    @Override // java.lang.Runnable
                    public final void run() {
                        String[] strArr = bsom.a;
                        bsoe bsoeVar = new bsoe();
                        bsoeVar.ap("processPendingWorkItemAsync-conversations1");
                        bsoeVar.ak();
                        bsoeVar.T(-1L);
                        bsoeVar.b().e();
                        bsoe bsoeVar2 = new bsoe();
                        bsoeVar2.ap("processPendingWorkItemAsync-conversations2");
                        bsoeVar2.ak();
                        bsoeVar2.A(4);
                        bsoeVar2.ad(new Function() { // from class: cepl
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bsol bsolVar = (bsol) obj;
                                bsolVar.j(2);
                                return bsolVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bsoeVar2.b().e();
                        cepn.this.c.h("ClearSessionIdsAction");
                    }
                });
                cepnVar.a.m("Finished transaction and notify change");
                return ceyt.i();
            }
        }, this.d).e(Throwable.class, new emwl() { // from class: cepk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cepn.this.a.o("Fail to clear session ids", (Throwable) obj);
                return ceyt.k();
            }
        }, this.d);
    }
}
