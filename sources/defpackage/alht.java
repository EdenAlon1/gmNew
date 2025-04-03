package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alht extends alhh {
    public alht(ffbr ffbrVar, alid alidVar, Executor executor) {
        super(ffbrVar, alidVar, executor);
    }

    public static int b(int i) {
        if (i <= 0) {
            return 2;
        }
        return i == 1 ? 3 : 4;
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: alhr
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eonl eonlVar = (eonl) obj;
                epzf epzfVar = (epzf) obj2;
                eonlVar.copyOnWrite();
                eonm eonmVar = (eonm) eonlVar.instance;
                eonm eonmVar2 = eonm.a;
                epzfVar.getClass();
                eonmVar.c = epzfVar;
                eonmVar.b = 13;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
