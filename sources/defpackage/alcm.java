package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alcm extends alck {
    public alcm(ffbr ffbrVar, alcs alcsVar, Executor executor) {
        super(ffbrVar, alcsVar, executor);
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: alcl
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eoji eojiVar = (eoji) obj;
                epsy epsyVar = (epsy) obj2;
                eojiVar.copyOnWrite();
                eojj eojjVar = (eojj) eojiVar.instance;
                eojj eojjVar2 = eojj.a;
                epsyVar.getClass();
                eojjVar.c = epsyVar;
                eojjVar.b = 4;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.alck
    protected final /* bridge */ /* synthetic */ eyhs b(epsw epswVar) {
        epsx epsxVar = (epsx) epsy.a.createBuilder();
        epsxVar.copyOnWrite();
        epsy epsyVar = (epsy) epsxVar.instance;
        epswVar.getClass();
        epsyVar.c = epswVar;
        epsyVar.b |= 1;
        return (epsy) epsxVar.build();
    }
}
