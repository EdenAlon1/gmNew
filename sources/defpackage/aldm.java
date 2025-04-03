package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aldm extends alhh {
    public aldm(ffbr ffbrVar, alcs alcsVar, Executor executor) {
        super(ffbrVar, alcsVar, executor);
    }

    protected static final eqlq d(int i, long j, int i2, eqln eqlnVar) {
        eqlo eqloVar = (eqlo) eqlq.a.createBuilder();
        eqloVar.copyOnWrite();
        eqlq eqlqVar = (eqlq) eqloVar.instance;
        eqlqVar.c = i - 1;
        eqlqVar.b |= 1;
        eqloVar.copyOnWrite();
        eqlq eqlqVar2 = (eqlq) eqloVar.instance;
        eqlqVar2.b |= 2;
        eqlqVar2.d = (((int) j) / 10) * 10;
        eqloVar.copyOnWrite();
        eqlq eqlqVar3 = (eqlq) eqloVar.instance;
        eqlqVar3.e = 1;
        eqlqVar3.b |= 4;
        eqloVar.copyOnWrite();
        eqlq eqlqVar4 = (eqlq) eqloVar.instance;
        eqlqVar4.f = alds.a(i2) - 1;
        eqlqVar4.b |= 8;
        eqloVar.copyOnWrite();
        eqlq eqlqVar5 = (eqlq) eqloVar.instance;
        eqlqVar5.g = eqlnVar.d;
        eqlqVar5.b |= 16;
        return (eqlq) eqloVar.build();
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aldk
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eoji eojiVar = (eoji) obj;
                eqlq eqlqVar = (eqlq) obj2;
                eojiVar.copyOnWrite();
                eojj eojjVar = (eojj) eojiVar.instance;
                eojj eojjVar2 = eojj.a;
                eqlqVar.getClass();
                eojjVar.c = eqlqVar;
                eojjVar.b = 10;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final void b(final long j, final int i, final eqln eqlnVar) {
        o(new Supplier() { // from class: aldj
            @Override // java.util.function.Supplier
            public final Object get() {
                return aldm.d(2, j, i, eqlnVar);
            }
        });
    }

    public final void c(final long j, final int i, final eqln eqlnVar) {
        o(new Supplier() { // from class: aldi
            @Override // java.util.function.Supplier
            public final Object get() {
                return aldm.d(3, j, i, eqlnVar);
            }
        });
    }
}
