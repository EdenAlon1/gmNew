package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apwq implements aptb {
    private final btqk a;
    private final apue b;

    public apwq(final dtuu dtuuVar, apuc apucVar) {
        dtuuVar.getClass();
        apucVar.getClass();
        btql b = btqq.b();
        b.z("MessagePreviewChangeObserver");
        b.d(new Function() { // from class: apwo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btpq btpqVar = (btpq) obj;
                return new btpr[]{btpqVar.a, btpqVar.b, btpqVar.d, btpqVar.e, btpqVar.f, btpqVar.h, btpqVar.g, btpqVar.c, btpqVar.j, btpqVar.k};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btqk b2 = b.b();
        this.a = b2;
        this.b = apucVar.a("MessagePreviewChangeObserver", b2, new apud() { // from class: apwp
            @Override // defpackage.apud
            public final Object a(final Consumer consumer) {
                return new apxb(dtuu.this, new ffji() { // from class: apwn
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
