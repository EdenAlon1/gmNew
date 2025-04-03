package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgns extends alhh {
    public static final /* synthetic */ int a = 0;
    private static final cfva b = cfvl.i(cfvl.b, "disable_logging_mdd_lib", true);

    static {
        cfvl.w("use_mdd_lib_event_logger").getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgns(ffbr ffbrVar, Executor executor) {
        super(ffbrVar, new cgnm(), executor);
        ffbrVar.getClass();
        executor.getClass();
    }

    private final void d(final ffji ffjiVar) {
        if (((Boolean) b.e()).booleanValue()) {
            return;
        }
        o(new Supplier() { // from class: cgnn
            @Override // java.util.function.Supplier
            public final Object get() {
                int i = cgns.a;
                eond eondVar = (eond) eong.a.createBuilder();
                eondVar.getClass();
                eohe eoheVar = new eohe(eondVar);
                ffji.this.invoke(eoheVar);
                eyfy build = eoheVar.a.build();
                build.getClass();
                return (eong) build;
            }
        });
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new cgnr(cgnq.a);
    }

    public final void b(final int i, final int i2) {
        d(new ffji() { // from class: cgno
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                eohe eoheVar = (eohe) obj;
                int i3 = cgns.a;
                eoheVar.getClass();
                eoheVar.b(i);
                eoheVar.a(i2);
                return ffcu.a;
            }
        });
    }

    public final void c(final int i, final int i2, final String str, final long j) {
        str.getClass();
        d(new ffji() { // from class: cgnp
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                eohe eoheVar = (eohe) obj;
                int i3 = cgns.a;
                eoheVar.getClass();
                eoheVar.b(i);
                eoheVar.a(i2);
                eond eondVar = eoheVar.a;
                eondVar.copyOnWrite();
                eong eongVar = (eong) eondVar.instance;
                eong eongVar2 = eong.a;
                eongVar.b |= 4;
                eongVar.e = str;
                eond eondVar2 = eoheVar.a;
                eondVar2.copyOnWrite();
                eong eongVar3 = (eong) eondVar2.instance;
                eongVar3.b |= 8;
                eongVar3.f = j;
                return ffcu.a;
            }
        });
    }
}
