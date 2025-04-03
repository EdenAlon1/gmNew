package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.UUID;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqbo {
    private final cqbt a;

    public cqbo(cqbu cqbuVar) {
        this.a = cqbuVar.a(new BiConsumer() { // from class: cqbn
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eqpl eqplVar = (eqpl) obj;
                eqpk eqpkVar = (eqpk) obj2;
                eqplVar.copyOnWrite();
                eqqn eqqnVar = (eqqn) eqplVar.instance;
                eqqn eqqnVar2 = eqqn.a;
                eqpkVar.getClass();
                eqqnVar.d = eqpkVar;
                eqqnVar.c = 4;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
    }

    public final void a(UUID uuid, UUID uuid2, int i, int i2, int i3, int i4, int i5, engw engwVar) {
        if (true != ((Boolean) cqbt.a.e()).booleanValue()) {
            i = -1;
        }
        if (true != ((Boolean) cqbt.a.e()).booleanValue()) {
            i2 = -1;
        }
        if (true != ((Boolean) cqbt.a.e()).booleanValue()) {
            i3 = -1;
        }
        if (true != ((Boolean) cqbt.a.e()).booleanValue()) {
            i4 = -1;
        }
        if (true != ((Boolean) cqbt.a.e()).booleanValue()) {
            i5 = -1;
        }
        eqpj eqpjVar = (eqpj) eqpk.a.createBuilder();
        eyee a = cpzf.a(uuid2);
        eqpjVar.copyOnWrite();
        eqpk eqpkVar = (eqpk) eqpjVar.instance;
        eqpkVar.b = 1 | eqpkVar.b;
        eqpkVar.c = a;
        eqpjVar.copyOnWrite();
        eqpk eqpkVar2 = (eqpk) eqpjVar.instance;
        eqpkVar2.b |= 2;
        eqpkVar2.d = i;
        eqpjVar.copyOnWrite();
        eqpk eqpkVar3 = (eqpk) eqpjVar.instance;
        eqpkVar3.b |= 4;
        eqpkVar3.e = i3;
        eqpjVar.copyOnWrite();
        eqpk eqpkVar4 = (eqpk) eqpjVar.instance;
        eqpkVar4.b |= 8;
        eqpkVar4.f = i4;
        eqpjVar.copyOnWrite();
        eqpk eqpkVar5 = (eqpk) eqpjVar.instance;
        eqpkVar5.b |= 32;
        eqpkVar5.h = i5;
        if (((Boolean) ((cfup) cpze.h.get()).e()).booleanValue()) {
            long j = i2;
            eqpjVar.copyOnWrite();
            eqpk eqpkVar6 = (eqpk) eqpjVar.instance;
            eqpkVar6.b |= 16;
            eqpkVar6.g = j;
        }
        this.a.b(uuid, engwVar, (eqpk) eqpjVar.build());
    }
}
