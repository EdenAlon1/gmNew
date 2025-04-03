package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class curu extends alhh {
    public final avkk a;
    private final ffbr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public curu(ffbr ffbrVar, ffbr ffbrVar2, avkk avkkVar, Executor executor) {
        super(ffbrVar2, new curo(), executor);
        ffbrVar.getClass();
        ffbrVar2.getClass();
        avkkVar.getClass();
        executor.getClass();
        this.b = ffbrVar;
        this.a = avkkVar;
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new curt(curs.a);
    }

    public final void b(eopq eopqVar) {
        akxn a = ((akyb) this.b.b()).a();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_MESSAGE;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eolvVar2.l = eopqVar;
        eolvVar2.b |= 4;
        a.j(eoluVar, alal.LOG_SPEC_SPAM_EVENTS);
    }

    public final void c(final bdhg bdhgVar, final eqxi eqxiVar) {
        bdhgVar.getClass();
        if (!cubs.b().booleanValue()) {
            o(new Supplier() { // from class: curp
                @Override // java.util.function.Supplier
                public final Object get() {
                    eoop eoopVar = (eoop) eopq.a.createBuilder();
                    eoopVar.getClass();
                    eohm.e(bdhg.this.f(), eoopVar);
                    eohm.f(this.a.a(), eoopVar);
                    eohm.h(14, eoopVar);
                    eohm.g(6, eoopVar);
                    eqxi eqxiVar2 = eqxiVar;
                    if (eqxiVar2 != null) {
                        eohm.d(eqxiVar2, eoopVar);
                    }
                    return eohm.a(eoopVar);
                }
            });
            return;
        }
        eoop eoopVar = (eoop) eopq.a.createBuilder();
        eoopVar.getClass();
        eohm.e(bdhgVar.f(), eoopVar);
        eohm.f(this.a.a(), eoopVar);
        eohm.h(14, eoopVar);
        eohm.g(6, eoopVar);
        if (eqxiVar != null) {
            eohm.d(eqxiVar, eoopVar);
        }
        b(eohm.a(eoopVar));
    }

    public final void d(final bdhg bdhgVar) {
        bdhgVar.getClass();
        if (!cubs.b().booleanValue()) {
            o(new Supplier() { // from class: curr
                @Override // java.util.function.Supplier
                public final Object get() {
                    eoop eoopVar = (eoop) eopq.a.createBuilder();
                    eoopVar.getClass();
                    eohm.e(bdhg.this.f(), eoopVar);
                    eohm.f(this.a.a(), eoopVar);
                    eohm.h(14, eoopVar);
                    eohm.g(2, eoopVar);
                    return eohm.a(eoopVar);
                }
            });
            return;
        }
        eoop eoopVar = (eoop) eopq.a.createBuilder();
        eoopVar.getClass();
        eohm.e(bdhgVar.f(), eoopVar);
        eohm.f(this.a.a(), eoopVar);
        eohm.h(14, eoopVar);
        eohm.g(2, eoopVar);
        b(eohm.a(eoopVar));
    }
}
