package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ttv extends alhh {
    public static final emyl a;
    private static final cfup b = cfvl.i(cfvl.b, "disable_logging_add_edit_contact_event", false);

    static {
        emyl w = cfvl.w("use_contact_event_logger");
        w.getClass();
        a = w;
    }

    public ttv(ffbr ffbrVar, ttr ttrVar, Executor executor) {
        super(ffbrVar, ttrVar, executor);
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new ttu(ttt.a);
    }

    public final void b(final ffji ffjiVar) {
        if (((Boolean) b.e()).booleanValue()) {
            return;
        }
        o(new Supplier() { // from class: tts
            @Override // java.util.function.Supplier
            public final Object get() {
                emyl emylVar = ttv.a;
                eokc eokcVar = (eokc) eokd.a.createBuilder();
                eokcVar.getClass();
                eogx eogxVar = new eogx(eokcVar);
                ffji.this.invoke(eogxVar);
                eyfy build = eogxVar.a.build();
                build.getClass();
                return (eokd) build;
            }
        });
    }
}
