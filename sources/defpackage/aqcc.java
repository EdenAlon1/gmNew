package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqcc extends alhh {
    public aqcc(ffbr ffbrVar, aqcf aqcfVar, Executor executor) {
        super(ffbrVar, aqcfVar, executor);
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aqca
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eqgp eqgpVar = (eqgp) obj;
                eqgu eqguVar = (eqgu) obj2;
                eqgpVar.copyOnWrite();
                eqgq eqgqVar = (eqgq) eqgpVar.instance;
                eqgq eqgqVar2 = eqgq.a;
                eqguVar.getClass();
                eqgqVar.c = eqguVar;
                eqgqVar.b = 1;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final void b(final int i, final cvqb cvqbVar) {
        o(new Supplier() { // from class: aqcb
            @Override // java.util.function.Supplier
            public final Object get() {
                eqgs eqgsVar = (eqgs) eqgu.a.createBuilder();
                eqgsVar.copyOnWrite();
                eqgu eqguVar = (eqgu) eqgsVar.instance;
                int i2 = i;
                if (i2 == 0) {
                    throw null;
                }
                cvqb cvqbVar2 = cvqbVar;
                eqguVar.c = i2 - 1;
                eqguVar.b |= 1;
                int c = cvpz.c(cvqbVar2.d);
                int i3 = 3;
                if (c != 0 && c == 3) {
                    i3 = 2;
                }
                eqgsVar.copyOnWrite();
                eqgu eqguVar2 = (eqgu) eqgsVar.instance;
                eqguVar2.d = i3 - 1;
                eqguVar2.b = 2 | eqguVar2.b;
                String str = cvqbVar2.e;
                eqgsVar.copyOnWrite();
                eqgu eqguVar3 = (eqgu) eqgsVar.instance;
                str.getClass();
                eqguVar3.b |= 4;
                eqguVar3.e = str;
                String str2 = cvqbVar2.b;
                eqgsVar.copyOnWrite();
                eqgu eqguVar4 = (eqgu) eqgsVar.instance;
                str2.getClass();
                eqguVar4.b |= 8;
                eqguVar4.f = str2;
                return (eqgu) eqgsVar.build();
            }
        });
    }
}
