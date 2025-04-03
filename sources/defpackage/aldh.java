package defpackage;

import j$.util.DesugarCollections;
import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aldh extends alhh {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aldh(ffbr ffbrVar, alcs alcsVar, Executor executor) {
        super(ffbrVar, alcsVar, executor);
        ffbrVar.getClass();
        executor.getClass();
    }

    public static /* synthetic */ void b(aldh aldhVar, final long j, final int i, Integer num, Iterable iterable, eqfc eqfcVar, eqfq eqfqVar, epwy epwyVar, int i2) {
        if ((i2 & 8) != 0) {
            iterable = ffel.a;
        }
        final Iterable iterable2 = iterable;
        final Integer num2 = (i2 & 4) != 0 ? null : num;
        final eqfc eqfcVar2 = (i2 & 16) != 0 ? null : eqfcVar;
        final eqfq eqfqVar2 = (i2 & 32) != 0 ? null : eqfqVar;
        final epwy epwyVar2 = (i2 & 64) != 0 ? null : epwyVar;
        iterable2.getClass();
        aldhVar.o(new Supplier() { // from class: aldg
            @Override // java.util.function.Supplier
            public final Object get() {
                eqas eqasVar = (eqas) eqat.a.createBuilder();
                eqasVar.getClass();
                eqasVar.copyOnWrite();
                eqat eqatVar = (eqat) eqasVar.instance;
                eqatVar.b |= 1;
                eqatVar.c = j;
                DesugarCollections.unmodifiableList(eqatVar.d).getClass();
                eqasVar.copyOnWrite();
                eqat eqatVar2 = (eqat) eqasVar.instance;
                eygr eygrVar = eqatVar2.d;
                if (!eygrVar.c()) {
                    eqatVar2.d = eyfy.mutableCopy(eygrVar);
                }
                Integer num3 = num2;
                int i3 = i;
                eydl.addAll(iterable2, eqatVar2.d);
                eqasVar.copyOnWrite();
                eqat eqatVar3 = (eqat) eqasVar.instance;
                eqatVar3.e = i3 - 1;
                eqatVar3.b |= 2;
                if (num3 != null) {
                    num3.intValue();
                    int intValue = num3.intValue();
                    eqasVar.copyOnWrite();
                    eqat eqatVar4 = (eqat) eqasVar.instance;
                    eqatVar4.b |= 4;
                    eqatVar4.f = intValue;
                }
                eqfc eqfcVar3 = eqfcVar2;
                if (eqfcVar3 != null) {
                    eqasVar.copyOnWrite();
                    eqat eqatVar5 = (eqat) eqasVar.instance;
                    eqatVar5.g = eqfcVar3;
                    eqatVar5.b |= 8;
                }
                eqfq eqfqVar3 = eqfqVar2;
                if (eqfqVar3 != null) {
                    eqasVar.copyOnWrite();
                    eqat eqatVar6 = (eqat) eqasVar.instance;
                    eqatVar6.h = eqfqVar3;
                    eqatVar6.b |= 16;
                }
                epwy epwyVar3 = epwyVar2;
                if (epwyVar3 != null) {
                    eqasVar.copyOnWrite();
                    eqat eqatVar7 = (eqat) eqasVar.instance;
                    eqatVar7.i = epwyVar3;
                    eqatVar7.b |= 32;
                }
                eyfy build = eqasVar.build();
                build.getClass();
                return (eqat) build;
            }
        });
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aldf
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eoji eojiVar = (eoji) obj;
                eqat eqatVar = (eqat) obj2;
                eojiVar.getClass();
                eqatVar.getClass();
                eojiVar.copyOnWrite();
                eojj eojjVar = (eojj) eojiVar.instance;
                eojj eojjVar2 = eojj.a;
                eojjVar.c = eqatVar;
                eojjVar.b = 13;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
