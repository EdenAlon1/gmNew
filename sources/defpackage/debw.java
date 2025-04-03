package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class debw extends alhh {
    public static final /* synthetic */ int a = 0;
    private static final cfup b = cfvl.i(cfvl.b, "disable_logging_bugle_clearcut_federated_learning", false);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public debw(ffbr ffbrVar, Executor executor) {
        super(ffbrVar, new debp(), executor);
        ffbrVar.getClass();
        executor.getClass();
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new debv(debu.a);
    }

    public final void b(final ffji ffjiVar) {
        if (((Boolean) b.e()).booleanValue()) {
            return;
        }
        o(new Supplier() { // from class: debq
            @Override // java.util.function.Supplier
            public final Object get() {
                int i = debw.a;
                eolw eolwVar = (eolw) eolx.a.createBuilder();
                eolwVar.getClass();
                eogz eogzVar = new eogz(eolwVar);
                ffji.this.invoke(eogzVar);
                eyfy build = eogzVar.a.build();
                build.getClass();
                return (eolx) build;
            }
        });
    }
}
