package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aewk extends alhh {
    public static final enru a = enru.c("com/google/android/apps/messaging/label/analytics/AutoDeletedMessagesEventLogger");
    public final ffbr b;

    public aewk(ffbr ffbrVar, ffbr ffbrVar2, aexz aexzVar, Executor executor) {
        super(ffbrVar, aexzVar, executor);
        this.b = ffbrVar2;
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aewh
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eqhb eqhbVar = (eqhb) obj;
                eqha eqhaVar = (eqha) obj2;
                eqhbVar.copyOnWrite();
                eqhc eqhcVar = (eqhc) eqhbVar.instance;
                eqhc eqhcVar2 = eqhc.a;
                eqhaVar.getClass();
                eqhcVar.c = eqhaVar;
                eqhcVar.b = 5;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
