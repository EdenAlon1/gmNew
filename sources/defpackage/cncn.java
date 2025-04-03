package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cncn extends alhh {
    public final cncd a;

    public cncn(ffbr ffbrVar, cnch cnchVar, Executor executor, cncd cncdVar) {
        super(ffbrVar, cnchVar, executor);
        this.a = cncdVar;
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: cncl
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                epdj epdjVar = (epdj) obj;
                epdn epdnVar = (epdn) obj2;
                epdjVar.copyOnWrite();
                epdr epdrVar = (epdr) epdjVar.instance;
                epdr epdrVar2 = epdr.a;
                epdnVar.getClass();
                epdrVar.c = epdnVar;
                epdrVar.b = 1;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
