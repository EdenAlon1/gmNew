package defpackage;

import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alde extends alhh {
    public final ffbr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alde(ffbr ffbrVar, alcs alcsVar, Executor executor, ffbr ffbrVar2) {
        super(ffbrVar, alcsVar, executor);
        ffbrVar.getClass();
        executor.getClass();
        ffbrVar2.getClass();
        this.a = ffbrVar2;
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aldb
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eoji eojiVar = (eoji) obj;
                eqar eqarVar = (eqar) obj2;
                eojiVar.getClass();
                eqarVar.getClass();
                eojiVar.copyOnWrite();
                eojj eojjVar = (eojj) eojiVar.instance;
                eojj eojjVar2 = eojj.a;
                eojjVar.c = eqarVar;
                eojjVar.b = 7;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final void b(final long j, final int i, final int i2, final Iterable iterable, final eqfc eqfcVar, final ajqc ajqcVar) {
        iterable.getClass();
        o(new Supplier() { // from class: alda
            @Override // java.util.function.Supplier
            public final Object get() {
                final equc a = equb.a((eqaq) eqar.a.createBuilder());
                a.c(j);
                a.e();
                a.d(iterable);
                eqaq eqaqVar = a.a;
                eqaqVar.copyOnWrite();
                eqar eqarVar = (eqar) eqaqVar.instance;
                eqarVar.e = i - 1;
                eqarVar.b |= 2;
                eqaq eqaqVar2 = a.a;
                eqaqVar2.copyOnWrite();
                eqar eqarVar2 = (eqar) eqaqVar2.instance;
                eqarVar2.b |= 4;
                eqarVar2.f = i2;
                eqfc eqfcVar2 = eqfcVar;
                if (eqfcVar2 != null) {
                    eqaq eqaqVar3 = a.a;
                    eqaqVar3.copyOnWrite();
                    eqar eqarVar3 = (eqar) eqaqVar3.instance;
                    eqarVar3.g = eqfcVar2;
                    eqarVar3.b |= 8;
                }
                final ajqc ajqcVar2 = ajqcVar;
                if (ajqcVar2 != null) {
                    Optional optional = (Optional) this.a.b();
                    final ffji ffjiVar = new ffji() { // from class: aldc
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            ajqb ajqbVar = (ajqb) obj;
                            ajqbVar.getClass();
                            ajqbVar.a(equc.this, ajqcVar2);
                            return ffcu.a;
                        }
                    };
                    optional.ifPresent(new Consumer() { // from class: aldd
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            ffji.this.invoke(obj);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                return a.a();
            }
        });
    }
}
