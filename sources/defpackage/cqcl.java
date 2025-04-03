package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.UUID;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqcl {
    public final cqbt a;
    public final cqbt b;
    public final cqbt c;
    public final cqbt d;
    private final cqbt e;
    private final cqbt f;
    private final cqbt g;

    public cqcl(cqbu cqbuVar) {
        this.a = cqbuVar.a(new BiConsumer() { // from class: cqce
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eqpl eqplVar = (eqpl) obj;
                eqpp eqppVar = (eqpp) obj2;
                eqplVar.copyOnWrite();
                eqqn eqqnVar = (eqqn) eqplVar.instance;
                eqqn eqqnVar2 = eqqn.a;
                eqppVar.getClass();
                eqqnVar.d = eqppVar;
                eqqnVar.c = 8;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        this.e = cqbuVar.a(new BiConsumer() { // from class: cqcf
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eqpl eqplVar = (eqpl) obj;
                eqqb eqqbVar = (eqqb) obj2;
                eqplVar.copyOnWrite();
                eqqn eqqnVar = (eqqn) eqplVar.instance;
                eqqn eqqnVar2 = eqqn.a;
                eqqbVar.getClass();
                eqqnVar.d = eqqbVar;
                eqqnVar.c = 9;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        this.b = cqbuVar.a(new BiConsumer() { // from class: cqcg
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eqpl eqplVar = (eqpl) obj;
                eqqm eqqmVar = (eqqm) obj2;
                eqplVar.copyOnWrite();
                eqqn eqqnVar = (eqqn) eqplVar.instance;
                eqqn eqqnVar2 = eqqn.a;
                eqqmVar.getClass();
                eqqnVar.d = eqqmVar;
                eqqnVar.c = 10;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        this.f = cqbuVar.a(new BiConsumer() { // from class: cqch
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eqpl eqplVar = (eqpl) obj;
                eqpw eqpwVar = (eqpw) obj2;
                eqplVar.copyOnWrite();
                eqqn eqqnVar = (eqqn) eqplVar.instance;
                eqqn eqqnVar2 = eqqn.a;
                eqpwVar.getClass();
                eqqnVar.d = eqpwVar;
                eqqnVar.c = 13;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        this.c = cqbuVar.a(new BiConsumer() { // from class: cqci
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eqpl eqplVar = (eqpl) obj;
                eqpy eqpyVar = (eqpy) obj2;
                eqplVar.copyOnWrite();
                eqqn eqqnVar = (eqqn) eqplVar.instance;
                eqqn eqqnVar2 = eqqn.a;
                eqpyVar.getClass();
                eqqnVar.d = eqpyVar;
                eqqnVar.c = 11;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        this.d = cqbuVar.a(new BiConsumer() { // from class: cqcj
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eqpl eqplVar = (eqpl) obj;
                eqqk eqqkVar = (eqqk) obj2;
                eqplVar.copyOnWrite();
                eqqn eqqnVar = (eqqn) eqplVar.instance;
                eqqn eqqnVar2 = eqqn.a;
                eqqkVar.getClass();
                eqqnVar.d = eqqkVar;
                eqqnVar.c = 12;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        this.g = cqbuVar.a(new BiConsumer() { // from class: cqck
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eqpl eqplVar = (eqpl) obj;
                eqpn eqpnVar = (eqpn) obj2;
                eqplVar.copyOnWrite();
                eqqn eqqnVar = (eqqn) eqplVar.instance;
                eqqn eqqnVar2 = eqqn.a;
                eqpnVar.getClass();
                eqqnVar.d = eqpnVar;
                eqqnVar.c = 14;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
    }

    public final void a(UUID uuid, engw engwVar) {
        this.g.b(uuid, engwVar, eqpn.a);
    }

    public final void b(UUID uuid, eqqd eqqdVar) {
        this.f.b(uuid, engw.r(eqqdVar), eqpw.a);
    }

    public final void c(UUID uuid, UUID uuid2, int i, boolean z) {
        eqpz eqpzVar = (eqpz) eqqb.a.createBuilder();
        eqpzVar.copyOnWrite();
        eqqb eqqbVar = (eqqb) eqpzVar.instance;
        eqqbVar.b |= 2;
        eqqbVar.d = z;
        eqpzVar.copyOnWrite();
        eqqb eqqbVar2 = (eqqb) eqpzVar.instance;
        eqqbVar2.b |= 4;
        eqqbVar2.e = i == 8;
        eqpzVar.copyOnWrite();
        eqqb eqqbVar3 = (eqqb) eqpzVar.instance;
        eqqbVar3.f = i - 1;
        eqqbVar3.b |= 8;
        if (uuid2 != null) {
            eyee a = cpzf.a(uuid2);
            eqpzVar.copyOnWrite();
            eqqb eqqbVar4 = (eqqb) eqpzVar.instance;
            eqqbVar4.b |= 1;
            eqqbVar4.c = a;
        }
        cqbt cqbtVar = this.e;
        int i2 = engw.d;
        cqbtVar.b(uuid, enou.a, (eqqb) eqpzVar.build());
    }
}
