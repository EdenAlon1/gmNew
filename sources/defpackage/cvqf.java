package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvqf extends alhh {
    public cvqf(ffbr ffbrVar, aqcf aqcfVar, Executor executor) {
        super(ffbrVar, aqcfVar, executor);
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: cvqd
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eqgp eqgpVar = (eqgp) obj;
                eqgw eqgwVar = (eqgw) obj2;
                eqgpVar.copyOnWrite();
                eqgq eqgqVar = (eqgq) eqgpVar.instance;
                eqgq eqgqVar2 = eqgq.a;
                eqgwVar.getClass();
                eqgqVar.c = eqgwVar;
                eqgqVar.b = 2;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
