package defpackage;

import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apym implements aptb {
    private final buea a;
    private final apue b;

    public apym(final dtuu dtuuVar, apuc apucVar) {
        dtuuVar.getClass();
        apucVar.getClass();
        bueb a = bueg.a();
        a.z("ReactionsChangeObserver");
        a.d(new Function() { // from class: apyj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                budk budkVar = (budk) obj;
                return new budl[]{budkVar.b, budkVar.c, budkVar.g};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buea b = a.b();
        this.a = b;
        this.b = apucVar.a("ReactionsChangeObserver", b, new apud() { // from class: apyk
            @Override // defpackage.apud
            public final Object a(final Consumer consumer) {
                return new apyt(dtuu.this, new ffji() { // from class: apyl
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        List list = (List) obj;
                        list.getClass();
                        Consumer.this.o(engq.a(list));
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
