package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cugd extends alhh {
    private final ffbr c;
    private static final cfup b = cfvl.i(cfvl.b, "disable_logging_spam_folder_event_logger", false);
    public static final cfup a = cfvl.f(cfvl.b, "spam_folder_log_max_conversation_count", 1000);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cugd(ffbr ffbrVar, ffbr ffbrVar2, Executor executor) {
        super(ffbrVar2, new cufx(), executor);
        ffbrVar.getClass();
        ffbrVar2.getClass();
        executor.getClass();
        this.c = ffbrVar;
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new cugc(cugb.a);
    }

    public final void b(final ffji ffjiVar) {
        if (((Boolean) b.e()).booleanValue()) {
            return;
        }
        if (!cubs.b().booleanValue()) {
            o(new Supplier() { // from class: cufz
                @Override // java.util.function.Supplier
                public final Object get() {
                    cfup cfupVar = cugd.a;
                    ereu a2 = eret.a((erdp) erdq.a.createBuilder());
                    ffji.this.invoke(a2);
                    return a2.a();
                }
            });
            return;
        }
        akxn a2 = ((akyb) this.c.b()).a();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.SPAM_FOLDER_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        ereu a3 = eret.a((erdp) erdq.a.createBuilder());
        ffjiVar.invoke(a3);
        erdq a4 = a3.a();
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eolvVar2.ak = a4;
        eolvVar2.d |= 8;
        a2.j(eoluVar, alal.LOG_SPEC_SPAM_EVENTS);
    }
}
