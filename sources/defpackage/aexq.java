package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aexq extends alhh {
    static final cfva a = cfvl.i(cfvl.b, "enable_super_sort_ready_status_logging", true);
    public static final /* synthetic */ int b = 0;

    public aexq(ffbr ffbrVar, aexz aexzVar, Executor executor) {
        super(ffbrVar, aexzVar, executor);
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aexo
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eqhb eqhbVar = (eqhb) obj;
                eqjt eqjtVar = (eqjt) obj2;
                eqhbVar.copyOnWrite();
                eqhc eqhcVar = (eqhc) eqhbVar.instance;
                eqhc eqhcVar2 = eqhc.a;
                eqjtVar.getClass();
                eqhcVar.c = eqjtVar;
                eqhcVar.b = 6;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final void b(final float f) {
        if (!((Boolean) aexw.a.e()).booleanValue() && ((Boolean) a.e()).booleanValue()) {
            o(new Supplier() { // from class: aexp
                @Override // java.util.function.Supplier
                public final Object get() {
                    int i = aexq.b;
                    eqjs eqjsVar = (eqjs) eqjt.a.createBuilder();
                    eqjsVar.copyOnWrite();
                    eqjt eqjtVar = (eqjt) eqjsVar.instance;
                    eqjtVar.b |= 1;
                    eqjtVar.c = f;
                    return (eqjt) eqjsVar.build();
                }
            });
        }
    }
}
