package defpackage;

import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avma implements avpe {
    final Set a;
    public final azei b;
    private final errl c;

    public avma(Set set, azei azeiVar, errl errlVar) {
        this.a = set;
        this.b = azeiVar;
        this.c = errlVar;
    }

    @Override // defpackage.avpe
    public final elfl a(final Map map) {
        ArrayList arrayList = new ArrayList(this.a.size());
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((avmb) it.next()).c(map));
        }
        return elfo.j(arrayList).a(new Callable() { // from class: avlu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final Map map2 = map;
                avma.this.b.d(new Consumer() { // from class: avlw
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((azak) obj).a(azan.RCS, (Map) Collection.EL.stream(map2.entrySet()).collect(endq.a(new Function() { // from class: avlx
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return (awui) ((Map.Entry) obj2).getKey();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: avly
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return azav.a(((avmz) ((Map.Entry) obj2).getValue()).a());
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        })));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return null;
            }
        }, this.c);
    }

    @Override // defpackage.avpe
    public final elfl b(final awui awuiVar, final avmz avmzVar) {
        ArrayList arrayList = new ArrayList(this.a.size());
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((avmb) it.next()).d(awuiVar, avmzVar));
        }
        return elfo.j(arrayList).a(new Callable() { // from class: avlz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final awui awuiVar2 = awuiVar;
                final avmz avmzVar2 = avmzVar;
                avma.this.b.d(new Consumer() { // from class: avlv
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        avmz avmzVar3 = avmzVar2;
                        azan azanVar = azan.RCS;
                        azav.a(avmzVar3.a());
                        ((azak) obj).b(azanVar, awui.this);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return null;
            }
        }, this.c);
    }
}
