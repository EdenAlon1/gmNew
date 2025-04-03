package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alhx extends alhh {
    public alhx(ffbr ffbrVar, alid alidVar, Executor executor) {
        super(ffbrVar, alidVar, executor);
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: alhv
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eonl eonlVar = (eonl) obj;
                epzu epzuVar = (epzu) obj2;
                eonlVar.copyOnWrite();
                eonm eonmVar = (eonm) eonlVar.instance;
                eonm eonmVar2 = eonm.a;
                epzuVar.getClass();
                eonmVar.c = epzuVar;
                eonmVar.b = 3;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final void b(final eqad eqadVar, final epzq epzqVar) {
        o(new Supplier() { // from class: alhw
            @Override // java.util.function.Supplier
            public final Object get() {
                epzt epztVar = (epzt) epzu.a.createBuilder();
                epztVar.copyOnWrite();
                epzu epzuVar = (epzu) epztVar.instance;
                eqad eqadVar2 = eqad.this;
                eqadVar2.getClass();
                epzuVar.c = eqadVar2;
                epzuVar.b |= 1;
                epztVar.copyOnWrite();
                epzu epzuVar2 = (epzu) epztVar.instance;
                epzq epzqVar2 = epzqVar;
                epzqVar2.getClass();
                epzuVar2.d = epzqVar2;
                epzuVar2.b |= 2;
                epztVar.copyOnWrite();
                epzu epzuVar3 = (epzu) epztVar.instance;
                epzuVar3.b |= 4;
                epzuVar3.e = 0;
                epztVar.copyOnWrite();
                epzu epzuVar4 = (epzu) epztVar.instance;
                epzuVar4.b |= 8;
                epzuVar4.f = true;
                return (epzu) epztVar.build();
            }
        });
    }
}
