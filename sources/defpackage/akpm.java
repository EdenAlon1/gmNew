package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akpm extends alhh {
    public akpm(ffbr ffbrVar, akpq akpqVar, Executor executor) {
        super(ffbrVar, akpqVar, executor);
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: akpk
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eqgf eqgfVar = (eqgf) obj;
                eqge eqgeVar = (eqge) obj2;
                eqgfVar.copyOnWrite();
                eqgg eqggVar = (eqgg) eqgfVar.instance;
                eqgg eqggVar2 = eqgg.a;
                eqgeVar.getClass();
                eqggVar.c = eqgeVar;
                eqggVar.b = 2;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
