package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.function.BiConsumer$CC;
import java.util.UUID;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqbz {
    public final cqbt a;

    public cqbz(cqbu cqbuVar) {
        this.a = cqbuVar.a(new BiConsumer() { // from class: cqby
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eqpl eqplVar = (eqpl) obj;
                eqpr eqprVar = (eqpr) obj2;
                eqplVar.copyOnWrite();
                eqqn eqqnVar = (eqqn) eqplVar.instance;
                eqqn eqqnVar2 = eqqn.a;
                eqprVar.getClass();
                eqqnVar.d = eqprVar;
                eqqnVar.c = 6;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
    }

    public final void a(UUID uuid, Instant instant, Instant instant2, Instant instant3, long j, engw engwVar) {
        Duration between = Duration.between(instant, instant3);
        eqpq eqpqVar = (eqpq) eqpr.a.createBuilder();
        eqpqVar.copyOnWrite();
        eqpr eqprVar = (eqpr) eqpqVar.instance;
        eqprVar.b |= 1;
        eqprVar.c = j;
        eyev a = eykj.a(between);
        eqpqVar.copyOnWrite();
        eqpr eqprVar2 = (eqpr) eqpqVar.instance;
        a.getClass();
        eqprVar2.d = a;
        eqprVar2.b |= 2;
        eyev a2 = eykj.a(Duration.between(instant2, instant3));
        eqpqVar.copyOnWrite();
        eqpr eqprVar3 = (eqpr) eqpqVar.instance;
        a2.getClass();
        eqprVar3.e = a2;
        eqprVar3.b |= 4;
        this.a.b(uuid, engwVar, (eqpr) eqpqVar.build());
    }
}
