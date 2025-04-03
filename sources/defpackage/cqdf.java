package defpackage;

import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqdf {
    public final azei a;
    public final azei b;
    public final ffsk c;

    public cqdf(azei azeiVar, azei azeiVar2, ffsk ffskVar) {
        azeiVar.getClass();
        azeiVar2.getClass();
        ffskVar.getClass();
        this.a = azeiVar;
        this.b = azeiVar2;
        this.c = ffskVar;
    }

    public final void a(azei azeiVar, final ffji ffjiVar) {
        azeiVar.a(new Function() { // from class: cqdd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                elfl c;
                obj.getClass();
                c = axol.c(cqdf.this.c, ffhe.a, ffsm.a, new cqde(ffjiVar, obj, null));
                return c;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final void b(final cqcu cqcuVar) {
        cqcuVar.getClass();
        this.a.d(new Consumer() { // from class: cqcy
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                cqcv cqcvVar = (cqcv) obj;
                cqcvVar.getClass();
                cqcvVar.d();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        a(this.a, new ffji() { // from class: cqcz
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((cqcv) obj).getClass();
                return ffcu.a;
            }
        });
        a(this.b, new ffji() { // from class: cqda
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                coxh coxhVar = (coxh) obj;
                coxhVar.getClass();
                cqgj cqgjVar = cqcu.this.a.c;
                if (cqgjVar == null) {
                    cqgjVar = cqgj.a;
                }
                cqgjVar.getClass();
                coxhVar.b(cqjg.e(cqgjVar));
                return ffcu.a;
            }
        });
    }
}
