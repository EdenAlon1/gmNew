package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aldw extends alhh {
    private final ffsk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aldw(ffsk ffskVar, ffbr ffbrVar, alcs alcsVar, Executor executor) {
        super(ffbrVar, alcsVar, executor);
        ffskVar.getClass();
        ffbrVar.getClass();
        executor.getClass();
        this.a = ffskVar;
    }

    public static /* synthetic */ void b(aldw aldwVar, int i, eppr epprVar, Integer num, Integer num2, int i2) {
        Integer num3 = (i2 & 4) != 0 ? null : num;
        if (num3 != null && num3.intValue() < 0) {
            throw new IllegalArgumentException(a.i(num3, "draftPosition ", " is negative"));
        }
        Integer num4 = (i2 & 8) != 0 ? null : num2;
        if (num4 != null && num4.intValue() < 0) {
            throw new IllegalArgumentException(a.i(num4, "listPosition ", " is negative"));
        }
        axol.k(aldwVar.a, null, new aldv(aldwVar, i, epprVar, num3, num4, null), 3);
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aldt
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eoji eojiVar = (eoji) obj;
                eppp epppVar = (eppp) obj2;
                eojiVar.getClass();
                epppVar.getClass();
                eojiVar.copyOnWrite();
                eojj eojjVar = (eojj) eojiVar.instance;
                eojj eojjVar2 = eojj.a;
                eojjVar.c = epppVar;
                eojjVar.b = 2;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
