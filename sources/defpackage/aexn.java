package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aexn extends alhh {
    static final cfva a = cfvl.i(cfvl.b, "ss_disable_bulk_logs", false);
    public static final /* synthetic */ int e = 0;
    public final ffbr b;
    public final ffbr c;
    public final Executor d;

    public aexn(ffbr ffbrVar, ffbr ffbrVar2, aexz aexzVar, ffbr ffbrVar3, Executor executor) {
        super(ffbrVar, aexzVar, executor);
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = executor;
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aexm
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eqhb eqhbVar = (eqhb) obj;
                eqje eqjeVar = (eqje) obj2;
                eqhbVar.copyOnWrite();
                eqhc eqhcVar = (eqhc) eqhbVar.instance;
                eqhc eqhcVar2 = eqhc.a;
                eqjeVar.getClass();
                eqhcVar.c = eqjeVar;
                eqhcVar.b = 1;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
