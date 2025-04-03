package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctcd extends alhh {
    public ctcd(ffbr ffbrVar, ctcb ctcbVar, Executor executor) {
        super(ffbrVar, ctcbVar, executor);
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: ctcc
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((epll) obj).mergeFrom((epll) obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
