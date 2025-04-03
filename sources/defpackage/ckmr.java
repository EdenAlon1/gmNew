package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckmr extends alhh {
    public ckmr(ffbr ffbrVar, ckmp ckmpVar, Executor executor) {
        super(ffbrVar, ckmpVar, executor);
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: ckmq
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((eomj) obj).mergeFrom((eomj) obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
