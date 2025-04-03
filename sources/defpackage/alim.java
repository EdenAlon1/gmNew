package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alim extends alhh {
    public alim(ffbr ffbrVar, alid alidVar, Executor executor) {
        super(ffbrVar, alidVar, executor);
    }

    public static eqai b(eqad eqadVar, epzq epzqVar, int i, long j) {
        eqah eqahVar = (eqah) eqai.a.createBuilder();
        eqahVar.copyOnWrite();
        eqai eqaiVar = (eqai) eqahVar.instance;
        eqadVar.getClass();
        eqaiVar.c = eqadVar;
        eqaiVar.b |= 1;
        eqahVar.copyOnWrite();
        eqai eqaiVar2 = (eqai) eqahVar.instance;
        epzqVar.getClass();
        eqaiVar2.d = epzqVar;
        eqaiVar2.b |= 2;
        eqahVar.copyOnWrite();
        eqai eqaiVar3 = (eqai) eqahVar.instance;
        eqaiVar3.e = i - 1;
        eqaiVar3.b |= 4;
        eqahVar.copyOnWrite();
        eqai eqaiVar4 = (eqai) eqahVar.instance;
        eqaiVar4.b |= 8;
        eqaiVar4.f = (((int) j) / 10) * 10;
        return (eqai) eqahVar.build();
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: alik
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eonl eonlVar = (eonl) obj;
                eqai eqaiVar = (eqai) obj2;
                eonlVar.copyOnWrite();
                eonm eonmVar = (eonm) eonlVar.instance;
                eonm eonmVar2 = eonm.a;
                eqaiVar.getClass();
                eonmVar.c = eqaiVar;
                eonmVar.b = 7;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
