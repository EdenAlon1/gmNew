package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cupa extends alhh {
    public static final /* synthetic */ int a = 0;
    private static final cfup b = cfvl.i(cfvl.b, "disable_logging_hades_sdk_event_logger", false);
    private final ffbr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cupa(ffbr ffbrVar, ffbr ffbrVar2, Executor executor) {
        super(ffbrVar2, new cuow(), executor);
        ffbrVar.getClass();
        ffbrVar2.getClass();
        executor.getClass();
        this.c = ffbrVar;
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new cuoz(cuoy.a);
    }

    public final void b(final int i) {
        if (((Boolean) b.e()).booleanValue()) {
            return;
        }
        if (!cubs.b().booleanValue()) {
            o(new Supplier() { // from class: cuox
                @Override // java.util.function.Supplier
                public final Object get() {
                    int i2 = cupa.a;
                    erdd erddVar = (erdd) erde.a.createBuilder();
                    erddVar.getClass();
                    erda erdaVar = (erda) erdc.a.createBuilder();
                    erdaVar.getClass();
                    eref.c(erdaVar);
                    eref.b(i, erdaVar);
                    ereg.b(eref.a(erdaVar), erddVar);
                    return ereg.a(erddVar);
                }
            });
            return;
        }
        akxn a2 = ((akyb) this.c.b()).a();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.HADES_SDK_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        erdd erddVar = (erdd) erde.a.createBuilder();
        erddVar.getClass();
        erda erdaVar = (erda) erdc.a.createBuilder();
        erdaVar.getClass();
        eref.c(erdaVar);
        eref.b(i, erdaVar);
        ereg.b(eref.a(erdaVar), erddVar);
        erde a3 = ereg.a(erddVar);
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eolvVar2.av = a3;
        eolvVar2.d |= 65536;
        a2.j(eoluVar, alal.LOG_SPEC_SPAM_EVENTS);
    }
}
