package defpackage;

import j$.time.Duration;
import j$.util.function.BiConsumer$CC;
import java.util.UUID;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqbm {
    public final cqbt a;

    public cqbm(cqbu cqbuVar) {
        this.a = cqbuVar.a(new BiConsumer() { // from class: cqbk
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eqpl eqplVar = (eqpl) obj;
                eqpi eqpiVar = (eqpi) obj2;
                eqplVar.copyOnWrite();
                eqqn eqqnVar = (eqqn) eqplVar.instance;
                eqqn eqqnVar2 = eqqn.a;
                eqpiVar.getClass();
                eqqnVar.d = eqpiVar;
                eqqnVar.c = 5;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
    }

    public final void a(UUID uuid, UUID uuid2, UUID uuid3, int i, Duration duration, Duration duration2, engw engwVar) {
        eqpg eqpgVar = (eqpg) eqpi.a.createBuilder();
        eyee a = cpzf.a(uuid2);
        eqpgVar.copyOnWrite();
        eqpi eqpiVar = (eqpi) eqpgVar.instance;
        eqpiVar.b |= 1;
        eqpiVar.c = a;
        eyee a2 = cpzf.a(uuid3);
        eqpgVar.copyOnWrite();
        eqpi eqpiVar2 = (eqpi) eqpgVar.instance;
        eqpiVar2.b |= 8;
        eqpiVar2.f = a2;
        eqpgVar.copyOnWrite();
        eqpi eqpiVar3 = (eqpi) eqpgVar.instance;
        eqpiVar3.g = i - 1;
        eqpiVar3.b |= 16;
        eyev a3 = eykj.a(duration);
        eqpgVar.copyOnWrite();
        eqpi eqpiVar4 = (eqpi) eqpgVar.instance;
        a3.getClass();
        eqpiVar4.d = a3;
        eqpiVar4.b |= 2;
        eyev a4 = eykj.a(duration2);
        eqpgVar.copyOnWrite();
        eqpi eqpiVar5 = (eqpi) eqpgVar.instance;
        a4.getClass();
        eqpiVar5.e = a4;
        eqpiVar5.b |= 4;
        this.a.b(uuid, engwVar, (eqpi) eqpgVar.build());
    }
}
