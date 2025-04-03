package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alci extends alck {
    public alci(ffbr ffbrVar, alcs alcsVar, Executor executor) {
        super(ffbrVar, alcsVar, executor);
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: alch
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eoji eojiVar = (eoji) obj;
                epsn epsnVar = (epsn) obj2;
                eojiVar.copyOnWrite();
                eojj eojjVar = (eojj) eojiVar.instance;
                eojj eojjVar2 = eojj.a;
                epsnVar.getClass();
                eojjVar.c = epsnVar;
                eojjVar.b = 3;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.alck
    protected final /* bridge */ /* synthetic */ eyhs b(epsw epswVar) {
        epsm epsmVar = (epsm) epsn.a.createBuilder();
        epsmVar.copyOnWrite();
        epsn epsnVar = (epsn) epsmVar.instance;
        epswVar.getClass();
        epsnVar.c = epswVar;
        epsnVar.b |= 1;
        return (epsn) epsmVar.build();
    }
}
