package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alcz extends alhh {
    public alcz(ffbr ffbrVar, alcs alcsVar, Executor executor) {
        super(ffbrVar, alcsVar, executor);
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: alcy
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eoji eojiVar = (eoji) obj;
                eqap eqapVar = (eqap) obj2;
                eojiVar.copyOnWrite();
                eojj eojjVar = (eojj) eojiVar.instance;
                eojj eojjVar2 = eojj.a;
                eqapVar.getClass();
                eojjVar.c = eqapVar;
                eojjVar.b = 5;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final void b(Iterable iterable, int i, int i2, boolean z) {
        c(5, iterable, i, i2, z);
    }

    public final void c(final int i, final Iterable iterable, final int i2, final int i3, final boolean z) {
        o(new Supplier() { // from class: alcx
            @Override // java.util.function.Supplier
            public final Object get() {
                eqan eqanVar = (eqan) eqap.a.createBuilder();
                eqanVar.copyOnWrite();
                eqap eqapVar = (eqap) eqanVar.instance;
                eqapVar.c = i - 1;
                eqapVar.b |= 1;
                eqanVar.copyOnWrite();
                eqap eqapVar2 = (eqap) eqanVar.instance;
                eygr eygrVar = eqapVar2.e;
                if (!eygrVar.c()) {
                    eqapVar2.e = eyfy.mutableCopy(eygrVar);
                }
                int i4 = i2;
                eydl.addAll(iterable, eqapVar2.e);
                eqanVar.copyOnWrite();
                eqap eqapVar3 = (eqap) eqanVar.instance;
                boolean z2 = z;
                int i5 = i3;
                eqapVar3.f = i4 - 1;
                eqapVar3.b |= 4;
                eqanVar.copyOnWrite();
                eqap eqapVar4 = (eqap) eqanVar.instance;
                eqapVar4.b |= 8;
                eqapVar4.g = i5;
                eqanVar.copyOnWrite();
                eqap eqapVar5 = (eqap) eqanVar.instance;
                eqapVar5.b |= 2;
                eqapVar5.d = z2;
                return (eqap) eqanVar.build();
            }
        });
    }
}
