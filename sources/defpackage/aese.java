package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aese extends alhh {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aese(ffbr ffbrVar, aerq aerqVar, Executor executor) {
        super(ffbrVar, aerqVar, executor);
        ffbrVar.getClass();
        executor.getClass();
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        final aesc aescVar = aesc.a;
        return new BiConsumer() { // from class: aesd
            @Override // java.util.function.BiConsumer
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ffjm.this.a(obj, obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
