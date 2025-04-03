package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apzn implements aptb {
    private final bwvs a;
    private final apue b;

    public apzn(final dtuu dtuuVar, apuc apucVar) {
        dtuuVar.getClass();
        apucVar.getClass();
        bwvt b = bwvy.b();
        b.z("MessageDeliveryReportsChangeObserver");
        b.c(new Function() { // from class: apzk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwvg bwvgVar = (bwvg) obj;
                return new bwvh[]{bwvgVar.a, bwvgVar.b, bwvgVar.c, bwvgVar.d, bwvgVar.e, bwvgVar.f};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bwvs b2 = b.b();
        this.a = b2;
        this.b = apucVar.a("MessageDeliveryReportsChangeObserver", b2, new apud() { // from class: apzl
            @Override // defpackage.apud
            public final Object a(final Consumer consumer) {
                return new apzy(dtuu.this, new ffji() { // from class: apzm
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        engw engwVar = (engw) obj;
                        engwVar.getClass();
                        Consumer.this.o(engwVar);
                        return ffcu.a;
                    }
                });
            }
        });
    }

    @Override // defpackage.aptb
    public final apta a() {
        return this.b.a();
    }

    @Override // defpackage.aptb
    public final ctbx b(alyd alydVar) {
        return this.b.b(alydVar);
    }
}
