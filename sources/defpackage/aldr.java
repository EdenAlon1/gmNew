package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aldr extends alhh {
    public aldr(ffbr ffbrVar, alcs alcsVar, Executor executor) {
        super(ffbrVar, alcsVar, executor);
    }

    public static eqlt c(int i, int i2) {
        eqlr eqlrVar = (eqlr) eqlt.a.createBuilder();
        eqlrVar.copyOnWrite();
        eqlt eqltVar = (eqlt) eqlrVar.instance;
        eqltVar.c = i - 1;
        eqltVar.b |= 1;
        eqlrVar.copyOnWrite();
        eqlt eqltVar2 = (eqlt) eqlrVar.instance;
        eqltVar2.d = 1;
        eqltVar2.b |= 2;
        eqlrVar.copyOnWrite();
        eqlt eqltVar3 = (eqlt) eqlrVar.instance;
        eqltVar3.e = alds.a(i2) - 1;
        eqltVar3.b |= 4;
        return (eqlt) eqlrVar.build();
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aldn
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eoji eojiVar = (eoji) obj;
                eqlt eqltVar = (eqlt) obj2;
                eojiVar.copyOnWrite();
                eojj eojjVar = (eojj) eojiVar.instance;
                eojj eojjVar2 = eojj.a;
                eqltVar.getClass();
                eojjVar.c = eqltVar;
                eojjVar.b = 11;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final void b(final int i) {
        o(new Supplier() { // from class: aldo
            @Override // java.util.function.Supplier
            public final Object get() {
                return aldr.c(4, i);
            }
        });
    }
}
