package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.UUID;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqcd {
    public final cqbt a;

    public cqcd(cqbu cqbuVar) {
        this.a = cqbuVar.a(new BiConsumer() { // from class: cqcc
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eqpl eqplVar = (eqpl) obj;
                eqqi eqqiVar = (eqqi) obj2;
                eqplVar.copyOnWrite();
                eqqn eqqnVar = (eqqn) eqplVar.instance;
                eqqn eqqnVar2 = eqqn.a;
                eqqiVar.getClass();
                eqqnVar.d = eqqiVar;
                eqqnVar.c = 2;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
    }

    public static eqqi a(eqqh eqqhVar, int i, boolean z, boolean z2) {
        eqqe eqqeVar = (eqqe) eqqi.a.createBuilder();
        eqqeVar.copyOnWrite();
        eqqi eqqiVar = (eqqi) eqqeVar.instance;
        eqqiVar.e = eqqhVar.M;
        eqqiVar.b |= 4;
        eqqeVar.copyOnWrite();
        eqqi eqqiVar2 = (eqqi) eqqeVar.instance;
        eqqiVar2.g = i - 1;
        eqqiVar2.b |= 16;
        eqqeVar.copyOnWrite();
        eqqi eqqiVar3 = (eqqi) eqqeVar.instance;
        eqqiVar3.b |= 1;
        eqqiVar3.c = z;
        eqqeVar.copyOnWrite();
        eqqi eqqiVar4 = (eqqi) eqqeVar.instance;
        eqqiVar4.b |= 2;
        eqqiVar4.d = z2;
        return (eqqi) eqqeVar.build();
    }

    public static eqqi d(eqqh eqqhVar, boolean z, boolean z2, UUID uuid) {
        eqqe eqqeVar = (eqqe) a(eqqhVar, 3, z, z2).toBuilder();
        eyee a = cpzf.a(uuid);
        eqqeVar.copyOnWrite();
        eqqi eqqiVar = (eqqi) eqqeVar.instance;
        eqqiVar.b |= 8;
        eqqiVar.f = a;
        return (eqqi) eqqeVar.build();
    }

    public final void b(eqqh eqqhVar, int i, boolean z, engw engwVar) {
        this.a.c(engwVar, a(eqqhVar, i, true, z));
    }

    public final void c(eqqh eqqhVar, int i, engw engwVar) {
        this.a.c(engwVar, a(eqqhVar, i, false, false));
    }
}
