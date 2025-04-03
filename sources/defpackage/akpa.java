package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akpa extends alhh {
    public akpa(ffbr ffbrVar, akpq akpqVar, Executor executor) {
        super(ffbrVar, akpqVar, executor);
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: akoy
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eqgf eqgfVar = (eqgf) obj;
                eqfu eqfuVar = (eqfu) obj2;
                eqgfVar.copyOnWrite();
                eqgg eqggVar = (eqgg) eqgfVar.instance;
                eqgg eqggVar2 = eqgg.a;
                eqfuVar.getClass();
                eqggVar.c = eqfuVar;
                eqggVar.b = 1;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
