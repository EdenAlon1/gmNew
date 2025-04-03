package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.UUID;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqcb {
    private final cqbt a;

    public cqcb(cqbu cqbuVar) {
        this.a = cqbuVar.a(new BiConsumer() { // from class: cqca
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eqpl eqplVar = (eqpl) obj;
                eqpu eqpuVar = (eqpu) obj2;
                eqplVar.copyOnWrite();
                eqqn eqqnVar = (eqqn) eqplVar.instance;
                eqqn eqqnVar2 = eqqn.a;
                eqpuVar.getClass();
                eqqnVar.d = eqpuVar;
                eqqnVar.c = 3;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
    }

    public final void a(UUID uuid, UUID uuid2, int i, engw engwVar) {
        eqps eqpsVar = (eqps) eqpu.a.createBuilder();
        eyee a = cpzf.a(uuid2);
        eqpsVar.copyOnWrite();
        eqpu eqpuVar = (eqpu) eqpsVar.instance;
        eqpuVar.b |= 1;
        eqpuVar.c = a;
        eqpsVar.copyOnWrite();
        eqpu eqpuVar2 = (eqpu) eqpsVar.instance;
        eqpuVar2.b |= 2;
        eqpuVar2.d = 0L;
        eqpsVar.copyOnWrite();
        eqpu eqpuVar3 = (eqpu) eqpsVar.instance;
        eqpuVar3.e = i - 1;
        eqpuVar3.b |= 4;
        this.a.b(uuid, engwVar, (eqpu) eqpsVar.build());
    }
}
