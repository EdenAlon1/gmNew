package defpackage;

import android.util.LruCache;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpgn implements avlp {
    private static final entd a = entd.c("BugleTachygram");
    private final cphs b;
    private final cpht c;

    public cpgn(cphs cphsVar, cpht cphtVar) {
        this.b = cphsVar;
        this.c = cphtVar;
    }

    @Override // defpackage.avlp
    public final ephj a(aoku aokuVar) {
        eoyo eoyoVar;
        ephh ephhVar = (ephh) ephj.a.createBuilder();
        cphr cphrVar = (cphr) ((LruCache) ((cphs) this.c).a.get()).get(aokuVar);
        int i = 1;
        if (cphrVar == null) {
            eoyn eoynVar = (eoyn) eoyo.a.createBuilder();
            eowi eowiVar = (eowi) eowl.a.createBuilder();
            eowiVar.copyOnWrite();
            eowl eowlVar = (eowl) eowiVar.instance;
            eowlVar.d = 0;
            eowlVar.b |= 2;
            eowiVar.copyOnWrite();
            eowl eowlVar2 = (eowl) eowiVar.instance;
            eowlVar2.c = 0;
            eowlVar2.b |= 1;
            eoynVar.copyOnWrite();
            eoyo eoyoVar2 = (eoyo) eoynVar.instance;
            eowl eowlVar3 = (eowl) eowiVar.build();
            eowlVar3.getClass();
            eoyoVar2.d = eowlVar3;
            eoyoVar2.b |= 2;
            eowe eoweVar = (eowe) eowh.a.createBuilder();
            eoweVar.copyOnWrite();
            eowh eowhVar = (eowh) eoweVar.instance;
            eowhVar.d = 0;
            eowhVar.b |= 2;
            eoweVar.copyOnWrite();
            eowh eowhVar2 = (eowh) eoweVar.instance;
            eowhVar2.c = 0;
            eowhVar2.b |= 1;
            eoynVar.copyOnWrite();
            eoyo eoyoVar3 = (eoyo) eoynVar.instance;
            eowh eowhVar3 = (eowh) eoweVar.build();
            eowhVar3.getClass();
            eoyoVar3.c = eowhVar3;
            eoyoVar3.b |= 1;
            eoyoVar = (eoyo) eoynVar.build();
        } else {
            eoyn eoynVar2 = (eoyn) eoyo.a.createBuilder();
            eowh a2 = cphrVar.a();
            eoynVar2.copyOnWrite();
            eoyo eoyoVar4 = (eoyo) eoynVar2.instance;
            eoyoVar4.c = a2;
            eoyoVar4.b |= 1;
            cphrVar.b().isPresent();
            eowi eowiVar2 = (eowi) eowl.a.createBuilder();
            eowiVar2.copyOnWrite();
            eowl eowlVar4 = (eowl) eowiVar2.instance;
            eowlVar4.c = 1;
            eowlVar4.b |= 1;
            eowiVar2.copyOnWrite();
            eowl eowlVar5 = (eowl) eowiVar2.instance;
            eowlVar5.d = 1;
            eowlVar5.b |= 2;
            eowl eowlVar6 = (eowl) eowiVar2.build();
            eoynVar2.copyOnWrite();
            eoyo eoyoVar5 = (eoyo) eoynVar2.instance;
            eowlVar6.getClass();
            eoyoVar5.d = eowlVar6;
            eoyoVar5.b |= 2;
            eoyoVar = (eoyo) eoynVar2.build();
        }
        ephhVar.copyOnWrite();
        ephj ephjVar = (ephj) ephhVar.instance;
        eoyoVar.getClass();
        ephjVar.e = eoyoVar;
        ephjVar.b |= 1;
        Optional c = c(aokuVar);
        if (c.isPresent() && !((avlk) c.get()).g()) {
            i = 4;
        }
        ephhVar.copyOnWrite();
        ephj ephjVar2 = (ephj) ephhVar.instance;
        ephjVar2.d = Integer.valueOf(i - 1);
        ephjVar2.c = 2;
        return (ephj) ephhVar.build();
    }

    @Override // defpackage.avlp
    public final Optional c(aoku aokuVar) {
        Optional optional;
        cphs cphsVar = this.b;
        synchronized (cphsVar.a) {
            cphr cphrVar = (cphr) ((LruCache) cphsVar.a.get()).get(aokuVar);
            if (cphrVar != null) {
                optional = cphrVar.b();
            } else {
                cpho cphoVar = new cpho();
                eowe eoweVar = (eowe) eowh.a.createBuilder();
                eoweVar.copyOnWrite();
                eowh eowhVar = (eowh) eoweVar.instance;
                eowhVar.d = 0;
                eowhVar.b |= 2;
                eoweVar.copyOnWrite();
                eowh eowhVar2 = (eowh) eoweVar.instance;
                eowhVar2.c = 0;
                eowhVar2.b |= 1;
                cphoVar.a((eowh) eoweVar.build());
                eowe eoweVar2 = (eowe) eowh.a.createBuilder();
                eoweVar2.copyOnWrite();
                eowh eowhVar3 = (eowh) eoweVar2.instance;
                eowhVar3.d = 1;
                eowhVar3.b |= 2;
                eoweVar2.copyOnWrite();
                eowh eowhVar4 = (eowh) eoweVar2.instance;
                eowhVar4.c = 1;
                eowhVar4.b |= 1;
                cphoVar.a((eowh) eoweVar2.build());
                eowh eowhVar5 = cphoVar.b;
                if (eowhVar5 == null) {
                    throw new IllegalStateException("Missing required properties: capabilityLookup");
                }
                cphp cphpVar = new cphp(cphoVar.a, eowhVar5);
                ((LruCache) cphsVar.a.get()).put(aokuVar, cphpVar);
                optional = cphpVar.a;
            }
        }
        Optional map = optional.map(new Function() { // from class: cpgl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((avmz) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: cpgm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return avlk.b((avoi) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (!map.isPresent()) {
            ((ensz) a.o().h("com/google/android/apps/messaging/shared/tachygram/capabilities/RcsContactsTachygramAdapter", "logCachedRecipientRcsAvailabilities", 87, "RcsContactsTachygramAdapter.java")).q("No cached Rcs capabilities found.");
            return map;
        }
        ensk o = a.o();
        o.Y(avlq.a, (avlk) map.get());
        ((ensz) o.h("com/google/android/apps/messaging/shared/tachygram/capabilities/RcsContactsTachygramAdapter", "logCachedRecipientRcsAvailabilities", 85, "RcsContactsTachygramAdapter.java")).q("Returning cached capabilities.");
        return map;
    }
}
