package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alih extends alhh {
    public alih(ffbr ffbrVar, alid alidVar, Executor executor) {
        super(ffbrVar, alidVar, executor);
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: alig
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eonl eonlVar = (eonl) obj;
                eqaf eqafVar = (eqaf) obj2;
                eonlVar.copyOnWrite();
                eonm eonmVar = (eonm) eonlVar.instance;
                eonm eonmVar2 = eonm.a;
                eqafVar.getClass();
                eonmVar.c = eqafVar;
                eonmVar.b = 1;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
