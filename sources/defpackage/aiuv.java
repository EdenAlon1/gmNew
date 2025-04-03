package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiuv extends alhh implements aeez {
    private final aitz a;

    public aiuv(aitz aitzVar, ffbr ffbrVar, aexz aexzVar, Executor executor) {
        super(ffbrVar, aexzVar, executor);
        this.a = aitzVar;
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aiut
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eqhb eqhbVar = (eqhb) obj;
                eqjr eqjrVar = (eqjr) obj2;
                eqhbVar.copyOnWrite();
                eqhc eqhcVar = (eqhc) eqhbVar.instance;
                eqhc eqhcVar2 = eqhc.a;
                eqjrVar.getClass();
                eqhcVar.c = eqjrVar;
                eqhcVar.b = 3;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final void b(Supplier supplier) {
        if (((Boolean) aexw.a.e()).booleanValue()) {
            return;
        }
        o(supplier);
    }

    public final void c(final int i) {
        b(new Supplier() { // from class: aiup
            @Override // java.util.function.Supplier
            public final Object get() {
                eqjf eqjfVar = (eqjf) eqjr.a.createBuilder();
                eqis eqisVar = (eqis) eqiv.a.createBuilder();
                eqiq eqiqVar = (eqiq) eqir.a.createBuilder();
                eqiqVar.copyOnWrite();
                eqir eqirVar = (eqir) eqiqVar.instance;
                eqirVar.c = i - 1;
                eqirVar.b |= 1;
                eqisVar.copyOnWrite();
                eqiv eqivVar = (eqiv) eqisVar.instance;
                eqir eqirVar2 = (eqir) eqiqVar.build();
                eqirVar2.getClass();
                eqivVar.c = eqirVar2;
                eqivVar.b = 2;
                eqjfVar.copyOnWrite();
                eqjr eqjrVar = (eqjr) eqjfVar.instance;
                eqiv eqivVar2 = (eqiv) eqisVar.build();
                eqivVar2.getClass();
                eqjrVar.c = eqivVar2;
                eqjrVar.b = 1;
                return (eqjr) eqjfVar.build();
            }
        });
    }

    public final void d(final String str, final int i) {
        b(new Supplier() { // from class: aiur
            @Override // java.util.function.Supplier
            public final Object get() {
                eqjf eqjfVar = (eqjf) eqjr.a.createBuilder();
                eqjl eqjlVar = (eqjl) eqjn.a.createBuilder();
                eqjlVar.copyOnWrite();
                eqjn eqjnVar = (eqjn) eqjlVar.instance;
                eqjnVar.c = i - 1;
                eqjnVar.b |= 1;
                eqjlVar.copyOnWrite();
                eqjn eqjnVar2 = (eqjn) eqjlVar.instance;
                String str2 = str;
                str2.getClass();
                eqjnVar2.b |= 2;
                eqjnVar2.d = str2;
                eqjn eqjnVar3 = (eqjn) eqjlVar.build();
                eqjfVar.copyOnWrite();
                eqjr eqjrVar = (eqjr) eqjfVar.instance;
                eqjnVar3.getClass();
                eqjrVar.c = eqjnVar3;
                eqjrVar.b = 4;
                return (eqjr) eqjfVar.build();
            }
        });
    }

    @Override // defpackage.aeez
    public final void q() {
        this.a.e();
        b(new Supplier() { // from class: aiuq
            @Override // java.util.function.Supplier
            public final Object get() {
                eqjf eqjfVar = (eqjf) eqjr.a.createBuilder();
                eqis eqisVar = (eqis) eqiv.a.createBuilder();
                eqiu eqiuVar = eqiu.a;
                eqisVar.copyOnWrite();
                eqiv eqivVar = (eqiv) eqisVar.instance;
                eqiuVar.getClass();
                eqivVar.c = eqiuVar;
                eqivVar.b = 1;
                eqjfVar.copyOnWrite();
                eqjr eqjrVar = (eqjr) eqjfVar.instance;
                eqiv eqivVar2 = (eqiv) eqisVar.build();
                eqivVar2.getClass();
                eqjrVar.c = eqivVar2;
                eqjrVar.b = 1;
                return (eqjr) eqjfVar.build();
            }
        });
    }
}
